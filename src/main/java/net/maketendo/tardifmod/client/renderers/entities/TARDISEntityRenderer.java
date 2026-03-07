package net.maketendo.tardifmod.client.renderers.entities;

import com.mojang.blaze3d.vertex.PoseStack;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.client.models.entities.PoliceBoxModel;
import net.maketendo.tardifmod.client.renderers.entities.renderstates.TARDISEntityRenderState;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.resources.Identifier;

public class TARDISEntityRenderer extends LivingEntityRenderer<TARDISEntity, TARDISEntityRenderState, PoliceBoxModel> {

    public static final Identifier TEXTURE = TARDIFMod.id("textures/entity/tardis/skins/police_box_troughton.png");

    public TARDISEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new PoliceBoxModel(context.bakeLayer(PoliceBoxModel.LAYER_LOCATION)), 0.5F);
    }

    @Override
    public void extractRenderState(TARDISEntity entity, TARDISEntityRenderState state, float tickDelta) {
        super.extractRenderState(entity, state, tickDelta);
        state.setDoorOpened(entity.isDoorOpen());
    }

    @Override
    public TARDISEntityRenderState createRenderState() {
        return new TARDISEntityRenderState();
    }

    @Override
    public void submit(TARDISEntityRenderState entityRenderState, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState cameraRenderState) {
        super.submit(entityRenderState, poseStack, submitNodeCollector, cameraRenderState);
    }

    @Override
    public Identifier getTextureLocation(TARDISEntityRenderState livingEntityRenderState) {
        return TEXTURE;
    }
}