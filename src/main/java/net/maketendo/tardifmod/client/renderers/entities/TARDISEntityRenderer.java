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
        this.renderLayers.addLayer(new AutoGlowingGeoLayer<>(this));
    }

    @Override
    public @org.jspecify.annotations.Nullable RenderLayer getRenderType(R renderState, Identifier texture) {
        return RenderLayers.entityTranslucent(texture);
    }

    @Override
    public int getRenderColor(TARDISEntity animatable, @Nullable Void relatedObject, float partialTick) {
        float alpha = animatable.getFade();

        int a = (int)(alpha * 255.0f);
        int r = 255;
        int g = 255;
        int b = 255;

        return (a << 24) | (r << 16) | (g << 8) | b;
    }

}