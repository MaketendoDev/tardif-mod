package net.maketendo.tardifmod.utils;

import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.permissions.PermissionSet;
import net.minecraft.world.entity.Entity;

public class CommandUtil {

    public static void runCommandAsEntity(Entity entity, String command) {
        if (entity.level().isClientSide()) return;

        ServerLevel serverWorld = (ServerLevel) entity.level();
        MinecraftServer server = serverWorld.getServer();

        if (server == null) return;

        CommandSourceStack source = entity.createCommandSourceStackForNameResolution(serverWorld)
                .withSuppressedOutput()
                .withPermission(PermissionSet.ALL_PERMISSIONS);

        try {
            server.getCommands().performPrefixedCommand(source, command);
        } catch (Exception e) {
            server.sendSystemMessage(Component.literal("Failed to run command for entity: " + e.getMessage()));
        }
    }
}