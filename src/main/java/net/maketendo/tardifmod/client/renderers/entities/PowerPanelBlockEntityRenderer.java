package net.maketendo.tardifmod.client.renderers.entities;

import net.maketendo.tardifmod.client.models.entities.panel.PowerPanelModel;
import net.maketendo.tardifmod.main.blockentities.panels.PowerPanelBlockEntity;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.block.entity.state.BlockEntityRenderState;
import software.bernie.geckolib.renderer.GeoBlockRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;
import software.bernie.geckolib.renderer.layer.builtin.AutoGlowingGeoLayer;

public class PowerPanelBlockEntityRenderer<R extends BlockEntityRenderState & GeoRenderState> extends GeoBlockRenderer<PowerPanelBlockEntity, R> {
    public PowerPanelBlockEntityRenderer(BlockEntityRendererFactory.Context context) {
        super(new PowerPanelModel());
        this.renderLayers.addLayer(new AutoGlowingGeoLayer<>(this));
    }
}