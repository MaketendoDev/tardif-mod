package net.maketendo.tardifmod.client.renderers.entities;

import net.maketendo.tardifmod.client.models.entities.TARDISModel;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.minecraft.client.render.*;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.util.Identifier;
import org.jspecify.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;
import software.bernie.geckolib.renderer.layer.builtin.AutoGlowingGeoLayer;

public class TARDISEntityRenderer<R extends EntityRenderState & GeoRenderState> extends GeoEntityRenderer<TARDISEntity, R> {
    public TARDISEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new TARDISModel());
        //this.renderLayers.addLayer(new AutoGlowingGeoLayer<>(this));
    }

    @Override
    public @Nullable RenderLayer getRenderType(R renderState, Identifier texture) {
        return RenderLayers.entityTranslucent(texture);
    }


}