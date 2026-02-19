package net.maketendo.tardifmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.maketendo.tardifmod.client.models.console.CrystalConsoleModel;
import net.maketendo.tardifmod.client.packets.TardisAnimPackets;
import net.maketendo.tardifmod.events.UseBlockEvent;
import net.maketendo.tardifmod.main.*;
import net.maketendo.tardifmod.main.commands.TardifCommand;
import net.maketendo.tardifmod.main.tardis.TardisDataManager;
import net.maketendo.tardifmod.utils.StainedQuartzRegistry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TARDIFMod implements ModInitializer {

    public static final String MOD_ID = "tardif_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        TARDIFSounds.register();
        TARDIFEntities.register();
        TARDIFBlocks.register();
        TARDIFItems.register();
        TARDIFBlockEntities.register();
        TARDIFItemGroups.register();
        TardifCommand.register();
        TARDIFPlayerStatistics.register();
        TARDIFComponents.register();

        StainedQuartzRegistry.register();
        TardisAnimPackets.register();


        // Events
        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            UseBlockEvent.register();
        }
        UseBlockEvent.registerQuartz();

        ServerLifecycleEvents.SERVER_STARTED.register(TardisDataManager::init);

        ServerLifecycleEvents.SERVER_STOPPING.register(server -> {
            TardisDataManager.saveAll();
        });

    }

}
