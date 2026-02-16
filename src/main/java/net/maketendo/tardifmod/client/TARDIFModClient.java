package net.maketendo.tardifmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.client.managers.AnimationManager;
import net.maketendo.tardifmod.client.packets.TardisAnimPackets;
import net.maketendo.tardifmod.client.renderers.entities.*;
import net.maketendo.tardifmod.client.screens.DevOverlay;
import net.maketendo.tardifmod.client.screens.PreviewOverlay;
import net.maketendo.tardifmod.main.TARDIFBlockEntities;
import net.maketendo.tardifmod.main.TARDIFEntities;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.minecraft.entity.Entity;


import java.util.Optional;

public class TARDIFModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(TARDIFEntities.TARDIS, TARDISEntityRenderer::new);
        EntityRendererRegistry.register(TARDIFEntities.TARDIS_INTERIOR_DOOR, TARDISInteriorDoorEntityRenderer::new);

        BlockEntityRendererRegistry.register(TARDIFBlockEntities.TARDIS_CONSOLE_BLOCK, TardisConsoleBlockEntityRenderer::new);
        BlockEntityRendererRegistry.register(TARDIFBlockEntities.POWER_PANEL, PowerPanelBlockEntityRenderer::new);
        BlockEntityRendererRegistry.register(TARDIFBlockEntities.COORDINATES_PANEL, CoordinatesPanelBlockEntityRenderer::new);
        BlockEntityRendererRegistry.register(TARDIFBlockEntities.DEMATERIALISATION_PANEL, DematPanelBlockEntityRenderer::new);

        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            HudRenderCallback.EVENT.register(new DevOverlay());
        } else {
            HudRenderCallback.EVENT.register(new PreviewOverlay());
        }

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            AnimationManager.tick();
        });
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
