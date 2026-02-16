package net.maketendo.tardifmod.main.blocks;

import com.mojang.serialization.MapCodec;
import net.maketendo.tardifmod.main.TARDIFBlockEntities;
import net.maketendo.tardifmod.main.blockentities.RoundelBlockEntity;
import net.maketendo.tardifmod.main.blockentities.TardisConsoleBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class TardisConsoleBlock extends BlockWithEntity {

    public static final IntProperty LIGHT = IntProperty.of("light", 0, 15);

    public TardisConsoleBlock(Settings settings) {
        super(settings.luminance(state -> state.get(LIGHT)));
        this.setDefaultState(
                this.stateManager.getDefaultState()
                        .with(LIGHT, 0)
        );
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return TardisConsoleBlock.createCodec(TardisConsoleBlock::new);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new TardisConsoleBlockEntity(pos, state);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIGHT);
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.INVISIBLE;
    }
}

