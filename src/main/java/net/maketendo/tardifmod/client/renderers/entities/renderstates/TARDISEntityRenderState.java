package net.maketendo.tardifmod.client.renderers.entities.renderstates;

import net.maketendo.tardifmod.client.animations.tardis.TardisAnimation;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.AnimationState;

import java.util.ArrayList;
import java.util.List;

public class TARDISEntityRenderState extends LivingEntityRenderState {
    private boolean door_open = false;

    //public float ageInTicks;

    public AnimationState doorRightOpenAnimationState = new AnimationState();
    public AnimationState doorLeftOpenAnimationState = new AnimationState();

    public AnimationState doorRightCloseAnimationState = new AnimationState();
    public AnimationState doorLeftCloseAnimationState = new AnimationState();

    public AnimationState phoneBoothOpenAnimationState = new AnimationState();
    public AnimationState phoneBoothCloseAnimationState = new AnimationState();

    public AnimationState lampOpenAnimationState = new AnimationState();
    public AnimationState lampCloseAnimationState = new AnimationState();

    public AnimationState phoneRingAnimationState = new AnimationState();
    public AnimationState phoneDialAnimationState = new AnimationState();

    public AnimationState fallingStartAnimationState = new AnimationState();
    public AnimationState fallingLoopAnimationState = new AnimationState();

    public Boolean getDoorOpened() {
        return door_open;
    }

    public void setDoorOpened(boolean opened) {
        this.door_open = opened;
    }

}
