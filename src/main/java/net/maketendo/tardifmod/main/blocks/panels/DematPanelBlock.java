package net.maketendo.tardifmod.main.blocks.panels;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.maketendo.tardifmod.main.TARDIFSounds;
import net.maketendo.tardifmod.main.blockentities.panels.DematPanelBlockEntity;
import net.maketendo.tardifmod.main.blockentities.panels.PowerPanelBlockEntity;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.maketendo.tardifmod.main.tardis.managers.TardisTravelManager;
import net.maketendo.tardifmod.utils.ShapeUtil;
import net.maketendo.tardifmod.utils.TardisWorldUtil;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.block.WireOrientation;
import org.jspecify.annotations.Nullable;

public class DematPanelBlock extends BlockWithEntity {

    public static final EnumProperty<Direction> FACING = Properties.HORIZONTAL_FACING;

    public DematPanelBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return DematPanelBlock.createCodec(DematPanelBlock::new);
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new DematPanelBlockEntity(pos, state);
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.INVISIBLE;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState()
                .with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {

        if (world.isClient()) {return ActionResult.PASS;}

        TardisData data = TardisWorldUtil.getTardisData(world, pos);
        if (data == null) return ActionResult.PASS;

        Vec3d local = hit.getPos().subtract(
                pos.getX(),
                pos.getY(),
                pos.getZ()
        );

        double lx = local.x * 16.0;
        double ly = local.y * 16.0;
        double lz = local.z * 16.0;

        Vec3d unrotated = unrotate(lx, ly, lz, state.get(FACING));

        for (PowerPanelPart part : PowerPanelPart.values()) {
            if (part.contains(unrotated.x, unrotated.y, unrotated.z)) {
                handlePartClick(part, world, pos, player, data);
                return ActionResult.CONSUME;
            }
        }

        return ActionResult.PASS;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    protected VoxelShape getCollisionShape(
            BlockState state, BlockView world, BlockPos pos, ShapeContext context
    ) {
        VoxelShape shape = ShapeUtil.builder()
                .box(0, 0, 0, 16, 4, 16)
                .build();

        return ShapeUtil.rotateY(shape, state.get(FACING));
    }

    @Override
    protected VoxelShape getOutlineShape(
            BlockState state, BlockView world, BlockPos pos, ShapeContext context
    ) {
        VoxelShape shape = ShapeUtil.builder()
                .box(11, 0, 1, 3, 3, 6)
                .box(6, 0, 1, 3, 3, 6)
                .box(1, 0, 2, 3, 2, 2)
                .box(5, 0, 9, 6, 1, 3)
                .build();

        return ShapeUtil.rotateY(shape, state.get(FACING));
    }

    private Vec3d unrotate(double x, double y, double z, Direction dir) {
        return switch (dir) {
            case EAST  -> new Vec3d(z, y, 16 - x);
            case SOUTH -> new Vec3d(16 - x, y, 16 - z);
            case WEST  -> new Vec3d(16 - z, y, x);
            default    -> new Vec3d(x, y, z); // NORTH
        };
    }

    private void handlePartClick(
            PowerPanelPart part,
            World world,
            BlockPos pos,
            PlayerEntity player,
            TardisData data
    ) {
        switch (part) {
            case LEVER_A -> {
                if (data.dematerialised) {
                    TardisTravelManager.rematTardis(data, TardisManager.getEntityFromId(data.id, world.getServer()), world.getServer());
                } else {
                    TardisTravelManager.dematTardis(data, TardisManager.getEntityFromId(data.id, world.getServer()), world.getServer());
                }
                player.sendMessage(Text.literal(data.dematerialised ? "Dematerialising..." : "Materializing..."), true);
            }
            case LEVER_B -> {

            }
            case SWITCH   -> {

            }
        }
    }

    public enum PowerPanelPart {
        LEVER_A (11, 0, 1, 3, 3, 6),
        LEVER_B (6, 0, 1, 3, 3, 6),
        SWITCH (1, 0, 2, 3, 2, 2);

        public final double x, y, z, w, h, l;

        PowerPanelPart(double x, double y, double z, double w, double h, double l) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
            this.h = h;
            this.l = l;
        }

        public boolean contains(double lx, double ly, double lz) {
            return lx >= x && lx <= x + w &&
                    ly >= y && ly <= y + h &&
                    lz >= z && lz <= z + l;
        }
    }

    @Override
    protected void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, @Nullable WireOrientation wireOrientation, boolean notify) {
        if (world.isClient()) return;

        TardisData data = TardisWorldUtil.getTardisData(world, pos);
        if (data == null) return;

        boolean poweredNow = world.isReceivingRedstonePower(pos);

        if (poweredNow) {
            data.powered = !data.powered;
        }
    }

}
