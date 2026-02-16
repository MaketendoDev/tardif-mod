package net.maketendo.tardifmod.utils;


import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.TARDIFBlocks;
import net.maketendo.tardifmod.main.TARDIFEntities;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.maketendo.tardifmod.main.entities.tardis.TARDISInteriorDoorEntity;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.particle.GlowParticle;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.Properties;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.StructureTemplate;
import net.minecraft.structure.StructureTemplateManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;

public class TardisInteriorGenerator {

    public static void generate(ServerWorld world, BlockPos center, TardisData data) {
        StructureTemplateManager manager = world.getStructureTemplateManager();
        StructureTemplate template = manager.getTemplate(
                Identifier.of(TARDIFMod.MOD_ID, "crystal")
        ).orElse(null);

        if (template == null) {
            TARDIFMod.LOGGER.error("TARDIS interior structure not found!");
            return;
        }

        Vec3i sizeVec = template.getSize();
        BlockPos size = new BlockPos(sizeVec.getX(), sizeVec.getY(), sizeVec.getZ());

        BlockPos placementPos = center.add(
                -size.getX() / 2,
                0,
                -size.getZ() / 2
        );


        StructurePlacementData placement = new StructurePlacementData();

        template.place(
                world,
                placementPos,
                placementPos,
                placement,
                world.random,
                2
        );

        handleMarkers(world, placementPos, size, data);
    }

    private static void handleMarkers(ServerWorld world, BlockPos start, BlockPos size, TardisData data) {
        BlockPos end = start.add(size).add(-1, -1, -1);

        BlockPos.iterate(start, end).forEach(pos -> {
            var state = world.getBlockState(pos);

            if (state.isOf(TARDIFBlocks.INTERIOR_DOOR_GENERATOR_BLOCK)) {
                spawnTardisDoor(world, pos, state, data);
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
            }
        });
    }


    private static void spawnTardisDoor(ServerWorld world, BlockPos pos, BlockState state, TardisData data) {
        Direction facing = state.get(Properties.HORIZONTAL_FACING);

        double x = pos.getX() + 0.5;
        double y = pos.getY();
        double z = pos.getZ() + 0.5;

        data.interiorPos = new Vec3d(x, y, z);

        x -= facing.getOffsetX() * 0.45;
        z -= facing.getOffsetZ() * 0.45;

        float yaw = yawFromFacing(facing);

        TARDISInteriorDoorEntity door =
                new TARDISInteriorDoorEntity(TARDIFEntities.TARDIS_INTERIOR_DOOR, world);

        door.refreshPositionAndAngles(x, y, z, yaw, 0);
        door.setTardisId(data.id);
        world.setChunkForced((int) x, (int) z, true);
        world.spawnEntity(door);
    }

    private static float yawFromFacing(Direction facing) {
        return switch (facing) {
            case SOUTH -> 180f;
            case WEST  -> -90f;
            case NORTH -> -180f;
            case EAST  -> -270f;
            default -> 180f;
        };
    }
}

