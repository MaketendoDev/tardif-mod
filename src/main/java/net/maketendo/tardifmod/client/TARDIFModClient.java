package net.maketendo.tardifmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.client.managers.AnimationManager;
import net.maketendo.tardifmod.client.models.console.CrystallineConsoleModel;
import net.maketendo.tardifmod.client.models.entities.PoliceBoxInteriorDoorModel;
import net.maketendo.tardifmod.client.models.entities.PoliceBoxModel;
import net.maketendo.tardifmod.client.renderers.blockentities.TardisConsoleBlockEntityRenderer;
import net.maketendo.tardifmod.client.renderers.entities.*;
import net.maketendo.tardifmod.client.screens.DevOverlay;
import net.maketendo.tardifmod.client.screens.PreviewOverlay;
import net.maketendo.tardifmod.main.TARDIFBlockEntities;
import net.maketendo.tardifmod.main.TARDIFEntities;

import java.util.Optional;

public class TARDIFModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(TARDIFEntities.TARDIS, TARDISEntityRenderer::new);
        EntityRendererRegistry.register(TARDIFEntities.TARDIS_INTERIOR_DOOR, TardisInteriorDoorEntityRenderer::new);
        EntityRendererRegistry.register(TARDIFEntities.CONSOLE_CONTROL, ConsoleControlRenderer::new);
        EntityRendererRegistry.register(TARDIFEntities.TARDIS_PART, TARDISPartsRenderer::new);

        BlockEntityRendererRegistry.register(TARDIFBlockEntities.TARDIS_CONSOLE_BLOCK, TardisConsoleBlockEntityRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(CrystallineConsoleModel.LAYER_LOCATION, CrystallineConsoleModel::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(PoliceBoxModel.LAYER_LOCATION, PoliceBoxModel::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(PoliceBoxInteriorDoorModel.LAYER_LOCATION, PoliceBoxInteriorDoorModel::createBodyLayer);

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
