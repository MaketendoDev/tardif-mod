package net.maketendo.tardifmod.main.entities.controls;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

public class ConsoleControlEntity extends Entity {

    private static final EntityDataAccessor<Float> LENGTH =
            SynchedEntityData.defineId(ConsoleControlEntity.class, EntityDataSerializers.FLOAT);
    private static final EntityDataAccessor<Float> HEIGHT =
            SynchedEntityData.defineId(ConsoleControlEntity.class, EntityDataSerializers.FLOAT);
    private static final EntityDataAccessor<Float> WIDTH =
            SynchedEntityData.defineId(ConsoleControlEntity.class, EntityDataSerializers.FLOAT);

    public ConsoleControlEntity(EntityType<?> type, Level world) {
        super(type, world);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        builder.define(LENGTH, 1f);
        builder.define(HEIGHT, 1f);
        builder.define(WIDTH, 1f);
    }

    @Override
    protected void addAdditionalSaveData(ValueOutput view) {
        view.putFloat("Length", this.entityData.get(LENGTH));
        view.putFloat("Height", this.entityData.get(HEIGHT));
        view.putFloat("Width", this.entityData.get(WIDTH));
    }

    @Override
    protected void readAdditionalSaveData(ValueInput view) {
        if (view.contains("Length")) {
            this.entityData.set(LENGTH, view.getFloatOr("Length", 0L));
        }

        if (view.contains("Height")) {
            this.entityData.set(HEIGHT, view.getFloatOr("Height", 0L));
        }

        if (view.contains("Width")) {
            this.entityData.set(WIDTH, view.getFloatOr("Width", 0L));
        }

        this.refreshDimensions();
    }


    @Override
    public boolean isInvisible() {
        return true;
    }

    @Override
    public boolean shouldRender(double cameraX, double cameraY, double cameraZ) {
        return false;
    }

    public void setSize(float length, float height, float width) {
        this.entityData.set(LENGTH, length);
        this.entityData.set(HEIGHT, height);
        this.entityData.set(WIDTH, width);

        this.refreshDimensions();
    }

    @Override
    public AABB makeBoundingBox(Vec3 pos) {
        double length = this.entityData.get(LENGTH);
        double height = this.entityData.get(HEIGHT);
        double width = this.entityData.get(WIDTH);

        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();

        return new AABB(
                x - width / 2.0,
                y,
                z - length / 2.0,
                x + width / 2.0,
                y + height,
                z + length / 2.0
        );
    }




    @Override
    public boolean canBeCollidedWith(@Nullable Entity entity) {
        return false;
    }

    @Override
    public boolean hurtServer(ServerLevel world, DamageSource source, float amount) {
        return false;
    }
}
