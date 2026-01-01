package net.maketendo.tardifmod.main.blocks;

import net.maketendo.tardifmod.main.TARDIFDimensions;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisInteriorResolver;
import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class RoundelBlock extends Block {

    public static final IntProperty LIGHT = IntProperty.of("light", 0, 15);

    public RoundelBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(LIGHT, 0));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIGHT);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state,
                         LivingEntity placer, ItemStack stack) {

        if (world instanceof ServerWorld serverWorld) {
            update(serverWorld, pos);

            int tardisId = TardisInteriorResolver.getTardisIdAt(serverWorld, pos);
            if (tardisId >= 0) {
                TardisData data = TardisManager.get(serverWorld.getServer(), tardisId);
                if (data != null) {
                    data.roundelPositions.add(pos.toImmutable());
                }
            }
        }

    }

    @Override
    protected void onBlockAdded(BlockState state, World world, BlockPos pos,
                                BlockState oldState, boolean notify) {
        if (!oldState.isOf(state.getBlock()) && world instanceof ServerWorld serverWorld) {
            update(serverWorld, pos);
        }
    }

    @Override
    protected void onStateReplaced(BlockState state, ServerWorld world, BlockPos pos, boolean moved) {
        if (!world.isClient() && state.getBlock() != state.getBlock()) {
            if (world instanceof ServerWorld serverWorld) {
                int tardisId = TardisInteriorResolver.getTardisIdAt(serverWorld, pos);
                if (tardisId >= 0) {
                    TardisData data = TardisManager.get(serverWorld.getServer(), tardisId);
                    if (data != null) {
                        data.roundelPositions.remove(pos);
                    }
                }
            }
        }
        super.onStateReplaced(state, world, pos, moved);
    }

    public void update(ServerWorld world, BlockPos pos) {
        if (world.getRegistryKey() != TARDIFDimensions.TARDIS_WORLD) return;

        int tardisId = TardisInteriorResolver.getTardisIdAt(world, pos);
        if (tardisId < 0) return;

        TardisData data = TardisManager.get(world.getServer(), tardisId);
        if (data == null) return;

        int light = MathHelper.clamp(data.roundelLight, 0, 15);

        BlockState state = world.getBlockState(pos);

        if (state.get(LIGHT) != light) {
            BlockState newState = state.with(LIGHT, light);

            world.setBlockState(pos, newState, Block.NOTIFY_ALL);

            world.getChunkManager().getLightingProvider().checkBlock(pos);

            world.updateListeners(pos, state, newState, Block.NOTIFY_ALL);
        }
    }

}
