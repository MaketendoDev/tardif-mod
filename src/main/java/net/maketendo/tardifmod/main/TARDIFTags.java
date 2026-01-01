package net.maketendo.tardifmod.main;

import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TARDIFTags {
    public static class Blocks {
        public static final TagKey<Block> ROUNDELS = createTag("roundels");
        public static final TagKey<Block> STAINED_QUARTZ = createTag("stained_quartz");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TARDIFMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TARDIS_KEYS = createTag("tardis_keys");
        public static final TagKey<Item> LINKABLE_ITEMS = createTag("linkable_items");
        public static final TagKey<Item> PAINT_BRUSH = createTag("paint_brush");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(TARDIFMod.MOD_ID, name));
        }
    }
}
