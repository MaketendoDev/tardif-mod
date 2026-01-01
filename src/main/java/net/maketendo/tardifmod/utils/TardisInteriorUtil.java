package net.maketendo.tardifmod.utils;

import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class TardisInteriorUtil {
    public static final int SPACING = 128;

    public static BlockPos allocate(MinecraftServer server) throws IOException {
        int count = TardisManager.getTardisCount(server);

        int x = (count % 64) * (SPACING* 2 );
        int z = (count / 64) * (SPACING * 2);

        return new BlockPos(x, 64, z);
    }
}
