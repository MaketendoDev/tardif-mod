package net.maketendo.tardifmod.datagen.providers;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.TARDIFBlocks;
import net.maketendo.tardifmod.main.TARDIFItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.renderer.texture.TextureContents;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Blocks;
import java.util.*;


public class TARDIFModModelProvider extends FabricModelProvider {
    public TARDIFModModelProvider(FabricDataOutput output) {
        super(output);
    }

    public static final ModelTemplate GENERATED_KEY = item("key_generated", TextureSlot.LAYER0);;

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.ROUNDEL);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.ROUNDEL_HALF);

        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.GRAY_ROUNDEL);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.GRAY_ROUNDEL_HALF);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.DARK_GRAY_ROUNDEL);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.DARK_GRAY_ROUNDEL_HALF);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.BLACK_ROUNDEL);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.BLACK_ROUNDEL_HALF);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.BROWN_ROUNDEL);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.BROWN_ROUNDEL_HALF);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.RED_ROUNDEL);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.RED_ROUNDEL_HALF);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.ORANGE_ROUNDEL);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.ORANGE_ROUNDEL_HALF);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.YELLOW_ROUNDEL);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.YELLOW_ROUNDEL_HALF);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.LIME_ROUNDEL);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.LIME_ROUNDEL_HALF);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.GREEN_ROUNDEL);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.GREEN_ROUNDEL_HALF);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.CYAN_ROUNDEL);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.CYAN_ROUNDEL_HALF);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.LIGHT_BLUE_ROUNDEL);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.LIGHT_BLUE_ROUNDEL_HALF);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.BLUE_ROUNDEL);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.BLUE_ROUNDEL_HALF);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.PURPLE_ROUNDEL);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.PURPLE_ROUNDEL_HALF);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.MAGENTA_ROUNDEL);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.MAGENTA_ROUNDEL_HALF);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.PINK_ROUNDEL);
        blockStateModelGenerator.createRotatedVariantBlock(TARDIFBlocks.PINK_ROUNDEL_HALF);

        //blockStateModelGenerator.createMultifaceBlockStates(TARDIFBlocks.TARDIS_MONITOR);

        blockStateModelGenerator.createTrivialCube(TARDIFBlocks.INTERIOR_DOOR_GENERATOR_BLOCK);
        blockStateModelGenerator.createTrivialCube(TARDIFBlocks.TARDIS_LIGHT_BLOCK);

