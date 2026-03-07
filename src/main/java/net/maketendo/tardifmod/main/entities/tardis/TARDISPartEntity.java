package net.maketendo.tardifmod.main.entities.tardis;

import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;

public class TARDISPartEntity extends Entity {
    private TARDISEntity parent;

    public TARDISPartEntity(EntityType<?> type, Level world) {
        super(type, world);
    }

    public void setParent(TARDISEntity parent) {
        this.parent = parent;
    }

    @Override
    public void tick() {
        super.tick();

        if (parent == null || parent.isRemoved()) {
            this.discard();
            return;
        }

        this.snapTo(
                parent.getX(),
                parent.getY(),
                parent.getZ(),
                parent.getYRot(),
                parent.getXRot()
        );
    }

    @Override
    public boolean isInvisible() {
        return true;
    }

    @Override
    public boolean isNoGravity() {
        return true;
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {

    }

    @Override
    public boolean hurtServer(ServerLevel world, DamageSource source, float amount) {
        return false;
    }

    @Override
    protected void readAdditionalSaveData(ValueInput view) {

    }

    @Override
    protected void addAdditionalSaveData(ValueOutput view) {

    }
}
