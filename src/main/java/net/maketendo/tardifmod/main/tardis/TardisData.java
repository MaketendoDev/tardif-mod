package net.maketendo.tardifmod.main.tardis;

import com.google.gson.JsonObject;
import net.maketendo.tardifmod.main.TARDIFDimensions;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.UUID;

public class TardisData {

    public int id;
    public UUID owner;

    public boolean doorOpen = false;
    public boolean doorLocked = false;
    public boolean powered = true;
    public boolean emergencyMode = false;
    public int roundelLight = 10;

    // Interior
    public float interiorYaw = 0f;
    public BlockPos interiorOrigin = BlockPos.ORIGIN;
    public Vec3d interiorPos = Vec3d.ZERO;
    public Identifier interiorDimension = TARDIFDimensions.TARDIS_DIM_ID;

    // Exterior
    public float exteriorYaw = 0f;
    public Vec3d exteriorPos = Vec3d.ZERO;
    public Identifier exteriorDimension = TARDIFDimensions.TARDIS_DIM_ID;

    // Travel
    public Vec3d previousPos = Vec3d.ZERO;
    public Vec3d setPos = Vec3d.ZERO;
    public boolean dematerialised = false;

    public JsonObject toJson() {
        JsonObject json = new JsonObject();

        json.addProperty("id", id);
        json.addProperty("owner", owner.toString());

        json.addProperty("door_open", doorOpen);
        json.addProperty("door_locked", doorLocked);
        json.addProperty("powered", powered);
        json.addProperty("emergency_mode", emergencyMode);
        json.addProperty("roundel_light", roundelLight);
        json.addProperty("dematerialised", dematerialised);

        json.addProperty("interior_yaw", interiorYaw);
        json.addProperty("interior_origin", interiorOrigin.asLong());
        json.add("interior_pos", vecToJson(interiorPos));
        json.addProperty("interior_dim", interiorDimension.toString());

        json.addProperty("exterior_yaw", exteriorYaw);
        json.add("exterior_pos", vecToJson(exteriorPos));
        json.addProperty("exterior_dim", exteriorDimension.toString());

        json.add("previous_pos", vecToJson(previousPos));
        json.add("set_pos", vecToJson(setPos));

        return json;
    }

    public static TardisData fromJson(JsonObject json) {
        TardisData data = new TardisData();

        data.id = getInt(json, "id", 0);
        data.owner = json.has("owner")
                ? UUID.fromString(json.get("owner").getAsString())
                : new UUID(0, 0);

        data.doorOpen = getBool(json, "door_open", false);
        data.doorLocked = getBool(json, "door_locked", false);
        data.powered = getBool(json, "powered", true);
        data.emergencyMode = getBool(json, "emergency_mode", false);
        data.roundelLight = getInt(json, "roundel_light", 10);
        data.dematerialised = getBool(json, "dematerialised", false);

        data.interiorYaw = getFloat(json, "interior_yaw", 0f);
        data.interiorOrigin = json.has("interior_origin")
                ? BlockPos.fromLong(json.get("interior_origin").getAsLong())
                : BlockPos.ORIGIN;

        data.interiorPos = getVec(json, "interior_pos", Vec3d.ZERO);
        data.interiorDimension = getId(json, "interior_dim", TARDIFDimensions.TARDIS_DIM_ID);

        data.exteriorYaw = getFloat(json, "exterior_yaw", 0f);
        data.exteriorPos = getVec(json, "exterior_pos", Vec3d.ZERO);
        data.exteriorDimension = getId(json, "exterior_dim", TARDIFDimensions.TARDIS_DIM_ID);

        data.previousPos = getVec(json, "previous_pos", Vec3d.ZERO);
        data.setPos = getVec(json, "set_pos", Vec3d.ZERO);

        return data;
    }

    private static boolean getBool(JsonObject json, String key, boolean def) {
        return json.has(key) && !json.get(key).isJsonNull()
                ? json.get(key).getAsBoolean()
                : def;
    }

    private static int getInt(JsonObject json, String key, int def) {
        return json.has(key) && !json.get(key).isJsonNull()
                ? json.get(key).getAsInt()
                : def;
    }

    private static float getFloat(JsonObject json, String key, float def) {
        return json.has(key) && !json.get(key).isJsonNull()
                ? json.get(key).getAsFloat()
                : def;
    }

    private static Identifier getId(JsonObject json, String key, Identifier def) {
        return json.has(key)
                ? Identifier.of(json.get(key).getAsString())
                : def;
    }

    private static Vec3d getVec(JsonObject json, String key, Vec3d def) {
        if (!json.has(key)) return def;
        JsonObject o = json.getAsJsonObject(key);
        return new Vec3d(
                o.get("x").getAsDouble(),
                o.get("y").getAsDouble(),
                o.get("z").getAsDouble()
        );
    }

    private static JsonObject vecToJson(Vec3d v) {
        JsonObject o = new JsonObject();
        o.addProperty("x", v.x);
        o.addProperty("y", v.y);
        o.addProperty("z", v.z);
        return o;
    }

    // Helpers
    public void incrementX(int amount) { this.setPos = this.setPos.add(amount, 0, 0); }
    public void incrementY(int amount) { this.setPos = this.setPos.add(0, amount, 0); }
    public void incrementZ(int amount) { this.setPos = this.setPos.add(0, 0, amount); }

}
