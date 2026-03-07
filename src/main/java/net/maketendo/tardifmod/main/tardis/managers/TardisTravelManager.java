package net.maketendo.tardifmod.main.tardis.managers;

import net.maketendo.tardifmod.client.packets.TardisAnimPackets;
import net.maketendo.tardifmod.main.TARDIFDimensions;
import net.maketendo.tardifmod.main.TARDIFEntities;
import net.maketendo.tardifmod.main.TARDIFSounds;
import net.maketendo.tardifmod.main.entities.tardis.TardisEntity;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.phys.Vec3;

public class TardisTravelManager {
    public static void dematTardis(TardisData data, Entity entity, MinecraftServer server) {
        data.dematerialised = true;

        ServerLevel intWorld = server.getLevel(TARDIFDimensions.TARDIS_WORLD);
        if (intWorld == null) return;

        intWorld.playSound(
                null,
                data.interiorOrigin.getX(),
                data.interiorOrigin.getY(),
                data.interiorOrigin.getZ(),
                TARDIFSounds.DEMATERIALISATION,
                SoundSource.BLOCKS,
                10.0f,
                1.0f
        );

        ServerLevel extWorld = server.getLevel(TARDIFDimensions.TARDIS_WORLD);
        if (extWorld == null) return;

        extWorld.playSound(
                null,
                data.exteriorPos.x(),
                data.exteriorPos.y(),
                data.exteriorPos.z(),
                TARDIFSounds.DEMATERIALISATION,
                SoundSource.BLOCKS,
                5.0f,
                1.0f
        );

        TardisAnimPackets.send(extWorld, entity, 0);

    }

    public static void rematTardis(TardisData data, Entity entity, MinecraftServer server) {
        data.dematerialised = false;

        ServerLevel intWorld = server.getLevel(TARDIFDimensions.TARDIS_WORLD);
        if (intWorld != null) {
            intWorld.playSound(
                    null,
                    data.interiorOrigin,
                    TARDIFSounds.MATERIALISATION,
                    SoundSource.BLOCKS,
                    10.0f,
                    1.0f
            );
        }

        ServerLevel extWorld = server.getLevel(TARDIFDimensions.TARDIS_WORLD);
        if (extWorld != null) {
            extWorld.playSound(
                    null,
                    data.exteriorPos.x(),
                    data.exteriorPos.y(),
                    data.exteriorPos.z(),
                    TARDIFSounds.MATERIALISATION,
                    SoundSource.BLOCKS,
                    5.0f,
                    1.0f
            );

            ServerLevel landingWorld = server.getLevel(ResourceKey.create(Registries.DIMENSION, data.exteriorDimension));
            if (landingWorld != null) {

                landingWorld.setChunkForced((int) data.setPos.x(), (int) data.setPos.y(), true);

                Entity rematTardis = TARDIFEntities.TARDIS.spawn(
                        landingWorld,
                        BlockPos.containing(data.exteriorPos),
                        EntitySpawnReason.TRIGGERED
                );

                if (rematTardis instanceof TardisEntity tardis) {
                    tardis.preInitialised();
                    tardis.setTardisId(data.id);

                    data.exteriorPos = new Vec3(
                            data.setPos.x() + 0.5,
                            data.setPos.y(),
                            data.setPos.z() + 0.5
                    );

                    tardis.setPosRaw(
                            data.setPos.x() + 0.5,
                            data.setPos.y(),
                            data.setPos.z() + 0.5
                    );

                    extWorld.addFreshEntity(tardis);
                }
            }

        }
    }

}