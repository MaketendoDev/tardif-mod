package net.maketendo.tardifmod.main.items;

import net.maketendo.tardifmod.main.TARDIFEntities;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.minecraft.block.BlockState;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.io.IOException;

public class TardisItem extends Item {
    public TardisItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();

        if (!world.isClient()) {
            BlockPos pos = context.getBlockPos();
            BlockState state = world.getBlockState(pos);
            ServerWorld serverWorld = (ServerWorld) world;
            PlayerEntity player = context.getPlayer();

            double y;

            if (context.getSide() == Direction.UP) {

                TARDISEntity tardis = TARDIFEntities.TARDIS.create(world, SpawnReason.SPAWN_ITEM_USE);
                try {
                    assert tardis != null;
                    tardis.initializeTardis(serverWorld);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                TardisData data = TardisManager.get(world.getServer(), tardis.getTardisId());
                if (player != null) {
                    data.owner = player.getUuid();
                }

                double x = pos.getX() + 0.5;
                double z = pos.getZ() + 0.5;

                if (state.isFullCube(world, pos)) {
                    y = pos.getY() + 1;
                } else {
                    y = pos.getY();
                }

                tardis.refreshPositionAndAngles(x, y, z, context.getPlayerYaw() - 180, 0);
                serverWorld.spawnEntity(tardis);

                if (!player.isCreative()) {
                    context.getStack().decrement(1);
                }

                player.sendMessage(Text.translatable("message.tardif_mod.tardis_item.created_tardis").formatted(Formatting.GREEN),true);
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }
}
