package net.maketendo.tardifmod.main;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.items.TardisItem;
import net.maketendo.tardifmod.main.items.TardisKeyItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.equipment.trim.TrimMaterials;
import java.util.function.Function;

public class TARDIFItems {

    public static final Item TARDIS_ITEM = registerItem("tardis_item",
            setting -> new TardisItem(setting.fireResistant().stacksTo(1)));

    public static final Item SILVER_TARDIS_KEY = registerItem("silver_tardis_key",
            setting -> new TardisKeyItem(setting.fireResistant().stacksTo(1).rarity(Rarity.COMMON), "Silver"));

    public static final Item GOLD_TARDIS_KEY = registerItem("gold_tardis_key",
            setting -> new TardisKeyItem(setting.fireResistant().stacksTo(1).rarity(Rarity.COMMON), "Gold"));

    // Materials

    public static final Item CRYSTALLINE_SHARD = registerItem("crystalline_shard",
            setting -> new Item(setting.trimMaterial(TrimMaterials.RESIN).rarity(Rarity.COMMON)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, name)))));
    }

    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(entries -> {
            entries.accept(SILVER_TARDIS_KEY);
            entries.accept(GOLD_TARDIS_KEY);
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> {
            entries.accept(CRYSTALLINE_SHARD);
        });
    }
}
