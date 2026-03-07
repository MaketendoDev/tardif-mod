package net.maketendo.tardifmod.client.renderers.entities.renderstates;

import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class TARDISEntityRenderState extends LivingEntityRenderState {
    private boolean door_open = false;

    public Boolean getDoorOpened() {
        return door_open;
    }

    public void setDoorOpened(boolean opened) {
        this.door_open = opened;
    }
}
