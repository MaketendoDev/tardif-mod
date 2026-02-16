package net.maketendo.tardifmod.datagen.providers;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.TARDIFBlocks;
import net.maketendo.tardifmod.main.TARDIFItems;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.BlockModelDefinition;
import net.minecraft.client.render.model.json.ModelVariant;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.minecraft.client.data.BlockStateVariantMap;
import net.minecraft.client.data.VariantsBlockModelDefinitionCreator;
import net.minecraft.util.collection.Pool;


public class TARDIFModModelProvider extends FabricModelProvider {
    public TARDIFModModelProvider(FabricDataOutput output) {
        super(output);
    }

    public static final Model GENERATED_KEY = item("key_generated", TextureKey.LAYER0);;

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.ROUNDEL);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.ROUNDEL_HALF);

        blockStateModelGenerator.registerRotatable(TARDIFBlocks.GREY_ROUNDEL);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.GREY_ROUNDEL_HALF);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.DARK_GREY_ROUNDEL);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.DARK_GREY_ROUNDEL_HALF);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.BLACK_ROUNDEL);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.BLACK_ROUNDEL_HALF);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.BROWN_ROUNDEL);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.BROWN_ROUNDEL_HALF);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.RED_ROUNDEL);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.RED_ROUNDEL_HALF);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.ORANGE_ROUNDEL);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.ORANGE_ROUNDEL_HALF);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.YELLOW_ROUNDEL);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.YELLOW_ROUNDEL_HALF);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.LIME_ROUNDEL);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.LIME_ROUNDEL_HALF);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.GREEN_ROUNDEL);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.GREEN_ROUNDEL_HALF);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.CYAN_ROUNDEL);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.CYAN_ROUNDEL_HALF);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.LIGHT_BLUE_ROUNDEL);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.LIGHT_BLUE_ROUNDEL_HALF);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.BLUE_ROUNDEL);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.BLUE_ROUNDEL_HALF);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.PURPLE_ROUNDEL);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.PURPLE_ROUNDEL_HALF);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.MAGENTA_ROUNDEL);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.MAGENTA_ROUNDEL_HALF);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.PINK_ROUNDEL);
        blockStateModelGenerator.registerRotatable(TARDIFBlocks.PINK_ROUNDEL_HALF);

        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.INTERIOR_DOOR_GENERATOR_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.TARDIS_LIGHT_BLOCK);

        blockStateModelGenerator.registerBuiltinWithParticle(TARDIFBlocks.POWER_PANEL, Blocks.IRON_BLOCK);
        blockStateModelGenerator.registerBuiltinWithParticle(TARDIFBlocks.COORDINATES_PANEL, Blocks.IRON_BLOCK);
        blockStateModelGenerator.registerBuiltinWithParticle(TARDIFBlocks.DEMATERIALISATION_PANEL, Blocks.IRON_BLOCK);

        BlockStateModelGenerator.BlockTexturePool greyStainedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TARDIFBlocks.GREY_STAINED_QUARTZ);
        greyStainedQuartzPool.stairs(TARDIFBlocks.GREY_STAINED_QUARTZ_STAIRS);
        greyStainedQuartzPool.slab(TARDIFBlocks.GREY_STAINED_QUARTZ_SLAB);

        BlockStateModelGenerator.BlockTexturePool darkGreyStainedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ);
        darkGreyStainedQuartzPool.stairs(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ_STAIRS);
        darkGreyStainedQuartzPool.slab(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ_SLAB);

        BlockStateModelGenerator.BlockTexturePool blackStainedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TARDIFBlocks.BLACK_STAINED_QUARTZ);
        blackStainedQuartzPool.stairs(TARDIFBlocks.BLACK_STAINED_QUARTZ_STAIRS);
        blackStainedQuartzPool.slab(TARDIFBlocks.BLACK_STAINED_QUARTZ_SLAB);

        BlockStateModelGenerator.BlockTexturePool brownStainedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TARDIFBlocks.BROWN_STAINED_QUARTZ);
        brownStainedQuartzPool.stairs(TARDIFBlocks.BROWN_STAINED_QUARTZ_STAIRS);
        brownStainedQuartzPool.slab(TARDIFBlocks.BROWN_STAINED_QUARTZ_SLAB);

        BlockStateModelGenerator.BlockTexturePool redStainedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TARDIFBlocks.RED_STAINED_QUARTZ);
        redStainedQuartzPool.stairs(TARDIFBlocks.RED_STAINED_QUARTZ_STAIRS);
        redStainedQuartzPool.slab(TARDIFBlocks.RED_STAINED_QUARTZ_SLAB);

        BlockStateModelGenerator.BlockTexturePool orangeStainedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TARDIFBlocks.ORANGE_STAINED_QUARTZ);
        orangeStainedQuartzPool.stairs(TARDIFBlocks.ORANGE_STAINED_QUARTZ_STAIRS);
        orangeStainedQuartzPool.slab(TARDIFBlocks.ORANGE_STAINED_QUARTZ_SLAB);

        BlockStateModelGenerator.BlockTexturePool yellowStainedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TARDIFBlocks.YELLOW_STAINED_QUARTZ);
        yellowStainedQuartzPool.stairs(TARDIFBlocks.YELLOW_STAINED_QUARTZ_STAIRS);
        yellowStainedQuartzPool.slab(TARDIFBlocks.YELLOW_STAINED_QUARTZ_SLAB);

        BlockStateModelGenerator.BlockTexturePool limeStainedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TARDIFBlocks.LIME_STAINED_QUARTZ);
        limeStainedQuartzPool.stairs(TARDIFBlocks.LIME_STAINED_QUARTZ_STAIRS);
        limeStainedQuartzPool.slab(TARDIFBlocks.LIME_STAINED_QUARTZ_SLAB);

        BlockStateModelGenerator.BlockTexturePool greenStainedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TARDIFBlocks.GREEN_STAINED_QUARTZ);
        greenStainedQuartzPool.stairs(TARDIFBlocks.GREEN_STAINED_QUARTZ_STAIRS);
        greenStainedQuartzPool.slab(TARDIFBlocks.GREEN_STAINED_QUARTZ_SLAB);

        BlockStateModelGenerator.BlockTexturePool cyanStainedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TARDIFBlocks.CYAN_STAINED_QUARTZ);
        cyanStainedQuartzPool.stairs(TARDIFBlocks.CYAN_STAINED_QUARTZ_STAIRS);
        cyanStainedQuartzPool.slab(TARDIFBlocks.CYAN_STAINED_QUARTZ_SLAB);

        BlockStateModelGenerator.BlockTexturePool lightBlueStainedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ);
        lightBlueStainedQuartzPool.stairs(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ_STAIRS);
        lightBlueStainedQuartzPool.slab(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ_SLAB);

        BlockStateModelGenerator.BlockTexturePool blueStainedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TARDIFBlocks.BLUE_STAINED_QUARTZ);
        blueStainedQuartzPool.stairs(TARDIFBlocks.BLUE_STAINED_QUARTZ_STAIRS);
        blueStainedQuartzPool.slab(TARDIFBlocks.BLUE_STAINED_QUARTZ_SLAB);

        BlockStateModelGenerator.BlockTexturePool purpleStainedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TARDIFBlocks.PURPLE_STAINED_QUARTZ);
        purpleStainedQuartzPool.stairs(TARDIFBlocks.PURPLE_STAINED_QUARTZ_STAIRS);
        purpleStainedQuartzPool.slab(TARDIFBlocks.PURPLE_STAINED_QUARTZ_SLAB);

        BlockStateModelGenerator.BlockTexturePool magentaStainedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TARDIFBlocks.MAGENTA_STAINED_QUARTZ);
        magentaStainedQuartzPool.stairs(TARDIFBlocks.MAGENTA_STAINED_QUARTZ_STAIRS);
        magentaStainedQuartzPool.slab(TARDIFBlocks.MAGENTA_STAINED_QUARTZ_SLAB);

        BlockStateModelGenerator.BlockTexturePool pinkStainedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TARDIFBlocks.PINK_STAINED_QUARTZ);
        pinkStainedQuartzPool.stairs(TARDIFBlocks.PINK_STAINED_QUARTZ_STAIRS);
        pinkStainedQuartzPool.slab(TARDIFBlocks.PINK_STAINED_QUARTZ_SLAB);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(TARDIFItems.GOLD_TARDIS_KEY, GENERATED_KEY);
        itemModelGenerator.register(TARDIFItems.SILVER_TARDIS_KEY, GENERATED_KEY);
        itemModelGenerator.register(TARDIFItems.TARDIS_ITEM, Models.GENERATED);

        itemModelGenerator.register(TARDIFBlocks.TARDIS_LIGHT_BLOCK.asItem(), Models.GENERATED);
        itemModelGenerator.register(TARDIFBlocks.POWER_PANEL.asItem(), Models.GENERATED);
        itemModelGenerator.register(TARDIFBlocks.COORDINATES_PANEL.asItem(), Models.GENERATED);
        itemModelGenerator.register(TARDIFBlocks.DEMATERIALISATION_PANEL.asItem(), Models.GENERATED);
    }

    private static Model item(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(TARDIFMod.MOD_ID, "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }
}
