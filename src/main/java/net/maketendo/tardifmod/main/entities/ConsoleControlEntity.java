package net.maketendo.tardifmod.main.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jspecify.annotations.Nullable;

public abstract class ConsoleControlEntity extends Entity {

    private static final TrackedData<Long> CONSOLE_POS =
            DataTracker.registerData(ConsoleControlEntity.class, TrackedDataHandlerRegistry.LONG);

    protected BlockPos consolePos;

    protected ConsoleControlEntity(EntityType<?> type, World world) {
        super(type, world);
        this.noClip = true;
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        builder.add(CONSOLE_POS, 0L);
    }

    @Override
    protected void readCustomData(ReadView view) {
        if (view.contains("ConsolePos")) {
            this.consolePos = BlockPos.fromLong(view.getLong("ConsolePos", 0));
            this.dataTracker.set(CONSOLE_POS, this.consolePos.asLong());
        }
    }

    @Override
    protected void writeCustomData(WriteView view) {
        if (consolePos != null) {
            view.putLong("ConsolePos", consolePos.asLong());
        }
    }

    public void setConsole(BlockPos pos) {
        this.consolePos = pos;
        this.dataTracker.set(CONSOLE_POS, pos.asLong());
    }

    public BlockPos getConsolePos() {
        long l = this.dataTracker.get(CONSOLE_POS);
        return l == 0L ? null : BlockPos.fromLong(l);
    }

    @Override
    public boolean isInvisible() {
        return true;
    }

    @Override
    public boolean isCollidable(@Nullable Entity entity) {
        return false;
    }

    @Override
    public boolean damage(ServerWorld world, DamageSource source, float amount) {
        return false;
    }

    private boolean powered;

    public boolean isPowered() {
        return powered;
    }

    public void setPowered(boolean powered) {
        this.powered = powered;
    }

    public abstract void onUse(PlayerEntity player);
}
