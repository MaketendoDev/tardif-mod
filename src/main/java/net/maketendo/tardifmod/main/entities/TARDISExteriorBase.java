package net.maketendo.tardifmod.main.entities;

import net.maketendo.tardifmod.main.TARDIFItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Leashable;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

public abstract class TARDISExteriorBase extends ObjectEntity implements Leashable {

    private Leashable.@Nullable LeashData leashData;

    public TARDISExteriorBase(EntityType<?> type, Level world) {
        super(type, world);
    }

    public Leashable.@Nullable LeashData getLeashData() {
        return this.leashData;
    }

    @Override
    public Vec3 getPassengerRidingPosition(Entity passenger) {
        Vec3 forward = Vec3.directionFromRotation(0, this.getYRot()).normalize();

        return this.position()
                .add(0, this.getBbHeight() - 0.1, 0)
                .add(forward.scale(0.4));
    }

    public void setLeashData(Leashable.@Nullable LeashData leashData) {
        this.leashData = leashData;
    }

    public Vec3 getLeashOffset() {
        return new Vec3(0.0F, (0.88F * this.getBbHeight()), (0.64F * this.getBbWidth()));
    }

    public boolean supportQuadLeash() {
        return true;
    }

    public Vec3[] getQuadLeashOffsets() {
        return Leashable.createQuadLeashOffsets(this, 0.0F, 0.64, 0.382, 0.88);
    }

    @Override
    public @Nullable ItemStack getPickResult() {
        return TARDIFItems.TARDIS_ITEM.getDefaultInstance();
    }

    // Helper Methods
    public void playSoundAtTardis(SoundEvent soundEvent, Float volume) {
        level().playSound(
                null,
                getX(), getY(), getZ(),
                soundEvent,
                SoundSource.NEUTRAL,
                volume,
                1.0f
        );
    }
}

