package net.maketendo.tardifmod.main;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.maketendo.tardifmod.TARDIFMod;
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

    public static void register() {
    }
}
