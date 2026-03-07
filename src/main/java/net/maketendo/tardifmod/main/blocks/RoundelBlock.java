package net.maketendo.tardifmod.main.blocks;

import com.mojang.serialization.MapCodec;
import net.maketendo.tardifmod.main.TARDIFBlockEntities;
import net.maketendo.tardifmod.main.blockentities.RoundelBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import org.jetbrains.annotations.Nullable;

public class RoundelBlock extends BaseEntityBlock {

    public static final IntegerProperty LIGHT = IntegerProperty.create("light", 0, 15);
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;


    public RoundelBlock(Properties settings) {
        super(settings.lightLevel(state -> state.getValue(LIGHT)));
        this.registerDefaultState(
                this.stateDefinition.any()
                        .setValue(LIGHT, 0)
                        .setValue(FACING, Direction.NORTH)
        );
    }


    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(
            Level world, BlockState state, BlockEntityType<T> type) {

        if (type == TARDIFBlockEntities.ROUNDELS) {
            return (world1, pos, state1, be) ->
                    RoundelBlockEntity.tick(world1, pos, state1, (RoundelBlockEntity) be);
        }
        return null;

    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return RoundelBlock.simpleCodec(RoundelBlock::new);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new RoundelBlockEntity(pos, state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIGHT, FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState()
                .setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

}

