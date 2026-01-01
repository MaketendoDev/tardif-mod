package net.maketendo.tardifmod.main;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.maketendo.tardifmod.TARDIFMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TARDIFItemGroups {
    public static final ItemGroup ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TARDIFMod.MOD_ID, "items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(TARDIFItems.TARDIS_ITEM))
                    .displayName(Text.translatable("itemgroup.tardif_mod.items"))
                    .entries((displayContext, entries) -> {

                        entries.add(TARDIFItems.TARDIS_ITEM);

                        entries.add(TARDIFItems.SILVER_TARDIS_KEY);
                        entries.add(TARDIFItems.GOLD_TARDIS_KEY);

                        entries.add(TARDIFBlocks.POWER_PANEL);

                    }).build());

    public static final ItemGroup DECORATION = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TARDIFMod.MOD_ID, "decoration"),
            FabricItemGroup.builder().icon(() -> new ItemStack(TARDIFBlocks.ROUNDEL.asItem()))
                    .displayName(Text.translatable("itemgroup.tardif_mod.decoration"))
                    .entries((displayContext, entries) -> {
                        entries.add(TARDIFBlocks.ROUNDEL);
                        entries.add(TARDIFBlocks.ROUNDEL_HALF);

                        entries.add(TARDIFBlocks.GREY_ROUNDEL);
                        entries.add(TARDIFBlocks.GREY_ROUNDEL_HALF);
                        entries.add(TARDIFBlocks.DARK_GREY_ROUNDEL);
                        entries.add(TARDIFBlocks.DARK_GREY_ROUNDEL_HALF);
                        entries.add(TARDIFBlocks.BLACK_ROUNDEL);
                        entries.add(TARDIFBlocks.BLACK_ROUNDEL_HALF);
                        entries.add(TARDIFBlocks.BROWN_ROUNDEL);
                        entries.add(TARDIFBlocks.BROWN_ROUNDEL_HALF);
                        entries.add(TARDIFBlocks.RED_ROUNDEL);
                        entries.add(TARDIFBlocks.RED_ROUNDEL_HALF);
                        entries.add(TARDIFBlocks.ORANGE_ROUNDEL);
                        entries.add(TARDIFBlocks.ORANGE_ROUNDEL_HALF);
                        entries.add(TARDIFBlocks.YELLOW_ROUNDEL);
                        entries.add(TARDIFBlocks.YELLOW_ROUNDEL_HALF);
                        entries.add(TARDIFBlocks.LIME_ROUNDEL);
                        entries.add(TARDIFBlocks.LIME_ROUNDEL_HALF);
                        entries.add(TARDIFBlocks.GREEN_ROUNDEL);
                        entries.add(TARDIFBlocks.GREEN_ROUNDEL_HALF);
                        entries.add(TARDIFBlocks.CYAN_ROUNDEL);
                        entries.add(TARDIFBlocks.CYAN_ROUNDEL_HALF);
                        entries.add(TARDIFBlocks.LIGHT_BLUE_ROUNDEL);
                        entries.add(TARDIFBlocks.LIGHT_BLUE_ROUNDEL_HALF);
                        entries.add(TARDIFBlocks.BLUE_ROUNDEL);
                        entries.add(TARDIFBlocks.BLUE_ROUNDEL_HALF);
                        entries.add(TARDIFBlocks.PURPLE_ROUNDEL);
                        entries.add(TARDIFBlocks.PURPLE_ROUNDEL_HALF);
                        entries.add(TARDIFBlocks.MAGENTA_ROUNDEL);
                        entries.add(TARDIFBlocks.MAGENTA_ROUNDEL_HALF);
                        entries.add(TARDIFBlocks.PINK_ROUNDEL);
                        entries.add(TARDIFBlocks.PINK_ROUNDEL_HALF);

                        entries.add(TARDIFBlocks.GREY_STAINED_QUARTZ);
                        entries.add(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ);
                        entries.add(TARDIFBlocks.BLACK_STAINED_QUARTZ);
                        entries.add(TARDIFBlocks.BROWN_STAINED_QUARTZ);
                        entries.add(TARDIFBlocks.RED_STAINED_QUARTZ);
                        entries.add(TARDIFBlocks.ORANGE_STAINED_QUARTZ);
                        entries.add(TARDIFBlocks.YELLOW_STAINED_QUARTZ);
                        entries.add(TARDIFBlocks.LIME_STAINED_QUARTZ);
                        entries.add(TARDIFBlocks.GREEN_STAINED_QUARTZ);
                        entries.add(TARDIFBlocks.CYAN_STAINED_QUARTZ);
                        entries.add(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ);
                        entries.add(TARDIFBlocks.BLUE_STAINED_QUARTZ);
                        entries.add(TARDIFBlocks.PURPLE_STAINED_QUARTZ);
                        entries.add(TARDIFBlocks.MAGENTA_STAINED_QUARTZ);
                        entries.add(TARDIFBlocks.PINK_STAINED_QUARTZ);

                        entries.add(TARDIFBlocks.GREY_STAINED_QUARTZ_SLAB);
                        entries.add(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ_SLAB);
                        entries.add(TARDIFBlocks.BLACK_STAINED_QUARTZ_SLAB);
                        entries.add(TARDIFBlocks.BROWN_STAINED_QUARTZ_SLAB);
                        entries.add(TARDIFBlocks.RED_STAINED_QUARTZ_SLAB);
                        entries.add(TARDIFBlocks.ORANGE_STAINED_QUARTZ_SLAB);
                        entries.add(TARDIFBlocks.YELLOW_STAINED_QUARTZ_SLAB);
                        entries.add(TARDIFBlocks.LIME_STAINED_QUARTZ_SLAB);
                        entries.add(TARDIFBlocks.GREEN_STAINED_QUARTZ_SLAB);
                        entries.add(TARDIFBlocks.CYAN_STAINED_QUARTZ_SLAB);
                        entries.add(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ_SLAB);
                        entries.add(TARDIFBlocks.BLUE_STAINED_QUARTZ_SLAB);
                        entries.add(TARDIFBlocks.PURPLE_STAINED_QUARTZ_SLAB);
                        entries.add(TARDIFBlocks.MAGENTA_STAINED_QUARTZ_SLAB);
                        entries.add(TARDIFBlocks.PINK_STAINED_QUARTZ_SLAB);

                        entries.add(TARDIFBlocks.GREY_STAINED_QUARTZ_STAIRS);
                        entries.add(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ_STAIRS);
                        entries.add(TARDIFBlocks.BLACK_STAINED_QUARTZ_STAIRS);
                        entries.add(TARDIFBlocks.BROWN_STAINED_QUARTZ_STAIRS);
                        entries.add(TARDIFBlocks.RED_STAINED_QUARTZ_STAIRS);
                        entries.add(TARDIFBlocks.ORANGE_STAINED_QUARTZ_STAIRS);
                        entries.add(TARDIFBlocks.YELLOW_STAINED_QUARTZ_STAIRS);
                        entries.add(TARDIFBlocks.LIME_STAINED_QUARTZ_STAIRS);
                        entries.add(TARDIFBlocks.GREEN_STAINED_QUARTZ_STAIRS);
                        entries.add(TARDIFBlocks.CYAN_STAINED_QUARTZ_STAIRS);
                        entries.add(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ_STAIRS);
                        entries.add(TARDIFBlocks.BLUE_STAINED_QUARTZ_STAIRS);
                        entries.add(TARDIFBlocks.PURPLE_STAINED_QUARTZ_STAIRS);
                        entries.add(TARDIFBlocks.MAGENTA_STAINED_QUARTZ_STAIRS);
                        entries.add(TARDIFBlocks.PINK_STAINED_QUARTZ_STAIRS);


                    }).build());


    public static void register() {}
}
