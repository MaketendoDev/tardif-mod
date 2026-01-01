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


        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.GREY_STAINED_QUARTZ);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.BLACK_STAINED_QUARTZ);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.BROWN_STAINED_QUARTZ);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.RED_STAINED_QUARTZ);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.ORANGE_STAINED_QUARTZ);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.YELLOW_STAINED_QUARTZ);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.LIME_STAINED_QUARTZ);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.GREEN_STAINED_QUARTZ);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.CYAN_STAINED_QUARTZ);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.BLUE_STAINED_QUARTZ);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.PURPLE_STAINED_QUARTZ);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.MAGENTA_STAINED_QUARTZ);
        blockStateModelGenerator.registerSimpleCubeAll(TARDIFBlocks.PINK_STAINED_QUARTZ);

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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(TARDIFItems.GOLD_TARDIS_KEY, Models.GENERATED);
        itemModelGenerator.register(TARDIFItems.SILVER_TARDIS_KEY, Models.GENERATED);
        itemModelGenerator.register(TARDIFItems.TARDIS_ITEM, Models.GENERATED);
    }
}
