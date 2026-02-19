package net.maketendo.tardifmod.main.tardis.managers;

import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisDataManager;
import net.minecraft.util.math.Vec3d;

public class TardisInformationManager {
    public static void setTardisId(Integer id, Integer new_id) {
        TardisData data = TardisDataManager.get(id);
        data.setInt("id", new_id);
    }

    public static Integer getTardisId(Integer id) {
        TardisData data = TardisDataManager.get(id);
        return data.getInt("id");
    }
}
