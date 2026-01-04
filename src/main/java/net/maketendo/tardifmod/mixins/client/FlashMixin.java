package net.maketendo.tardifmod.mixins.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.BillboardParticle;
import net.minecraft.client.particle.FireworksSparkParticle;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin(FireworksSparkParticle.Flash.class)
public abstract class FlashMixin extends BillboardParticle {

    protected FlashMixin(ClientWorld clientWorld, double x, double y, double z, Sprite sprite) {
        super(clientWorld, x, y, z, sprite);
    }

    @Inject(method = "getSize", at = @At("HEAD"), cancellable = true)
    private void slowBreathSize(float tickProgress, CallbackInfoReturnable<Float> cir) {
        float minSize = 3.5F;
        float maxSize = 1.5F;
        float speed = 0.02F;

        // Smooth inhale/exhale using sine mapped to 0..1
        float normalized = (MathHelper.sin(((float)this.age + tickProgress) * speed * (float)Math.PI) + 1f) / 2f;
        float size = minSize + (maxSize - minSize) * normalized;

        cir.setReturnValue(size);
    }
}


