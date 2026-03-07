package net.maketendo.tardifmod.main.items;

import net.maketendo.tardifmod.main.TARDIFEntities;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import java.io.IOException;

public class TardisItem extends Item {
    public TardisItem(Properties settings) {
        super(settings.rarity(Rarity.EPIC));
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();

        if (!world.isClientSide()) {
            BlockPos pos = context.getClickedPos();
            BlockState state = world.getBlockState(pos);
            ServerLevel serverWorld = (ServerLevel) world;
            Player player = context.getPlayer();

            double y;

            if (context.getClickedFace() == Direction.UP) {

                TARDISEntity tardis = TARDIFEntities.TARDIS.create(world, EntitySpawnReason.SPAWN_ITEM_USE);
                try {
                    assert tardis != null;
                    tardis.initializeTardis(serverWorld);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                TardisData data = TardisManager.getFromId(world.getServer(), tardis.getTardisId());
                if (player != null) {
                    data.owner = player.getUUID();
                }

                double x = pos.getX() + 0.5;
                double z = pos.getZ() + 0.5;

                if (state.isCollisionShapeFullBlock(world, pos)) {
                    y = pos.getY() + 1;
                } else {
                    y = pos.getY();
                }

                tardis.snapTo(x, y, z, context.getRotation() - 180, 0);
                serverWorld.addFreshEntity(tardis);

                if (!player.isCreative()) {
                    context.getItemInHand().shrink(1);
                }

                player.displayClientMessage(Component.translatable("message.tardif_mod.tardis_item.created_tardis").withStyle(ChatFormatting.GREEN),true);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }
}
