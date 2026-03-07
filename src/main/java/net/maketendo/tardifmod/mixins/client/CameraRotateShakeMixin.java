package net.maketendo.tardifmod.mixins.client;

import net.minecraft.client.Camera;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Camera.class)
public abstract class CameraRotateShakeMixin {

    @Shadow private float xRot;
    @Shadow private float yRot;
    @Shadow protected abstract void setRotation(float yaw, float pitch);

    @Inject(method = "setup", at = @At("TAIL"))
    private void rotateVerticalShake(Level area, Entity focusedEntity, boolean thirdPerson,
                                     boolean inverseView, float tickProgress, CallbackInfo ci) {

        if (focusedEntity != null) return;

        float time = focusedEntity.tickCount + tickProgress;
        float intensity = 1.0F + Mth.sin(time * 0.05F) * 0.4F;

        float pitchShake =
                Mth.sin(time * 0.37F) * 0.6F +
                        Mth.sin(time * 0.13F) * 0.35F +
                        Mth.sin(time * 0.07F) * 0.2F;

        pitchShake *= intensity;

        float yawShake =
                Mth.cos(time * 0.52F) * 0.25F +
                        Mth.sin(time * 0.21F) * 0.12F;

        yawShake *= intensity * 0.8F;
        yawShake += Mth.sin(time * 0.017F) * 0.05F;

        this.setRotation(this.yRot + yawShake, this.xRot + pitchShake);
    }
}
