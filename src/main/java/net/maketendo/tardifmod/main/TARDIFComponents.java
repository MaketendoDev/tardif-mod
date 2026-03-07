package net.maketendo.tardifmod.main;

import com.mojang.serialization.Codec;
import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class TARDIFComponents {
    public static final DataComponentType<Integer> LINKED_ID = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "linked_id"),
            DataComponentType.<Integer>builder().persistent(Codec.INT).build()
    );

    public static void register() {}
}
