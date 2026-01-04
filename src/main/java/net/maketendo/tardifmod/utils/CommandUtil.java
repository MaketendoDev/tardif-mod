package net.maketendo.tardifmod.utils;

import net.minecraft.command.permission.PermissionPredicate;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;

public class CommandUtil {

    public static void runCommandAsEntity(Entity entity, String command) {
        if (entity.getEntityWorld().isClient()) return; // only server

        ServerWorld serverWorld = (ServerWorld) entity.getEntityWorld();
        MinecraftServer server = serverWorld.getServer();

        if (server == null) return;

        ServerCommandSource source = entity.getCommandSource(serverWorld)
                .withSilent()
                .withPermissions(PermissionPredicate.ALL);

        try {
            server.getCommandManager().parseAndExecute(source, command);
        } catch (Exception e) {
            server.sendMessage(Text.literal("Failed to run command for entity: " + e.getMessage()));
        }
    }
}