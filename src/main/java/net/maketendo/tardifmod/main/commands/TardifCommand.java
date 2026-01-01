package net.maketendo.tardifmod.main.commands;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.maketendo.tardifmod.main.entities.tardis.TARDISInteriorDoorEntity;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.minecraft.command.argument.UuidArgumentType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.UUID;

public class TardifCommand {

    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(
                    CommandManager.literal("tardif")
                            .then(CommandManager.literal("data")
                                    .then(CommandManager.literal("get")
                                            .then(CommandManager.argument("uuid", UuidArgumentType.uuid())
                                                    .executes(ctx -> getData(ctx.getSource(),
                                                            UuidArgumentType.getUuid(ctx, "uuid")))
                                            )
                                    )
                            )
            );
        });
    }

    private static int getData(ServerCommandSource source, UUID uuid) {
        try {
            var world = source.getWorld();

            var entity = world.getEntity(uuid);
            if (!(entity instanceof TARDISEntity tardis)) {
                source.sendError(Text.literal("That entity is not a TARDIS Linked Entity.")
                        .formatted(Formatting.RED));
                return 0;
            }

            int tardisId = tardis.getTardisId();
            if (tardisId == -1) {
                source.sendError(Text.literal("TARDIS has no ID.")
                        .formatted(Formatting.RED));
                return 0;
            }

            TardisData data = TardisManager.get(source.getServer(), tardisId);
            if (data == null) {
                source.sendError(Text.literal("No data found for TARDIS ID " + tardisId)
                        .formatted(Formatting.RED));
                return 0;
            }

            JsonObject json = data.toJson();
            String pretty = new GsonBuilder()
                    .setPrettyPrinting()
                    .create()
                    .toJson(json);

            source.sendFeedback(() ->
                            Text.literal("TARDIS DATA (id=" + tardisId + ")\n")
                                    .formatted(Formatting.GOLD)
                                    .append(Text.literal(pretty).formatted(Formatting.GRAY)),
                    false
            );

            return 1;

        } catch (Exception e) {
            source.sendError(Text.literal("Error reading TARDIS data.")
                    .formatted(Formatting.RED));
            e.printStackTrace();
            return 0;
        }
    }
}

