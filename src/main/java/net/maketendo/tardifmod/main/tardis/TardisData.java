package net.maketendo.tardifmod.main.tardis;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.maketendo.tardifmod.main.blocks.RoundelBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class TardisData {

    public int id;
    public UUID owner;

    public Boolean doorOpen;
    public Boolean doorLocked;
    public Boolean powered;

    public Integer roundelLight;
    public Set<BlockPos> roundelPositions = new HashSet<>();


    // Interior
    public Float interiorYaw;
    public BlockPos interiorOrigin;
    public Vec3d interiorPos;
    public Identifier interiorDimension;

    // Exterior
    public Float exteriorYaw;
    public Vec3d exteriorPos;
    public Identifier exteriorDimension;

    public JsonObject toJson() {
        JsonObject json = new JsonObject();

        json.addProperty("id", id);
        json.addProperty("owner", owner.toString());

        json.addProperty("door_open", doorOpen);
        json.addProperty("door_locked", doorLocked);
        json.addProperty("powered", powered.toString());
        json.addProperty("roundel_light", roundelLight.toString());

        JsonArray roundels = new JsonArray();
        for (BlockPos pos : roundelPositions) {
            roundels.add(pos.asLong());
        }
        json.add("roundels", roundels);


        // Interior
        json.addProperty("interior_yaw", interiorYaw);
        json.addProperty("interior_origin", interiorOrigin.asLong());
        JsonObject interiorPosJson = new JsonObject();
        interiorPosJson.addProperty("x", interiorPos.x);
        interiorPosJson.addProperty("y", interiorPos.y);
        interiorPosJson.addProperty("z", interiorPos.z);
        json.add("interior_pos", interiorPosJson);
        json.addProperty("interior_dim", interiorDimension.toString());

        // Exterior
        json.addProperty("exterior_yaw", exteriorYaw);
        JsonObject exteriorPosJson = new JsonObject();
        exteriorPosJson.addProperty("x", exteriorPos.x);
        exteriorPosJson.addProperty("y", exteriorPos.y);
        exteriorPosJson.addProperty("z", exteriorPos.z);
        json.add("exterior_pos", exteriorPosJson);

        json.addProperty("exterior_dim", exteriorDimension.toString());

        return json;
    }


    public static TardisData fromJson(JsonObject json) {
        TardisData data = new TardisData();

        data.id = json.get("id").getAsInt();
        data.owner = UUID.fromString(json.get("owner").getAsString());

        data.doorOpen = json.get("door_open").getAsBoolean();
        data.doorLocked = json.get("door_locked").getAsBoolean();
        data.powered = json.get("powered").getAsBoolean();
        data.roundelLight = json.get("roundel_light").getAsInt();

        data.roundelPositions = new HashSet<>();
        if (json.has("roundels")) {
            JsonArray roundels = json.getAsJsonArray("roundels");
            for (var el : roundels) {
                data.roundelPositions.add(BlockPos.fromLong(el.getAsLong()));
            }
        }


        // Interior
        data.interiorYaw = json.get("interior_yaw").getAsFloat();
        data.interiorOrigin = BlockPos.fromLong(json.get("interior_origin").getAsLong());
        JsonObject interiorPosJson = json.getAsJsonObject("interior_pos");
        data.interiorPos = new Vec3d(
                interiorPosJson.get("x").getAsDouble(),
                interiorPosJson.get("y").getAsDouble(),
                interiorPosJson.get("z").getAsDouble()
        );
        data.interiorDimension = Identifier.of(json.get("interior_dim").getAsString());

        // Exterior
        data.exteriorYaw = json.get("exterior_yaw").getAsFloat();
        JsonObject exteriorPosJson = json.getAsJsonObject("exterior_pos");
        data.exteriorPos = new Vec3d(
                exteriorPosJson.get("x").getAsDouble(),
                exteriorPosJson.get("y").getAsDouble(),
                exteriorPosJson.get("z").getAsDouble()
        );
        data.exteriorDimension = Identifier.of(json.get("exterior_dim").getAsString());
        return data;
    }

}

