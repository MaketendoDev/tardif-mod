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

        //ServerWorld world = (ServerWorld) TardisDimensionManager.getTardisDimension(id);
        if (world == null) return null;

        Entity entity = world.getEntity(UUID.fromString(uuidString));

        return entity instanceof TARDISEntity exterior ? exterior : null;
    }

}
