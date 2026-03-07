package net.maketendo.tardifmod.client.screens;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.loader.api.FabricLoader;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.maketendo.tardifmod.main.entities.tardis.TARDISInteriorDoorEntity;
import net.minecraft.ChatFormatting;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class PreviewOverlay implements HudRenderCallback {
    @Override
    public void onHudRender(@NonNull GuiGraphics drawContext, @NonNull DeltaTracker tickCounter) {
        Minecraft client = Minecraft.getInstance();
        if (client.player == null) return;

        Component text = Component.literal("FEATURES SUBJECT TO CHANGE")
                .withStyle(ChatFormatting.BOLD);

        int screenWidth = client.getWindow().getGuiScaledWidth();
        int textWidth = client.font.width(text);

        int x = (screenWidth - textWidth) / 2;
        int y = 5;

        drawContext.drawString(
                client.font,
                text,
                x,
                y,
                0x88FFFFFF
        );
    }
}
