package net.maketendo.tardifmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.maketendo.tardifmod.events.UseBlockEvent;
import net.maketendo.tardifmod.main.*;
import net.maketendo.tardifmod.main.commands.TardifCommand;
import net.maketendo.tardifmod.utils.StainedQuartzRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TARDIFMod implements ModInitializer {

    public static final String MOD_ID = "tardif_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        TARDIFSounds.register();
        TARDIFEntities.register();
        TARDIFItems.register();
        TARDIFBlocks.register();
        TARDIFBlockEntities.register();
        TARDIFItemGroups.register();
        TardifCommand.register();
        TARDIFPlayerStatistics.register();
        StainedQuartzRegistry.register();

        // Events
        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            //UseBlockEvent.register();
        }
        UseBlockEvent.registerQuartz();
    }

}
