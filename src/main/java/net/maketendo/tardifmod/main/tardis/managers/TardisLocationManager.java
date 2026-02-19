package net.maketendo.tardifmod.main.tardis.managers;

import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisDataManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;

public class TardisLocationManager {
    public static void setInteriorDoorLocation(Integer id, Vec3d location) {
        TardisData data = TardisDataManager.get(id);
        data.setVec3d("interior_door_location", location);
    }

    public static Vec3d getInteriorDoorLocation(Integer id) {
        TardisData data = TardisDataManager.get(id);
        return data.getVec3("interior_door_location");
    }

    public static void setExteriorLocation(Integer id, Vec3d location) {
        TardisData data = TardisDataManager.get(id);
        data.setVec3d("exterior_location", location);
    }

    public static Vec3d getExteriorLocation(Integer id) {
        TardisData data = TardisDataManager.get(id);
        return data.getVec3("exterior_location");
    }

    public static void setExteriorDimension(Integer id, Identifier identifier) {
        TardisData data = TardisDataManager.get(id);
        data.setString("exterior_dimension", identifier.toString());
    }

    public static Identifier getExteriorDimension(Integer id) {
        TardisData data = TardisDataManager.get(id);
        if (data == null) return null;

        String dimString = data.getString("exterior_dimension");
        return Identifier.of(dimString);
    }

}
