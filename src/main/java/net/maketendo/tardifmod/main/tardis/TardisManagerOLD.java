package net.maketendo.tardifmod.main.tardis;

import com.google.gson.*;
import net.maketendo.tardifmod.main.TARDIFDimensions;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.maketendo.tardifmod.utils.TardisInteriorUtil;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.WorldSavePath;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class TardisManagerOLD {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Map<Integer, TardisData> CACHE = new HashMap<>();

    private static Path getDir(MinecraftServer server) {
        return server.getSavePath(WorldSavePath.ROOT)
                .resolve("data")
                .resolve("tardis");
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

    // ----------------------------------------------------------------

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

        try (Writer w = Files.newBufferedWriter(indexFile)) {
            GSON.toJson(index, w);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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

    public static TardisData getFromId(MinecraftServer server, int id) {
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

    public static Integer getTardisInteriorId(ServerWorld world, BlockPos pos) {
        MinecraftServer server = world.getServer();

        try {
            for (int id : TardisManager.getIterableTardisCount(server)) {
                TardisData data = TardisManager.getFromId(server, id);
                if (data == null) continue;

                if (!data.interiorDimension.equals(world.getRegistryKey().getValue()))
                    continue;

                if (TardisInteriorUtil.isInside(data.interiorOrigin, TardisInteriorUtil.SPACING, pos)) {
                    return id;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Nullable
    public static TardisData getTardisData(World world, BlockPos pos) {
        if (world.isClient()) return null;
        if (!(world instanceof ServerWorld serverWorld)) return null;

        assert serverWorld.getServer() != null;
        ServerWorld tardisWorld = serverWorld.getServer()
                .getWorld(TARDIFDimensions.TARDIS_WORLD);

        if (tardisWorld == null) return null;
        if (serverWorld != tardisWorld) return null;

        int tardisId = getTardisInteriorId(tardisWorld, pos);
        if (tardisId < 0) return null;

        return TardisManager.getFromId(serverWorld.getServer(), tardisId);
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
