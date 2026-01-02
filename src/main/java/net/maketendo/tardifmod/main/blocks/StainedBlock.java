package net.maketendo.tardifmod.main.blocks;

import net.maketendo.tardifmod.main.TARDIFTags;
import net.maketendo.tardifmod.utils.StainedQuartzRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StainedBlock extends Block {

    public StainedBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        if (world.isClient()) {
            return ActionResult.PASS;
        }

        if (player.getOffHandStack().isIn(TARDIFTags.Items.PAINT_BRUSH)) {
            Block replacement = StainedQuartzRegistry.getFromDye(stack);
            if (replacement == null) {
                return ActionResult.PASS;
            }

            world.setBlockState(pos, replacement.getDefaultState());
            world.playSound(null, pos, SoundEvents.ITEM_HONEYCOMB_WAX_ON, SoundCategory.BLOCKS, 0.5f, 1f);

            if (!player.isCreative()) {
                stack.decrement(1);
            }

            return ActionResult.CONSUME;
        }

        return ActionResult.PASS;
    }
}
