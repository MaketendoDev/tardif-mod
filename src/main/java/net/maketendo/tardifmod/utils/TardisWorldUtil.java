package net.maketendo.tardifmod.utils;

import net.maketendo.tardifmod.main.TARDIFDimensions;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisInteriorResolver;
import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public final class TardisWorldUtil {

    private TardisWorldUtil() {}

    @Nullable
    public static TardisData getTardisData(World world, BlockPos pos) {
        if (world.isClient()) return null;
        if (!(world instanceof ServerWorld serverWorld)) return null;

        ServerWorld tardisWorld = serverWorld.getServer()
                .getWorld(TARDIFDimensions.TARDIS_WORLD);

        if (tardisWorld == null) return null;
        if (serverWorld != tardisWorld) return null;

        int tardisId = TardisInteriorResolver.getTardisIdAt(tardisWorld, pos);
        if (tardisId < 0) return null;

        return TardisManager.get(serverWorld.getServer(), tardisId);
    }
}

