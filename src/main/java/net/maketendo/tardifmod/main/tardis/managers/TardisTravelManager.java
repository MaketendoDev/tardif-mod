package net.maketendo.tardifmod.main.tardis.managers;

import net.maketendo.tardifmod.main.TARDIFDimensions;
import net.maketendo.tardifmod.main.TARDIFEntities;
import net.maketendo.tardifmod.main.TARDIFSounds;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class TardisTravelManager {
    public static void dematTardis(TardisData data, MinecraftServer server) {
        data.dematerialised = true;

        ServerWorld intWorld = server.getWorld(TARDIFDimensions.TARDIS_WORLD);
        if (intWorld == null) return;

        intWorld.playSound(
                null,
                data.interiorOrigin.getX(),
                data.interiorOrigin.getY(),
                data.interiorOrigin.getZ(),
                TARDIFSounds.DEMATERIALISATION,
                SoundCategory.BLOCKS,
                10.0f,
                1.0f
        );

        ServerWorld extWorld = server.getWorld(TARDIFDimensions.TARDIS_WORLD);
        if (extWorld == null) return;

        extWorld.playSound(
                null,
                data.exteriorPos.getX(),
                data.exteriorPos.getY(),
                data.exteriorPos.getZ(),
                TARDIFSounds.DEMATERIALISATION,
                SoundCategory.BLOCKS,
                5.0f,
                1.0f
        );
    }

    public static void rematTardis(TardisData data, MinecraftServer server) {
        data.dematerialised = false;

        ServerWorld intWorld = server.getWorld(TARDIFDimensions.TARDIS_WORLD);
        if (intWorld != null) {
            intWorld.playSound(
                    null,
                    data.interiorOrigin,
                    TARDIFSounds.MATERIALISATION,
                    SoundCategory.BLOCKS,
                    10.0f,
                    1.0f
            );
        }

        ServerWorld extWorld = server.getWorld(TARDIFDimensions.TARDIS_WORLD);
        if (extWorld != null) {
            extWorld.playSound(
                    null,
                    data.exteriorPos.getX(),
                    data.exteriorPos.getY(),
                    data.exteriorPos.getZ(),
                    TARDIFSounds.MATERIALISATION,
                    SoundCategory.BLOCKS,
                    5.0f,
                    1.0f
            );

            ServerWorld landingWorld = server.getWorld(RegistryKey.of(RegistryKeys.WORLD, data.exteriorDimension));
            if (landingWorld != null) {

                landingWorld.setChunkForced((int) data.setPos.getX(), (int) data.setPos.getY(), true);

                Entity entity = TARDIFEntities.TARDIS.spawn(
                        landingWorld,
                        BlockPos.ofFloored(data.exteriorPos),
                        SpawnReason.TRIGGERED
                );

                if (entity instanceof TARDISEntity tardis) {
                    tardis.preInitialised();
                    tardis.setTardisId(data.id);

                    data.exteriorPos = new Vec3d(
                            data.setPos.getX() + 0.5,
                            data.setPos.getY(),
                            data.setPos.getZ() + 0.5
                    );

                    tardis.setPos(
                            data.setPos.getX() + 0.5,
                            data.setPos.getY(),
                            data.setPos.getZ() + 0.5
                    );

                    extWorld.spawnEntity(tardis);
                }
            }


        }
    }

}
