package net.maketendo.tardifmod.main.blocks;

import com.mojang.serialization.MapCodec;
import net.maketendo.tardifmod.main.TARDIFBlockEntities;
import net.maketendo.tardifmod.main.blockentities.RoundelBlockEntity;
import net.maketendo.tardifmod.main.blockentities.TardisConsoleBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import org.jetbrains.annotations.Nullable;

public class TardisConsoleBlock extends BaseEntityBlock {

    public static final IntegerProperty LIGHT = IntegerProperty.create("light", 0, 15);

    public TardisConsoleBlock(Properties settings) {
        super(settings.lightLevel(state -> state.getValue(LIGHT)));
        this.registerDefaultState(
                this.stateDefinition.any()
                        .setValue(LIGHT, 0)
        );
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return TardisConsoleBlock.simpleCodec(TardisConsoleBlock::new);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new TardisConsoleBlockEntity(pos, state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIGHT);
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.INVISIBLE;
    }
}

