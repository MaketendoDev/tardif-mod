package net.maketendo.tardifmod.utils;

import net.minecraft.server.MinecraftServer;
import net.minecraft.util.WorldSavePath;


import java.nio.file.Path;

public class WorldSaveUtil {

    public static Path getWorldPath(MinecraftServer server) {
        return server.getSavePath(WorldSavePath.ROOT);
    }

}

