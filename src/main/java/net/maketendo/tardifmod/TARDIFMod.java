package net.maketendo.tardifmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.maketendo.tardifmod.client.packets.TardisAnimPackets;
import net.maketendo.tardifmod.events.UseBlockEvent;
import net.maketendo.tardifmod.main.*;
import net.maketendo.tardifmod.main.commands.TardifCommand;
import net.maketendo.tardifmod.main.entities.tardis.TARDISEntity;
import net.maketendo.tardifmod.main.entities.tardis.TARDISInteriorDoorEntity;
import net.maketendo.tardifmod.utils.StainedQuartzRegistry;
import net.minecraft.resources.Identifier;
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

        FabricDefaultAttributeRegistry.register(TARDIFEntities.TARDIS, TARDISEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(TARDIFEntities.TARDIS_INTERIOR_DOOR, TARDISInteriorDoorEntity.createAttributes());


        // Events
        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            UseBlockEvent.register();
        }
        UseBlockEvent.registerQuartz();

    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
