package net.maketendo.tardifmod.main.entities.tardis;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

public class TARDISPartEntity extends Entity {
    private TARDISEntity parent;

    public TARDISPartEntity(EntityType<?> type, World world) {
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

        this.refreshPositionAndAngles(
                parent.getX(),
                parent.getY(),
                parent.getZ(),
                parent.getYaw(),
                parent.getPitch()
        );
    }

    @Override
    public boolean isInvisible() {
        return true;
    }

    @Override
    public boolean hasNoGravity() {
        return true;
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {

    }

    @Override
    public boolean damage(ServerWorld world, DamageSource source, float amount) {
        return false;
    }

    @Override
    protected void readCustomData(ReadView view) {

    }

    @Override
    protected void writeCustomData(WriteView view) {

    }
}
