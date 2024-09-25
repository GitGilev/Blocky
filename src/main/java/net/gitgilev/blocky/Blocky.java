package net.gitgilev.blocky;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.gitgilev.blocky.block.ModBlocks;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Blocky implements ModInitializer {
	public static final String MOD_ID = "blocky";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final RegistryKey<PlacedFeature> OCHRUM_GEN = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of("blocky","ochrum_custom"));
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, OCHRUM_GEN);
		ModBlocks.registerModBlocks();
		LOGGER.info("Blocky mod is initialized!");
	}
}