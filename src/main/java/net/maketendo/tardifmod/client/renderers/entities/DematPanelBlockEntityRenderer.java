package net.maketendo.tardifmod.client.renderers.entities;

import net.maketendo.tardifmod.client.models.entities.panel.CoordinatesPanelModel;
import net.maketendo.tardifmod.client.models.entities.panel.DematPanelModel;
import net.maketendo.tardifmod.main.blockentities.panels.CoordinatesPanelBlockEntity;
import net.maketendo.tardifmod.main.blockentities.panels.DematPanelBlockEntity;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.block.entity.state.BlockEntityRenderState;
import software.bernie.geckolib.renderer.GeoBlockRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class DematPanelBlockEntityRenderer<R extends BlockEntityRenderState & GeoRenderState> extends GeoBlockRenderer<DematPanelBlockEntity, R> {
    public DematPanelBlockEntityRenderer(BlockEntityRendererFactory.Context context) {
        super(new DematPanelModel());
        //this.renderLayers.addLayer(new AutoGlowingGeoLayer<>(this));
    }
}