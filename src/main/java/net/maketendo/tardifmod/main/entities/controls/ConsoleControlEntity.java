package net.maketendo.tardifmod.main.entities.controls;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jspecify.annotations.Nullable;

public class ConsoleControlEntity extends Entity {

    private static final TrackedData<Float> LENGTH =
            DataTracker.registerData(ConsoleControlEntity.class, TrackedDataHandlerRegistry.FLOAT);
    private static final TrackedData<Float> HEIGHT =
            DataTracker.registerData(ConsoleControlEntity.class, TrackedDataHandlerRegistry.FLOAT);
    private static final TrackedData<Float> WIDTH =
            DataTracker.registerData(ConsoleControlEntity.class, TrackedDataHandlerRegistry.FLOAT);

    public ConsoleControlEntity(EntityType<?> type, World world) {
        super(type, world);
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        builder.add(LENGTH, 1f);
        builder.add(HEIGHT, 1f);
        builder.add(WIDTH, 1f);
    }

    @Override
    protected void writeCustomData(WriteView view) {
        view.putFloat("Length", this.dataTracker.get(LENGTH));
        view.putFloat("Height", this.dataTracker.get(HEIGHT));
        view.putFloat("Width", this.dataTracker.get(WIDTH));
    }

    @Override
    protected void readCustomData(ReadView view) {
        if (view.contains("Length")) {
            this.dataTracker.set(LENGTH, view.getFloat("Length", 0L));
        }

        if (view.contains("Height")) {
            this.dataTracker.set(HEIGHT, view.getFloat("Height", 0L));
        }

        if (view.contains("Width")) {
            this.dataTracker.set(WIDTH, view.getFloat("Width", 0L));
        }

        this.calculateDimensions();
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
        this.dataTracker.set(LENGTH, length);
        this.dataTracker.set(HEIGHT, height);
        this.dataTracker.set(WIDTH, width);

        this.calculateDimensions();
    }

    @Override
    public Box calculateDefaultBoundingBox(Vec3d pos) {
        double length = this.dataTracker.get(LENGTH);
        double height = this.dataTracker.get(HEIGHT);
        double width = this.dataTracker.get(WIDTH);

        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();

        return new Box(
                x - width / 2.0,
                y,
                z - length / 2.0,
                x + width / 2.0,
                y + height,
                z + length / 2.0
        );
    }




    @Override
    public boolean isCollidable(@Nullable Entity entity) {
        return false;
    }

    @Override
    public boolean damage(ServerWorld world, DamageSource source, float amount) {
        return false;
    }
}
