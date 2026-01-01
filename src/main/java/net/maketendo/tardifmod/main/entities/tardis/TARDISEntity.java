package net.maketendo.tardifmod.main.entities.tardis;

import net.maketendo.tardifmod.main.TARDIFDimensions;
import net.maketendo.tardifmod.main.TARDIFEntities;
import net.maketendo.tardifmod.main.TARDIFItems;
import net.maketendo.tardifmod.main.TARDIFTags;
import net.maketendo.tardifmod.main.entities.TARDISExteriorBase;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.maketendo.tardifmod.utils.TardisInteriorGenerator;
import net.maketendo.tardifmod.utils.TardisInteriorUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jspecify.annotations.Nullable;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.manager.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.io.IOException;
import java.util.Set;
import java.util.UUID;

public class TARDISEntity extends TARDISExteriorBase {
    private static final TrackedData<Integer> TARDIS_ID =
            DataTracker.registerData(TARDISEntity.class, TrackedDataHandlerRegistry.INTEGER);
    private static final TrackedData<Boolean> DOOR_OPEN =
            DataTracker.registerData(TARDISEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    private static final TrackedData<Boolean> TARDIS_INITIALISED =
            DataTracker.registerData(TARDISEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    private ChunkPos forcedChunk;

    public TARDISEntity(EntityType<?> type, World world) {
        super(type, world);
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        builder.add(TARDIS_ID, -1);
        builder.add(DOOR_OPEN, false);
        builder.add(TARDIS_INITIALISED, false);
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
    protected void writeCustomData(WriteView view) {
        view.putBoolean("TardisInit", this.dataTracker.get(TARDIS_INITIALISED));
        view.putInt("TardisId", getTardisId());

    }

    @Override
    protected void readCustomData(ReadView view) {
        this.dataTracker.set(TARDIS_INITIALISED, view.getBoolean("TardisInit", false));
        setTardisId(view.getInt("TardisId", -1));
    }

    @Override
    public void tick() {
        super.tick();
        if (getEntityWorld().isClient()) return;

        forceLoadChunk();

        if (this.dataTracker.get(TARDIS_INITIALISED)) {
            TardisData data = TardisManager.get(getEntityWorld().getServer(), getTardisId());
            setDoorOpen(data.doorOpen);
            data.exteriorPos = getEntityPos();
            data.exteriorYaw = this.getYaw();
        }

        // TARDIS Vector (hehe bananas)
        tardisMovement();

        // Tardis Initialising
        initTardis();
    }

    @Override
    public ActionResult interactAt(PlayerEntity player, Vec3d hitPos, Hand hand) {

        if (this.getEntityWorld().isClient()) return ActionResult.SUCCESS;

        ItemStack itemStack = player.getStackInHand(hand);
        TardisData data = TardisManager.get(getEntityWorld().getServer(), getTardisId());

        if (itemStack.getItem() == Items.LEAD) {
            leadTardis(player, hand);
        } else if (itemStack.isIn(TARDIFTags.Items.TARDIS_KEYS)) {
            lockTardisDoor(data);
        } else {
            if (!(hitPos.y >= this.getHeight() - 0.25)) {
                tardisDoor(data, player);
            } else {
                player.startRiding(this);
            }
        }
        return ActionResult.CONSUME;
    }

    @Override
    public void onPlayerCollision(PlayerEntity player) {
        super.onPlayerCollision(player);

        if (!this.dataTracker.get(TARDIS_INITIALISED)) return;
        TardisData data = TardisManager.get(getEntityWorld().getServer(), getTardisId());

        if (getEntityWorld().isClient()) return;
        if (!data.doorOpen) return;

        double maxDistance = 0.40D;

        if (player.getEntityPos().squaredDistanceTo(this.getEntityPos()) <= maxDistance * maxDistance) {
            Vec3d offset = Vec3d.fromPolar(0, data.interiorYaw).multiply(0.6);

            player.teleport(
                    getEntityWorld().getServer().getWorld(TARDIFDimensions.TARDIS_WORLD),
                    data.interiorPos.getX() - offset.x, data.interiorPos.getY(), data.interiorPos.getZ() - offset.z,
                    Set.of(),
                    data.interiorYaw + 180f,
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
    public boolean handleAttack(Entity attacker) {
        playSoundAtTardis(SoundEvents.ENTITY_ZOMBIE_ATTACK_WOODEN_DOOR, 0.5f);
        return super.handleAttack(attacker);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>("DoorAnim", state -> {
            if (this.isDoorOpen())
                return state.setAndContinue(RawAnimation.begin().thenLoop("open"));
            else
                return state.setAndContinue(RawAnimation.begin().thenLoop("close"));
        }));
    }

    @Override
    public boolean isCollidable(@Nullable Entity entity) {
        return !isDoorOpen();
    }

    public void leadTardis(PlayerEntity player, Hand hand) {
        if (!player.isSneaking()) {
            this.attachLeash(player, true);

            if (!player.getAbilities().creativeMode) {
                player.getStackInHand(hand).decrement(1);
            }
        } else {
            this.detachLeash();
        }
    }

    public void lockTardisDoor(TardisData data) {
        if (!data.doorOpen) {
            if (data.doorLocked) {
                data.doorLocked = false;
            } else {
                data.doorLocked = true;
            }
            playSoundAtTardis(SoundEvents.ITEM_LODESTONE_COMPASS_LOCK, 0.5f);
        }
    }

    public void tardisDoor(TardisData data, PlayerEntity player) {
        if (!data.doorLocked) {
            if (data.doorOpen == true) {
                data.doorOpen = false;
            } else {
                data.doorOpen = true;
            }
        } else {
            player.sendMessage(Text.literal("The door is locked...").formatted(Formatting.GRAY), true);
            playSoundAtTardis(SoundEvents.ENTITY_ZOMBIE_ATTACK_WOODEN_DOOR, 0.5f);
        }
    }

    public void forceLoadChunk() {
        if (getEntityWorld() instanceof ServerWorld world) {
            ChunkPos current = new ChunkPos(getBlockPos());

            if (!current.equals(forcedChunk)) {
                if (forcedChunk != null) {
                    world.setChunkForced(forcedChunk.x, forcedChunk.z, false);
                }

                world.setChunkForced(current.x, current.z, true);
                forcedChunk = current;
            }
        }
    }

    public void tardisMovement() {
        Vec3d velocity = this.getVelocity();

        if (!this.isOnGround() && !this.hasNoGravity()) {
            velocity = velocity.add(0.0, -this.getGravity(), 0.0);
        }

        if (Math.abs(velocity.y) < 0.003) {
            velocity = new Vec3d(0, 0, 0);
        }

        this.setVelocity(velocity);
        this.move(MovementType.SELF, this.getVelocity());

        if (this.isOnGround()) {
            this.setVelocity(0, 0, 0);
        }
    }

    public void initTardis() {
        if (this.dataTracker.get(TARDIS_INITIALISED)) return;

        ServerWorld serverWorld = (ServerWorld) getEntityWorld();

        try {
            initializeTardis(serverWorld);
            this.dataTracker.set(TARDIS_INITIALISED, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initializeTardis(ServerWorld exteriorWorld) throws IOException {
        MinecraftServer server = exteriorWorld.getServer();
        TardisData data = new TardisData();

        data.owner =  UUID.randomUUID();

        data.doorOpen = false;
        data.doorLocked = false;
        data.powered = true;
        data.roundelLight = 10;

        data.exteriorPos = getEntityPos();
        data.exteriorDimension = exteriorWorld.getRegistryKey().getValue();
        data.exteriorYaw = 0f;


        ServerWorld tardisWorld = server.getWorld(TARDIFDimensions.TARDIS_WORLD);
        BlockPos interiorOrigin = TardisInteriorUtil.allocate(server);

        data.interiorOrigin = interiorOrigin;
        data.interiorPos = Vec3d.of(BlockPos.ofFloored(data.interiorOrigin.getX() + 0.5, data.interiorOrigin.getY() + 1, data.interiorOrigin.getZ() + 3.5));
        data.interiorYaw = 0f;
        data.interiorDimension = tardisWorld.getRegistryKey().getValue();

        TardisInteriorGenerator.generate(tardisWorld, interiorOrigin);

        int id = TardisManager.createTardis(server, data);

        setTardisId(id);

        ServerWorld targetWorld = server.getWorld(TARDIFDimensions.TARDIS_WORLD);

        if (targetWorld != null) {
            TARDISInteriorDoorEntity entity = new TARDISInteriorDoorEntity(TARDIFEntities.TARDIS_INTERIOR_DOOR, targetWorld);

            entity.setTardisId(id);

            entity.refreshPositionAndAngles(
                    data.interiorOrigin.getX() + 0.5,
                    data.interiorOrigin.getY() + 1,
                    data.interiorOrigin.getZ() + 3.9,
                    0,
                    0
            );

            targetWorld.spawnEntity(entity);
        }
    }
}
