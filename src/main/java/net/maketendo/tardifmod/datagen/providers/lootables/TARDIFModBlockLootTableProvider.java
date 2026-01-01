package net.maketendo.tardifmod.datagen.providers.lootables;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.maketendo.tardifmod.main.TARDIFBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class TARDIFModBlockLootTableProvider extends FabricBlockLootTableProvider {

    public TARDIFModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(TARDIFBlocks.ROUNDEL);
        addDrop(TARDIFBlocks.ROUNDEL_HALF);

        addDrop(TARDIFBlocks.GREY_STAINED_QUARTZ);
        addDrop(TARDIFBlocks.DARK_GREY_STAINED_QUARTZ);
        addDrop(TARDIFBlocks.BLACK_STAINED_QUARTZ);
        addDrop(TARDIFBlocks.BROWN_STAINED_QUARTZ);
        addDrop(TARDIFBlocks.RED_STAINED_QUARTZ);
        addDrop(TARDIFBlocks.ORANGE_STAINED_QUARTZ);
        addDrop(TARDIFBlocks.YELLOW_STAINED_QUARTZ);
        addDrop(TARDIFBlocks.LIME_STAINED_QUARTZ);
        addDrop(TARDIFBlocks.GREEN_STAINED_QUARTZ);
        addDrop(TARDIFBlocks.CYAN_STAINED_QUARTZ);
        addDrop(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ);
        addDrop(TARDIFBlocks.BLUE_STAINED_QUARTZ);
        addDrop(TARDIFBlocks.PURPLE_STAINED_QUARTZ);
        addDrop(TARDIFBlocks.MAGENTA_STAINED_QUARTZ);
        addDrop(TARDIFBlocks.PINK_STAINED_QUARTZ);

        addDrop(TARDIFBlocks.GREY_ROUNDEL);
        addDrop(TARDIFBlocks.GREY_ROUNDEL_HALF);
        addDrop(TARDIFBlocks.DARK_GREY_ROUNDEL);
        addDrop(TARDIFBlocks.DARK_GREY_ROUNDEL_HALF);
        addDrop(TARDIFBlocks.BLACK_ROUNDEL);
        addDrop(TARDIFBlocks.BLACK_ROUNDEL_HALF);
        addDrop(TARDIFBlocks.BROWN_ROUNDEL);
        addDrop(TARDIFBlocks.BROWN_ROUNDEL_HALF);
        addDrop(TARDIFBlocks.RED_ROUNDEL);
        addDrop(TARDIFBlocks.RED_ROUNDEL_HALF);
        addDrop(TARDIFBlocks.ORANGE_ROUNDEL);
        addDrop(TARDIFBlocks.ORANGE_ROUNDEL_HALF);
        addDrop(TARDIFBlocks.YELLOW_ROUNDEL);
        addDrop(TARDIFBlocks.YELLOW_ROUNDEL_HALF);
        addDrop(TARDIFBlocks.LIME_ROUNDEL);
        addDrop(TARDIFBlocks.LIME_ROUNDEL_HALF);
        addDrop(TARDIFBlocks.GREEN_ROUNDEL);
        addDrop(TARDIFBlocks.GREEN_ROUNDEL_HALF);
        addDrop(TARDIFBlocks.CYAN_ROUNDEL);
        addDrop(TARDIFBlocks.CYAN_ROUNDEL_HALF);
        addDrop(TARDIFBlocks.LIGHT_BLUE_ROUNDEL);
        addDrop(TARDIFBlocks.LIGHT_BLUE_ROUNDEL_HALF);
        addDrop(TARDIFBlocks.BLUE_ROUNDEL);
        addDrop(TARDIFBlocks.BLUE_ROUNDEL);
        addDrop(TARDIFBlocks.PURPLE_ROUNDEL);
        addDrop(TARDIFBlocks.PURPLE_ROUNDEL);
        addDrop(TARDIFBlocks.MAGENTA_ROUNDEL);
        addDrop(TARDIFBlocks.MAGENTA_ROUNDEL_HALF);
        addDrop(TARDIFBlocks.PINK_ROUNDEL);
        addDrop(TARDIFBlocks.PINK_ROUNDEL_HALF);
    }
}
