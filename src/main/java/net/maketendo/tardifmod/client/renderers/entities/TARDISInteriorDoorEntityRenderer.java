package net.maketendo.tardifmod.client.renderers.entities;

import net.maketendo.tardifmod.client.models.entities.TARDISInteriorDoorModel;
import net.maketendo.tardifmod.main.entities.tardis.TARDISInteriorDoorEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;
import software.bernie.geckolib.renderer.layer.builtin.AutoGlowingGeoLayer;

public class TARDISInteriorDoorEntityRenderer<R extends LivingEntityRenderState & GeoRenderState> extends GeoEntityRenderer<TARDISInteriorDoorEntity, R> {
    public TARDISInteriorDoorEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new TARDISInteriorDoorModel());
        this.renderLayers.addLayer(new AutoGlowingGeoLayer<>(this));
    }
}