package net.maketendo.tardifmod.main;

import com.mojang.serialization.Codec;
import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.component.ComponentType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TARDIFComponents {
    public static final ComponentType<Integer> LINKED_ID = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(TARDIFMod.MOD_ID, "linked_id"),
            ComponentType.<Integer>builder().codec(Codec.INT).build()
    );

    public static void register() {}
}
