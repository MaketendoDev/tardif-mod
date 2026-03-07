package net.maketendo.tardifmod.main.entities.tardis;

import net.maketendo.tardifmod.main.entities.ObjectEntity;
import net.maketendo.tardifmod.main.items.extendable.LinkableItem;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.NonNull;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.manager.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.Set;

public class TardisInteriorDoorEntity extends ObjectEntity implements GeoAnimatable {
    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

    private static final EntityDataAccessor<Integer> TARDIS_ID =
            SynchedEntityData.defineId(TardisInteriorDoorEntity.class, EntityDataSerializers.INT);
    private static final EntityDataAccessor<Boolean> DOOR_OPEN =
            SynchedEntityData.defineId(TardisInteriorDoorEntity.class, EntityDataSerializers.BOOLEAN);


    public TardisInteriorDoorEntity(EntityType<?> type, Level world) {
        super(type, world);
    }

    public int getTardisId() {
        return this.entityData.get(TARDIS_ID);
    }

    public void setTardisId(int id) {
        this.entityData.set(TARDIS_ID, id);
    }

    public void setDoorOpen(boolean open) {
        entityData.set(DOOR_OPEN, open);
    }

    public boolean isDoorOpen() {
        return entityData.get(DOOR_OPEN);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);

        builder.define(TARDIS_ID, -1);
        builder.define(DOOR_OPEN, false);
    }

    @Override
    protected void addAdditionalSaveData(ValueOutput view) {
        view.putInt("TardisId", getTardisId());
    }

    @Override
    protected void readAdditionalSaveData(ValueInput view) {
        setTardisId(view.getIntOr("TardisId", -1));
    }

    @Override
    public void tick() {
        super.tick();
        if (level().isClientSide()) return;

        TardisData data = TardisManager.getFromId(level().getServer(), getTardisId());
        setDoorOpen(data.doorOpen);

        level().getChunkSource().updateChunkForced(chunkPosition(), true);

        data.interiorPos = position();
        data.interiorYaw = getYRot();
    }

    @Override
    public InteractionResult interactAt(Player player, Vec3 hitPos, InteractionHand hand) {

        if (this.level().isClientSide()) return InteractionResult.SUCCESS;

        ItemStack stack = player.getItemInHand(hand);
        TardisData data = TardisManager.getFromId(level().getServer(), getTardisId());

        if (stack.getItem() instanceof LinkableItem item) {
            linkItem(item,  stack, player);
        } else {
            if (!player.isShiftKeyDown()) {
                if (!data.doorLocked) {
                    if (data.doorOpen == true) {
                        data.doorOpen = false;
                    } else {
                        data.doorOpen = true;
                    }
                } else {
                    player.displayClientMessage(Component.literal("The door is locked...").withStyle(ChatFormatting.GRAY), true);
                    playSoundAtTardisDoor(SoundEvents.ZOMBIE_ATTACK_WOODEN_DOOR, 0.5f);
                }
            } else {
                lockTardisDoor(data, player);
            }
        }

        return InteractionResult.CONSUME;
    }

    @Override
    public void playerTouch(Player player) {
        super.playerTouch(player);

        if (level().isClientSide()) return;

        TardisData data = TardisManager.getFromId(level().getServer(), getTardisId());
        if (data != null && !data.doorOpen) return;

        double maxDistance = 0.3D;

        if (player.position().distanceToSqr(this.position()) <= maxDistance * maxDistance) {
            Vec3 offset = Vec3.directionFromRotation(0, data.exteriorYaw).scale(0.45);

            player.teleportTo(
                    level().getServer().getLevel(ResourceKey.create(Registries.DIMENSION, data.exteriorDimension)),
                    data.exteriorPos.x() + offset.x, data.exteriorPos.y(), data.exteriorPos.z() + offset.z,
                    Set.of(),
                    data.exteriorYaw,
                    player.getXRot(),
                    true
            );

            player.addEffect(
                    new MobEffectInstance(
                            MobEffects.BLINDNESS,
                            25,
                            1,
                            false,
                            false
                    )
            );
        }
    }

    @Override
    protected AABB makeBoundingBox(Vec3 pos) {
        return new AABB(
                getX() - 0.6, getY(),
                getZ() - 0.1,
                getX() + 0.6, getY() + 2.5,
                getZ() + 0.1
        );
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>("DoorAnim", state -> {
            if (isDoorOpen())
                return state.setAndContinue(RawAnimation.begin().thenPlayAndHold("open"));
            else
                return state.setAndContinue(RawAnimation.begin().thenPlayAndHold("close"));
        }));
    }

    @Override
    public @NonNull AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }

    public void lockTardisDoor(TardisData data, Player player) {
        if (!data.doorOpen) {
            if (data.doorLocked) {
                data.doorLocked = false;
                player.displayClientMessage(Component.literal("\uDD13").withStyle(ChatFormatting.GRAY), true);
            } else {
                data.doorLocked = true;
                player.displayClientMessage(Component.literal("\uDD12").withStyle(ChatFormatting.GRAY), true);
            }
            playSoundAtTardisDoor(SoundEvents.LODESTONE_COMPASS_LOCK, 0.5f);
        }
    }

    public void linkItem(LinkableItem item, ItemStack stack, Player player) {
        if (!(LinkableItem.getLinkedId(stack) == getTardisId())) {
            int id = this.getTardisId();

            if (id < 0) {
                player.displayClientMessage(Component.literal("TARDIS Door is not linked to an ID").withStyle(ChatFormatting.RED), true);
            }

            LinkableItem.setLinkedId(stack, id);
            player.displayClientMessage(Component.literal("Linked to TARDIS #" + id + "!").withStyle(ChatFormatting.GREEN), true);
        }
    }

    public void playSoundAtTardisDoor(SoundEvent soundEvent, Float volume) {
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
