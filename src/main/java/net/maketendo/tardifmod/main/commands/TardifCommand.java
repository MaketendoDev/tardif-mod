package net.maketendo.tardifmod.main.commands;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.minecraft.ChatFormatting;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.UuidArgument;
import net.minecraft.network.chat.Component;
import java.util.UUID;

public class TardifCommand {

    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(
                    Commands.literal("tardif")
                            .then(Commands.literal("data")
                                    .then(Commands.literal("getFromId")
                                            .then(Commands.argument("uuid", UuidArgument.uuid())
                                                    .executes(ctx -> getData(ctx.getSource(),
                                                            UuidArgument.getUuid(ctx, "uuid")))
                                            )
                                    )
                            )
            );
        });
    }

    private static int getData(CommandSourceStack source, UUID uuid) {
        try {
            var world = source.getLevel();

            var entity = world.getEntity(uuid);
            if (!(entity instanceof TARDISEntity tardis)) {
                source.sendFailure(Component.literal("That entity is not a TARDIS Linked Entity.")
                        .withStyle(ChatFormatting.RED));
                return 0;
            }

            int tardisId = tardis.getTardisId();
            if (tardisId == -1) {
                source.sendFailure(Component.literal("TARDIS has no ID.")
                        .withStyle(ChatFormatting.RED));
                return 0;
            }

            TardisData data = TardisManager.getFromId(source.getServer(), tardisId);
            if (data == null) {
                source.sendFailure(Component.literal("No data found for TARDIS ID " + tardisId)
                        .withStyle(ChatFormatting.RED));
                return 0;
            }

            JsonObject json = data.toJson();
            String pretty = new GsonBuilder()
                    .setPrettyPrinting()
                    .create()
                    .toJson(json);

            source.sendSuccess(() ->
                            Component.literal("TARDIS DATA (id=" + tardisId + ")\n")
                                    .withStyle(ChatFormatting.GOLD)
                                    .append(Component.literal(pretty).withStyle(ChatFormatting.GRAY)),
                    false
            );

            return 1;

        } catch (Exception e) {
            source.sendFailure(Component.literal("Error reading TARDIS data.")
                    .withStyle(ChatFormatting.RED));
            e.printStackTrace();
            return 0;
        }
    }
}

