package net.maketendo.tardifmod.main;

import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.blocks.RoundelBlock;
import net.maketendo.tardifmod.main.blocks.StainedBlock;
import net.maketendo.tardifmod.main.blocks.panels.CoordinatesPanelBlock;
import net.maketendo.tardifmod.main.blocks.panels.PowerPanelBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class TARDIFBlocks {

    public static final Block ROUNDEL = registerBlock("roundel",
            properties -> new RoundelBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block ROUNDEL_HALF = registerBlock("roundel_half",
            properties -> new RoundelBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));

    public static final Block GREY_ROUNDEL = registerBlock("grey_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block GREY_ROUNDEL_HALF = registerBlock("grey_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block DARK_GREY_ROUNDEL = registerBlock("dark_grey_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block DARK_GREY_ROUNDEL_HALF = registerBlock("dark_grey_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block BLACK_ROUNDEL = registerBlock("black_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block BLACK_ROUNDEL_HALF = registerBlock("black_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block BROWN_ROUNDEL = registerBlock("brown_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block BROWN_ROUNDEL_HALF = registerBlock("brown_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block RED_ROUNDEL = registerBlock("red_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block RED_ROUNDEL_HALF = registerBlock("red_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block ORANGE_ROUNDEL = registerBlock("orange_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block ORANGE_ROUNDEL_HALF = registerBlock("orange_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block YELLOW_ROUNDEL = registerBlock("yellow_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block YELLOW_ROUNDEL_HALF = registerBlock("yellow_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block LIME_ROUNDEL = registerBlock("lime_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.LIME)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block LIME_ROUNDEL_HALF = registerBlock("lime_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.LIME)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block GREEN_ROUNDEL = registerBlock("green_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block GREEN_ROUNDEL_HALF = registerBlock("green_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block CYAN_ROUNDEL = registerBlock("cyan_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block CYAN_ROUNDEL_HALF = registerBlock("cyan_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block LIGHT_BLUE_ROUNDEL = registerBlock("light_blue_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block LIGHT_BLUE_ROUNDEL_HALF = registerBlock("light_blue_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block BLUE_ROUNDEL = registerBlock("blue_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block BLUE_ROUNDEL_HALF = registerBlock("blue_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block PURPLE_ROUNDEL = registerBlock("purple_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block PURPLE_ROUNDEL_HALF = registerBlock("purple_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block MAGENTA_ROUNDEL = registerBlock("magenta_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block MAGENTA_ROUNDEL_HALF = registerBlock("magenta_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block PINK_ROUNDEL = registerBlock("pink_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));

    public static final Block PINK_ROUNDEL_HALF = registerBlock("pink_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.8F)));


    public static final Block GREY_STAINED_QUARTZ = registerBlock("grey_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block DARK_GREY_STAINED_QUARTZ = registerBlock("dark_grey_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block BLACK_STAINED_QUARTZ = registerBlock("black_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block BROWN_STAINED_QUARTZ = registerBlock("brown_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block RED_STAINED_QUARTZ = registerBlock("red_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block ORANGE_STAINED_QUARTZ = registerBlock("orange_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block YELLOW_STAINED_QUARTZ = registerBlock("yellow_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block LIME_STAINED_QUARTZ = registerBlock("lime_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block GREEN_STAINED_QUARTZ = registerBlock("green_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block CYAN_STAINED_QUARTZ = registerBlock("cyan_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block LIGHT_BLUE_STAINED_QUARTZ = registerBlock("light_blue_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block BLUE_STAINED_QUARTZ = registerBlock("blue_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block PURPLE_STAINED_QUARTZ = registerBlock("purple_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block MAGENTA_STAINED_QUARTZ = registerBlock("magenta_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block PINK_STAINED_QUARTZ = registerBlock("pink_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));

    public static final Block GREY_STAINED_QUARTZ_SLAB = registerBlock("grey_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block DARK_GREY_STAINED_QUARTZ_SLAB = registerBlock("dark_grey_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block BLACK_STAINED_QUARTZ_SLAB = registerBlock("black_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block BROWN_STAINED_QUARTZ_SLAB = registerBlock("brown_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block RED_STAINED_QUARTZ_SLAB = registerBlock("red_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block ORANGE_STAINED_QUARTZ_SLAB = registerBlock("orange_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block YELLOW_STAINED_QUARTZ_SLAB = registerBlock("yellow_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block LIME_STAINED_QUARTZ_SLAB = registerBlock("lime_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block GREEN_STAINED_QUARTZ_SLAB = registerBlock("green_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block CYAN_STAINED_QUARTZ_SLAB = registerBlock("cyan_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block LIGHT_BLUE_STAINED_QUARTZ_SLAB = registerBlock("light_blue_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block BLUE_STAINED_QUARTZ_SLAB = registerBlock("blue_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block PURPLE_STAINED_QUARTZ_SLAB = registerBlock("purple_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block MAGENTA_STAINED_QUARTZ_SLAB = registerBlock("magenta_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block PINK_STAINED_QUARTZ_SLAB = registerBlock("pink_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));

    public static final Block GREY_STAINED_QUARTZ_STAIRS = registerBlock("grey_stained_quartz_stairs",
            properties -> new StairsBlock(GREY_STAINED_QUARTZ.getDefaultState(), properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block DARK_GREY_STAINED_QUARTZ_STAIRS = registerBlock("dark_grey_stained_quartz_stairs",
            properties -> new StairsBlock(DARK_GREY_STAINED_QUARTZ.getDefaultState(), properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block BLACK_STAINED_QUARTZ_STAIRS = registerBlock("black_stained_quartz_stairs",
            properties -> new StairsBlock(BLACK_STAINED_QUARTZ.getDefaultState(), properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block BROWN_STAINED_QUARTZ_STAIRS = registerBlock("brown_stained_quartz_stairs",
            properties -> new StairsBlock(BROWN_STAINED_QUARTZ.getDefaultState(), properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block RED_STAINED_QUARTZ_STAIRS = registerBlock("red_stained_quartz_stairs",
            properties -> new StairsBlock(RED_STAINED_QUARTZ.getDefaultState(), properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block ORANGE_STAINED_QUARTZ_STAIRS = registerBlock("orange_stained_quartz_stairs",
            properties -> new StairsBlock(ORANGE_STAINED_QUARTZ.getDefaultState(), properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block YELLOW_STAINED_QUARTZ_STAIRS = registerBlock("yellow_stained_quartz_stairs",
            properties -> new StairsBlock(YELLOW_STAINED_QUARTZ.getDefaultState(), properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block LIME_STAINED_QUARTZ_STAIRS = registerBlock("lime_stained_quartz_stairs",
            properties -> new StairsBlock(LIME_STAINED_QUARTZ.getDefaultState(), properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block GREEN_STAINED_QUARTZ_STAIRS = registerBlock("green_stained_quartz_stairs",
            properties -> new StairsBlock(GREEN_STAINED_QUARTZ.getDefaultState(), properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block CYAN_STAINED_QUARTZ_STAIRS = registerBlock("cyan_stained_quartz_stairs",
            properties -> new StairsBlock(CYAN_STAINED_QUARTZ.getDefaultState(), properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block LIGHT_BLUE_STAINED_QUARTZ_STAIRS = registerBlock("light_blue_stained_quartz_stairs",
            properties -> new StairsBlock(LIGHT_BLUE_STAINED_QUARTZ.getDefaultState(), properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block BLUE_STAINED_QUARTZ_STAIRS = registerBlock("blue_stained_quartz_stairs",
            properties -> new StairsBlock(BLUE_STAINED_QUARTZ.getDefaultState(), properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block PURPLE_STAINED_QUARTZ_STAIRS = registerBlock("purple_stained_quartz_stairs",
            properties -> new StairsBlock(PURPLE_STAINED_QUARTZ.getDefaultState(), properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block MAGENTA_STAINED_QUARTZ_STAIRS = registerBlock("magenta_stained_quartz_stairs",
            properties -> new StairsBlock(MAGENTA_STAINED_QUARTZ.getDefaultState(), properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block PINK_STAINED_QUARTZ_STAIRS = registerBlock("pink_stained_quartz_stairs",
            properties -> new StairsBlock(PINK_STAINED_QUARTZ.getDefaultState(), properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));

    public static final Block POWER_PANEL = registerBlock("power_panel",
            properties -> new PowerPanelBlock(properties.nonOpaque().strength(0.6F)));

    public static final Block COORDINATES_PANEL = registerBlock("coordinates_panel",
            properties -> new CoordinatesPanelBlock(properties.nonOpaque().strength(0.6F)));

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TARDIFMod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(TARDIFMod.MOD_ID, name), toRegister);
    }

    private static Block registerBlockWithoutBlockItem(String name, Function<AbstractBlock.Settings, Block> function) {
        return Registry.register(Registries.BLOCK, Identifier.of(TARDIFMod.MOD_ID, name),
                function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TARDIFMod.MOD_ID, name)))));
    }

    private static Block createRoundelBlock(AbstractBlock.Settings settings) {
        return new RoundelBlock(
                settings.luminance(state -> state.get(RoundelBlock.LIGHT))
        );
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TARDIFMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TARDIFMod.MOD_ID, name)))));
    }

    public static void register() {
    }
}
