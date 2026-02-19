package net.maketendo.tardifmod.main.tardis;

import net.minecraft.server.MinecraftServer;
import net.minecraft.util.WorldSavePath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class TardisDataManager {

    private static Path tardisFolder;
    private static final Map<Integer, TardisData> CACHE = new HashMap<>();

    public static void init(MinecraftServer server) {
        Path worldPath = server.getSavePath(WorldSavePath.ROOT);
        tardisFolder = worldPath.resolve("tardis");

        try {
            Files.createDirectories(tardisFolder);
            loadAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadAll() throws IOException {
        CACHE.clear();

        try (Stream<Path> paths = Files.list(tardisFolder)) {
            paths.filter(p -> p.toString().endsWith(".json"))
                    .forEach(path -> {
                        int id = Integer.parseInt(
                                path.getFileName().toString().replace(".json", "")
                        );

                        TardisData data = new TardisData(path, id);
                        CACHE.put(id, data);
                    });
        }
    }

    public static TardisData get(int id) {
        return CACHE.computeIfAbsent(id, i -> {
            Path path = tardisFolder.resolve(i + ".json");
            TardisData data = new TardisData(path, i);
            CACHE.put(i, data);
            return data;
        });
    }

    public static void saveAll() {
        CACHE.values().forEach(TardisData::save);
    }

    public static void remove(int id) {
        CACHE.remove(id);
        try {
            Files.deleteIfExists(tardisFolder.resolve(id + ".json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




