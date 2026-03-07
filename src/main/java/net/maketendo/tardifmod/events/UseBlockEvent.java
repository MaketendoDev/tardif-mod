package net.maketendo.tardifmod.events;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.maketendo.tardifmod.main.TARDIFTags;

import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.maketendo.tardifmod.utils.StainedQuartzRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class UseBlockEvent {
    public static void register() {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            if (world.isClientSide()) return InteractionResult.PASS;
            if (!(world instanceof ServerLevel serverWorld)) return InteractionResult.PASS;

            BlockPos pos = hitResult.getBlockPos().relative(hitResult.getDirection());

            Integer tardisId = TardisManager.getTardisInteriorId(serverWorld, pos);
            if (tardisId != null) {
                player.displayClientMessage(
                        Component.literal("Placed block in TARDIS ID: " + tardisId),
                        false
                );
            }

            return InteractionResult.PASS;
        });

    }

    public static void registerQuartz() {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            if (world.isClientSide()) return InteractionResult.PASS;

            BlockPos pos = hitResult.getBlockPos();
            BlockState state = world.getBlockState(pos);

            if (!state.is(Blocks.QUARTZ_BLOCK)) return InteractionResult.PASS;

            if (!player.getOffhandItem().is(TARDIFTags.Items.PAINT_BRUSH)) {
                return InteractionResult.PASS;
            }

            ItemStack brush = player.getOffhandItem();
            Block replacement = StainedQuartzRegistry.getFromDye(brush);
            if (replacement == null) return InteractionResult.PASS;

            world.setBlockAndUpdate(pos, replacement.defaultBlockState());
            world.playSound(
                    null,
                    pos,
                    SoundEvents.HONEYCOMB_WAX_ON,
                    SoundSource.BLOCKS,
                    0.5f,
                    1f
            );

            if (!player.isCreative()) {
                brush.shrink(1);
            }

            return InteractionResult.CONSUME;
        });

    }
}
