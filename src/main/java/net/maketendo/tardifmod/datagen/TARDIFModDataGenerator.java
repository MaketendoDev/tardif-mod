package net.maketendo.tardifmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.maketendo.tardifmod.datagen.providers.TARDIFModAdvancementProvider;
import net.maketendo.tardifmod.datagen.providers.TARDIFModEnglishLangProvider;
import net.maketendo.tardifmod.datagen.providers.TARDIFModModelProvider;
import net.maketendo.tardifmod.datagen.providers.TARDIFRecipeProvider;
import net.maketendo.tardifmod.datagen.providers.lootables.TARDIFModBlockLootTableProvider;
import net.maketendo.tardifmod.datagen.providers.lootables.TARDIFModChestLootTableProvider;
import net.maketendo.tardifmod.datagen.providers.tags.TARDIFModBlockTagProvider;
import net.maketendo.tardifmod.datagen.providers.tags.TARDIFModItemTagProvider;

public class TARDIFModDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(TARDIFModAdvancementProvider::new);
        pack.addProvider(TARDIFModBlockLootTableProvider::new);
        //pack.addProvider(TARDIFModChestLootTableProvider::new);
        pack.addProvider(TARDIFModItemTagProvider::new);
        pack.addProvider(TARDIFModBlockTagProvider::new);
        pack.addProvider(TARDIFModEnglishLangProvider::new);
        pack.addProvider(TARDIFModModelProvider::new);
        pack.addProvider(TARDIFRecipeProvider::new);
    }
}
