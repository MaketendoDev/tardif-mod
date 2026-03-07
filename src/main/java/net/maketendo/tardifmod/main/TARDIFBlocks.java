package net.maketendo.tardifmod.main;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maketendo.tardifmod.TARDIFMod;
import net.maketendo.tardifmod.main.blocks.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class TARDIFBlocks {

    public static final Block ROUNDEL = registerBlock("roundel",
            properties -> new RoundelBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block ROUNDEL_HALF = registerBlock("roundel_half",
            properties -> new RoundelBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));

    public static final Block GRAY_ROUNDEL = registerBlock("gray_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block GRAY_ROUNDEL_HALF = registerBlock("gray_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block DARK_GRAY_ROUNDEL = registerBlock("dark_gray_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block DARK_GRAY_ROUNDEL_HALF = registerBlock("dark_gray_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block BLACK_ROUNDEL = registerBlock("black_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block BLACK_ROUNDEL_HALF = registerBlock("black_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block BROWN_ROUNDEL = registerBlock("brown_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block BROWN_ROUNDEL_HALF = registerBlock("brown_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block RED_ROUNDEL = registerBlock("red_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block RED_ROUNDEL_HALF = registerBlock("red_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block ORANGE_ROUNDEL = registerBlock("orange_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block ORANGE_ROUNDEL_HALF = registerBlock("orange_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block YELLOW_ROUNDEL = registerBlock("yellow_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block YELLOW_ROUNDEL_HALF = registerBlock("yellow_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block LIME_ROUNDEL = registerBlock("lime_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block LIME_ROUNDEL_HALF = registerBlock("lime_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block GREEN_ROUNDEL = registerBlock("green_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block GREEN_ROUNDEL_HALF = registerBlock("green_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block CYAN_ROUNDEL = registerBlock("cyan_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block CYAN_ROUNDEL_HALF = registerBlock("cyan_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block LIGHT_BLUE_ROUNDEL = registerBlock("light_blue_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block LIGHT_BLUE_ROUNDEL_HALF = registerBlock("light_blue_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block BLUE_ROUNDEL = registerBlock("blue_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block BLUE_ROUNDEL_HALF = registerBlock("blue_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block PURPLE_ROUNDEL = registerBlock("purple_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block PURPLE_ROUNDEL_HALF = registerBlock("purple_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block MAGENTA_ROUNDEL = registerBlock("magenta_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block MAGENTA_ROUNDEL_HALF = registerBlock("magenta_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block PINK_ROUNDEL = registerBlock("pink_roundel",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));

    public static final Block PINK_ROUNDEL_HALF = registerBlock("pink_roundel_half",
            props -> createRoundelBlock(props.mapColor(MapColor.COLOR_PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)));


    public static final Block GRAY_STAINED_QUARTZ = registerBlock("gray_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block DARK_GRAY_STAINED_QUARTZ = registerBlock("dark_gray_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block BLACK_STAINED_QUARTZ = registerBlock("black_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block BROWN_STAINED_QUARTZ = registerBlock("brown_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block RED_STAINED_QUARTZ = registerBlock("red_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block ORANGE_STAINED_QUARTZ = registerBlock("orange_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block YELLOW_STAINED_QUARTZ = registerBlock("yellow_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block LIME_STAINED_QUARTZ = registerBlock("lime_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block GREEN_STAINED_QUARTZ = registerBlock("green_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block CYAN_STAINED_QUARTZ = registerBlock("cyan_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block LIGHT_BLUE_STAINED_QUARTZ = registerBlock("light_blue_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block BLUE_STAINED_QUARTZ = registerBlock("blue_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block PURPLE_STAINED_QUARTZ = registerBlock("purple_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block MAGENTA_STAINED_QUARTZ = registerBlock("magenta_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block PINK_STAINED_QUARTZ = registerBlock("pink_stained_quartz",
            properties -> new StainedBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));

    // Kill me.
    public static final Block GRAY_STAINED_QUARTZ_SLAB = registerBlock("gray_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block DARK_GRAY_STAINED_QUARTZ_SLAB = registerBlock("dark_gray_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block BLACK_STAINED_QUARTZ_SLAB = registerBlock("black_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block BROWN_STAINED_QUARTZ_SLAB = registerBlock("brown_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block RED_STAINED_QUARTZ_SLAB = registerBlock("red_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block ORANGE_STAINED_QUARTZ_SLAB = registerBlock("orange_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block YELLOW_STAINED_QUARTZ_SLAB = registerBlock("yellow_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block LIME_STAINED_QUARTZ_SLAB = registerBlock("lime_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block GREEN_STAINED_QUARTZ_SLAB = registerBlock("green_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block CYAN_STAINED_QUARTZ_SLAB = registerBlock("cyan_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block LIGHT_BLUE_STAINED_QUARTZ_SLAB = registerBlock("light_blue_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block BLUE_STAINED_QUARTZ_SLAB = registerBlock("blue_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block PURPLE_STAINED_QUARTZ_SLAB = registerBlock("purple_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block MAGENTA_STAINED_QUARTZ_SLAB = registerBlock("magenta_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block PINK_STAINED_QUARTZ_SLAB = registerBlock("pink_stained_quartz_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));

    public static final Block GRAY_STAINED_QUARTZ_STAIRS = registerBlock("gray_stained_quartz_stairs",
            properties -> new StairBlock(GRAY_STAINED_QUARTZ.defaultBlockState(), properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block DARK_GRAY_STAINED_QUARTZ_STAIRS = registerBlock("dark_gray_stained_quartz_stairs",
            properties -> new StairBlock(DARK_GRAY_STAINED_QUARTZ.defaultBlockState(), properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block BLACK_STAINED_QUARTZ_STAIRS = registerBlock("black_stained_quartz_stairs",
            properties -> new StairBlock(BLACK_STAINED_QUARTZ.defaultBlockState(), properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block BROWN_STAINED_QUARTZ_STAIRS = registerBlock("brown_stained_quartz_stairs",
            properties -> new StairBlock(BROWN_STAINED_QUARTZ.defaultBlockState(), properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block RED_STAINED_QUARTZ_STAIRS = registerBlock("red_stained_quartz_stairs",
            properties -> new StairBlock(RED_STAINED_QUARTZ.defaultBlockState(), properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block ORANGE_STAINED_QUARTZ_STAIRS = registerBlock("orange_stained_quartz_stairs",
            properties -> new StairBlock(ORANGE_STAINED_QUARTZ.defaultBlockState(), properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block YELLOW_STAINED_QUARTZ_STAIRS = registerBlock("yellow_stained_quartz_stairs",
            properties -> new StairBlock(YELLOW_STAINED_QUARTZ.defaultBlockState(), properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block LIME_STAINED_QUARTZ_STAIRS = registerBlock("lime_stained_quartz_stairs",
            properties -> new StairBlock(LIME_STAINED_QUARTZ.defaultBlockState(), properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block GREEN_STAINED_QUARTZ_STAIRS = registerBlock("green_stained_quartz_stairs",
            properties -> new StairBlock(GREEN_STAINED_QUARTZ.defaultBlockState(), properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block CYAN_STAINED_QUARTZ_STAIRS = registerBlock("cyan_stained_quartz_stairs",
            properties -> new StairBlock(CYAN_STAINED_QUARTZ.defaultBlockState(), properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block LIGHT_BLUE_STAINED_QUARTZ_STAIRS = registerBlock("light_blue_stained_quartz_stairs",
            properties -> new StairBlock(LIGHT_BLUE_STAINED_QUARTZ.defaultBlockState(), properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block BLUE_STAINED_QUARTZ_STAIRS = registerBlock("blue_stained_quartz_stairs",
            properties -> new StairBlock(BLUE_STAINED_QUARTZ.defaultBlockState(), properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block PURPLE_STAINED_QUARTZ_STAIRS = registerBlock("purple_stained_quartz_stairs",
            properties -> new StairBlock(PURPLE_STAINED_QUARTZ.defaultBlockState(), properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block MAGENTA_STAINED_QUARTZ_STAIRS = registerBlock("magenta_stained_quartz_stairs",
            properties -> new StairBlock(MAGENTA_STAINED_QUARTZ.defaultBlockState(), properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block PINK_STAINED_QUARTZ_STAIRS = registerBlock("pink_stained_quartz_stairs",
            properties -> new StairBlock(PINK_STAINED_QUARTZ.defaultBlockState(), properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));

    public static final Block CRYSTALLINE_BLOCK = registerBlock("crystalline_block",
            properties -> new Block(properties.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F).hasPostProcess(Blocks::always).emissiveRendering(Blocks::always).lightLevel((blockStatex) -> 10)));
    public static final Block CRYSTALLINE_SLAB = registerBlock("crystalline_slab",
            properties -> new SlabBlock(properties.noOcclusion().strength(0.6F).hasPostProcess(Blocks::always).emissiveRendering(Blocks::always).lightLevel((blockStatex) -> 10)));
    public static final Block CRYSTALLINE_STAIR = registerBlock("crystalline_stair",
            properties -> new StairBlock(CRYSTALLINE_BLOCK.defaultBlockState(), properties.noOcclusion().strength(0.6F).hasPostProcess(Blocks::always).emissiveRendering(Blocks::always).lightLevel((blockStatex) -> 10)));

    public static final Block TARDIS_CONSOLE_BLOCK = registerBlock("tardis_console_block",
            properties -> new TardisConsoleBlock(properties.noOcclusion().strength(0.6F)));
    public static final Block TARDIS_MONITOR = registerBlock("tardis_monitor",
            properties -> new Block(properties.noOcclusion().strength(0.6F)));
    public static final Block INTERIOR_DOOR_GENERATOR_BLOCK = registerDevBlock("interior_door_generator_block",
            properties -> new InteriorDoorGenBlock(properties.noOcclusion().strength(0.6F)));
    public static final Block TARDIS_LIGHT_BLOCK = registerDevBlock(
            "tardis_light_block",
            properties -> new TardisLightBlock(
                    properties
                            .replaceable()
                            .strength(-1.0F, 3600000.8F)
                            .mapColor(createMapColorFromWaterloggedBlockState(MapColor.NONE))
                            .noLootTable()
                            .noOcclusion()
                            .lightLevel(TardisLightBlock.STATE_TO_LUMINANCE)
            )
    );


    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, name), toRegister);
    }

    private static Block registerDevBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, name))));
        registerEpicItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, name), toRegister);
    }

    private static Block registerBlockWithoutBlockItem(String name, Function<BlockBehaviour.Properties, Block> function) {
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, name),
                function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, name)))));
    }

    private static Block createRoundelBlock(BlockBehaviour.Properties settings) {
        return new RoundelBlock(
                settings.lightLevel(state -> state.getValue(RoundelBlock.LIGHT))
        );
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, name)))));
    }

    private static void registerEpicItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().rarity(Rarity.EPIC)
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TARDIFMod.MOD_ID, name)))));
    }

    private static Function<BlockState, MapColor> createMapColorFromWaterloggedBlockState(MapColor mapColor) {
        return (state) -> (Boolean)state.getValue(BlockStateProperties.WATERLOGGED) ? MapColor.WATER : mapColor;
    }

    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.OP_BLOCKS).register(entries -> {
            entries.accept(INTERIOR_DOOR_GENERATOR_BLOCK);
            entries.accept(TARDIS_LIGHT_BLOCK);
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(entries -> {
            entries.accept(TARDIFBlocks.CRYSTALLINE_BLOCK);
            entries.accept(TARDIFBlocks.CRYSTALLINE_SLAB);
            entries.accept(TARDIFBlocks.CRYSTALLINE_STAIR);
        });
    }
}
