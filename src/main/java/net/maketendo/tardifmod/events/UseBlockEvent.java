package net.maketendo.tardifmod.events;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.maketendo.tardifmod.main.TARDIFTags;
import net.maketendo.tardifmod.main.tardis.TardisInteriorResolver;
import net.maketendo.tardifmod.utils.StainedQuartzRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class UseBlockEvent {
    public static void register() {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            if (world.isClient()) return ActionResult.PASS;
            if (!(world instanceof ServerWorld serverWorld)) return ActionResult.PASS;

            BlockPos pos = hitResult.getBlockPos().offset(hitResult.getSide());

            Integer tardisId = TardisInteriorResolver.getTardisIdAt(serverWorld, pos);
            if (tardisId != null) {
                player.sendMessage(
                        Text.literal("Placed block in TARDIS ID: " + tardisId),
                        false
                );
            }

            return ActionResult.PASS;
        });

    }

    public static void registerQuartz() {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            if (world.isClient()) return ActionResult.PASS;

            BlockPos pos = hitResult.getBlockPos();
            BlockState state = world.getBlockState(pos);

            if (!state.isOf(Blocks.QUARTZ_BLOCK)) return ActionResult.PASS;

            if (!player.getOffHandStack().isIn(TARDIFTags.Items.PAINT_BRUSH)) {
                return ActionResult.PASS;
            }

            ItemStack brush = player.getOffHandStack();
            Block replacement = StainedQuartzRegistry.getFromDye(brush);
            if (replacement == null) return ActionResult.PASS;

            world.setBlockState(pos, replacement.getDefaultState());
            world.playSound(
                    null,
                    pos,
                    SoundEvents.ITEM_HONEYCOMB_WAX_ON,
                    SoundCategory.BLOCKS,
                    0.5f,
                    1f
            );

            if (!player.isCreative()) {
                brush.decrement(1);
            }

            return ActionResult.CONSUME;
        });

    }
}
