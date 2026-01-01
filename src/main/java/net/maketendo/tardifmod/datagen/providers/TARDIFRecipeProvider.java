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

                StonecuttingRecipeJsonBuilder.createStonecutting(
                                Ingredient.ofItems(TARDIFBlocks.GREY_STAINED_QUARTZ),
                                RecipeCategory.BUILDING_BLOCKS,
                                TARDIFBlocks.GREY_ROUNDEL,
                                1
                        ).criterion("has_grey_stained_quartz", conditionsFromItem(TARDIFBlocks.GREY_STAINED_QUARTZ))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE,
                                Identifier.of(TARDIFMod.MOD_ID, "stonecutting/grey_roundel")));

                StonecuttingRecipeJsonBuilder.createStonecutting(
                                Ingredient.ofItems(TARDIFBlocks.GREY_STAINED_QUARTZ),
                                RecipeCategory.BUILDING_BLOCKS,
                                TARDIFBlocks.GREY_ROUNDEL_HALF,
                                2
                        ).criterion("has_grey_stained_quartz", conditionsFromItem(TARDIFBlocks.GREY_STAINED_QUARTZ))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE,
                                Identifier.of(TARDIFMod.MOD_ID, "stonecutting/grey_roundel_half")));


                StonecuttingRecipeJsonBuilder.createStonecutting(
                                Ingredient.ofItems(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ),
                                RecipeCategory.BUILDING_BLOCKS,
                                TARDIFBlocks.DARK_GREY_ROUNDEL,
                                1
                        ).criterion("has_dark_grey_stained_quartz", conditionsFromItem(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE,
                                Identifier.of(TARDIFMod.MOD_ID, "stonecutting/dark_grey_roundel")));

                StonecuttingRecipeJsonBuilder.createStonecutting(
                                Ingredient.ofItems(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ),
                                RecipeCategory.BUILDING_BLOCKS,
                                TARDIFBlocks.DARK_GREY_ROUNDEL_HALF,
                                2
                        ).criterion("has_dark_grey_stained_quartz", conditionsFromItem(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE,
                                Identifier.of(TARDIFMod.MOD_ID, "stonecutting/dark_grey_roundel_half")));


                StonecuttingRecipeJsonBuilder.createStonecutting(
                                Ingredient.ofItems(TARDIFBlocks.BLACK_STAINED_QUARTZ),
                                RecipeCategory.BUILDING_BLOCKS,
                                TARDIFBlocks.BLACK_ROUNDEL,
                                1
                        ).criterion("has_black_stained_quartz", conditionsFromItem(TARDIFBlocks.BLACK_STAINED_QUARTZ))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE,
                                Identifier.of(TARDIFMod.MOD_ID, "stonecutting/black_roundel")));

                StonecuttingRecipeJsonBuilder.createStonecutting(
                                Ingredient.ofItems(TARDIFBlocks.BLACK_STAINED_QUARTZ),
                                RecipeCategory.BUILDING_BLOCKS,
                                TARDIFBlocks.BLACK_ROUNDEL_HALF,
                                2
                        ).criterion("has_black_stained_quartz", conditionsFromItem(TARDIFBlocks.BLACK_STAINED_QUARTZ))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE,
                                Identifier.of(TARDIFMod.MOD_ID, "stonecutting/black_roundel_half")));


                StonecuttingRecipeJsonBuilder.createStonecutting(
                                Ingredient.ofItems(TARDIFBlocks.RED_STAINED_QUARTZ),
                                RecipeCategory.BUILDING_BLOCKS,
                                TARDIFBlocks.RED_ROUNDEL,
                                1
                        ).criterion("has_red_stained_quartz", conditionsFromItem(TARDIFBlocks.RED_STAINED_QUARTZ))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE,
                                Identifier.of(TARDIFMod.MOD_ID, "stonecutting/red_roundel")));

                StonecuttingRecipeJsonBuilder.createStonecutting(
                                Ingredient.ofItems(TARDIFBlocks.RED_STAINED_QUARTZ),
                                RecipeCategory.BUILDING_BLOCKS,
                                TARDIFBlocks.RED_ROUNDEL_HALF,
                                2
                        ).criterion("has_red_stained_quartz", conditionsFromItem(TARDIFBlocks.RED_STAINED_QUARTZ))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE,
                                Identifier.of(TARDIFMod.MOD_ID, "stonecutting/red_roundel_half")));


                StonecuttingRecipeJsonBuilder.createStonecutting(
                                Ingredient.ofItems(TARDIFBlocks.ORANGE_STAINED_QUARTZ),
                                RecipeCategory.BUILDING_BLOCKS,
                                TARDIFBlocks.ORANGE_ROUNDEL,
                                1
                        ).criterion("has_orange_stained_quartz", conditionsFromItem(TARDIFBlocks.ORANGE_STAINED_QUARTZ))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE,
                                Identifier.of(TARDIFMod.MOD_ID, "stonecutting/orange_roundel")));

                StonecuttingRecipeJsonBuilder.createStonecutting(
                                Ingredient.ofItems(TARDIFBlocks.ORANGE_STAINED_QUARTZ),
                                RecipeCategory.BUILDING_BLOCKS,
                                TARDIFBlocks.ORANGE_ROUNDEL_HALF,
                                2
                        ).criterion("has_orange_stained_quartz", conditionsFromItem(TARDIFBlocks.ORANGE_STAINED_QUARTZ))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE,
                                Identifier.of(TARDIFMod.MOD_ID, "stonecutting/orange_roundel_half")));


                StonecuttingRecipeJsonBuilder.createStonecutting(
                                Ingredient.ofItems(TARDIFBlocks.YELLOW_STAINED_QUARTZ),
                                RecipeCategory.BUILDING_BLOCKS,
                                TARDIFBlocks.YELLOW_ROUNDEL,
                                1
                        ).criterion("has_yellow_stained_quartz", conditionsFromItem(TARDIFBlocks.YELLOW_STAINED_QUARTZ))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE,
                                Identifier.of(TARDIFMod.MOD_ID, "stonecutting/yellow_roundel")));

                StonecuttingRecipeJsonBuilder.createStonecutting(
                                Ingredient.ofItems(TARDIFBlocks.YELLOW_STAINED_QUARTZ),
                                RecipeCategory.BUILDING_BLOCKS,
                                TARDIFBlocks.YELLOW_ROUNDEL_HALF,
                                2
                        ).criterion("has_yellow_stained_quartz", conditionsFromItem(TARDIFBlocks.YELLOW_STAINED_QUARTZ))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE,
                                Identifier.of(TARDIFMod.MOD_ID, "stonecutting/yellow_roundel_half")));
            }
        };
    }

    @Override
    public String getName() {
        return "TARDIF Mod Recipes";
    }
}