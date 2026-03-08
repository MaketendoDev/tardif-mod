package net.maketendo.tardifmod.datagen.providers.lootables;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.maketendo.tardifmod.main.TARDIFBlocks;
import net.minecraft.core.HolderLookup;
import java.util.concurrent.CompletableFuture;

public class TARDIFModBlockLootTableProvider extends FabricBlockLootTableProvider {

    public TARDIFModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        dropSelf(TARDIFBlocks.GRAY_STAINED_QUARTZ);
        dropSelf(TARDIFBlocks.DARK_GRAY_STAINED_QUARTZ);
        dropSelf(TARDIFBlocks.BLACK_STAINED_QUARTZ);
        dropSelf(TARDIFBlocks.BROWN_STAINED_QUARTZ);
        dropSelf(TARDIFBlocks.RED_STAINED_QUARTZ);
        dropSelf(TARDIFBlocks.ORANGE_STAINED_QUARTZ);
        dropSelf(TARDIFBlocks.YELLOW_STAINED_QUARTZ);
        dropSelf(TARDIFBlocks.LIME_STAINED_QUARTZ);
        dropSelf(TARDIFBlocks.GREEN_STAINED_QUARTZ);
        dropSelf(TARDIFBlocks.CYAN_STAINED_QUARTZ);
        dropSelf(TARDIFBlocks.LIGHT_BLUE_STAINED_QUARTZ);
        dropSelf(TARDIFBlocks.BLUE_STAINED_QUARTZ);
        dropSelf(TARDIFBlocks.PURPLE_STAINED_QUARTZ);
        dropSelf(TARDIFBlocks.MAGENTA_STAINED_QUARTZ);
        dropSelf(TARDIFBlocks.PINK_STAINED_QUARTZ);

        dropSelf(TARDIFBlocks.HALF_CHISELED_QUARTZ);

        dropSelf(TARDIFBlocks.REDSTONE_ROUNDEL);
        dropSelf(TARDIFBlocks.REDSTONE_ROUNDEL_HALF);
        dropSelf(TARDIFBlocks.WHITE_ROUNDEL);
        dropSelf(TARDIFBlocks.WHITE_ROUNDEL_HALF);
        dropSelf(TARDIFBlocks.GRAY_ROUNDEL);
        dropSelf(TARDIFBlocks.GRAY_ROUNDEL_HALF);
        dropSelf(TARDIFBlocks.DARK_GRAY_ROUNDEL);
        dropSelf(TARDIFBlocks.DARK_GRAY_ROUNDEL_HALF);
        dropSelf(TARDIFBlocks.BLACK_ROUNDEL);
        dropSelf(TARDIFBlocks.BLACK_ROUNDEL_HALF);
        dropSelf(TARDIFBlocks.BROWN_ROUNDEL);
        dropSelf(TARDIFBlocks.BROWN_ROUNDEL_HALF);
        dropSelf(TARDIFBlocks.RED_ROUNDEL);
        dropSelf(TARDIFBlocks.RED_ROUNDEL_HALF);
        dropSelf(TARDIFBlocks.ORANGE_ROUNDEL);
        dropSelf(TARDIFBlocks.ORANGE_ROUNDEL_HALF);
        dropSelf(TARDIFBlocks.YELLOW_ROUNDEL);
        dropSelf(TARDIFBlocks.YELLOW_ROUNDEL_HALF);
        dropSelf(TARDIFBlocks.LIME_ROUNDEL);
        dropSelf(TARDIFBlocks.LIME_ROUNDEL_HALF);
        dropSelf(TARDIFBlocks.GREEN_ROUNDEL);
        dropSelf(TARDIFBlocks.GREEN_ROUNDEL_HALF);
        dropSelf(TARDIFBlocks.CYAN_ROUNDEL);
        dropSelf(TARDIFBlocks.CYAN_ROUNDEL_HALF);
        dropSelf(TARDIFBlocks.LIGHT_BLUE_ROUNDEL);
        dropSelf(TARDIFBlocks.LIGHT_BLUE_ROUNDEL_HALF);
        dropSelf(TARDIFBlocks.BLUE_ROUNDEL);
        dropSelf(TARDIFBlocks.BLUE_ROUNDEL);
        dropSelf(TARDIFBlocks.PURPLE_ROUNDEL);
        dropSelf(TARDIFBlocks.PURPLE_ROUNDEL);
        dropSelf(TARDIFBlocks.MAGENTA_ROUNDEL);
        dropSelf(TARDIFBlocks.MAGENTA_ROUNDEL_HALF);
        dropSelf(TARDIFBlocks.PINK_ROUNDEL);
        dropSelf(TARDIFBlocks.PINK_ROUNDEL_HALF);

        dropSelf(TARDIFBlocks.CRYSTALLINE_BLOCK);
        dropSelf(TARDIFBlocks.CRYSTALLINE_STAIR);
        dropSelf(TARDIFBlocks.CRYSTALLINE_SLAB);
    }
}
