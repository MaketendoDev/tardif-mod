package net.maketendo.tardifmod.main;

import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class TARDIFTags {
    public static class Blocks {
        public static final TagKey<Block> ROUNDELS = createTag("roundels");
        public static final TagKey<Block> STAINED_QUARTZ = createTag("stained_quartz");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TARDIS_KEYS = createTag("tardis_keys");
        public static final TagKey<Item> LINKABLE_ITEMS = createTag("linkable_items");
        public static final TagKey<Item> PAINT_BRUSH = createTag("paint_brush");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, name));
        }
    }
}
