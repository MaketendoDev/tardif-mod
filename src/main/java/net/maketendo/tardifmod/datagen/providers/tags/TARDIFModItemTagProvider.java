package net.maketendo.tardifmod.datagen.providers.tags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.maketendo.tardifmod.main.TARDIFItems;
import net.maketendo.tardifmod.main.TARDIFTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import org.jspecify.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class TARDIFModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public TARDIFModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
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