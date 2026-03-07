package net.maketendo.tardifmod.client.screens;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.loader.api.FabricLoader;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.entities.tardis.TardisEntity;
import net.maketendo.tardifmod.main.entities.tardis.TardisInteriorDoorEntity;
import net.minecraft.ChatFormatting;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.server.IntegratedServer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.EntityHitResult;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class DevOverlay implements HudRenderCallback {
    @Override
    public void onHudRender(@NonNull GuiGraphics drawContext, @NonNull DeltaTracker tickCounter) {
        Minecraft client = Minecraft.getInstance();
        if (client.player == null) return;
        if (client.options.hideGui) return;
        ServerLevel serverWorld = getServerWorld(client);

        drawContext.blit(
                RenderPipelines.GUI_TEXTURED,
                Identifier.fromNamespaceAndPath(
                        TARDIFMod.MOD_ID,
                        "textures/gui/wrench_ui.png"
                ),
                1, 2,
                0, 0,
                16, 16,
                16, 16
        );



        drawContext.drawString(
                client.font,
                Component.literal("TARDIF Mod " + client.getVersionType() + " " + FabricLoader.getInstance().getRawGameVersion() + " - Development Build")
                        .withStyle(ChatFormatting.BOLD),
                18,
                5,
                0xFFFFFFFF
        );

        drawContext.drawString(
                client.font,
                Component.literal("---------------------------------------").withStyle(ChatFormatting.BOLD),
                18,
                13,
                0xFFFFFFFF,
                true
        );

        drawContext.drawString(
                client.font,
                Component.literal("FPS: " + client.getFps()),
                18,
                23,
                0xFFFFFFFF,
                false
        );

        if (client.hitResult instanceof EntityHitResult entityHit) {
            Entity entity = entityHit.getEntity();

            drawContext.drawString(
                    client.font,
                    Component.literal("Looking at: " + entity.getName().getString()),
                    18,
                    33,
                    0xFFFFFFFF,
                    false
            );

            if (entity instanceof TardisEntity tardisEntity) {
                drawContext.drawString(
                        client.font,
                        Component.literal("ID: " + tardisEntity.getTardisId()),
                        18,
                        43,
                        0xFFFFFFFF,
                        false
                );
            }

            if (entity instanceof TardisInteriorDoorEntity tardisEntity) {
                drawContext.drawString(
                        client.font,
                        Component.literal("ID: " + tardisEntity.getTardisId()),
                        18,
                        43,
                        0xFFFFFFFF,
                        false
                );
            }
        }



    }

    private @Nullable ServerLevel getServerWorld(Minecraft client) {
        if (client.level == null) {
            return null;
        } else {
            IntegratedServer integratedServer = client.getSingleplayerServer();
            return integratedServer != null ? integratedServer.getLevel(client.level.dimension()) : null;
        }
    }

}
