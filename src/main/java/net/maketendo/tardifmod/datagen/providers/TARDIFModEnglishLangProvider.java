package net.maketendo.tardifmod.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.maketendo.tardifmod.main.TARDIFBlocks;
import net.maketendo.tardifmod.main.TARDIFEntities;
import net.maketendo.tardifmod.main.TARDIFItems;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class TARDIFModEnglishLangProvider extends FabricLanguageProvider {

    public TARDIFModEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        // Creative Tabs
        translationBuilder.add("itemgroup.tardif_mod.items", "TARDIF: Items");
        translationBuilder.add("itemgroup.tardif_mod.decoration", "TARDIF: Decoration");

        // Items
        translationBuilder.add(TARDIFItems.TARDIS_ITEM, "TARDIS");
        translationBuilder.add(TARDIFItems.SILVER_TARDIS_KEY, "TARDIS Key");
        translationBuilder.add(TARDIFItems.GOLD_TARDIS_KEY, "TARDIS Key");

        // Blocks
        translationBuilder.add(TARDIFBlocks.ROUNDEL, "Roundel");
        translationBuilder.add(TARDIFBlocks.ROUNDEL_HALF, "Roundel");

        translationBuilder.add(TARDIFBlocks.GREY_STAINED_QUARTZ, "Grey Stained Quartz");
        translationBuilder.add(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ, "Dark Grey Stained Quartz");
        translationBuilder.add(TARDIFBlocks.BLACK_STAINED_QUARTZ, "Black Stained Quartz");
        translationBuilder.add(TARDIFBlocks.BROWN_STAINED_QUARTZ, "Brown Stained Quartz");
        translationBuilder.add(TARDIFBlocks.RED_STAINED_QUARTZ, "Red Stained Quartz");
        translationBuilder.add(TARDIFBlocks.ORANGE_STAINED_QUARTZ, "Orange Stained Quartz");
        translationBuilder.add(TARDIFBlocks.YELLOW_STAINED_QUARTZ, "Yellow Stained Quartz");
        translationBuilder.add(TARDIFBlocks.LIME_STAINED_QUARTZ, "Lime Stained Quartz");
        translationBuilder.add(TARDIFBlocks.GREEN_STAINED_QUARTZ, "Green Stained Quartz");
        translationBuilder.add(TARDIFBlocks.CYAN_STAINED_QUARTZ, "Cyan Stained Quartz");
        translationBuilder.add(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ, "Light Blue Stained Quartz");
        translationBuilder.add(TARDIFBlocks.BLUE_STAINED_QUARTZ, "Blue Stained Quartz");
        translationBuilder.add(TARDIFBlocks.PURPLE_STAINED_QUARTZ, "Purple Stained Quartz");
        translationBuilder.add(TARDIFBlocks.MAGENTA_STAINED_QUARTZ, "Magenta Stained Quartz");
        translationBuilder.add(TARDIFBlocks.PINK_STAINED_QUARTZ, "Pink Stained Quartz");

        translationBuilder.add(TARDIFBlocks.GREY_ROUNDEL, "Grey Roundel");
        translationBuilder.add(TARDIFBlocks.GREY_ROUNDEL_HALF, "Grey Roundel");
        translationBuilder.add(TARDIFBlocks.DARK_GREY_ROUNDEL, "Dark Grey Roundel");
        translationBuilder.add(TARDIFBlocks.DARK_GREY_ROUNDEL_HALF, "Dark Grey Roundel");
        translationBuilder.add(TARDIFBlocks.BLACK_ROUNDEL, "Black Roundel");
        translationBuilder.add(TARDIFBlocks.BLACK_ROUNDEL_HALF, "Black Roundel");
        translationBuilder.add(TARDIFBlocks.BROWN_ROUNDEL, "Brown Roundel");
        translationBuilder.add(TARDIFBlocks.BROWN_ROUNDEL_HALF, "Brown Roundel");
        translationBuilder.add(TARDIFBlocks.RED_ROUNDEL, "Red Roundel");
        translationBuilder.add(TARDIFBlocks.RED_ROUNDEL_HALF, "Red Roundel");
        translationBuilder.add(TARDIFBlocks.ORANGE_ROUNDEL, "Orange Roundel");
        translationBuilder.add(TARDIFBlocks.ORANGE_ROUNDEL_HALF, "Orange Roundel");
        translationBuilder.add(TARDIFBlocks.YELLOW_ROUNDEL, "Yellow Roundel");
        translationBuilder.add(TARDIFBlocks.YELLOW_ROUNDEL_HALF, "Yellow Roundel");
        translationBuilder.add(TARDIFBlocks.LIME_ROUNDEL, "Lime Roundel");
        translationBuilder.add(TARDIFBlocks.LIME_ROUNDEL_HALF, "Lime Roundel");
        translationBuilder.add(TARDIFBlocks.GREEN_ROUNDEL, "Green Roundel");
        translationBuilder.add(TARDIFBlocks.GREEN_ROUNDEL_HALF, "Green Roundel");
        translationBuilder.add(TARDIFBlocks.CYAN_ROUNDEL, "Cyan Roundel");
        translationBuilder.add(TARDIFBlocks.CYAN_ROUNDEL_HALF, "Cyan Roundel");
        translationBuilder.add(TARDIFBlocks.LIGHT_BLUE_ROUNDEL, "Light Blue Roundel");
        translationBuilder.add(TARDIFBlocks.LIGHT_BLUE_ROUNDEL_HALF, "Light Blue Roundel");
        translationBuilder.add(TARDIFBlocks.BLUE_ROUNDEL, "Blue Roundel");
        translationBuilder.add(TARDIFBlocks.BLUE_ROUNDEL_HALF, "Blue Roundel");
        translationBuilder.add(TARDIFBlocks.PURPLE_ROUNDEL, "Purple Roundel");
        translationBuilder.add(TARDIFBlocks.PURPLE_ROUNDEL_HALF, "Purple Roundel");
        translationBuilder.add(TARDIFBlocks.MAGENTA_ROUNDEL, "Magenta Roundel");
        translationBuilder.add(TARDIFBlocks.MAGENTA_ROUNDEL_HALF, "Magenta Roundel");
        translationBuilder.add(TARDIFBlocks.PINK_ROUNDEL, "Pink Roundel");
        translationBuilder.add(TARDIFBlocks.PINK_ROUNDEL_HALF, "Pink Roundel");

        translationBuilder.add(TARDIFBlocks.GREY_STAINED_QUARTZ_SLAB, "Grey Stained Quartz Slab");
        translationBuilder.add(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ_SLAB, "Dark Grey Stained Quartz Slab");
        translationBuilder.add(TARDIFBlocks.BLACK_STAINED_QUARTZ_SLAB, "Black Stained Quartz Slab");
        translationBuilder.add(TARDIFBlocks.BROWN_STAINED_QUARTZ_SLAB, "Brown Stained Quartz Slab");
        translationBuilder.add(TARDIFBlocks.RED_STAINED_QUARTZ_SLAB, "Red Stained Quartz Slab");
        translationBuilder.add(TARDIFBlocks.ORANGE_STAINED_QUARTZ_SLAB, "Orange Stained Quartz Slab");
        translationBuilder.add(TARDIFBlocks.YELLOW_STAINED_QUARTZ_SLAB, "Yellow Stained Quartz Slab");
        translationBuilder.add(TARDIFBlocks.LIME_STAINED_QUARTZ_SLAB, "Lime Stained Quartz Slab");
        translationBuilder.add(TARDIFBlocks.GREEN_STAINED_QUARTZ_SLAB, "Green Stained Quartz Slab");
        translationBuilder.add(TARDIFBlocks.CYAN_STAINED_QUARTZ_SLAB, "Cyan Stained Quartz Slab");
        translationBuilder.add(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ_SLAB, "Light Blue Stained Quartz Slab");
        translationBuilder.add(TARDIFBlocks.BLUE_STAINED_QUARTZ_SLAB, "Blue Stained Quartz Slab");
        translationBuilder.add(TARDIFBlocks.PURPLE_STAINED_QUARTZ_SLAB, "Purple Stained Quartz Slab");
        translationBuilder.add(TARDIFBlocks.MAGENTA_STAINED_QUARTZ_SLAB, "Magenta Stained Quartz Slab");
        translationBuilder.add(TARDIFBlocks.PINK_STAINED_QUARTZ_SLAB, "Pink Stained Quartz Slab");

        translationBuilder.add(TARDIFBlocks.GREY_STAINED_QUARTZ_STAIRS, "Grey Stained Quartz Stairs");
        translationBuilder.add(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ_STAIRS, "Dark Grey Stained Quartz Stairs");
        translationBuilder.add(TARDIFBlocks.BLACK_STAINED_QUARTZ_STAIRS, "Black Stained Quartz Stairs");
        translationBuilder.add(TARDIFBlocks.BROWN_STAINED_QUARTZ_STAIRS, "Brown Stained Quartz Stairs");
        translationBuilder.add(TARDIFBlocks.RED_STAINED_QUARTZ_STAIRS, "Red Stained Quartz Stairs");
        translationBuilder.add(TARDIFBlocks.ORANGE_STAINED_QUARTZ_STAIRS, "Orange Stained Quartz Stairs");
        translationBuilder.add(TARDIFBlocks.YELLOW_STAINED_QUARTZ_STAIRS, "Yellow Stained Quartz Stairs");
        translationBuilder.add(TARDIFBlocks.LIME_STAINED_QUARTZ_STAIRS, "Lime Stained Quartz Stairs");
        translationBuilder.add(TARDIFBlocks.GREEN_STAINED_QUARTZ_STAIRS, "Green Stained Quartz Stairs");
        translationBuilder.add(TARDIFBlocks.CYAN_STAINED_QUARTZ_STAIRS, "Cyan Stained Quartz Stairs");
        translationBuilder.add(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ_STAIRS, "Light Blue Stained Quartz Stairs");
        translationBuilder.add(TARDIFBlocks.BLUE_STAINED_QUARTZ_STAIRS, "Blue Stained Quartz Stairs");
        translationBuilder.add(TARDIFBlocks.PURPLE_STAINED_QUARTZ_STAIRS, "Purple Stained Quartz Stairs");
        translationBuilder.add(TARDIFBlocks.MAGENTA_STAINED_QUARTZ_STAIRS, "Magenta Stained Quartz Stairs");
        translationBuilder.add(TARDIFBlocks.PINK_STAINED_QUARTZ_STAIRS, "Pink Stained Quartz Stairs");

        translationBuilder.add(TARDIFBlocks.INTERIOR_DOOR_GENERATOR_BLOCK, "Interior Door Generator Block");
        translationBuilder.add(TARDIFBlocks.TARDIS_LIGHT_BLOCK, "TARDIS Light Block");

        // Panels
        translationBuilder.add(TARDIFBlocks.POWER_PANEL, "TARDIS Power Panel");
        translationBuilder.add(TARDIFBlocks.COORDINATES_PANEL, "TARDIS Coordinates Panel");
        translationBuilder.add(TARDIFBlocks.DEMATERIALISATION_PANEL, "TARDIS Dematerialisation Panel");

        // Item Tooltips
        translationBuilder.add("tooltip.tardif_mod.linkable_item.1", "Click on the interior door of the TARDIS");
        translationBuilder.add("tooltip.tardif_mod.linkable_item.2", "for it to link.");
        translationBuilder.add("tooltip.tardif_mod.linkable_item.id", "Linked ID: ");
        translationBuilder.add("tooltip.tardif_mod.tardis_key.type", "Material: ");

        // Actionbar Messages
        translationBuilder.add("message.tardif_mod.tardis_item.created_tardis","Created TARDIS Successfully!");

        // Entities
        translationBuilder.add(TARDIFEntities.TARDIS, "TARDIS");
        translationBuilder.add(TARDIFEntities.TARDIS_INTERIOR_DOOR, "TARDIS Interior Door");

        // Tags
        translationBuilder.add("tag.item.tardif_mod.tardis_keys", "TARDIS Keys");
        translationBuilder.add("tag.item.tardif_mod.linkable_items", "TARDIF Linkable Items");
        translationBuilder.add("tag.item.tardif_mod.paint_brush", "Paint Brushes");
        translationBuilder.add("tag.block.tardif_mod.roundels", "Roundels");
        translationBuilder.add("tag.block.tardif_mod.stained_quartz", "Stained Quartz");

        // Paintings

        translationBuilder.add("painting.tardif_mod.rasilon.title", "The Rasilon");
        translationBuilder.add("painting.tardif_mod.rasilon.author", "???");
        translationBuilder.add("painting.tardif_mod.galifrayan_lands.title", "Distant Galifrayan Lands");
        translationBuilder.add("painting.tardif_mod.galifrayan_lands.author", "???");

        // Statistics
        translationBuilder.add("stat.tardif_mod.interact_with_tardis", "TARDIS Doors Opened");
        translationBuilder.add("stat.tardif_mod.locked_tardis", "TARDIS Doors Locked");
        translationBuilder.add("stat.tardif_mod.demat_tardis", "TARDIS Dematerialised");
    }
}
