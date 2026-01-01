package net.maketendo.tardifmod.main;

import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.maketendo.tardifmod.main.entities.tardis.TARDISInteriorDoorEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class TARDIFEntities {
    private static final RegistryKey<EntityType<?>> TARDIS_KEY =
            RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(TARDIFMod.MOD_ID, "tardis"));

    private static final RegistryKey<EntityType<?>> TARDIS_INTERIOR_DOOR_KEY =
            RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(TARDIFMod.MOD_ID, "tardis_interior_door"));

    public static final EntityType<TARDISEntity> TARDIS = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(TARDIFMod.MOD_ID, "tardis"),
            EntityType.Builder.create(TARDISEntity::new, SpawnGroup.MISC)
                    .dimensions(1f, 2.74f).build(TARDIS_KEY));

    public static final EntityType<TARDISInteriorDoorEntity> TARDIS_INTERIOR_DOOR = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(TARDIFMod.MOD_ID, "tardis_interior_door"),
            EntityType.Builder.create(TARDISInteriorDoorEntity::new, SpawnGroup.MISC)
                    .dimensions(0.1f, 2.5f).disableSummon().build(TARDIS_INTERIOR_DOOR_KEY));

    public static void register() {
    }
}
