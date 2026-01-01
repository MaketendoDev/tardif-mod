package net.maketendo.tardifmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.client.renderers.entities.PowerPanelBlockEntityRenderer;
import net.maketendo.tardifmod.client.renderers.entities.TARDISEntityRenderer;
import net.maketendo.tardifmod.client.renderers.entities.TARDISInteriorDoorEntityRenderer;
import net.maketendo.tardifmod.client.screens.DevOverlay;
import net.maketendo.tardifmod.client.screens.PreviewOverlay;
import net.maketendo.tardifmod.main.TARDIFBlockEntities;
import net.maketendo.tardifmod.main.TARDIFEntities;
import net.maketendo.tardifmod.main.entities.tardis.TARDISInteriorDoorEntity;
import net.minecraft.client.gui.hud.InGameOverlayRenderer;

import java.util.Optional;

public class TARDIFModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(TARDIFEntities.TARDIS, TARDISEntityRenderer::new);
        EntityRendererRegistry.register(TARDIFEntities.TARDIS_INTERIOR_DOOR, TARDISInteriorDoorEntityRenderer::new);
        BlockEntityRendererRegistry.register(TARDIFBlockEntities.POWER_PANEL, PowerPanelBlockEntityRenderer::new);

        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            HudRenderCallback.EVENT.register(new DevOverlay());
        } else if (isPreviewBuild()) {
            HudRenderCallback.EVENT.register(new PreviewOverlay());
        }

    }

    public static boolean isPreviewBuild() {
        Optional<ModContainer> container =
                FabricLoader.getInstance().getModContainer(TARDIFMod.MOD_ID);

        if (container.isEmpty()) return false;

        String version = container.get().getMetadata().getVersion().getFriendlyString();
        String name = container.get().getMetadata().getName();

        return version.toLowerCase().contains("preview")
                || name.toLowerCase().contains("preview");
    }
}
