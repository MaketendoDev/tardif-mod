package net.maketendo.tardifmod.client.models.entities;

import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class TARDISInteriorDoorModel extends GeoModel {
    @Override
    public Identifier getModelResource(GeoRenderState geoRenderState) {
        return Identifier.of(TARDIFMod.MOD_ID, "police_box_interior_door");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Identifier.of(TARDIFMod.MOD_ID, "textures/entity/tardis/police_box_interior_door.png");
    }

    @Override
    public Identifier getAnimationResource(GeoAnimatable geoAnimatable) {
        return Identifier.of(TARDIFMod.MOD_ID, "police_box");
    }
}