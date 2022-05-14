package pam.pamhc2crops.worldgen;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import pam.pamhc2crops.config.EnableConfig;
import pam.pamhc2crops.init.WorldGenRegistry;

public final class GardenGeneration {

	private GardenGeneration() {}

	public static void addFeaturesToBiomes(BiomeLoadingEvent biome) {
		if (biome.getCategory() == Biome.BiomeCategory.DESERT || biome.getCategory() == Biome.BiomeCategory.MESA)
			if (EnableConfig.enable_aridgarden.get())
				addAridGarden(biome);

		if (biome.getCategory() == Biome.BiomeCategory.ICY || biome.getCategory() == Biome.BiomeCategory.EXTREME_HILLS)
			if (EnableConfig.enable_frostgarden.get())
				addFrostGarden(biome);

		if (biome.getCategory() == Biome.BiomeCategory.FOREST)
			if (EnableConfig.enable_shadedgarden.get())
				addShadedGarden(biome);

		if (biome.getCategory() == Biome.BiomeCategory.SWAMP || biome.getCategory() == Biome.BiomeCategory.RIVER)
			if (EnableConfig.enable_soggygarden.get())
				addSoggyGarden(biome);

		if (biome.getCategory() == Biome.BiomeCategory.BEACH || biome.getCategory() == Biome.BiomeCategory.OCEAN)
			if (EnableConfig.enable_tropicalgarden.get())
				addTropicalGarden(biome);

		if (biome.getCategory() == Biome.BiomeCategory.PLAINS || biome.getCategory() == Biome.BiomeCategory.SAVANNA)
			if (EnableConfig.enable_windygarden.get())
				addWindyGarden(biome);
	}

	private static void addAridGarden(BiomeLoadingEvent biome) {
		biome.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.ARID_GARDEN.placedFeatureHolder());
	}

	private static void addFrostGarden(BiomeLoadingEvent biome) {
		biome.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.FROST_GARDEN.placedFeatureHolder());
	}

	private static void addShadedGarden(BiomeLoadingEvent biome) {
		biome.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.SHADED_GARDEN.placedFeatureHolder());
	}

	private static void addSoggyGarden(BiomeLoadingEvent biome) {
		biome.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.SOGGY_GARDEN.placedFeatureHolder());
	}

	private static void addTropicalGarden(BiomeLoadingEvent biome) {
		biome.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.TROPICAL_GARDEN.placedFeatureHolder());
	}

	private static void addWindyGarden(BiomeLoadingEvent biome) {
		biome.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.WINDY_GARDEN.placedFeatureHolder());
	}
}