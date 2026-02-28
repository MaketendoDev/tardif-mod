package net.maketendo.tardifmod.client.renderers.entities;

import net.maketendo.tardifmod.main.entities.controls.ConsoleControlEntity;
import net.maketendo.tardifmod.main.entities.tardis.TARDISPartEntity;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.state.EntityRenderState;

public class TARDISPartsRenderer extends EntityRenderer<TARDISPartEntity, EntityRenderState> {

    public TARDISPartsRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
    }

    @Override
    public EntityRenderState createRenderState() {
        return new EntityRenderState();
    }

    @Override
    public void updateRenderState(TARDISPartEntity entity, EntityRenderState state, float tickProgress) {
        super.updateRenderState(entity, state, tickProgress);
    }
}


