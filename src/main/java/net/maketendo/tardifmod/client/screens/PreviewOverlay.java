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

public class PreviewOverlay implements HudRenderCallback {
    @Override
    public void onHudRender(@NonNull DrawContext drawContext, @NonNull RenderTickCounter tickCounter) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null) return;

        Text text = Text.literal("FEATURES SUBJECT TO CHANGE")
                .formatted(Formatting.BOLD);

        int screenWidth = client.getWindow().getScaledWidth();
        int textWidth = client.textRenderer.getWidth(text);

        int x = (screenWidth - textWidth) / 2;
        int y = 5;

        drawContext.drawTextWithShadow(
                client.textRenderer,
                text,
                x,
                y,
                0x88FFFFFF
        );
    }
}
