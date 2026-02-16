package net.maketendo.tardifmod.datagen.providers.tags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.maketendo.tardifmod.main.TARDIFBlocks;
import net.maketendo.tardifmod.main.TARDIFTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import org.jspecify.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class TARDIFModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public TARDIFModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .addTag(TARDIFTags.Blocks.ROUNDELS)
                .addTag(TARDIFTags.Blocks.STAINED_QUARTZ)
                .add(TARDIFBlocks.INTERIOR_DOOR_GENERATOR_BLOCK);

        valueLookupBuilder(TARDIFTags.Blocks.ROUNDELS)
                .add(
                        TARDIFBlocks.ROUNDEL,
                        TARDIFBlocks.ROUNDEL_HALF,

                        TARDIFBlocks.GREY_ROUNDEL,
                        TARDIFBlocks.GREY_ROUNDEL_HALF,
                        TARDIFBlocks.DARK_GREY_ROUNDEL,
                        TARDIFBlocks.DARK_GREY_ROUNDEL_HALF,
                        TARDIFBlocks.BLACK_ROUNDEL,
                        TARDIFBlocks.BLACK_ROUNDEL_HALF,
                        TARDIFBlocks.BROWN_ROUNDEL,
                        TARDIFBlocks.BROWN_ROUNDEL_HALF,

                        TARDIFBlocks.RED_ROUNDEL,
                        TARDIFBlocks.RED_ROUNDEL_HALF,
                        TARDIFBlocks.ORANGE_ROUNDEL,
                        TARDIFBlocks.ORANGE_ROUNDEL_HALF,
                        TARDIFBlocks.YELLOW_ROUNDEL,
                        TARDIFBlocks.YELLOW_ROUNDEL_HALF,
                        TARDIFBlocks.LIME_ROUNDEL,
                        TARDIFBlocks.LIME_ROUNDEL_HALF,
                        TARDIFBlocks.GREEN_ROUNDEL,
                        TARDIFBlocks.GREEN_ROUNDEL_HALF,

                        TARDIFBlocks.CYAN_ROUNDEL,
                        TARDIFBlocks.CYAN_ROUNDEL_HALF,
                        TARDIFBlocks.LIGHT_BLUE_ROUNDEL,
                        TARDIFBlocks.LIGHT_BLUE_ROUNDEL_HALF,
                        TARDIFBlocks.BLUE_ROUNDEL,
                        TARDIFBlocks.BLUE_ROUNDEL_HALF,
                        TARDIFBlocks.PURPLE_ROUNDEL,
                        TARDIFBlocks.PURPLE_ROUNDEL_HALF,
                        TARDIFBlocks.MAGENTA_ROUNDEL,
                        TARDIFBlocks.MAGENTA_ROUNDEL_HALF,
                        TARDIFBlocks.PINK_ROUNDEL,
                        TARDIFBlocks.PINK_ROUNDEL_HALF
                );

        valueLookupBuilder(TARDIFTags.Blocks.STAINED_QUARTZ)
                .add(
                        Blocks.QUARTZ_BLOCK,
                        TARDIFBlocks.GREY_STAINED_QUARTZ,
                        TARDIFBlocks.DARK_GREY_STAINED_QUARTZ,
                        TARDIFBlocks.BLACK_STAINED_QUARTZ,
                        TARDIFBlocks.BROWN_STAINED_QUARTZ,
                        TARDIFBlocks.RED_STAINED_QUARTZ,
                        TARDIFBlocks.ORANGE_STAINED_QUARTZ,
                        TARDIFBlocks.YELLOW_STAINED_QUARTZ,
                        TARDIFBlocks.LIME_STAINED_QUARTZ,
                        TARDIFBlocks.GREEN_STAINED_QUARTZ,
                        TARDIFBlocks.CYAN_STAINED_QUARTZ,
                        TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ,
                        TARDIFBlocks.BLUE_STAINED_QUARTZ,
                        TARDIFBlocks.PURPLE_STAINED_QUARTZ,
                        TARDIFBlocks.MAGENTA_STAINED_QUARTZ,
                        TARDIFBlocks.PINK_STAINED_QUARTZ,
                        TARDIFBlocks.GREY_STAINED_QUARTZ_STAIRS,
                        TARDIFBlocks.GREY_STAINED_QUARTZ_SLAB,
                        TARDIFBlocks.DARK_GREY_STAINED_QUARTZ_STAIRS,
                        TARDIFBlocks.DARK_GREY_STAINED_QUARTZ_SLAB,
                        TARDIFBlocks.BLACK_STAINED_QUARTZ_STAIRS,
                        TARDIFBlocks.BLACK_STAINED_QUARTZ_SLAB,
                        TARDIFBlocks.BROWN_STAINED_QUARTZ_STAIRS,
                        TARDIFBlocks.BROWN_STAINED_QUARTZ_SLAB,
                        TARDIFBlocks.RED_STAINED_QUARTZ_STAIRS,
                        TARDIFBlocks.RED_STAINED_QUARTZ_SLAB,
                        TARDIFBlocks.ORANGE_STAINED_QUARTZ_STAIRS,
                        TARDIFBlocks.ORANGE_STAINED_QUARTZ_SLAB,
                        TARDIFBlocks.YELLOW_STAINED_QUARTZ_STAIRS,
                        TARDIFBlocks.YELLOW_STAINED_QUARTZ_SLAB,
                        TARDIFBlocks.LIME_STAINED_QUARTZ_STAIRS,
                        TARDIFBlocks.LIME_STAINED_QUARTZ_SLAB,
                        TARDIFBlocks.GREEN_STAINED_QUARTZ_STAIRS,
                        TARDIFBlocks.GREEN_STAINED_QUARTZ_SLAB,
                        TARDIFBlocks.CYAN_STAINED_QUARTZ_STAIRS,
                        TARDIFBlocks.CYAN_STAINED_QUARTZ_SLAB,
                        TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ_STAIRS,
                        TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ_SLAB,
                        TARDIFBlocks.BLUE_STAINED_QUARTZ_STAIRS,
                        TARDIFBlocks.BLUE_STAINED_QUARTZ_SLAB,
                        TARDIFBlocks.PURPLE_STAINED_QUARTZ_STAIRS,
                        TARDIFBlocks.PURPLE_STAINED_QUARTZ_SLAB,
                        TARDIFBlocks.MAGENTA_STAINED_QUARTZ_STAIRS,
                        TARDIFBlocks.MAGENTA_STAINED_QUARTZ_SLAB,
                        TARDIFBlocks.PINK_STAINED_QUARTZ_STAIRS,
                        TARDIFBlocks.PINK_STAINED_QUARTZ_SLAB

                );
    }
}