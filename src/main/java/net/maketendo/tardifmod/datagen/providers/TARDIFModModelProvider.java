package net.maketendo.tardifmod.datagen.providers;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.maketendo.tardifmod.main.TARDIFBlocks;
import net.maketendo.tardifmod.main.TARDIFItems;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class TARDIFModModelProvider extends FabricModelProvider {
    public TARDIFModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.ROUNDEL);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.ROUNDEL_HALF);

//        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.GREY_STAINED_QUARTZ);
//        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ);
//        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.BLACK_STAINED_QUARTZ);
//        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.BROWN_STAINED_QUARTZ);
//        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.RED_STAINED_QUARTZ);
//        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.ORANGE_STAINED_QUARTZ);
//        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.YELLOW_STAINED_QUARTZ);
//        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.LIME_STAINED_QUARTZ);
//        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.GREEN_STAINED_QUARTZ);
//        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.CYAN_STAINED_QUARTZ);
//        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ);
//        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.BLUE_STAINED_QUARTZ);
//        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.PURPLE_STAINED_QUARTZ);
//        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.MAGENTA_STAINED_QUARTZ);
//        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.PINK_STAINED_QUARTZ);

        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.GREY_ROUNDEL);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.GREY_ROUNDEL_HALF);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.DARK_GREY_ROUNDEL);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.DARK_GREY_ROUNDEL_HALF);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.BLACK_ROUNDEL);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.BLACK_ROUNDEL_HALF);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.BROWN_ROUNDEL);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.BROWN_ROUNDEL_HALF);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.RED_ROUNDEL);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.RED_ROUNDEL_HALF);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.ORANGE_ROUNDEL);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.ORANGE_ROUNDEL_HALF);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.YELLOW_ROUNDEL);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.YELLOW_ROUNDEL_HALF);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.LIME_ROUNDEL);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.LIME_ROUNDEL_HALF);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.GREEN_ROUNDEL);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.GREEN_ROUNDEL_HALF);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.CYAN_ROUNDEL);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.CYAN_ROUNDEL_HALF);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.LIGHT_BLUE_ROUNDEL);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.LIGHT_BLUE_ROUNDEL_HALF);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.BLUE_ROUNDEL);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.BLUE_ROUNDEL_HALF);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.PURPLE_ROUNDEL);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.PURPLE_ROUNDEL_HALF);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.MAGENTA_ROUNDEL);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.MAGENTA_ROUNDEL_HALF);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.PINK_ROUNDEL);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.PINK_ROUNDEL_HALF);

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
        itemModelGenerator.register(TARDIFItems.GOLD_TARDIS_KEY, Models.GENERATED);
        itemModelGenerator.register(TARDIFItems.SILVER_TARDIS_KEY, Models.GENERATED);
        itemModelGenerator.register(TARDIFItems.TARDIS_ITEM, Models.GENERATED);
    }
}
