package net.maketendo.tardifmod.main.tardis;

import com.google.gson.*;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.WorldSavePath;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class TardisManager {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Map<Integer, TardisData> CACHE = new HashMap<>();

    private static Path getDir(MinecraftServer server) {
        return server.getSavePath(WorldSavePath.ROOT)
                .resolve("data")
                .resolve("tardis");
    }

    public static TardisData get(MinecraftServer server, int id) {
        if (CACHE.containsKey(id)) return CACHE.get(id);

        Path file = getDir(server).resolve("tardis-" + id + ".json");
        if (!Files.exists(file)) return null;

        try (Reader reader = Files.newBufferedReader(file)) {
            TardisData data = TardisData.fromJson(JsonParser.parseReader(reader).getAsJsonObject());
            CACHE.put(id, data);
            return data;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void save(MinecraftServer server, TardisData data) {
        Path file = getDir(server).resolve("tardis-" + data.id + ".json");
        try {
            Files.createDirectories(file.getParent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (Writer writer = Files.newBufferedWriter(file)) {
            GSON.toJson(data.toJson(), writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static JsonObject loadIndex(Path path) {
        if (!Files.exists(path)) {
            JsonObject json = new JsonObject();
            json.addProperty("next_id", 1);
            json.add("tardises", new JsonArray());
            return json;
        }

        try (Reader r = Files.newBufferedReader(path)) {
            return JsonParser.parseReader(r).getAsJsonObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void saveIndex(Path path, JsonObject json) {
        try (Writer w = Files.newBufferedWriter(path)) {
            GSON.toJson(json, w);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int createTardis(MinecraftServer server, TardisData data) {
        Path dir = getDir(server);
        try {
            Files.createDirectories(dir);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path indexFile = dir.resolve("index.json");
        JsonObject index = loadIndex(indexFile);

        int id = index.get("next_id").getAsInt();

        index.addProperty("next_id", id + 1);
        index.getAsJsonArray("tardises").add(id);

        saveIndex(indexFile, index);

        data.id = id;
        save(server, data);
        CACHE.put(id, data);

        return id;
    }

    public static int getTardisCount(MinecraftServer server) throws IOException {
        Path indexFile = getDir(server).resolve("index.json");
        JsonObject index = loadIndex(indexFile);
        return index.getAsJsonArray("tardises").size();
    }

    public static Iterable<Integer> getIterableTardisCount(MinecraftServer server) throws IOException {
        Path indexFile = getDir(server).resolve("index.json");
        JsonObject index = loadIndex(indexFile);

        var list = new java.util.ArrayList<Integer>();
        index.getAsJsonArray("tardises")
                .forEach(e -> list.add(e.getAsInt()));
        return list;
    }

    public static Iterable<TardisData> getAll(MinecraftServer server) {
        Path indexFile = getDir(server).resolve("index.json");
        JsonObject index = loadIndex(indexFile);

        var list = new java.util.ArrayList<TardisData>();

        index.getAsJsonArray("tardises").forEach(e -> {
            int id = e.getAsInt();
            TardisData data = get(server, id);
            if (data != null) {
                list.add(data);
            }
        });

        return list;
    }

    public static Entity getEntityFromId(int id, MinecraftServer server) {
        for (ServerWorld world : server.getWorlds()) {
            for (Entity entity : world.iterateEntities()) {
                if (entity instanceof TARDISEntity tardis &&
                        tardis.getTardisId() == id) {
                    return tardis;
                }
            }
        }
        return null;
    }
}
