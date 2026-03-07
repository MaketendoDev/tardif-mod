package net.maketendo.tardifmod.utils;

import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.TARDIFBlocks;
import net.maketendo.tardifmod.main.TARDIFEntities;
import net.maketendo.tardifmod.main.entities.tardis.TardisInteriorDoorEntity;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.resources.Identifier;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import net.minecraft.world.phys.Vec3;
import java.io.IOException;

public class TardisInteriorUtil {

    public static final int SPACING = 128;

    public static BlockPos allocate(MinecraftServer server) throws IOException {
        int count = TardisManager.getTardisCount(server);

        int x = (count % 64) * (SPACING* 2 );
        int z = (count / 64) * (SPACING * 2);

        return new BlockPos(x, 64, z);
    }

    public static void generate(ServerLevel world, BlockPos center, TardisData data) {
        StructureTemplateManager manager = world.getStructureManager();
        StructureTemplate template = manager.get(
                Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "crystal")
        ).orElse(null);

        if (template == null) {
            TARDIFMod.LOGGER.error("TARDIS interior structure not found!");
            return;
        }

        Vec3i sizeVec = template.getSize();
        BlockPos size = new BlockPos(sizeVec.getX(), sizeVec.getY(), sizeVec.getZ());

        BlockPos placementPos = center.offset(
                -size.getX() / 2,
                0,
                -size.getZ() / 2
        );


        StructurePlaceSettings placement = new StructurePlaceSettings();

        template.placeInWorld(
                world,
                placementPos,
                placementPos,
                placement,
                world.random,
                2
        );

        handleMarkers(world, placementPos, size, data);
    }

    private static void handleMarkers(ServerLevel world, BlockPos start, BlockPos size, TardisData data) {
        BlockPos end = start.offset(size).offset(-1, -1, -1);

        BlockPos.betweenClosed(start, end).forEach(pos -> {
            var state = world.getBlockState(pos);

            if (state.is(TARDIFBlocks.INTERIOR_DOOR_GENERATOR_BLOCK)) {
                spawnTardisDoor(world, pos, state, data);
                world.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
            }
        });
    }


    private static void spawnTardisDoor(ServerLevel world, BlockPos pos, BlockState state, TardisData data) {
        Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);

        double x = pos.getX() + 0.5;
        double y = pos.getY();
        double z = pos.getZ() + 0.5;

        data.interiorPos = new Vec3(x, y, z);

        x -= facing.getStepX() * 0.45;
        z -= facing.getStepZ() * 0.45;

        float yaw = yawFromFacing(facing);

        TardisInteriorDoorEntity door =
                new TardisInteriorDoorEntity(TARDIFEntities.TARDIS_INTERIOR_DOOR, world);

        door.snapTo(x, y, z, yaw, 0);
        door.setTardisId(data.id);
        world.setChunkForced((int) x, (int) z, true);
        world.addFreshEntity(door);
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

    public static boolean isInside(BlockPos origin, int radius, BlockPos pos) {
        return Math.abs(pos.getX() - origin.getX()) <= radius
                && Math.abs(pos.getY() - origin.getY()) <= radius
                && Math.abs(pos.getZ() - origin.getZ()) <= radius;
    }
}

