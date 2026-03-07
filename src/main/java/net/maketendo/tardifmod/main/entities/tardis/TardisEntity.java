package net.maketendo.tardifmod.main.entities.tardis;

import net.maketendo.tardifmod.client.animations.tardis.TardisAnimation;
import net.maketendo.tardifmod.client.managers.AnimationManager;
import net.maketendo.tardifmod.main.*;
import net.maketendo.tardifmod.main.entities.TardisExteriorBase;
import net.maketendo.tardifmod.main.tardis.TardisData;
import net.maketendo.tardifmod.main.tardis.TardisManager;
import net.maketendo.tardifmod.utils.animation.FadeTimeline;
import net.maketendo.tardifmod.utils.TardisInteriorUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.io.IOException;
import java.util.Set;
import java.util.UUID;

import static net.maketendo.tardifmod.utils.CommandUtil.runCommandAsEntity;

public class TardisEntity extends TardisExteriorBase {
    private static final EntityDataAccessor<Integer> TARDIS_ID =
            SynchedEntityData.defineId(TardisEntity.class, EntityDataSerializers.INT);
    private static final EntityDataAccessor<Boolean> DOOR_OPEN =
            SynchedEntityData.defineId(TardisEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> TARDIS_INITIALISED =
            SynchedEntityData.defineId(TardisEntity.class, EntityDataSerializers.BOOLEAN);

    private int dematTicks = 0;
    private float fade = 1.0f;
    private ChunkPos forcedChunk;
    private boolean dematAnimStarted = false;

    public static final EntityDataAccessor<Integer> DATA_ANIMATION =
            SynchedEntityData.defineId(TardisEntity.class, EntityDataSerializers.INT);

    // Animations
    public final AnimationState doorRightOpenAnimationState = new AnimationState();
    public final AnimationState doorLeftOpenAnimationState = new AnimationState();

    public final AnimationState doorRightCloseAnimationState = new AnimationState();
    public final AnimationState doorLeftCloseAnimationState = new AnimationState();

    public final AnimationState phoneBoothOpenAnimationState = new AnimationState();
    public final AnimationState phoneBoothCloseAnimationState = new AnimationState();

    public final AnimationState lampOpenAnimationState = new AnimationState();
    public final AnimationState lampCloseAnimationState = new AnimationState();

    public final AnimationState phoneRingAnimationState = new AnimationState();
    public final AnimationState phoneDialAnimationState = new AnimationState();

    public final AnimationState fallingStartAnimationState = new AnimationState();
    public final AnimationState fallingLoopAnimationState = new AnimationState();

    public TardisEntity(EntityType<?> type, Level world) {
        super(type, world);
    }

    @Override
    public @NonNull Component getName() {
        return Component.literal("§bTARDIS Exterior §7| ID: " + getTardisId());
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(TARDIS_ID, -1);
        builder.define(DOOR_OPEN, false);
        builder.define(TARDIS_INITIALISED, false);
        builder.define(DATA_ANIMATION, 0);
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

    public void preInitialised() {this.entityData.set(TARDIS_INITIALISED, true);}

    public void setOpacity(Float opacity) {
        this.fade = opacity;
    }

    public void playAnimation(TardisAnimation animation) {
        this.entityData.set(DATA_ANIMATION, animation.ordinal());
    }

    @Override
    protected void addAdditionalSaveData(ValueOutput view) {
        view.putBoolean("TardisInit", this.entityData.get(TARDIS_INITIALISED));
        view.putInt("TardisId", getTardisId());

    }

    @Override
    protected void readAdditionalSaveData(ValueInput view) {
        this.entityData.set(TARDIS_INITIALISED, view.getBooleanOr("TardisInit", false));
        setTardisId(view.getIntOr("TardisId", -1));
    }

    @Override
    public void onSyncedDataUpdated(EntityDataAccessor<?> key) {

        if (DATA_ANIMATION.equals(key)) {

            switch (TardisAnimation.values()[this.entityData.get(DATA_ANIMATION)]) {

                case DOOR_OPEN -> {
                    //this.doorRightCloseAnimationState.stop();
                    //this.doorLeftCloseAnimationState.stop();

                    this.doorRightOpenAnimationState.startIfStopped(this.tickCount);
                    this.doorLeftOpenAnimationState.startIfStopped(this.tickCount);
                }

                case DOOR_CLOSE -> {
                    //this.doorLeftOpenAnimationState.stop();
                    //this.doorRightOpenAnimationState.stop();

                    this.doorRightCloseAnimationState.startIfStopped(this.tickCount);
                    this.doorLeftCloseAnimationState.startIfStopped(this.tickCount);
                }

                case PHONE_OPEN -> this.phoneBoothOpenAnimationState.start(this.tickCount);

                case PHONE_CLOSE -> this.phoneBoothCloseAnimationState.start(this.tickCount);

                case LAMP_OPEN -> this.lampOpenAnimationState.start(this.tickCount);

                case LAMP_CLOSE -> this.lampCloseAnimationState.start(this.tickCount);

                case PHONE_RING -> this.phoneRingAnimationState.start(this.tickCount);

                case PHONE_DIAL -> this.phoneDialAnimationState.start(this.tickCount);

                case FALLING_START -> this.fallingStartAnimationState.start(this.tickCount);

                case FALLING_LOOP -> this.fallingLoopAnimationState.start(this.tickCount);
            }
        }

        super.onSyncedDataUpdated(key);
    }

    @Override
    public void tick() {
        super.tick();


        if (this.entityData.get(TARDIS_INITIALISED) && level().isClientSide()) {
            TardisData data = TardisManager.getFromId(level().getServer(), getTardisId());
            clientTick(data);
        }

        if (level().isClientSide()) return;

        forceLoadChunk();

        if (this.entityData.get(TARDIS_INITIALISED)) {
            TardisData data = TardisManager.getFromId(level().getServer(), getTardisId());
            setDoorOpen(data.doorOpen);

            if (!data.dematerialised) {
                dematAnimStarted = false;
                setOpacity(1.0f);
            }

            data.exteriorPos = position();
            data.exteriorYaw = this.getYRot();

            if (data.dematerialised) {
                dematTicks++;
                if (dematTicks % 16  == 0) {
                    runCommandAsEntity(this, "particle flash{color:[1.0,1.0,1.0,1.0]} ~ ~3 ~ 0 0 0 0.1 1 normal");
                }
                if (dematTicks >= 20 * 15) {remove(RemovalReason.DISCARDED);}
            }
        }

        // TARDIS Vector (hehe bananas)
        //tardisMovement();

        // Tardis Initialising
        initTardis();
    }

    private void clientTick(TardisData data) {
        if (data.dematerialised && !dematAnimStarted) {
            dematAnimStarted = true;

            AnimationManager.trigger(
                    new FadeTimeline(1.0f, this::setOpacity)
                            .fadeTo(20, 1.0f)
                            .fadeTo(20, 0.7f)
                            .fadeTo(20, 1.0f)
                            .fadeTo(20, 0.6f)
                            .fadeTo(20, 0.9f)
                            .fadeTo(20, 0.5f)
                            .fadeTo(15, 0.7f)
                            .fadeTo(20, 0.3f)
                            .fadeTo(15, 0.5f)
                            .fadeTo(20, 0.2f)
                            .fadeTo(30, 0f)
                            .onTick(this::spawnWind)
            );
        }
    }

    private void spawnWind() {
        Level world = level();
        RandomSource random = world.getRandom();

        for (int i = 0; i < 6; i++) {
            double angle = random.nextDouble() * Math.PI * 2;
            double speed = 0.05 + random.nextDouble() * 0.05;
            double vx = Math.cos(angle) * speed;
            double vz = Math.sin(angle) * speed;
            double vy = 0.1 + random.nextDouble() * 0.05;

            double x = getX() + (random.nextDouble() - 0.5) * 0.3;
            double y = getY() + 0.02;
            double z = getZ() + (random.nextDouble() - 0.5) * 0.3;

            BlockState ground = world.getBlockState(blockPosition().below());
            if (!ground.isAir()) {
                world.addParticle(
                        new BlockParticleOption(ParticleTypes.BLOCK, ground),
                        x, y, z,
                        vx, vy, vz
                );
            }
        }
    }


    @Override
    public InteractionResult interactAt(Player player, Vec3 hitPos, InteractionHand hand) {

        if (this.level().isClientSide()) return InteractionResult.SUCCESS;

        initParts();

        ItemStack itemStack = player.getItemInHand(hand);
        TardisData data = TardisManager.getFromId(level().getServer(), getTardisId());

        if (itemStack.getItem() == Items.LEAD) {
            leadTardis(player, hand);
        } else if (itemStack.is(TARDIFTags.Items.TARDIS_KEYS)) {
            lockTardisDoor(data, player);
        } else {
            if (!(hitPos.y >= this.getBbHeight() - 0.25)) {
                tardisDoor(data, player);
            } else {
                player.startRiding(this);
            }
        }
        return InteractionResult.CONSUME;
    }

    @Override
    public void playerTouch(Player player) {
        super.playerTouch(player);

        if (!this.entityData.get(TARDIS_INITIALISED)) return;
        TardisData data = TardisManager.getFromId(level().getServer(), getTardisId());

        if (level().isClientSide()) return;
        if (!data.doorOpen) return;

        double maxDistance = 0.40D;

        if (player.position().distanceToSqr(this.position()) <= maxDistance * maxDistance) {
            Vec3 offset = Vec3.directionFromRotation(0, data.interiorYaw).scale(0.6);

            player.teleportTo(
                    level().getServer().getLevel(TARDIFDimensions.TARDIS_WORLD),
                    data.interiorPos.x() - offset.x, data.interiorPos.y(), data.interiorPos.z() - offset.z,
                    Set.of(),
                    data.interiorYaw + 180f,
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
    public boolean skipAttackInteraction(Entity attacker) {
        playSoundAtTardis(SoundEvents.ZOMBIE_ATTACK_WOODEN_DOOR, 0.5f);
        return super.skipAttackInteraction(attacker);
    }

    @Override
    public boolean canBeCollidedWith(@Nullable Entity entity) {
        return !isDoorOpen();
    }

    public void leadTardis(Player player, InteractionHand hand) {
        if (!player.isShiftKeyDown()) {
            this.setLeashedTo(player, true);

            if (!player.getAbilities().instabuild) {
                player.getItemInHand(hand).shrink(1);
            }
        } else {
            this.dropLeash();
        }
    }

    public void lockTardisDoor(TardisData data, Player player) {
        if (!data.doorOpen) {
            if (data.doorLocked) {
                data.doorLocked = false;
                player.displayClientMessage(Component.literal("\uD83D\uDD12").withStyle(ChatFormatting.GRAY), true);
            } else {
                data.doorLocked = true;
                player.displayClientMessage(Component.literal("\uD83D\uDD12").withStyle(ChatFormatting.GRAY), true);
            }
            playSoundAtTardis(SoundEvents.LODESTONE_COMPASS_LOCK, 0.5f);
        }
    }

    public void tardisDoor(TardisData data, Player player) {
        if (!data.doorLocked) {

            player.awardStat(TARDIFPlayerStatistics.INTERACT_WITH_TARDIS);

            if (data.doorOpen) {

                data.doorOpen = false;
                playAnimation(TardisAnimation.DOOR_CLOSE);
                this.doorRightCloseAnimationState.start(this.tickCount);
                this.doorLeftCloseAnimationState.start(this.tickCount);
            } else {
                data.doorOpen = true;
                playAnimation(TardisAnimation.DOOR_OPEN);
                this.doorRightOpenAnimationState.start(this.tickCount);
                this.doorLeftOpenAnimationState.start(this.tickCount);
            }
            this.refreshDimensions();
        } else {

            player.displayClientMessage(Component.literal("The door is locked...").withStyle(ChatFormatting.GRAY), true);
            playSoundAtTardis(SoundEvents.ZOMBIE_ATTACK_WOODEN_DOOR, 0.5f);

        }
    }

    public void forceLoadChunk() {
        if (level() instanceof ServerLevel world) {
            ChunkPos current = new ChunkPos(blockPosition());

            if (!current.equals(forcedChunk)) {
                if (forcedChunk != null) {
                    world.setChunkForced(forcedChunk.x, forcedChunk.z, false);
                }

                world.setChunkForced(current.x, current.z, true);
                forcedChunk = current;
            }
        }
    }

    public void initTardis() {
        if (this.entityData.get(TARDIS_INITIALISED)) return;

        ServerLevel serverWorld = (ServerLevel) level();

        try {
            initializeTardis(serverWorld);
            this.entityData.set(TARDIS_INITIALISED, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private TardisPartEntity leftArm;
    private TardisPartEntity rightArm;

    private void initParts() {
        if (this.level().isClientSide()) return;

        leftArm = TARDIFEntities.TARDIS_PART.create(this.level(), EntitySpawnReason.TRIGGERED);
        rightArm = TARDIFEntities.TARDIS_PART.create(this.level(), EntitySpawnReason.TRIGGERED);

        if (leftArm != null) {
            leftArm.setParent(this);
            leftArm.snapTo(
                    this.getX() - 1.0,
                    this.getY(),
                    this.getZ(),
                    this.getYRot(),
                    this.getXRot()
            );
            this.level().addFreshEntity(leftArm);
        }

        if (rightArm != null) {
            rightArm.setParent(this);
            rightArm.snapTo(
                    this.getX() + 1.0,
                    this.getY(),
                    this.getZ(),
                    this.getYRot(),
                    this.getXRot()
            );
            this.level().addFreshEntity(rightArm);
        }
    }

    public void initializeTardis(ServerLevel exteriorWorld) throws IOException {
        MinecraftServer server = exteriorWorld.getServer();
        TardisData data = new TardisData();

        data.owner =  UUID.randomUUID();

        data.doorOpen = false;
        data.doorLocked = false;
        data.powered = true;
        data.emergencyMode = false;
        data.roundelLight = 10;

        data.exteriorPos = position();
        data.exteriorDimension = exteriorWorld.dimension().identifier();
        data.exteriorYaw = 0f;


        ServerLevel tardisWorld = server.getLevel(TARDIFDimensions.TARDIS_WORLD);
        BlockPos interiorOrigin = TardisInteriorUtil.allocate(server);

        data.interiorOrigin = interiorOrigin;
        data.interiorPos = Vec3.atLowerCornerOf(BlockPos.containing(data.interiorOrigin.getX() + 0.5, data.interiorOrigin.getY() + 1, data.interiorOrigin.getZ() + 3.5));
        data.interiorYaw = 0f;
        data.interiorDimension = tardisWorld.dimension().identifier();

        data.previousPos = position();
        data.setPos = position();

        data.dematerialised = false;

        int id = TardisManager.createTardis(server, data);

        setTardisId(id);

        TardisInteriorUtil.generate(tardisWorld, interiorOrigin, data);

    }
}
