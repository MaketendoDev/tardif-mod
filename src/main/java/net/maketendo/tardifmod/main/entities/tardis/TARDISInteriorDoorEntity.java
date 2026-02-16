package net.maketendo.tardifmod.main.entities.tardis;

import net.maketendo.tardifmod.main.entities.ObjectBaseEntity;
import net.maketendo.tardifmod.main.items.LinkableItem;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jspecify.annotations.NonNull;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.manager.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;
import java.util.Set;

public class TARDISInteriorDoorEntity extends ObjectBaseEntity implements GeoAnimatable {
    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

    private static final TrackedData<Integer> TARDIS_ID =
            DataTracker.registerData(TARDISInteriorDoorEntity.class, TrackedDataHandlerRegistry.INTEGER);
    private static final TrackedData<Boolean> DOOR_OPEN =
            DataTracker.registerData(TARDISInteriorDoorEntity.class, TrackedDataHandlerRegistry.BOOLEAN);


    public TARDISInteriorDoorEntity(EntityType<?> type, World world) {
        super(type, world);
    }

    public int getTardisId() {
        return this.dataTracker.get(TARDIS_ID);
    }

    public void setTardisId(int id) {
        this.dataTracker.set(TARDIS_ID, id);
    }

    public void setDoorOpen(boolean open) {
        dataTracker.set(DOOR_OPEN, open);
    }

    public boolean isDoorOpen() {
        return dataTracker.get(DOOR_OPEN);
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        builder.add(TARDIS_ID, -1);
        builder.add(DOOR_OPEN, false);
    }

    @Override
    protected void writeCustomData(WriteView view) {
        view.putInt("TardisId", getTardisId());
    }

    @Override
    protected void readCustomData(ReadView view) {
        setTardisId(view.getInt("TardisId", -1));
    }

    @Override
    public void tick() {
        super.tick();
        if (getEntityWorld().isClient()) return;

        TardisData data = TardisManager.get(getEntityWorld().getServer(), getTardisId());
        setDoorOpen(data.doorOpen);

        getEntityWorld().getChunkManager().setChunkForced(getChunkPos(), true);

        data.interiorPos = getEntityPos();
        data.interiorYaw = getYaw();
    }

    @Override
    public ActionResult interactAt(PlayerEntity player, Vec3d hitPos, Hand hand) {

        if (this.getEntityWorld().isClient()) return ActionResult.SUCCESS;

        ItemStack stack = player.getStackInHand(hand);
        TardisData data = TardisManager.get(getEntityWorld().getServer(), getTardisId());

        if (stack.getItem() instanceof LinkableItem item) {
            linkItem(item,  stack, player);
        } else {
            if (!player.isSneaking()) {
                if (!data.doorLocked) {
                    if (data.doorOpen == true) {
                        data.doorOpen = false;
                    } else {
                        data.doorOpen = true;
                    }
                } else {
                    player.sendMessage(Text.literal("The door is locked...").formatted(Formatting.GRAY), true);
                    playSoundAtTardisDoor(SoundEvents.ENTITY_ZOMBIE_ATTACK_WOODEN_DOOR, 0.5f);
                }
            } else {
                lockTardisDoor(data);
            }
        }

        return ActionResult.CONSUME;
    }

    @Override
    public void onPlayerCollision(PlayerEntity player) {
        super.onPlayerCollision(player);

        if (getEntityWorld().isClient()) return;

        TardisData data = TardisManager.get(getEntityWorld().getServer(), getTardisId());
        if (data != null && !data.doorOpen) return;

        double maxDistance = 0.45D;

        if (player.getEntityPos().squaredDistanceTo(this.getEntityPos()) <= maxDistance * maxDistance) {
            Vec3d offset = Vec3d.fromPolar(0, data.exteriorYaw).multiply(0.45);

            player.teleport(
                    getEntityWorld().getServer().getWorld(RegistryKey.of(RegistryKeys.WORLD, data.exteriorDimension)),
                    data.exteriorPos.getX() + offset.x, data.exteriorPos.getY(), data.exteriorPos.getZ() + offset.z,
                    Set.of(),
                    data.exteriorYaw,
                    player.getPitch(),
                    true
            );

            player.addStatusEffect(
                    new StatusEffectInstance(
                            StatusEffects.BLINDNESS,
                            25,
                            1,
                            false,
                            false
                    )
            );
        }
    }

    @Override
    protected Box calculateDefaultBoundingBox(Vec3d pos) {
        return new Box(
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

    public void lockTardisDoor(TardisData data) {
        if (!data.doorOpen) {
            if (data.doorLocked) {
                data.doorLocked = false;
            } else {
                data.doorLocked = true;
            }
            playSoundAtTardisDoor(SoundEvents.ITEM_LODESTONE_COMPASS_LOCK, 0.5f);
        }
    }

    public void linkItem(LinkableItem item, ItemStack stack, PlayerEntity player) {
        if (!(LinkableItem.getLinkedId(stack) == getTardisId())) {
            int id = this.getTardisId();

            if (id < 0) {
                player.sendMessage(Text.literal("TARDIS Door is not linked to an ID").formatted(Formatting.RED), true);
            }

            LinkableItem.setLinkedId(stack, id);
            player.sendMessage(Text.literal("Linked to TARDIS #" + id + "!").formatted(Formatting.GREEN), true);
        }
    }

    public void playSoundAtTardisDoor(SoundEvent soundEvent, Float volume) {
        getEntityWorld().playSound(
                null,
                getX(), getY(), getZ(),
                soundEvent,
                SoundCategory.NEUTRAL,
                volume,
                1.0f
        );
    }
}
