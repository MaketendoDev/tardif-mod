package net.maketendo.tardifmod.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.TARDIFBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.StonecuttingRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.recipe.RecipeGenerator.*;

public class TARDIFRecipeProvider extends FabricRecipeProvider {


    public TARDIFRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {

                // GREY
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.GREY_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.GREY_ROUNDEL, 1).criterion("has_grey_stained_quartz", conditionsFromItem(TARDIFBlocks.GREY_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/grey_roundel")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.GREY_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.GREY_ROUNDEL_HALF, 2).criterion("has_grey_stained_quartz", conditionsFromItem(TARDIFBlocks.GREY_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/grey_roundel_half")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.GREY_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.GREY_STAINED_QUARTZ_SLAB, 2).criterion("has_grey_stained_quartz", conditionsFromItem(TARDIFBlocks.GREY_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/grey_stained_quartz_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.GREY_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.GREY_STAINED_QUARTZ_STAIRS, 1).criterion("has_grey_stained_quartz", conditionsFromItem(TARDIFBlocks.GREY_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/grey_stained_quartz_stairs")));

                // DARK GREY
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.DARK_GREY_ROUNDEL, 1).criterion("has_dark_grey_stained_quartz", conditionsFromItem(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/dark_grey_roundel")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.DARK_GREY_ROUNDEL_HALF, 2).criterion("has_dark_grey_stained_quartz", conditionsFromItem(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/dark_grey_roundel_half")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.DARK_GREY_STAINED_QUARTZ_SLAB, 2).criterion("has_dark_grey_stained_quartz", conditionsFromItem(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/dark_grey_stained_quartz_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.DARK_GREY_STAINED_QUARTZ_STAIRS, 1).criterion("has_dark_grey_stained_quartz", conditionsFromItem(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/dark_grey_stained_quartz_stairs")));

                // BLACK
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.BLACK_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BLACK_ROUNDEL, 1).criterion("has_black_stained_quartz", conditionsFromItem(TARDIFBlocks.BLACK_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/black_roundel")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.BLACK_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BLACK_ROUNDEL_HALF, 2).criterion("has_black_stained_quartz", conditionsFromItem(TARDIFBlocks.BLACK_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/black_roundel_half")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.BLACK_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BLACK_STAINED_QUARTZ_SLAB, 2).criterion("has_black_stained_quartz", conditionsFromItem(TARDIFBlocks.BLACK_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/black_stained_quartz_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.BLACK_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BLACK_STAINED_QUARTZ_STAIRS, 1).criterion("has_black_stained_quartz", conditionsFromItem(TARDIFBlocks.BLACK_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/black_stained_quartz_stairs")));

                // BROWN
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.BROWN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BROWN_ROUNDEL, 1).criterion("has_brown_stained_quartz", conditionsFromItem(TARDIFBlocks.BROWN_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/brown_roundel")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.BROWN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BROWN_ROUNDEL_HALF, 2).criterion("has_brown_stained_quartz", conditionsFromItem(TARDIFBlocks.BROWN_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/brown_roundel_half")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.BROWN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BROWN_STAINED_QUARTZ_SLAB, 2).criterion("has_brown_stained_quartz", conditionsFromItem(TARDIFBlocks.BROWN_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/brown_stained_quartz_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.BROWN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BROWN_STAINED_QUARTZ_STAIRS, 1).criterion("has_brown_stained_quartz", conditionsFromItem(TARDIFBlocks.BROWN_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/brown_stained_quartz_stairs")));

                // RED
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.RED_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.RED_ROUNDEL, 1).criterion("has_red_stained_quartz", conditionsFromItem(TARDIFBlocks.RED_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/red_roundel")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.RED_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.RED_ROUNDEL_HALF, 2).criterion("has_red_stained_quartz", conditionsFromItem(TARDIFBlocks.RED_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/red_roundel_half")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.RED_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.RED_STAINED_QUARTZ_SLAB, 2).criterion("has_red_stained_quartz", conditionsFromItem(TARDIFBlocks.RED_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/red_stained_quartz_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.RED_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.RED_STAINED_QUARTZ_STAIRS, 1).criterion("has_red_stained_quartz", conditionsFromItem(TARDIFBlocks.RED_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/red_stained_quartz_stairs")));

                // ORANGE
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.ORANGE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.ORANGE_ROUNDEL, 1).criterion("has_orange_stained_quartz", conditionsFromItem(TARDIFBlocks.ORANGE_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/orange_roundel")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.ORANGE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.ORANGE_ROUNDEL_HALF, 2).criterion("has_orange_stained_quartz", conditionsFromItem(TARDIFBlocks.ORANGE_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/orange_roundel_half")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.ORANGE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.ORANGE_STAINED_QUARTZ_SLAB, 2).criterion("has_orange_stained_quartz", conditionsFromItem(TARDIFBlocks.ORANGE_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/orange_stained_quartz_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.ORANGE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.ORANGE_STAINED_QUARTZ_STAIRS, 1).criterion("has_orange_stained_quartz", conditionsFromItem(TARDIFBlocks.ORANGE_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/orange_stained_quartz_stairs")));

                // YELLOW
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.YELLOW_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.YELLOW_ROUNDEL, 1).criterion("has_yellow_stained_quartz", conditionsFromItem(TARDIFBlocks.YELLOW_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/yellow_roundel")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.YELLOW_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.YELLOW_ROUNDEL_HALF, 2).criterion("has_yellow_stained_quartz", conditionsFromItem(TARDIFBlocks.YELLOW_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/yellow_roundel_half")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.YELLOW_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.YELLOW_STAINED_QUARTZ_SLAB, 2).criterion("has_yellow_stained_quartz", conditionsFromItem(TARDIFBlocks.YELLOW_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/yellow_stained_quartz_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.YELLOW_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.YELLOW_STAINED_QUARTZ_STAIRS, 1).criterion("has_yellow_stained_quartz", conditionsFromItem(TARDIFBlocks.YELLOW_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/yellow_stained_quartz_stairs")));

                // LIME
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.LIME_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.LIME_ROUNDEL, 1).criterion("has_lime_stained_quartz", conditionsFromItem(TARDIFBlocks.LIME_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/lime_roundel")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.LIME_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.LIME_ROUNDEL_HALF, 2).criterion("has_lime_stained_quartz", conditionsFromItem(TARDIFBlocks.LIME_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/lime_roundel_half")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.LIME_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.LIME_STAINED_QUARTZ_SLAB, 2).criterion("has_lime_stained_quartz", conditionsFromItem(TARDIFBlocks.LIME_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/lime_stained_quartz_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.LIME_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.LIME_STAINED_QUARTZ_STAIRS, 1).criterion("has_lime_stained_quartz", conditionsFromItem(TARDIFBlocks.LIME_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/lime_stained_quartz_stairs")));

                // GREEN
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.GREEN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.GREEN_ROUNDEL, 1).criterion("has_green_stained_quartz", conditionsFromItem(TARDIFBlocks.GREEN_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/green_roundel")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.GREEN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.GREEN_ROUNDEL_HALF, 2).criterion("has_green_stained_quartz", conditionsFromItem(TARDIFBlocks.GREEN_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/green_roundel_half")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.GREEN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.GREEN_STAINED_QUARTZ_SLAB, 2).criterion("has_green_stained_quartz", conditionsFromItem(TARDIFBlocks.GREEN_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/green_stained_quartz_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.GREEN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.GREEN_STAINED_QUARTZ_STAIRS, 1).criterion("has_green_stained_quartz", conditionsFromItem(TARDIFBlocks.GREEN_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/green_stained_quartz_stairs")));

                // CYAN
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.CYAN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.CYAN_ROUNDEL, 1).criterion("has_cyan_stained_quartz", conditionsFromItem(TARDIFBlocks.CYAN_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/cyan_roundel")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.CYAN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.CYAN_ROUNDEL_HALF, 2).criterion("has_cyan_stained_quartz", conditionsFromItem(TARDIFBlocks.CYAN_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/cyan_roundel_half")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.CYAN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.CYAN_STAINED_QUARTZ_SLAB, 2).criterion("has_cyan_stained_quartz", conditionsFromItem(TARDIFBlocks.CYAN_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/cyan_stained_quartz_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.CYAN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.CYAN_STAINED_QUARTZ_STAIRS, 1).criterion("has_cyan_stained_quartz", conditionsFromItem(TARDIFBlocks.CYAN_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/cyan_stained_quartz_stairs")));

                // LIGHT_BLUE
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.LIGHT_BLUE_ROUNDEL, 1).criterion("has_light_blue_stained_quartz", conditionsFromItem(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/light_blue_roundel")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.LIGHT_BLUE_ROUNDEL_HALF, 2).criterion("has_light_blue_stained_quartz", conditionsFromItem(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/light_blue_roundel_half")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ_SLAB, 2).criterion("has_light_blue_stained_quartz", conditionsFromItem(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/light_blue_stained_quartz_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ_STAIRS, 1).criterion("has_light_blue_stained_quartz", conditionsFromItem(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/light_blue_stained_quartz_stairs")));

                // BLUE
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.BLUE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BLUE_ROUNDEL, 1).criterion("has_blue_stained_quartz", conditionsFromItem(TARDIFBlocks.BLUE_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/blue_roundel")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.BLUE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BLUE_ROUNDEL_HALF, 2).criterion("has_blue_stained_quartz", conditionsFromItem(TARDIFBlocks.BLUE_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/blue_roundel_half")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.BLUE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BLUE_STAINED_QUARTZ_SLAB, 2).criterion("has_blue_stained_quartz", conditionsFromItem(TARDIFBlocks.BLUE_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/blue_stained_quartz_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.BLUE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BLUE_STAINED_QUARTZ_STAIRS, 1).criterion("has_blue_stained_quartz", conditionsFromItem(TARDIFBlocks.BLUE_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/blue_stained_quartz_stairs")));

                // PURPLE
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.PURPLE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.PURPLE_ROUNDEL, 1).criterion("has_purple_stained_quartz", conditionsFromItem(TARDIFBlocks.PURPLE_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/purple_roundel")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.PURPLE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.PURPLE_ROUNDEL_HALF, 2).criterion("has_purple_stained_quartz", conditionsFromItem(TARDIFBlocks.PURPLE_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/purple_roundel_half")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.PURPLE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.PURPLE_STAINED_QUARTZ_SLAB, 2).criterion("has_purple_stained_quartz", conditionsFromItem(TARDIFBlocks.PURPLE_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/purple_stained_quartz_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.PURPLE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.PURPLE_STAINED_QUARTZ_STAIRS, 1).criterion("has_purple_stained_quartz", conditionsFromItem(TARDIFBlocks.PURPLE_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/purple_stained_quartz_stairs")));

                // MAGENTA
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.MAGENTA_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.MAGENTA_ROUNDEL, 1).criterion("has_magenta_stained_quartz", conditionsFromItem(TARDIFBlocks.MAGENTA_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/magenta_roundel")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.MAGENTA_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.MAGENTA_ROUNDEL_HALF, 2).criterion("has_magenta_stained_quartz", conditionsFromItem(TARDIFBlocks.MAGENTA_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/magenta_roundel_half")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.MAGENTA_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.MAGENTA_STAINED_QUARTZ_SLAB, 2).criterion("has_magenta_stained_quartz", conditionsFromItem(TARDIFBlocks.MAGENTA_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/magenta_stained_quartz_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.MAGENTA_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.MAGENTA_STAINED_QUARTZ_STAIRS, 1).criterion("has_magenta_stained_quartz", conditionsFromItem(TARDIFBlocks.MAGENTA_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/magenta_stained_quartz_stairs")));

                // PINK
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.PINK_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.PINK_ROUNDEL, 1).criterion("has_pink_stained_quartz", conditionsFromItem(TARDIFBlocks.PINK_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/pink_roundel")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.PINK_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.PINK_ROUNDEL_HALF, 2).criterion("has_pink_stained_quartz", conditionsFromItem(TARDIFBlocks.PINK_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/pink_roundel_half")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.PINK_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.PINK_STAINED_QUARTZ_SLAB, 2).criterion("has_pink_stained_quartz", conditionsFromItem(TARDIFBlocks.PINK_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/pink_stained_quartz_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(TARDIFBlocks.PINK_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.PINK_STAINED_QUARTZ_STAIRS, 1).criterion("has_pink_stained_quartz", conditionsFromItem(TARDIFBlocks.PINK_STAINED_QUARTZ)).offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TARDIFMod.MOD_ID, "stonecutting/pink_stained_quartz_stairs")));

            }
        };
    }

    @Override
    public String getName() {
        return "TARDIF Mod Recipes";
    }
}