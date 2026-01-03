package net.maketendo.tardifmod.client.renderers.entities;

import net.maketendo.tardifmod.client.models.entities.panel.CoordinatesPanelModel;
import net.maketendo.tardifmod.client.models.entities.panel.PowerPanelModel;
import net.maketendo.tardifmod.main.blockentities.panels.CoordinatesPanelBlockEntity;
import net.maketendo.tardifmod.main.blockentities.panels.PowerPanelBlockEntity;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.block.entity.state.BlockEntityRenderState;
import software.bernie.geckolib.renderer.GeoBlockRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;
import software.bernie.geckolib.renderer.layer.builtin.AutoGlowingGeoLayer;

public class CoordinatesPanelBlockEntityRenderer<R extends BlockEntityRenderState & GeoRenderState> extends GeoBlockRenderer<CoordinatesPanelBlockEntity, R> {
    public CoordinatesPanelBlockEntityRenderer(BlockEntityRendererFactory.Context context) {
        super(new CoordinatesPanelModel());
        //this.renderLayers.addLayer(new AutoGlowingGeoLayer<>(this));
    }
}