package net.gitgilev.blocky.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.gitgilev.blocky.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.OCHRUM_SLAB);
        addDrop(ModBlocks.OCHRUM_STAIRS);
        addDrop(ModBlocks.CRYSTALLITE_STAIRS);
        addDrop(ModBlocks.CRYSTALLITE_SLAB);
        addDrop(ModBlocks.CRYSTALLITE_BRICKS_SLAB);
        addDrop(ModBlocks.CRYSTALLITE_BRICKS_STAIRS);
        addDrop(ModBlocks.CRYSTALLITE_BRICKS_CRACKED_STAIRS);
        addDrop(ModBlocks.CRYSTALLITE_BRICKS_CRACKED_SLAB);
        addDrop(ModBlocks.AMETHYST_BRICKS_SLAB);
        addDrop(ModBlocks.AMETHYST_BRICKS_STAIRS);
        addDrop(ModBlocks.AMETHYST_BRICKS);
        addDrop(ModBlocks.AMETHYST_CRYSTALLITE);
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
