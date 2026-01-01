package net.maketendo.tardifmod.main.blocks.panels;

import com.mojang.serialization.MapCodec;
import net.maketendo.tardifmod.main.blockentities.panels.PowerPanelBlockEntity;
import net.maketendo.tardifmod.utils.ShapeUtil;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;

import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jspecify.annotations.Nullable;

public class PowerPanelBlock extends BlockWithEntity {

    public static final EnumProperty<Direction> FACING = Properties.HORIZONTAL_FACING;

    public PowerPanelBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return PowerPanelBlock.createCodec(PowerPanelBlock::new);
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new PowerPanelBlockEntity(pos, state);
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
                handlePartClick(part, world, pos, player);
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
                .box(1, 0, 1, 3, 1, 3)
                .box(6, 0, 2, 5, 1, 3)
                .box(11, 0, 10, 3, 3, 4)
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
            PlayerEntity player
    ) {
        switch (part) {
            case BUTTON_A -> player.sendMessage(Text.literal("Button A"), true);
            case BUTTON_B -> player.sendMessage(Text.literal("Button B"), true);
            case SWITCH   -> player.sendMessage(Text.literal("Switch"), true);
        }
    }



    public enum PowerPanelPart {
        BUTTON_A(1, 0, 1, 3, 1, 3),
        BUTTON_B(6, 0, 2, 5, 1, 3),
        SWITCH   (11, 0, 10, 3, 3, 4);

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

}
