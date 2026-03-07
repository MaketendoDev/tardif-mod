package net.maketendo.tardifmod.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.TARDIFBlocks;
import net.maketendo.tardifmod.main.TARDIFItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.crafting.Ingredient;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.recipes.RecipeProvider.*;

public class TARDIFRecipeProvider extends FabricRecipeProvider {


    public TARDIFRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider wrapperLookup, RecipeOutput recipeExporter) {
        return new RecipeProvider(wrapperLookup, recipeExporter) {
            @Override
            public void buildRecipes() {

                // GREY
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.GRAY_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.GRAY_ROUNDEL, 1).unlockedBy("has_grey_stained_quartz", has(TARDIFBlocks.GRAY_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/grey_roundel")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.GRAY_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.GRAY_ROUNDEL_HALF, 2).unlockedBy("has_grey_stained_quartz", has(TARDIFBlocks.GRAY_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/grey_roundel_half")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.GRAY_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.GRAY_STAINED_QUARTZ_SLAB, 2).unlockedBy("has_grey_stained_quartz", has(TARDIFBlocks.GRAY_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/grey_stained_quartz_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.GRAY_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.GRAY_STAINED_QUARTZ_STAIRS, 1).unlockedBy("has_grey_stained_quartz", has(TARDIFBlocks.GRAY_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/grey_stained_quartz_stairs")));

                // DARK GREY
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.DARK_GRAY_ROUNDEL, 1).unlockedBy("has_dark_grey_stained_quartz", has(TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/dark_grey_roundel")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.DARK_GRAY_ROUNDEL_HALF, 2).unlockedBy("has_dark_grey_stained_quartz", has(TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/dark_grey_roundel_half")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ_SLAB, 2).unlockedBy("has_dark_grey_stained_quartz", has(TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/dark_grey_stained_quartz_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ_STAIRS, 1).unlockedBy("has_dark_grey_stained_quartz", has(TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/dark_grey_stained_quartz_stairs")));

                // BLACK
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.BLACK_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BLACK_ROUNDEL, 1).unlockedBy("has_black_stained_quartz", has(TARDIFBlocks.BLACK_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/black_roundel")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.BLACK_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BLACK_ROUNDEL_HALF, 2).unlockedBy("has_black_stained_quartz", has(TARDIFBlocks.BLACK_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/black_roundel_half")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.BLACK_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BLACK_STAINED_QUARTZ_SLAB, 2).unlockedBy("has_black_stained_quartz", has(TARDIFBlocks.BLACK_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/black_stained_quartz_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.BLACK_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BLACK_STAINED_QUARTZ_STAIRS, 1).unlockedBy("has_black_stained_quartz", has(TARDIFBlocks.BLACK_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/black_stained_quartz_stairs")));

                // BROWN
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.BROWN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BROWN_ROUNDEL, 1).unlockedBy("has_brown_stained_quartz", has(TARDIFBlocks.BROWN_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/brown_roundel")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.BROWN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BROWN_ROUNDEL_HALF, 2).unlockedBy("has_brown_stained_quartz", has(TARDIFBlocks.BROWN_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/brown_roundel_half")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.BROWN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BROWN_STAINED_QUARTZ_SLAB, 2).unlockedBy("has_brown_stained_quartz", has(TARDIFBlocks.BROWN_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/brown_stained_quartz_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.BROWN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BROWN_STAINED_QUARTZ_STAIRS, 1).unlockedBy("has_brown_stained_quartz", has(TARDIFBlocks.BROWN_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/brown_stained_quartz_stairs")));

                // RED
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.RED_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.RED_ROUNDEL, 1).unlockedBy("has_red_stained_quartz", has(TARDIFBlocks.RED_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/red_roundel")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.RED_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.RED_ROUNDEL_HALF, 2).unlockedBy("has_red_stained_quartz", has(TARDIFBlocks.RED_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/red_roundel_half")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.RED_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.RED_STAINED_QUARTZ_SLAB, 2).unlockedBy("has_red_stained_quartz", has(TARDIFBlocks.RED_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/red_stained_quartz_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.RED_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.RED_STAINED_QUARTZ_STAIRS, 1).unlockedBy("has_red_stained_quartz", has(TARDIFBlocks.RED_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/red_stained_quartz_stairs")));

                // ORANGE
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.ORANGE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.ORANGE_ROUNDEL, 1).unlockedBy("has_orange_stained_quartz", has(TARDIFBlocks.ORANGE_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/orange_roundel")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.ORANGE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.ORANGE_ROUNDEL_HALF, 2).unlockedBy("has_orange_stained_quartz", has(TARDIFBlocks.ORANGE_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/orange_roundel_half")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.ORANGE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.ORANGE_STAINED_QUARTZ_SLAB, 2).unlockedBy("has_orange_stained_quartz", has(TARDIFBlocks.ORANGE_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/orange_stained_quartz_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.ORANGE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.ORANGE_STAINED_QUARTZ_STAIRS, 1).unlockedBy("has_orange_stained_quartz", has(TARDIFBlocks.ORANGE_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/orange_stained_quartz_stairs")));

                // YELLOW
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.YELLOW_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.YELLOW_ROUNDEL, 1).unlockedBy("has_yellow_stained_quartz", has(TARDIFBlocks.YELLOW_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/yellow_roundel")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.YELLOW_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.YELLOW_ROUNDEL_HALF, 2).unlockedBy("has_yellow_stained_quartz", has(TARDIFBlocks.YELLOW_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/yellow_roundel_half")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.YELLOW_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.YELLOW_STAINED_QUARTZ_SLAB, 2).unlockedBy("has_yellow_stained_quartz", has(TARDIFBlocks.YELLOW_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/yellow_stained_quartz_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.YELLOW_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.YELLOW_STAINED_QUARTZ_STAIRS, 1).unlockedBy("has_yellow_stained_quartz", has(TARDIFBlocks.YELLOW_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/yellow_stained_quartz_stairs")));

                // LIME
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.LIME_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.LIME_ROUNDEL, 1).unlockedBy("has_lime_stained_quartz", has(TARDIFBlocks.LIME_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/lime_roundel")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.LIME_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.LIME_ROUNDEL_HALF, 2).unlockedBy("has_lime_stained_quartz", has(TARDIFBlocks.LIME_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/lime_roundel_half")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.LIME_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.LIME_STAINED_QUARTZ_SLAB, 2).unlockedBy("has_lime_stained_quartz", has(TARDIFBlocks.LIME_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/lime_stained_quartz_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.LIME_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.LIME_STAINED_QUARTZ_STAIRS, 1).unlockedBy("has_lime_stained_quartz", has(TARDIFBlocks.LIME_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/lime_stained_quartz_stairs")));

                // GREEN
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.GREEN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.GREEN_ROUNDEL, 1).unlockedBy("has_green_stained_quartz", has(TARDIFBlocks.GREEN_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/green_roundel")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.GREEN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.GREEN_ROUNDEL_HALF, 2).unlockedBy("has_green_stained_quartz", has(TARDIFBlocks.GREEN_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/green_roundel_half")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.GREEN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.GREEN_STAINED_QUARTZ_SLAB, 2).unlockedBy("has_green_stained_quartz", has(TARDIFBlocks.GREEN_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/green_stained_quartz_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.GREEN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.GREEN_STAINED_QUARTZ_STAIRS, 1).unlockedBy("has_green_stained_quartz", has(TARDIFBlocks.GREEN_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/green_stained_quartz_stairs")));

                // CYAN
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.CYAN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.CYAN_ROUNDEL, 1).unlockedBy("has_cyan_stained_quartz", has(TARDIFBlocks.CYAN_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/cyan_roundel")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.CYAN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.CYAN_ROUNDEL_HALF, 2).unlockedBy("has_cyan_stained_quartz", has(TARDIFBlocks.CYAN_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/cyan_roundel_half")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.CYAN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.CYAN_STAINED_QUARTZ_SLAB, 2).unlockedBy("has_cyan_stained_quartz", has(TARDIFBlocks.CYAN_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/cyan_stained_quartz_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.CYAN_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.CYAN_STAINED_QUARTZ_STAIRS, 1).unlockedBy("has_cyan_stained_quartz", has(TARDIFBlocks.CYAN_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/cyan_stained_quartz_stairs")));

                // LIGHT_BLUE
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.LIGHT_BLUE_ROUNDEL, 1).unlockedBy("has_light_blue_stained_quartz", has(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/light_blue_roundel")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.LIGHT_BLUE_ROUNDEL_HALF, 2).unlockedBy("has_light_blue_stained_quartz", has(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/light_blue_roundel_half")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ_SLAB, 2).unlockedBy("has_light_blue_stained_quartz", has(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/light_blue_stained_quartz_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ_STAIRS, 1).unlockedBy("has_light_blue_stained_quartz", has(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/light_blue_stained_quartz_stairs")));

                // BLUE
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.BLUE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BLUE_ROUNDEL, 1).unlockedBy("has_blue_stained_quartz", has(TARDIFBlocks.BLUE_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/blue_roundel")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.BLUE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BLUE_ROUNDEL_HALF, 2).unlockedBy("has_blue_stained_quartz", has(TARDIFBlocks.BLUE_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/blue_roundel_half")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.BLUE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BLUE_STAINED_QUARTZ_SLAB, 2).unlockedBy("has_blue_stained_quartz", has(TARDIFBlocks.BLUE_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/blue_stained_quartz_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.BLUE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.BLUE_STAINED_QUARTZ_STAIRS, 1).unlockedBy("has_blue_stained_quartz", has(TARDIFBlocks.BLUE_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/blue_stained_quartz_stairs")));

                // PURPLE
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.PURPLE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.PURPLE_ROUNDEL, 1).unlockedBy("has_purple_stained_quartz", has(TARDIFBlocks.PURPLE_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/purple_roundel")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.PURPLE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.PURPLE_ROUNDEL_HALF, 2).unlockedBy("has_purple_stained_quartz", has(TARDIFBlocks.PURPLE_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/purple_roundel_half")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.PURPLE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.PURPLE_STAINED_QUARTZ_SLAB, 2).unlockedBy("has_purple_stained_quartz", has(TARDIFBlocks.PURPLE_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/purple_stained_quartz_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.PURPLE_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.PURPLE_STAINED_QUARTZ_STAIRS, 1).unlockedBy("has_purple_stained_quartz", has(TARDIFBlocks.PURPLE_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/purple_stained_quartz_stairs")));

                // MAGENTA
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.MAGENTA_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.MAGENTA_ROUNDEL, 1).unlockedBy("has_magenta_stained_quartz", has(TARDIFBlocks.MAGENTA_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/magenta_roundel")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.MAGENTA_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.MAGENTA_ROUNDEL_HALF, 2).unlockedBy("has_magenta_stained_quartz", has(TARDIFBlocks.MAGENTA_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/magenta_roundel_half")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.MAGENTA_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.MAGENTA_STAINED_QUARTZ_SLAB, 2).unlockedBy("has_magenta_stained_quartz", has(TARDIFBlocks.MAGENTA_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/magenta_stained_quartz_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.MAGENTA_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.MAGENTA_STAINED_QUARTZ_STAIRS, 1).unlockedBy("has_magenta_stained_quartz", has(TARDIFBlocks.MAGENTA_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/magenta_stained_quartz_stairs")));

                // PINK
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.PINK_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.PINK_ROUNDEL, 1).unlockedBy("has_pink_stained_quartz", has(TARDIFBlocks.PINK_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/pink_roundel")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.PINK_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.PINK_ROUNDEL_HALF, 2).unlockedBy("has_pink_stained_quartz", has(TARDIFBlocks.PINK_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/pink_roundel_half")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.PINK_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.PINK_STAINED_QUARTZ_SLAB, 2).unlockedBy("has_pink_stained_quartz", has(TARDIFBlocks.PINK_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/pink_stained_quartz_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(TARDIFBlocks.PINK_STAINED_QUARTZ), RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.PINK_STAINED_QUARTZ_STAIRS, 1).unlockedBy("has_pink_stained_quartz", has(TARDIFBlocks.PINK_STAINED_QUARTZ)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "stonecutting/pink_stained_quartz_stairs")));

                shaped(RecipeCategory.BUILDING_BLOCKS, TARDIFBlocks.CRYSTALLINE_BLOCK)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .define('#', TARDIFItems.CRYSTALLINE_SHARD)
                        .unlockedBy("has_tardis_crystal", has(TARDIFItems.CRYSTALLINE_SHARD))
                        .save(recipeExporter);

                stairBuilder(
                        TARDIFBlocks.CRYSTALLINE_STAIR,
                        Ingredient.of(TARDIFItems.CRYSTALLINE_SHARD));

                slabBuilder(
                        RecipeCategory.BUILDING_BLOCKS,
                        TARDIFBlocks.CRYSTALLINE_SLAB,
                        Ingredient.of(TARDIFItems.CRYSTALLINE_SHARD));

            }
        };
    }

    @Override
    public String getName() {
        return "TARDIF Mod Recipes";
    }
}