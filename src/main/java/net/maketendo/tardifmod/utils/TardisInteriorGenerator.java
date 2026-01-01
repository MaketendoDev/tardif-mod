package net.maketendo.tardifmod.utils;


import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class TardisInteriorGenerator {

    public static void generate(ServerWorld world, BlockPos origin) {
        TARDIFMod.LOGGER.debug(origin.toString());
        // Simple 9x9 floor
        for (int x = -4; x <= 4; x++) {
            for (int z = -4; z <= 4; z++) {
                world.setBlockState(origin.add(x, 0, z),
                        Blocks.COBBLESTONE.getDefaultState());
            }
        }
    }
}

