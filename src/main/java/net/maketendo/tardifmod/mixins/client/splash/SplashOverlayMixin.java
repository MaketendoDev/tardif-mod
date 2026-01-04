package net.maketendo.tardifmod.mixins.client.splash;

import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.client.gui.screen.SplashOverlay;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SplashOverlay.class)
public class SplashOverlayMixin {
// Use this code somewhat soon :smileheart:
//    @Shadow
//    @Mutable
//    private static Identifier LOGO;
//
//    @Inject(method = "<clinit>", at = @At("TAIL"))
//    private static void tardif$replaceLogo(CallbackInfo ci) {
//        LOGO = Identifier.of(TARDIFMod.MOD_ID, "textures/gui/title/custom_logo.png");
//    }
}
