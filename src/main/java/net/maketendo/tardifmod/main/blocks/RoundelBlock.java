package net.maketendo.tardifmod.main.blocks;

import com.mojang.serialization.MapCodec;
import net.maketendo.tardifmod.main.TARDIFBlockEntities;
import net.maketendo.tardifmod.main.TARDIFBlocks;
import net.maketendo.tardifmod.main.TARDIFDimensions;
import net.maketendo.tardifmod.main.blockentities.RoundelBlockEntity;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisInteriorResolver;
import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class RoundelBlock extends BlockWithEntity {

    public static final IntProperty LIGHT = IntProperty.of("light", 0, 15);
    public static final EnumProperty<Direction> FACING = Properties.HORIZONTAL_FACING;


    public RoundelBlock(Settings settings) {
        super(settings.luminance(state -> state.get(LIGHT)));
        this.setDefaultState(
                this.stateManager.getDefaultState()
                        .with(LIGHT, 0)
                        .with(FACING, Direction.NORTH)
        );
    }


    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(
            World world, BlockState state, BlockEntityType<T> type) {

        if (type == TARDIFBlockEntities.ROUNDELS) {
            return (world1, pos, state1, be) ->
                    RoundelBlockEntity.tick(world1, pos, state1, (RoundelBlockEntity) be);
        }
        return null;

    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return RoundelBlock.createCodec(RoundelBlock::new);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new RoundelBlockEntity(pos, state);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIGHT, FACING);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState()
                .with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

}

