package net.maketendo.tardifmod.main.blocks;

import net.maketendo.tardifmod.main.TARDIFTags;
import net.maketendo.tardifmod.utils.StainedQuartzRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class StainedBlock extends Block {

    public StainedBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {

        if (world.isClientSide()) {
            return InteractionResult.PASS;
        }

        if (player.getOffhandItem().is(TARDIFTags.Items.PAINT_BRUSH)) {
            Block replacement = StainedQuartzRegistry.getFromDye(stack);
            if (replacement == null) {
                return InteractionResult.PASS;
            }

            world.setBlockAndUpdate(pos, replacement.defaultBlockState());
            world.playSound(null, pos, SoundEvents.HONEYCOMB_WAX_ON, SoundSource.BLOCKS, 0.5f, 1f);

            if (!player.isCreative()) {
                stack.shrink(1);
            }

            return InteractionResult.CONSUME;
        }

        return InteractionResult.PASS;
    }
}
