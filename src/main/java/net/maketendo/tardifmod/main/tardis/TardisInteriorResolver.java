package net.maketendo.tardifmod.main.tardis;

import net.maketendo.tardifmod.main.blocks.RoundelBlock;
import net.maketendo.tardifmod.utils.TardisInteriorUtil;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;
import java.util.function.Consumer;

public class TardisInteriorResolver {

    public static Integer getTardisIdAt(ServerWorld world, BlockPos pos) {
        MinecraftServer server = world.getServer();

        try {
            for (int id : TardisManager.getIterableTardisCount(server)) {
                TardisData data = TardisManager.get(server, id);
                if (data == null) continue;

                if (!data.interiorDimension.equals(world.getRegistryKey().getValue()))
                    continue;

                if (isInside(data.interiorOrigin, TardisInteriorUtil.SPACING, pos)) {
                    return id;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    private static boolean isInside(BlockPos origin, int radius, BlockPos pos) {
        return Math.abs(pos.getX() - origin.getX()) <= radius
                && Math.abs(pos.getY() - origin.getY()) <= radius
                && Math.abs(pos.getZ() - origin.getZ()) <= radius;
    }


    public static void forEachRoundel(ServerWorld world, int tardisId, Consumer<BlockPos> consumer) {
        TardisData data = TardisManager.get(world.getServer(), tardisId);
        if (data == null) return;

        for (BlockPos pos : data.roundelPositions) {
            consumer.accept(pos);
        }
    }
}

