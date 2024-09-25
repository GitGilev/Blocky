package net.gitgilev.blocky.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gitgilev.blocky.block.ModBlocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool ochrumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OCHRUM);
        ochrumPool.slab(ModBlocks.OCHRUM_SLAB);
        ochrumPool.stairs(ModBlocks.OCHRUM_STAIRS);
        BlockStateModelGenerator.BlockTexturePool crystallite_bricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRYSTALLITE_BRICKS);
        crystallite_bricksPool.slab(ModBlocks.CRYSTALLITE_BRICKS_SLAB);
        crystallite_bricksPool.stairs(ModBlocks.CRYSTALLITE_BRICKS_STAIRS);
        BlockStateModelGenerator.BlockTexturePool crystallite_bricks_crackedPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRYSTALLITE_BRICKS_CRACKED);
        crystallite_bricks_crackedPool.slab(ModBlocks.CRYSTALLITE_BRICKS_CRACKED_SLAB);
        crystallite_bricks_crackedPool.stairs(ModBlocks.CRYSTALLITE_BRICKS_CRACKED_STAIRS);
        BlockStateModelGenerator.BlockTexturePool crystallitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRYSTALLITE);
        crystallitePool.slab(ModBlocks.CRYSTALLITE_SLAB);
        crystallitePool.stairs(ModBlocks.CRYSTALLITE_STAIRS);
        BlockStateModelGenerator.BlockTexturePool amethyst_bricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AMETHYST_BRICKS);
        amethyst_bricksPool.slab(ModBlocks.AMETHYST_BRICKS_SLAB);
        amethyst_bricksPool.stairs(ModBlocks.AMETHYST_BRICKS_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }


}
