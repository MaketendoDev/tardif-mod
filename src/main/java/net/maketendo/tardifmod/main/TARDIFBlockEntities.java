package net.maketendo.tardifmod.main;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.blockentities.RoundelBlockEntity;
import net.maketendo.tardifmod.main.blockentities.panels.CoordinatesPanelBlockEntity;
import net.maketendo.tardifmod.main.blockentities.panels.PowerPanelBlockEntity;
import net.maketendo.tardifmod.main.blocks.RoundelBlock;
import net.maketendo.tardifmod.main.blocks.StainedBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class TARDIFBlockEntities {

    public static final BlockEntityType<PowerPanelBlockEntity> POWER_PANEL =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(TARDIFMod.MOD_ID, "power_panel"),
                    FabricBlockEntityTypeBuilder.create(PowerPanelBlockEntity::new, TARDIFBlocks.POWER_PANEL).build(null));

    public static final BlockEntityType<CoordinatesPanelBlockEntity> COORDINATES_PANEL =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(TARDIFMod.MOD_ID, "coordinates_panel"),
                    FabricBlockEntityTypeBuilder.create(CoordinatesPanelBlockEntity::new, TARDIFBlocks.COORDINATES_PANEL).build(null));

    public static final BlockEntityType<RoundelBlockEntity> ROUNDELS =
            Registry.register(
                    Registries.BLOCK_ENTITY_TYPE,
                    Identifier.of(TARDIFMod.MOD_ID, "roundel"),
                    FabricBlockEntityTypeBuilder.create(
                            RoundelBlockEntity::new,
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
                    ).build()
            );


    public static void register() {
    }
}
