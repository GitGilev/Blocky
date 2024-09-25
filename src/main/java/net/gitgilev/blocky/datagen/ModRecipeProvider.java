package net.gitgilev.blocky.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gitgilev.blocky.Blocky;
import net.gitgilev.blocky.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> STONECUTTING = List.of(ModBlocks.OCHRUM,
                ModBlocks.CRYSTALLITE,
                ModBlocks.CHISELED_CRYSTALLITE,
                ModBlocks.CRYSTALLITE_BRICKS,
                ModBlocks.CRYSTALLITE_BRICKS_CRACKED,
                ModBlocks.CRYSTALLITE_WALL,
                ModBlocks.CRYSTALLITE_TILES,
                ModBlocks.CRYSTALLITE_PILLAR,
                ModBlocks.OCHRUM_SLAB,
                ModBlocks.OCHRUM_STAIRS,
                ModBlocks.CRYSTALLITE_SLAB,
                ModBlocks.CRYSTALLITE_STAIRS,
                ModBlocks.CRYSTALLITE_BRICKS_SLAB,
                ModBlocks.CRYSTALLITE_BRICKS_STAIRS,
                ModBlocks.CRYSTALLITE_BRICKS_CRACKED_SLAB,
                ModBlocks.CRYSTALLITE_BRICKS_CRACKED_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHISELED_CRYSTALLITE, ModBlocks.CRYSTALLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRYSTALLITE, ModBlocks.OCHRUM);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRYSTALLITE_BRICKS, ModBlocks.CRYSTALLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRYSTALLITE_BRICKS_CRACKED, ModBlocks.CRYSTALLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRYSTALLITE_WALL, ModBlocks.CRYSTALLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRYSTALLITE_PILLAR, ModBlocks.CRYSTALLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.OCHRUM_SLAB, ModBlocks.OCHRUM,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.OCHRUM_STAIRS, ModBlocks.OCHRUM);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRYSTALLITE_SLAB, ModBlocks.CRYSTALLITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRYSTALLITE_STAIRS, ModBlocks.CRYSTALLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRYSTALLITE_BRICKS_SLAB, ModBlocks.CRYSTALLITE_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRYSTALLITE_BRICKS_STAIRS, ModBlocks.CRYSTALLITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRYSTALLITE_BRICKS_CRACKED_STAIRS, ModBlocks.CRYSTALLITE_BRICKS_CRACKED);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRYSTALLITE_BRICKS_CRACKED_SLAB, ModBlocks.CRYSTALLITE_BRICKS_CRACKED,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.AMETHYST_BRICKS_SLAB, ModBlocks.AMETHYST_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.AMETHYST_BRICKS_STAIRS, ModBlocks.AMETHYST_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.AMETHYST_BRICKS, Blocks.AMETHYST_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AMETHYST_BRICKS_SLAB, 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("RRR")
                .input('R', ModBlocks.AMETHYST_BRICKS)

                .criterion(hasItem(ModBlocks.AMETHYST_BRICKS), conditionsFromItem(ModBlocks.AMETHYST_BRICKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AMETHYST_BRICKS_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.AMETHYST_BRICKS)

                .criterion(hasItem(ModBlocks.AMETHYST_BRICKS), conditionsFromItem(ModBlocks.AMETHYST_BRICKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.OCHRUM_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.OCHRUM)

                .criterion(hasItem(ModBlocks.OCHRUM), conditionsFromItem(ModBlocks.OCHRUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRYSTALLITE_BRICKS_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.CRYSTALLITE_BRICKS)

                .criterion(hasItem(ModBlocks.CRYSTALLITE_BRICKS), conditionsFromItem(ModBlocks.CRYSTALLITE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRYSTALLITE_BRICKS_CRACKED_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.CRYSTALLITE_BRICKS_CRACKED)

                .criterion(hasItem(ModBlocks.CRYSTALLITE_BRICKS_CRACKED), conditionsFromItem(ModBlocks.CRYSTALLITE_BRICKS_CRACKED))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRYSTALLITE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.CRYSTALLITE)

                .criterion(hasItem(ModBlocks.CRYSTALLITE), conditionsFromItem(ModBlocks.CRYSTALLITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.OCHRUM_SLAB, 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("RRR")
                .input('R', ModBlocks.OCHRUM)

                .criterion(hasItem(ModBlocks.OCHRUM), conditionsFromItem(ModBlocks.OCHRUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRYSTALLITE_BRICKS_SLAB, 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("RRR")
                .input('R', ModBlocks.CRYSTALLITE_BRICKS)

                .criterion(hasItem(ModBlocks.CRYSTALLITE_BRICKS), conditionsFromItem(ModBlocks.CRYSTALLITE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRYSTALLITE_BRICKS_CRACKED_SLAB, 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("RRR")
                .input('R', ModBlocks.CRYSTALLITE_BRICKS_CRACKED)

                .criterion(hasItem(ModBlocks.CRYSTALLITE_BRICKS_CRACKED), conditionsFromItem(ModBlocks.CRYSTALLITE_BRICKS_CRACKED))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRYSTALLITE_SLAB, 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("RRR")
                .input('R', ModBlocks.CRYSTALLITE)

                .criterion(hasItem(ModBlocks.CRYSTALLITE), conditionsFromItem(ModBlocks.CRYSTALLITE))
                .offerTo(exporter);


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRYSTALLITE_TILES, 4)
                .input(ModBlocks.CRYSTALLITE,2)
                .input(Items.GOLD_INGOT,2)
                .criterion(hasItem(ModBlocks.CRYSTALLITE), conditionsFromItem(ModBlocks.CRYSTALLITE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AMETHYST_CRYSTALLITE, 4)
                .input(ModBlocks.CRYSTALLITE,2)
                .input(Blocks.AMETHYST_BLOCK,2)
                .criterion(hasItem(ModBlocks.CRYSTALLITE), conditionsFromItem(ModBlocks.CRYSTALLITE))
                .offerTo(exporter);

    }

}
