package net.maketendo.tardifmod.main.entities.controls;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class HandbrakeControlEntity extends ConsoleControlEntity {

    public HandbrakeControlEntity(EntityType<?> type, Level world) {
        super(type, world);
    }

//    @Override
//    public void onUse(PlayerEntity player) {
//        BlockPos pos = getConsolePos();
//        if (pos == null) return;
//
//        if (getEntityWorld().getBlockEntity(pos) instanceof TardisConsoleBlockEntity console) {
//            TardisData tardis = TardisWorldUtil.getTardisData(getEntityWorld(), getConsolePos());
//            //console.toggleHandbrake(player);
//            assert tardis != null;
//            tardis.dematerialised = true;
//        }
//    }
}