//        blockStateModelGenerator.registerBuiltinWithParticle(TARDIFBlocks.POWER_PANEL, Blocks.IRON_BLOCK);
//        blockStateModelGenerator.registerBuiltinWithParticle(TARDIFBlocks.COORDINATES_PANEL, Blocks.IRON_BLOCK);
//        blockStateModelGenerator.registerBuiltinWithParticle(TARDIFBlocks.DEMATERIALISATION_PANEL, Blocks.IRON_BLOCK);
        blockStateModelGenerator.createParticleOnlyBlock(TARDIFBlocks.TARDIS_CONSOLE_BLOCK, Blocks.SHROOMLIGHT);

        BlockModelGenerators.BlockFamilyProvider crystallinePool = blockStateModelGenerator.family(TARDIFBlocks.CRYSTALLINE_BLOCK);
        crystallinePool.stairs(TARDIFBlocks.CRYSTALLINE_STAIR);
        crystallinePool.slab(TARDIFBlocks.CRYSTALLINE_SLAB);

        BlockModelGenerators.BlockFamilyProvider greyStainedQuartzPool = blockStateModelGenerator.family(TARDIFBlocks.GRAY_STAINED_QUARTZ);
        greyStainedQuartzPool.stairs(TARDIFBlocks.GRAY_STAINED_QUARTZ_STAIRS);
        greyStainedQuartzPool.slab(TARDIFBlocks.GRAY_STAINED_QUARTZ_SLAB);

        BlockModelGenerators.BlockFamilyProvider darkGreyStainedQuartzPool = blockStateModelGenerator.family(TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ);
        darkGreyStainedQuartzPool.stairs(TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ_STAIRS);
        darkGreyStainedQuartzPool.slab(TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ_SLAB);

        BlockModelGenerators.BlockFamilyProvider blackStainedQuartzPool = blockStateModelGenerator.family(TARDIFBlocks.BLACK_STAINED_QUARTZ);
        blackStainedQuartzPool.stairs(TARDIFBlocks.BLACK_STAINED_QUARTZ_STAIRS);
        blackStainedQuartzPool.slab(TARDIFBlocks.BLACK_STAINED_QUARTZ_SLAB);

        BlockModelGenerators.BlockFamilyProvider brownStainedQuartzPool = blockStateModelGenerator.family(TARDIFBlocks.BROWN_STAINED_QUARTZ);
        brownStainedQuartzPool.stairs(TARDIFBlocks.BROWN_STAINED_QUARTZ_STAIRS);
        brownStainedQuartzPool.slab(TARDIFBlocks.BROWN_STAINED_QUARTZ_SLAB);

        BlockModelGenerators.BlockFamilyProvider redStainedQuartzPool = blockStateModelGenerator.family(TARDIFBlocks.RED_STAINED_QUARTZ);
        redStainedQuartzPool.stairs(TARDIFBlocks.RED_STAINED_QUARTZ_STAIRS);
        redStainedQuartzPool.slab(TARDIFBlocks.RED_STAINED_QUARTZ_SLAB);

        BlockModelGenerators.BlockFamilyProvider orangeStainedQuartzPool = blockStateModelGenerator.family(TARDIFBlocks.ORANGE_STAINED_QUARTZ);
        orangeStainedQuartzPool.stairs(TARDIFBlocks.ORANGE_STAINED_QUARTZ_STAIRS);
        orangeStainedQuartzPool.slab(TARDIFBlocks.ORANGE_STAINED_QUARTZ_SLAB);

        BlockModelGenerators.BlockFamilyProvider yellowStainedQuartzPool = blockStateModelGenerator.family(TARDIFBlocks.YELLOW_STAINED_QUARTZ);
        yellowStainedQuartzPool.stairs(TARDIFBlocks.YELLOW_STAINED_QUARTZ_STAIRS);
        yellowStainedQuartzPool.slab(TARDIFBlocks.YELLOW_STAINED_QUARTZ_SLAB);

        BlockModelGenerators.BlockFamilyProvider limeStainedQuartzPool = blockStateModelGenerator.family(TARDIFBlocks.LIME_STAINED_QUARTZ);
        limeStainedQuartzPool.stairs(TARDIFBlocks.LIME_STAINED_QUARTZ_STAIRS);
        limeStainedQuartzPool.slab(TARDIFBlocks.LIME_STAINED_QUARTZ_SLAB);

        BlockModelGenerators.BlockFamilyProvider greenStainedQuartzPool = blockStateModelGenerator.family(TARDIFBlocks.GREEN_STAINED_QUARTZ);
        greenStainedQuartzPool.stairs(TARDIFBlocks.GREEN_STAINED_QUARTZ_STAIRS);
        greenStainedQuartzPool.slab(TARDIFBlocks.GREEN_STAINED_QUARTZ_SLAB);

        BlockModelGenerators.BlockFamilyProvider cyanStainedQuartzPool = blockStateModelGenerator.family(TARDIFBlocks.CYAN_STAINED_QUARTZ);
        cyanStainedQuartzPool.stairs(TARDIFBlocks.CYAN_STAINED_QUARTZ_STAIRS);
        cyanStainedQuartzPool.slab(TARDIFBlocks.CYAN_STAINED_QUARTZ_SLAB);

        BlockModelGenerators.BlockFamilyProvider lightBlueStainedQuartzPool = blockStateModelGenerator.family(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ);
        lightBlueStainedQuartzPool.stairs(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ_STAIRS);
        lightBlueStainedQuartzPool.slab(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ_SLAB);

        BlockModelGenerators.BlockFamilyProvider blueStainedQuartzPool = blockStateModelGenerator.family(TARDIFBlocks.BLUE_STAINED_QUARTZ);
        blueStainedQuartzPool.stairs(TARDIFBlocks.BLUE_STAINED_QUARTZ_STAIRS);
        blueStainedQuartzPool.slab(TARDIFBlocks.BLUE_STAINED_QUARTZ_SLAB);

        BlockModelGenerators.BlockFamilyProvider purpleStainedQuartzPool = blockStateModelGenerator.family(TARDIFBlocks.PURPLE_STAINED_QUARTZ);
        purpleStainedQuartzPool.stairs(TARDIFBlocks.PURPLE_STAINED_QUARTZ_STAIRS);
        purpleStainedQuartzPool.slab(TARDIFBlocks.PURPLE_STAINED_QUARTZ_SLAB);

        BlockModelGenerators.BlockFamilyProvider magentaStainedQuartzPool = blockStateModelGenerator.family(TARDIFBlocks.MAGENTA_STAINED_QUARTZ);
        magentaStainedQuartzPool.stairs(TARDIFBlocks.MAGENTA_STAINED_QUARTZ_STAIRS);
        magentaStainedQuartzPool.slab(TARDIFBlocks.MAGENTA_STAINED_QUARTZ_SLAB);

        BlockModelGenerators.BlockFamilyProvider pinkStainedQuartzPool = blockStateModelGenerator.family(TARDIFBlocks.PINK_STAINED_QUARTZ);
        pinkStainedQuartzPool.stairs(TARDIFBlocks.PINK_STAINED_QUARTZ_STAIRS);
        pinkStainedQuartzPool.slab(TARDIFBlocks.PINK_STAINED_QUARTZ_SLAB);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(TARDIFItems.GOLD_TARDIS_KEY, GENERATED_KEY);
        itemModelGenerator.generateFlatItem(TARDIFItems.SILVER_TARDIS_KEY, GENERATED_KEY);
        itemModelGenerator.generateFlatItem(TARDIFItems.TARDIS_ITEM, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(TARDIFItems.CRYSTALLINE_SHARD, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(TARDIFBlocks.TARDIS_LIGHT_BLOCK.asItem(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TARDIFBlocks.TARDIS_CONSOLE_BLOCK.asItem(), ModelTemplates.FLAT_ITEM);
//        itemModelGenerator.register(TARDIFBlocks.POWER_PANEL.asItem(), Models.GENERATED);
//        itemModelGenerator.register(TARDIFBlocks.COORDINATES_PANEL.asItem(), Models.GENERATED);
//        itemModelGenerator.register(TARDIFBlocks.DEMATERIALISATION_PANEL.asItem(), Models.GENERATED);
    }

    private static ModelTemplate item(String parent, TextureSlot... requiredTextureKeys) {
        return new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }
}
