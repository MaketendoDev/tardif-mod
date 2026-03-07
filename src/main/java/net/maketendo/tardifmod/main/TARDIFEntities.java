package net.maketendo.tardifmod.main;

import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.entities.controls.ConsoleControlEntity;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.maketendo.tardifmod.main.entities.tardis.TARDISInteriorDoorEntity;
import net.maketendo.tardifmod.main.entities.tardis.TARDISPartEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class TARDIFEntities {
    private static final ResourceKey<EntityType<?>> TARDIS_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "tardis"));

    private static final ResourceKey<EntityType<?>> TARDIS_INTERIOR_DOOR_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "tardis_interior_door"));

    private static final ResourceKey<EntityType<?>> CONSOLE_CONTROL_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "console_control"));

    private static final ResourceKey<EntityType<?>> TARDIS_PART_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "tardis_part"));

    public static final EntityType<TARDISEntity> TARDIS = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "tardis"),
            EntityType.Builder.of(TARDISEntity::new, MobCategory.MISC)
                    .sized(1f, 2.74f).build(TARDIS_KEY));

    public static final EntityType<TARDISInteriorDoorEntity> TARDIS_INTERIOR_DOOR = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "tardis_interior_door"),
            EntityType.Builder.of(TARDISInteriorDoorEntity::new, MobCategory.MISC)
                    .sized(0.1f, 2.3f).noSummon().build(TARDIS_INTERIOR_DOOR_KEY));

    public static final EntityType<ConsoleControlEntity> CONSOLE_CONTROL = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "console_control"),
            EntityType.Builder.of(ConsoleControlEntity::new, MobCategory.MISC)
                    .sized(0.1f, 2.3f).build(CONSOLE_CONTROL_KEY));

    public static final EntityType<TARDISPartEntity> TARDIS_PART = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "tardis_part"),
            EntityType.Builder.of(TARDISPartEntity::new, MobCategory.MISC)
                    .sized(0.1f, 2.5f).build(TARDIS_PART_KEY));

    public static void register() {
    }
}
