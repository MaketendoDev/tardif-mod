package net.maketendo.tardifmod.client.renderers.entities;

import com.mojang.blaze3d.vertex.PoseStack;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.client.models.entities.PoliceBoxInteriorDoorModel;
import net.maketendo.tardifmod.client.models.entities.PoliceBoxModel;
import net.maketendo.tardifmod.client.renderers.entities.renderstates.TARDISEntityRenderState;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.maketendo.tardifmod.main.entities.tardis.TARDISInteriorDoorEntity;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.resources.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class TARDISInteriorDoorEntityRenderer extends LivingEntityRenderer<TARDISInteriorDoorEntity, TARDISEntityRenderState, PoliceBoxInteriorDoorModel> {

    public static final Identifier TEXTURE = TARDIFMod.id("textures/entity/tardis/skins/police_box_troughton.png");

    public TARDISInteriorDoorEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new PoliceBoxInteriorDoorModel(context.bakeLayer(PoliceBoxInteriorDoorModel.LAYER_LOCATION)), 0.5F);
    }

    @Override
    public void extractRenderState(TARDISInteriorDoorEntity entity, TARDISEntityRenderState state, float tickDelta) {
        super.extractRenderState(entity, state, tickDelta);
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