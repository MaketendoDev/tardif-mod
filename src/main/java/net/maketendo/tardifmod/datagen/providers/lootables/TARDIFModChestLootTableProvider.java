package net.maketendo.tardifmod.datagen.providers.lootables;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.context.ContextKeySet;
import net.minecraft.world.level.storage.loot.LootTable;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class TARDIFModChestLootTableProvider extends SimpleFabricLootTableProvider {

    public TARDIFModChestLootTableProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registryLookup, ContextKeySet contextType) {
        super(output, registryLookup, contextType);
    }

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> lootTableBiConsumer) {

    }
}
