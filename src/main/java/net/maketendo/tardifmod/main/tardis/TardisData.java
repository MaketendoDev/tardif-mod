package net.maketendo.tardifmod.main.tardis;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

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

    public JsonObject getRaw() {
        return data;
    }
}


