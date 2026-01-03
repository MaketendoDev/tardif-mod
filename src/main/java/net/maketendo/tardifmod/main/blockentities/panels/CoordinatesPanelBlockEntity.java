package net.maketendo.tardifmod.main.blockentities.panels;

import net.maketendo.tardifmod.main.TARDIFBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.manager.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

public class CoordinatesPanelBlockEntity extends BlockEntity implements GeoBlockEntity {

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private int increment = 1;

    public CoordinatesPanelBlockEntity(BlockPos pos, BlockState state) {
        super(TARDIFBlockEntities.COORDINATES_PANEL, pos, state);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    public int getIncrement() {
        return increment;
    }

    public void adjustIncrement(int delta) {
        increment = Math.max(1, increment + delta);
    }

    public void cycleIncrement() {
        if (increment == 1) increment = 10;
        else if (increment == 10) increment = 100;
        else if (increment == 100) increment = 1000;
        else increment = 1;
    }


}
