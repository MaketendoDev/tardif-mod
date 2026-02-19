package net.maketendo.tardifmod.main.tardis;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TardisData {

    private final Path file;
    private final int id;
    private JsonObject data;
    private boolean dirty = false;

    private static final Gson GSON =
            new GsonBuilder().setPrettyPrinting().create();

    public TardisData(Path file, int id) {
        this.file = file;
        this.id = id;
        load();
    }

    private void load() {
        try {
            if (Files.exists(file)) {
                String content = Files.readString(file);
                data = JsonParser.parseString(content).getAsJsonObject();
            } else {
                data = new JsonObject();
                data.addProperty("id", id);
                markDirty();
                save();
            }
        } catch (IOException e) {
            e.printStackTrace();
            data = new JsonObject();
        }
    }

    public void markDirty() {
        dirty = true;
    }

    public void save() {
        if (!dirty) return;

        try {
            Files.writeString(file, GSON.toJson(data));
            dirty = false;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // GETTERS / SETTERS

    public void setString(String key, String value) {
        data.addProperty(key, value);
        markDirty();
    }

    public String getString(String key) {
        return data.has(key) ? data.get(key).getAsString() : "";
    }

    public void setInt(String key, int value) {
        data.addProperty(key, value);
        markDirty();
    }

    public int getInt(String key) {
        return data.has(key) ? data.get(key).getAsInt() : 0;
    }

    public void setBlockPos(String parentKey, String dimensionId, BlockPos pos) {

        JsonObject parent = new JsonObject();
        parent.addProperty("dimension", dimensionId);

        JsonObject posObject = new JsonObject();
        posObject.addProperty("x", pos.getX());
        posObject.addProperty("y", pos.getY());
        posObject.addProperty("z", pos.getZ());

        parent.add("pos", posObject);

        data.add(parentKey, parent);
        markDirty();
    }

    public BlockPos getBlockPos(String parentKey) {
        if (!data.has(parentKey)) return null;

        JsonObject parent = data.getAsJsonObject(parentKey);
        JsonObject posObject = parent.getAsJsonObject("pos");

        int x = posObject.get("x").getAsInt();
        int y = posObject.get("y").getAsInt();
        int z = posObject.get("z").getAsInt();

        return new BlockPos(x, y, z);
    }

    public String getDimension(String parentKey) {
        if (!data.has(parentKey)) return "minecraft:overworld";

        return data.getAsJsonObject(parentKey)
                .get("dimension")
                .getAsString();
    }

    public void setVec3d(String key, Vec3d vec) {
        JsonObject vecObject = new JsonObject();
        vecObject.addProperty("x", vec.x);
        vecObject.addProperty("y", vec.y);
        vecObject.addProperty("z", vec.z);

        data.add(key, vecObject);
        markDirty();
    }

    public Vec3d getVec3(String key) {
        if (!data.has(key)) return Vec3d.ZERO;

        JsonObject vecObject = data.getAsJsonObject(key);

        double x = vecObject.get("x").getAsDouble();
        double y = vecObject.get("y").getAsDouble();
        double z = vecObject.get("z").getAsDouble();

        return new Vec3d(x, y, z);
    }


    public JsonObject getRaw() {
        return data;
    }
}


