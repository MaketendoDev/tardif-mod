package net.maketendo.tardifmod.main.entities.controls;

import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.blockentities.TardisConsoleBlockEntity;
import net.maketendo.tardifmod.main.entities.ConsoleControlEntity;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.maketendo.tardifmod.utils.TardisWorldUtil;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HandbrakeControlEntity extends ConsoleControlEntity {

    public HandbrakeControlEntity(EntityType<?> type, World world) {
        super(type, world);
    }

    @Override
    public void onUse(PlayerEntity player) {
        BlockPos pos = getConsolePos();
        if (pos == null) return;

        if (getEntityWorld().getBlockEntity(pos) instanceof TardisConsoleBlockEntity console) {
            TardisData tardis = TardisWorldUtil.getTardisData(getEntityWorld(), getConsolePos());
            //console.toggleHandbrake(player);
            assert tardis != null;
            tardis.dematerialised = true;
        }
    }
}

