package net.maketendo.tardifmod.datagen.providers.tags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.maketendo.tardifmod.main.TARDIFItems;
import net.maketendo.tardifmod.main.TARDIFTags;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.jspecify.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class TARDIFModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public TARDIFModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(TARDIFTags.Items.TARDIS_KEYS)
                .add(TARDIFItems.GOLD_TARDIS_KEY)
                .add(TARDIFItems.SILVER_TARDIS_KEY);

        valueLookupBuilder(TARDIFTags.Items.LINKABLE_ITEMS)
                .add(TARDIFItems.GOLD_TARDIS_KEY)
                .add(TARDIFItems.SILVER_TARDIS_KEY);

        valueLookupBuilder(TARDIFTags.Items.PAINT_BRUSH)
                .add(Items.BRUSH);
    }
}