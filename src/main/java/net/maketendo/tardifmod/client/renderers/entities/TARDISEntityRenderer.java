package net.maketendo.tardifmod.client.renderers.entities;

import com.mojang.blaze3d.vertex.PoseStack;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.client.models.entities.PoliceBoxModel;
import net.maketendo.tardifmod.client.renderers.entities.renderstates.TARDISEntityRenderState;
import net.maketendo.tardifmod.main.TARDIFItems;
import net.maketendo.tardifmod.main.entities.tardis.TardisEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class TARDISEntityRenderer extends LivingEntityRenderer<TardisEntity, TARDISEntityRenderState, PoliceBoxModel> {

    public static final Identifier TEXTURE = TARDIFMod.id("textures/entity/tardis/skins/police_box_troughton.png");

    public TARDISEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new PoliceBoxModel(context.bakeLayer(PoliceBoxModel.LAYER_LOCATION)), 0.5F);
    }

    @Override
    public void extractRenderState(TardisEntity entity, TARDISEntityRenderState state, float tickDelta) {
        super.extractRenderState(entity, state, tickDelta);

        //state.ageInTicks = entity.tickCount + tickDelta;

        state.doorRightOpenAnimationState.copyFrom(entity.doorRightOpenAnimationState);
        state.doorLeftOpenAnimationState.copyFrom(entity.doorLeftOpenAnimationState);

        state.doorRightCloseAnimationState.copyFrom(entity.doorRightCloseAnimationState);
        state.doorLeftCloseAnimationState.copyFrom(entity.doorLeftCloseAnimationState);

        state.phoneBoothOpenAnimationState.copyFrom(entity.phoneBoothOpenAnimationState);
        state.phoneBoothCloseAnimationState.copyFrom(entity.phoneBoothCloseAnimationState);

        state.lampOpenAnimationState.copyFrom(entity.lampOpenAnimationState);
        state.lampCloseAnimationState.copyFrom(entity.lampCloseAnimationState);

        state.phoneRingAnimationState.copyFrom(entity.phoneRingAnimationState);
        state.phoneDialAnimationState.copyFrom(entity.phoneDialAnimationState);

        state.fallingStartAnimationState.copyFrom(entity.fallingStartAnimationState);
        state.fallingLoopAnimationState.copyFrom(entity.fallingLoopAnimationState);
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

    @Override
    protected boolean shouldShowName(TardisEntity entity, double distance) {

        Minecraft client = Minecraft.getInstance();
        Player player = client.player;

        if (player == null) return false;

        ItemStack main = player.getMainHandItem();
        ItemStack off = player.getOffhandItem();

        return main.getItem() == TARDIFItems.SONIC_SCREWDRIVER
                || off.getItem() == TARDIFItems.SONIC_SCREWDRIVER;
    }
}