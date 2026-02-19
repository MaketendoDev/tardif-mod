package net.maketendo.tardifmod.main.tardis.managers;

import net.maketendo.tardifmod.client.packets.TardisAnimPackets;
import net.maketendo.tardifmod.main.TARDIFDimensions;
import net.maketendo.tardifmod.main.TARDIFEntities;
import net.maketendo.tardifmod.main.TARDIFSounds;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisDataManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class TardisTravelManager {

    public static void setDematerialised(Integer id, boolean value) {
        TardisData data = TardisDataManager.get(id);
        data.setString("dematerialised", Boolean.toString(value));
    }

    public static boolean getDematerialised(Integer id) {
        TardisData data = TardisDataManager.get(id);
        return Boolean.getBoolean(data.getString("dematerialised"));
    }

    public static void setTargetExteriorLocation(Integer id, Vec3d location) {
        TardisData data = TardisDataManager.get(id);
        data.setVec3d("target_exterior_location", location);
    }

    public static Vec3d getTargetExteriorLocation(Integer id) {
        TardisData data = TardisDataManager.get(id);
        return data.getVec3("target_exterior_location");
    }

    public static void setTargetExteriorDimension(Integer id, Identifier identifier) {
        TardisData data = TardisDataManager.get(id);
        data.setString("target_exterior_dimension", identifier.toString());
    }

    public static Identifier getTargetExteriorDimension(Integer id) {
        TardisData data = TardisDataManager.get(id);
        if (data == null) return null;

        String dimString = data.getString("target_exterior_dimension");
        return Identifier.of(dimString);
    }



    public static void dematTardis(Integer id, Entity entity, MinecraftServer server) {
        setDematerialised(id, true);

        ServerWorld intWorld = server.getWorld(TARDIFDimensions.TARDIS_WORLD);
        if (intWorld == null) return;

        Vec3d interior_location = TardisLocationManager.getInteriorDoorLocation(id);
        Vec3d exterior_location = TardisLocationManager.getExteriorLocation(id);

        intWorld.playSound(
                null,
                interior_location.x,
                interior_location.y,
                interior_location.z,
                TARDIFSounds.DEMATERIALISATION,
                SoundCategory.BLOCKS,
                10.0f,
                1.0f
        );

        ServerWorld extWorld = server.getWorld(TARDIFDimensions.TARDIS_WORLD);
        if (extWorld == null) return;

        extWorld.playSound(
                null,
                exterior_location.x,
                exterior_location.y,
                exterior_location.z,
                TARDIFSounds.DEMATERIALISATION,
                SoundCategory.BLOCKS,
                5.0f,
                1.0f
        );

        TardisAnimPackets.send(extWorld, entity, 0);

    }

    public static void rematTardis(Integer id, Entity entity, MinecraftServer server) {
        setDematerialised(id, false);

        ServerWorld intWorld = server.getWorld(TARDIFDimensions.TARDIS_WORLD);

        Vec3d interior_location = TardisLocationManager.getInteriorDoorLocation(id);
        Vec3d exterior_location = TardisLocationManager.getExteriorLocation(id);

        if (intWorld != null) {
            intWorld.playSound(
                    null,
                    interior_location.x,
                    interior_location.y,
                    interior_location.z,
                    TARDIFSounds.MATERIALISATION,
                    SoundCategory.BLOCKS,
                    10.0f,
                    1.0f
            );
        }

        ServerWorld extWorld = server.getWorld(TARDIFDimensions.TARDIS_WORLD);
        Vec3d target_exterior_location = getTargetExteriorLocation(id);

        if (extWorld != null) {
            extWorld.playSound(
                    null,
                    exterior_location.x,
                    exterior_location.y,
                    exterior_location.z,
                    TARDIFSounds.MATERIALISATION,
                    SoundCategory.BLOCKS,
                    5.0f,
                    1.0f
            );

            ServerWorld landingWorld = server.getWorld(RegistryKey.of(RegistryKeys.WORLD, getTargetExteriorDimension(id)));
            if (landingWorld != null) {

                landingWorld.setChunkForced((int) target_exterior_location.getX(), (int) target_exterior_location.getY(), true);

                Entity rematTardis = TARDIFEntities.TARDIS.spawn(
                        landingWorld,
                        BlockPos.ofFloored(exterior_location),
                        SpawnReason.TRIGGERED
                );

                if (rematTardis instanceof TARDISEntity tardis) {
                    tardis.preInitialised();
                    tardis.setTardisId(id);

                    TardisLocationManager.setExteriorLocation(id, new Vec3d(
                            target_exterior_location.getX() + 0.5,
                            target_exterior_location.getY(),
                            target_exterior_location.getZ() + 0.5
                    ));

                    tardis.setPos(
                            target_exterior_location.getX() + 0.5,
                            target_exterior_location.getY(),
                            target_exterior_location.getZ() + 0.5
                    );

                    extWorld.spawnEntity(tardis);
                }
            }

        }
    }

}
