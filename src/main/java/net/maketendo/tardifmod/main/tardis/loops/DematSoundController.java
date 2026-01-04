package net.maketendo.tardifmod.main.tardis.loops;

import net.maketendo.tardifmod.main.TARDIFDimensions;
import net.maketendo.tardifmod.main.TARDIFSounds;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;

import java.io.IOException;

public class DematSoundController {

    private static final int SOUND_INTERVAL_TICKS = 40;
    private static int tickCounter = 0;

    public static void serverTick(MinecraftServer server) {
        tickCounter++;

        if (tickCounter % SOUND_INTERVAL_TICKS != 0) return;

        for (TardisData data : TardisManager.getAll(server)) {
            if (!data.dematerialised) continue;

            ServerWorld world = server.getWorld(TARDIFDimensions.TARDIS_WORLD);
            if (world == null) continue;

            world.playSound(
                    null,
                    data.interiorOrigin,
                    TARDIFSounds.FLIGHT_LOOP,
                    SoundCategory.BLOCKS,
                    10.0f,
                    1.0f
            );
        }
    }
}

