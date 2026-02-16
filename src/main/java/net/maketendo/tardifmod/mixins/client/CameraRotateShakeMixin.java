package net.maketendo.tardifmod.mixins.client;

import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Camera.class)
public abstract class CameraRotateShakeMixin {

    @Shadow private float pitch;
    @Shadow private float yaw;
    @Shadow protected abstract void setRotation(float yaw, float pitch);

    @Inject(method = "update", at = @At("TAIL"))
    private void rotateVerticalShake(World area, Entity focusedEntity, boolean thirdPerson,
                                     boolean inverseView, float tickProgress, CallbackInfo ci) {

        if (focusedEntity != null) return;

        float time = focusedEntity.age + tickProgress;
        float intensity = 1.0F + MathHelper.sin(time * 0.05F) * 0.4F;

        float pitchShake =
                MathHelper.sin(time * 0.37F) * 0.6F +
                        MathHelper.sin(time * 0.13F) * 0.35F +
                        MathHelper.sin(time * 0.07F) * 0.2F;

        pitchShake *= intensity;

        float yawShake =
                MathHelper.cos(time * 0.52F) * 0.25F +
                        MathHelper.sin(time * 0.21F) * 0.12F;

        yawShake *= intensity * 0.8F;
        yawShake += MathHelper.sin(time * 0.017F) * 0.05F;

        this.setRotation(this.yaw + yawShake, this.pitch + pitchShake);
    }
}
