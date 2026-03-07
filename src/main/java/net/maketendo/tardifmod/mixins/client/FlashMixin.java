package net.maketendo.tardifmod.mixins.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.FireworkParticles;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.Mth;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin(FireworkParticles.OverlayParticle.class)
public abstract class FlashMixin extends SingleQuadParticle {

    protected FlashMixin(ClientLevel clientWorld, double x, double y, double z, TextureAtlasSprite sprite) {
        super(clientWorld, x, y, z, sprite);
    }

    @Inject(method = "getQuadSize", at = @At("HEAD"), cancellable = true)
    private void slowBreathSize(float tickProgress, CallbackInfoReturnable<Float> cir) {
        float minSize = 3.5F;
        float maxSize = 1.5F;
        float speed = 0.02F;

        // Smooth inhale/exhale using sine mapped to 0..1
        float normalized = (Mth.sin(((float)this.age + tickProgress) * speed * (float)Math.PI) + 1f) / 2f;
        float size = minSize + (maxSize - minSize) * normalized;

        cir.setReturnValue(size);
    }
}


