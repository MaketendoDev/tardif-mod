package net.maketendo.tardifmod.main;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.items.TardisItem;
import net.maketendo.tardifmod.main.items.TardisKeyItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.function.Function;

public class TARDIFItems {

    public static final Item TARDIS_ITEM = registerItem("tardis_item",
            setting -> new TardisItem(setting.fireproof().maxCount(1)));

    public static final Item SILVER_TARDIS_KEY = registerItem("silver_tardis_key",
            setting -> new TardisKeyItem(setting.fireproof().maxCount(1).rarity(Rarity.COMMON), "Silver"));

    public static final Item GOLD_TARDIS_KEY = registerItem("gold_tardis_key",
            setting -> new TardisKeyItem(setting.fireproof().maxCount(1).rarity(Rarity.COMMON), "Gold"));

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(TARDIFMod.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TARDIFMod.MOD_ID, name)))));
    }

    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(SILVER_TARDIS_KEY);
            entries.add(GOLD_TARDIS_KEY);
        });
    }
}
