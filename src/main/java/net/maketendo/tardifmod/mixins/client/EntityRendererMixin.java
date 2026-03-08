package net.maketendo.tardifmod.mixins.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.maketendo.tardifmod.main.TARDIFItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityAttachment;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderer.class)
public abstract class EntityRendererMixin {

    @Inject(method = "submit", at = @At("TAIL"))
    private void renderScannerTag(
            EntityRenderState state,
            PoseStack poseStack,
            SubmitNodeCollector collector,
            CameraRenderState cameraState,
            CallbackInfo ci
    ) {

        Minecraft client = Minecraft.getInstance();
        if (client.player == null) return;

        if (!client.player.getMainHandItem().is(TARDIFItems.SONIC_SCREWDRIVER) &&
                !client.player.getOffhandItem().is(TARDIFItems.SONIC_SCREWDRIVER))
            return;

        if (!(client.crosshairPickEntity instanceof LivingEntity living))
            return;

        int hp = Math.round(living.getHealth());
        int maxHp = Math.round(living.getMaxHealth());

        Component text = Component.literal("HP: " + hp + "/" + maxHp);

        int offset = state.nameTag != null ? -11 : 0;

        collector.submitNameTag(
                poseStack,
                living.getAttachments().getNullable(
                        EntityAttachment.NAME_TAG,
                        0,
                        living.getYRot()
                ),
                offset,
                text,
                true,
                state.lightCoords,
                state.distanceToCameraSq,
                cameraState
        );
    }
}