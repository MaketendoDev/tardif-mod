package net.maketendo.tardifmod.main.blockentities.panels;

import net.maketendo.tardifmod.main.TARDIFBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.manager.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

public class PowerPanelBlockEntity extends BlockEntity implements GeoBlockEntity {

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private boolean increment_up = true;


    public PowerPanelBlockEntity(BlockPos pos, BlockState state) {
        super(TARDIFBlockEntities.TARDIS_LIGHT_BLOCK, pos, state);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    public boolean isIncrementingUp() {
        return increment_up;
    }

    public void toggleIncrementUp() {
        increment_up = !increment_up;
    }
}
