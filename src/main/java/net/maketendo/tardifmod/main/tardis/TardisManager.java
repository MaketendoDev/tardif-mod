package net.maketendo.tardifmod.main.tardis;

import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerWorld;

import java.util.UUID;

public class TardisManager {
    public static TARDISEntity getTardisExterior(int id) {
        TardisData tardis = TardisDataManager.get(id);

        String uuidString = tardis.getString("exterior_uuid");
        if (uuidString.isEmpty()) return null;

        //ServerWorld level = (ServerWorld) TardisDimensionManager.getTardisDimension(id);
        if (level == null) return null;

        Entity entity = level.getEntity(UUID.fromString(uuidString));

        return entity instanceof TARDISEntity exterior ? exterior : null;
    }

}
