package net.maketendo.tardifmod.client.models.console;

import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.cache.model.GeoBone;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class CrystalConsoleModel extends GeoModel {
    @Override
    public Identifier getModelResource(GeoRenderState geoRenderState) {
        return Identifier.of(TARDIFMod.MOD_ID, "consoles/crystal");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Identifier.of(TARDIFMod.MOD_ID, "textures/entity/consoles/crystal.png");
    }

    @Override
    public Identifier getAnimationResource(GeoAnimatable geoAnimatable) {
        return Identifier.of(TARDIFMod.MOD_ID, "consoles/crystal");
    }
}