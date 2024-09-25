package net.gitgilev.blocky.block;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gitgilev.blocky.Blocky;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block OCHRUM = registerBlock("ochrum",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CRYSTALLITE = registerBlock("crystallite",
            new Block(AbstractBlock.Settings.create().strength(1.25F, 4.2F)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CHISELED_CRYSTALLITE = registerBlock("chiseled_crystallite",
            new Block(AbstractBlock.Settings.create().strength(1.25F, 4.2F)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CRYSTALLITE_BRICKS = registerBlock("crystallite_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.25F, 4.2F)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block CRYSTALLITE_BRICKS_CRACKED = registerBlock("crystallite_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.25F, 4.2F)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block CRYSTALLITE_WALL = registerBlock("crystallite_wall",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.25F, 4.2F)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block CRYSTALLITE_TILES = registerBlock("crystallite_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.25F, 4.2F)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block AMETHYST_BRICKS = registerBlock("amethyst_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.25F, 4.2F)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block AMETHYST_CRYSTALLITE = registerBlock("amethyst_crystallite",
            new Block(AbstractBlock.Settings.create().strength(1.25F, 4.2F)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTALLITE_PILLAR = registerBlock("crystallite_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.25F, 4.2F)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block CRYSTALLITE_BRICKS_CRACKED_SLAB = registerBlock("crystallite_bricks_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.25F, 4.2F)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block CRYSTALLITE_BRICKS_SLAB = registerBlock("crystallite_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.25F, 4.2F)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block CRYSTALLITE_SLAB = registerBlock("crystallite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.25F, 4.2F)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block OCHRUM_SLAB = registerBlock("ochrum_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.25F, 4.2F)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CRYSTALLITE_BRICKS_CRACKED_STAIRS = registerBlock("crystallite_bricks_cracked_stairs",
            new StairsBlock(ModBlocks.CRYSTALLITE_BRICKS_CRACKED.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block CRYSTALLITE_BRICKS_STAIRS = registerBlock("crystallite_bricks_stairs",
            new StairsBlock(ModBlocks.CRYSTALLITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block CRYSTALLITE_STAIRS = registerBlock("crystallite_stairs",
            new StairsBlock(ModBlocks.CRYSTALLITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block OCHRUM_STAIRS = registerBlock("ochrum_stairs",
            new StairsBlock(ModBlocks.OCHRUM.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block AMETHYST_BRICKS_SLAB = registerBlock("amethyst_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.25F, 4.2F)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block AMETHYST_BRICKS_STAIRS = registerBlock("amethyst_bricks_stairs",
            new StairsBlock(ModBlocks.AMETHYST_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Blocky.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Blocky.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Blocky.LOGGER.info("Registering Mod Blocks for " + Blocky.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.OCHRUM);
            entries.add(ModBlocks.CRYSTALLITE);
            entries.add(ModBlocks.CHISELED_CRYSTALLITE);
            entries.add(ModBlocks.CRYSTALLITE_BRICKS);
            entries.add(ModBlocks.CRYSTALLITE_BRICKS_CRACKED);
            entries.add(ModBlocks.CRYSTALLITE_WALL);
            entries.add(ModBlocks.CRYSTALLITE_TILES);
            entries.add(ModBlocks.CRYSTALLITE_PILLAR);
            entries.add(ModBlocks.OCHRUM_SLAB);
            entries.add(ModBlocks.OCHRUM_STAIRS);
            entries.add(ModBlocks.CRYSTALLITE_SLAB);
            entries.add(ModBlocks.CRYSTALLITE_STAIRS);
            entries.add(ModBlocks.CRYSTALLITE_BRICKS_SLAB);
            entries.add(ModBlocks.CRYSTALLITE_BRICKS_STAIRS);
            entries.add(ModBlocks.CRYSTALLITE_BRICKS_CRACKED_SLAB);
            entries.add(ModBlocks.CRYSTALLITE_BRICKS_CRACKED_STAIRS);
            entries.add(ModBlocks.AMETHYST_BRICKS);
            entries.add(ModBlocks.AMETHYST_CRYSTALLITE);
            entries.add(ModBlocks.AMETHYST_BRICKS_SLAB);
            entries.add(ModBlocks.AMETHYST_BRICKS_STAIRS);
        });
    }
}