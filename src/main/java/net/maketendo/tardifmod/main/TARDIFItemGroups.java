package net.maketendo.tardifmod.main;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TARDIFItemGroups {
    public static final CreativeModeTab ITEMS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(TARDIFItems.TARDIS_ITEM))
                    .title(Component.translatable("itemgroup.tardif_mod.items"))
                    .displayItems((displayContext, entries) -> {

                        entries.accept(TARDIFItems.TARDIS_ITEM);

                        entries.accept(TARDIFItems.SILVER_TARDIS_KEY);
                        entries.accept(TARDIFItems.GOLD_TARDIS_KEY);

                        //entries.add(TARDIFBlocks.POWER_PANEL);
                        //entries.add(TARDIFBlocks.COORDINATES_PANEL);
                        //entries.add(TARDIFBlocks.DEMATERIALISATION_PANEL);

                        entries.accept(TARDIFBlocks.TARDIS_CONSOLE_BLOCK);

                    }).build());

    public static final CreativeModeTab DECORATION = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "decoration"),
            FabricItemGroup.builder().icon(() -> new ItemStack(TARDIFBlocks.ROUNDEL.asItem()))
                    .title(Component.translatable("itemgroup.tardif_mod.decoration"))
                    .displayItems((displayContext, entries) -> {
                        entries.accept(TARDIFBlocks.ROUNDEL);
                        entries.accept(TARDIFBlocks.ROUNDEL_HALF);

                        entries.accept(TARDIFBlocks.GRAY_ROUNDEL);
                        entries.accept(TARDIFBlocks.GRAY_ROUNDEL_HALF);
                        entries.accept(TARDIFBlocks.DARK_GRAY_ROUNDEL);
                        entries.accept(TARDIFBlocks.DARK_GRAY_ROUNDEL_HALF);
                        entries.accept(TARDIFBlocks.BLACK_ROUNDEL);
                        entries.accept(TARDIFBlocks.BLACK_ROUNDEL_HALF);
                        entries.accept(TARDIFBlocks.BROWN_ROUNDEL);
                        entries.accept(TARDIFBlocks.BROWN_ROUNDEL_HALF);
                        entries.accept(TARDIFBlocks.RED_ROUNDEL);
                        entries.accept(TARDIFBlocks.RED_ROUNDEL_HALF);
                        entries.accept(TARDIFBlocks.ORANGE_ROUNDEL);
                        entries.accept(TARDIFBlocks.ORANGE_ROUNDEL_HALF);
                        entries.accept(TARDIFBlocks.YELLOW_ROUNDEL);
                        entries.accept(TARDIFBlocks.YELLOW_ROUNDEL_HALF);
                        entries.accept(TARDIFBlocks.LIME_ROUNDEL);
                        entries.accept(TARDIFBlocks.LIME_ROUNDEL_HALF);
                        entries.accept(TARDIFBlocks.GREEN_ROUNDEL);
                        entries.accept(TARDIFBlocks.GREEN_ROUNDEL_HALF);
                        entries.accept(TARDIFBlocks.CYAN_ROUNDEL);
                        entries.accept(TARDIFBlocks.CYAN_ROUNDEL_HALF);
                        entries.accept(TARDIFBlocks.LIGHT_BLUE_ROUNDEL);
                        entries.accept(TARDIFBlocks.LIGHT_BLUE_ROUNDEL_HALF);
                        entries.accept(TARDIFBlocks.BLUE_ROUNDEL);
                        entries.accept(TARDIFBlocks.BLUE_ROUNDEL_HALF);
                        entries.accept(TARDIFBlocks.PURPLE_ROUNDEL);
                        entries.accept(TARDIFBlocks.PURPLE_ROUNDEL_HALF);
                        entries.accept(TARDIFBlocks.MAGENTA_ROUNDEL);
                        entries.accept(TARDIFBlocks.MAGENTA_ROUNDEL_HALF);
                        entries.accept(TARDIFBlocks.PINK_ROUNDEL);
                        entries.accept(TARDIFBlocks.PINK_ROUNDEL_HALF);

                        entries.accept(TARDIFBlocks.GRAY_STAINED_QUARTZ);
                        entries.accept(TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ);
                        entries.accept(TARDIFBlocks.BLACK_STAINED_QUARTZ);
                        entries.accept(TARDIFBlocks.BROWN_STAINED_QUARTZ);
                        entries.accept(TARDIFBlocks.RED_STAINED_QUARTZ);
                        entries.accept(TARDIFBlocks.ORANGE_STAINED_QUARTZ);
                        entries.accept(TARDIFBlocks.YELLOW_STAINED_QUARTZ);
                        entries.accept(TARDIFBlocks.LIME_STAINED_QUARTZ);
                        entries.accept(TARDIFBlocks.GREEN_STAINED_QUARTZ);
                        entries.accept(TARDIFBlocks.CYAN_STAINED_QUARTZ);
                        entries.accept(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ);
                        entries.accept(TARDIFBlocks.BLUE_STAINED_QUARTZ);
                        entries.accept(TARDIFBlocks.PURPLE_STAINED_QUARTZ);
                        entries.accept(TARDIFBlocks.MAGENTA_STAINED_QUARTZ);
                        entries.accept(TARDIFBlocks.PINK_STAINED_QUARTZ);

                        entries.accept(TARDIFBlocks.GRAY_STAINED_QUARTZ_SLAB);
                        entries.accept(TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ_SLAB);
                        entries.accept(TARDIFBlocks.BLACK_STAINED_QUARTZ_SLAB);
                        entries.accept(TARDIFBlocks.BROWN_STAINED_QUARTZ_SLAB);
                        entries.accept(TARDIFBlocks.RED_STAINED_QUARTZ_SLAB);
                        entries.accept(TARDIFBlocks.ORANGE_STAINED_QUARTZ_SLAB);
                        entries.accept(TARDIFBlocks.YELLOW_STAINED_QUARTZ_SLAB);
                        entries.accept(TARDIFBlocks.LIME_STAINED_QUARTZ_SLAB);
                        entries.accept(TARDIFBlocks.GREEN_STAINED_QUARTZ_SLAB);
                        entries.accept(TARDIFBlocks.CYAN_STAINED_QUARTZ_SLAB);
                        entries.accept(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ_SLAB);
                        entries.accept(TARDIFBlocks.BLUE_STAINED_QUARTZ_SLAB);
                        entries.accept(TARDIFBlocks.PURPLE_STAINED_QUARTZ_SLAB);
                        entries.accept(TARDIFBlocks.MAGENTA_STAINED_QUARTZ_SLAB);
                        entries.accept(TARDIFBlocks.PINK_STAINED_QUARTZ_SLAB);

                        entries.accept(TARDIFBlocks.GRAY_STAINED_QUARTZ_STAIRS);
                        entries.accept(TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ_STAIRS);
                        entries.accept(TARDIFBlocks.BLACK_STAINED_QUARTZ_STAIRS);
                        entries.accept(TARDIFBlocks.BROWN_STAINED_QUARTZ_STAIRS);
                        entries.accept(TARDIFBlocks.RED_STAINED_QUARTZ_STAIRS);
                        entries.accept(TARDIFBlocks.ORANGE_STAINED_QUARTZ_STAIRS);
                        entries.accept(TARDIFBlocks.YELLOW_STAINED_QUARTZ_STAIRS);
                        entries.accept(TARDIFBlocks.LIME_STAINED_QUARTZ_STAIRS);
                        entries.accept(TARDIFBlocks.GREEN_STAINED_QUARTZ_STAIRS);
                        entries.accept(TARDIFBlocks.CYAN_STAINED_QUARTZ_STAIRS);
                        entries.accept(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ_STAIRS);
                        entries.accept(TARDIFBlocks.BLUE_STAINED_QUARTZ_STAIRS);
                        entries.accept(TARDIFBlocks.PURPLE_STAINED_QUARTZ_STAIRS);
                        entries.accept(TARDIFBlocks.MAGENTA_STAINED_QUARTZ_STAIRS);
                        entries.accept(TARDIFBlocks.PINK_STAINED_QUARTZ_STAIRS);

                        entries.accept(TARDIFBlocks.CRYSTALLINE_BLOCK);
                        entries.accept(TARDIFBlocks.CRYSTALLINE_SLAB);
                        entries.accept(TARDIFBlocks.CRYSTALLINE_STAIR);

                    }).build());


    public static void register() {}

}
