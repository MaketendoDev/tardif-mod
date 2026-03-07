package net.maketendo.tardifmod.client.renderers.entities;

import net.maketendo.tardifmod.main.entities.controls.ConsoleControlEntity;
import net.maketendo.tardifmod.main.entities.tardis.TARDISPartEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;

public class TARDISPartsRenderer extends EntityRenderer<TARDISPartEntity, EntityRenderState> {

    public TARDISPartsRenderer(EntityRendererProvider.Context ctx) {
        super(ctx);
    }

    @Override
    public EntityRenderState createRenderState() {
        return new EntityRenderState();
    }

}


