package net.maketendo.tardifmod.main.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.redstone.Orientation;
import org.jspecify.annotations.Nullable;

public class RedstoneRoundelBlock extends Block {
    public static final MapCodec<RedstoneRoundelBlock> CODEC = simpleCodec(RedstoneRoundelBlock::new);
    public static final BooleanProperty LIT;

    public MapCodec<RedstoneRoundelBlock> codec() {
        return CODEC;
    }

    public RedstoneRoundelBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)this.defaultBlockState().setValue(LIT, false));
    }

    public @Nullable BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        return (BlockState)this.defaultBlockState().setValue(LIT, blockPlaceContext.getLevel().hasNeighborSignal(blockPlaceContext.getClickedPos()));
    }

    protected void neighborChanged(BlockState blockState, Level level, BlockPos blockPos, Block block, @Nullable Orientation orientation, boolean bl) {
        if (!level.isClientSide()) {
            boolean bl2 = (Boolean)blockState.getValue(LIT);
            if (bl2 != level.hasNeighborSignal(blockPos)) {
                if (bl2) {
                    level.scheduleTick(blockPos, this, 4);
                } else {
                    level.setBlock(blockPos, (BlockState)blockState.cycle(LIT), 2);
                }
            }

        }
    }

    protected void tick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        if ((Boolean)blockState.getValue(LIT) && !serverLevel.hasNeighborSignal(blockPos)) {
            serverLevel.setBlock(blockPos, (BlockState)blockState.cycle(LIT), 2);
        }

    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{LIT});
    }

    static {
        LIT = RedstoneTorchBlock.LIT;
    }
}
