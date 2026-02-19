package net.maketendo.tardifmod.main.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jspecify.annotations.NonNull;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.stateless.StatelessGeoEntity;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.List;

public abstract class ObjectEntity extends Entity implements StatelessGeoEntity {
    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

    public ObjectEntity(EntityType<?> type, World world) {
        super(type, world);
    }

    @Override
    public boolean collides(Vec3d oldPos, Vec3d newPos, List<Box> boxes) {
        return super.collides(oldPos, newPos, boxes);
    }

    @Override
    public boolean damage(ServerWorld world, DamageSource source, float amount) {
        return false;
    }

    @Override
    public boolean isAttackable() {
        return true;
    }

    @Override
    public boolean canHit() {
        return true;
    }

    @Override
    public @NonNull AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }
}
