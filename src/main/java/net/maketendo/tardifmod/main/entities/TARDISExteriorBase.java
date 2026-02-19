package net.maketendo.tardifmod.main.entities;

import net.maketendo.tardifmod.main.TARDIFItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Leashable;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jspecify.annotations.Nullable;

public abstract class TARDISExteriorBase extends ObjectEntity implements Leashable {

    private Leashable.@Nullable LeashData leashData;

    public TARDISExteriorBase(EntityType<?> type, World world) {
        super(type, world);
    }

    public Leashable.@Nullable LeashData getLeashData() {
        return this.leashData;
    }

    @Override
    public Vec3d getPassengerRidingPos(Entity passenger) {
        Vec3d forward = Vec3d.fromPolar(0, this.getYaw()).normalize();

        return this.getEntityPos()
                .add(0, this.getHeight() - 0.1, 0)
                .add(forward.multiply(0.4));
    }

    public void setLeashData(Leashable.@Nullable LeashData leashData) {
        this.leashData = leashData;
    }

    public Vec3d getLeashOffset() {
        return new Vec3d(0.0F, (0.88F * this.getHeight()), (0.64F * this.getWidth()));
    }

    public boolean canUseQuadLeashAttachmentPoint() {
        return true;
    }

    public Vec3d[] getQuadLeashOffsets() {
        return Leashable.createQuadLeashOffsets(this, 0.0F, 0.64, 0.382, 0.88);
    }

    @Override
    public @Nullable ItemStack getPickBlockStack() {
        return TARDIFItems.TARDIS_ITEM.getDefaultStack();
    }

    // Helper Methods
    public void playSoundAtTardis(SoundEvent soundEvent, Float volume) {
        getEntityWorld().playSound(
                null,
                getX(), getY(), getZ(),
                soundEvent,
                SoundCategory.NEUTRAL,
                volume,
                1.0f
        );
    }
}

