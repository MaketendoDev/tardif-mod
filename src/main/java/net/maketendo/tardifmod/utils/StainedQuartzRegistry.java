package net.maketendo.tardifmod.utils;

import net.maketendo.tardifmod.main.TARDIFBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class StainedQuartzRegistry {

    private static final Map<Item, Block> DYE_TO_BLOCK = new HashMap<>();

    public static void init() {
        DYE_TO_BLOCK.put(Items.WHITE_DYE, Blocks.QUARTZ_BLOCK);
        DYE_TO_BLOCK.put(Items.GRAY_DYE, TARDIFBlocks.GREY_STAINED_QUARTZ);
        DYE_TO_BLOCK.put(Items.BLACK_DYE, TARDIFBlocks.BLACK_STAINED_QUARTZ);
        DYE_TO_BLOCK.put(Items.RED_DYE, TARDIFBlocks.RED_STAINED_QUARTZ);
        DYE_TO_BLOCK.put(Items.ORANGE_DYE, TARDIFBlocks.ORANGE_STAINED_QUARTZ);
        DYE_TO_BLOCK.put(Items.YELLOW_DYE, TARDIFBlocks.YELLOW_STAINED_QUARTZ);
        DYE_TO_BLOCK.put(Items.LIME_DYE, TARDIFBlocks.LIME_STAINED_QUARTZ);
        DYE_TO_BLOCK.put(Items.GREEN_DYE, TARDIFBlocks.GREEN_STAINED_QUARTZ);
        DYE_TO_BLOCK.put(Items.CYAN_DYE, TARDIFBlocks.CYAN_STAINED_QUARTZ);
        DYE_TO_BLOCK.put(Items.LIGHT_BLUE_DYE, TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ);
        DYE_TO_BLOCK.put(Items.BLUE_DYE, TARDIFBlocks.BLUE_STAINED_QUARTZ);
        DYE_TO_BLOCK.put(Items.PURPLE_DYE, TARDIFBlocks.PURPLE_STAINED_QUARTZ);
        DYE_TO_BLOCK.put(Items.MAGENTA_DYE, TARDIFBlocks.MAGENTA_STAINED_QUARTZ);
        DYE_TO_BLOCK.put(Items.PINK_DYE, TARDIFBlocks.PINK_STAINED_QUARTZ);
        DYE_TO_BLOCK.put(Items.BROWN_DYE, TARDIFBlocks.BROWN_STAINED_QUARTZ);
    }

    public static Block getFromDye(ItemStack stack) {
        return DYE_TO_BLOCK.get(stack.getItem());
    }
}

