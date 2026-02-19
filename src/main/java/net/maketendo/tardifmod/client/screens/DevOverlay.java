package net.maketendo.tardifmod.client.screens;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.loader.api.FabricLoader;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.maketendo.tardifmod.main.entities.tardis.TARDISInteriorDoorEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.entity.Entity;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.EntityHitResult;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class DevOverlay implements HudRenderCallback {
    @Override
    public void onHudRender(@NonNull DrawContext drawContext, @NonNull RenderTickCounter tickCounter) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null) return;
        if (client.options.hudHidden) return;
        ServerWorld serverWorld = getServerWorld(client);

        drawContext.drawTexture(
                RenderPipelines.GUI_TEXTURED,
                Identifier.of(
                        TARDIFMod.MOD_ID,
                        "textures/gui/wrench_ui.png"
                ),
                1, 2,
                0, 0,
                16, 16,
                16, 16
        );



        drawContext.drawTextWithShadow(
                client.textRenderer,
                Text.literal("TARDIF Mod " + client.getVersionType() + " " + FabricLoader.getInstance().getRawGameVersion() + " - Development Build")
                        .formatted(Formatting.BOLD),
                18,
                5,
                0xFFFFFFFF
        );

        drawContext.drawText(
                client.textRenderer,
                Text.literal("---------------------------------------").formatted(Formatting.BOLD),
                18,
                13,
                0xFFFFFFFF,
                true
        );

        drawContext.drawText(
                client.textRenderer,
                Text.literal("FPS: " + client.getCurrentFps()),
                18,
                23,
                0xFFFFFFFF,
                false
        );

        if (client.crosshairTarget instanceof EntityHitResult entityHit) {
            Entity entity = entityHit.getEntity();

            drawContext.drawText(
                    client.textRenderer,
                    Text.literal("Looking at: " + entity.getName().getString()),
                    18,
                    33,
                    0xFFFFFFFF,
                    false
            );

            if (entity instanceof TARDISEntity tardisEntity) {
                drawContext.drawText(
                        client.textRenderer,
                        Text.literal("ID: " + tardisEntity.getTardisId()),
                        18,
                        43,
                        0xFFFFFFFF,
                        false
                );
            }

            if (entity instanceof TARDISInteriorDoorEntity tardisEntity) {
                drawContext.drawText(
                        client.textRenderer,
                        Text.literal("ID: " + tardisEntity.getTardisId()),
                        18,
                        43,
                        0xFFFFFFFF,
                        false
                );
            }
        }



    }

    private @Nullable ServerWorld getServerWorld(MinecraftClient client) {
        if (client.world == null) {
            return null;
        } else {
            IntegratedServer integratedServer = client.getServer();
            return integratedServer != null ? integratedServer.getWorld(client.world.getRegistryKey()) : null;
        }
    }

}
