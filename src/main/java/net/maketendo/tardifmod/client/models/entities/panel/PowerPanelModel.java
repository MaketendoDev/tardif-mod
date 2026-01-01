package net.maketendo.tardifmod.client.models.entities.panel;

import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class PowerPanelModel extends GeoModel {
    @Override
    public Identifier getModelResource(GeoRenderState geoRenderState) {
        return Identifier.of(TARDIFMod.MOD_ID, "panels/power_panel");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState geoRenderState) {
        return Identifier.of(TARDIFMod.MOD_ID, "textures/entity/panels/power_panel.png");
    }

    @Override
    public Identifier getAnimationResource(GeoAnimatable geoAnimatable) {
        return Identifier.of(TARDIFMod.MOD_ID, "panels/power_panel");
    }
}
