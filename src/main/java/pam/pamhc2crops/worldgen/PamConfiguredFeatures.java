package pam.pamhc2crops.worldgen;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.worldgen.configs.FeatureConfigs;

public final class PamConfiguredFeatures {

	public static ConfiguredFeature<?, ?> ARID_GARDEN;
	public static ConfiguredFeature<?, ?> FROST_GARDEN;
	public static ConfiguredFeature<?, ?> SHADED_GARDEN;
	public static ConfiguredFeature<?, ?> SOGGY_GARDEN;
	public static ConfiguredFeature<?, ?> TROPICAL_GARDEN;
	public static ConfiguredFeature<?, ?> WINDY_GARDEN;

	// Done in FMLCommonSetupEvent so the config is ready to go.
	public static void registerConfiguredFeatures(FMLCommonSetupEvent event){

		Registry<ConfiguredFeature<?, ?>> registry = WorldGenRegistries.CONFIGURED_FEATURE;

		ARID_GARDEN = Registry.register(registry, Pamhc2crops.getId("arid_garden"),
				Feature.RANDOM_PATCH.configured(FeatureConfigs.ARID_GARDEN_CONFIG)
				.decorated(Features.Placements.HEIGHTMAP_DOUBLE));

		FROST_GARDEN = Registry.register(registry, Pamhc2crops.getId("frost_garden"),
				Feature.RANDOM_PATCH.configured(FeatureConfigs.FROST_GARDEN_CONFIG)
				.decorated(Features.Placements.HEIGHTMAP_DOUBLE));

		SHADED_GARDEN = Registry.register(registry, Pamhc2crops.getId("shaded_garden"),
				Feature.RANDOM_PATCH.configured(FeatureConfigs.SHADED_GARDEN_CONFIG)
				.decorated(Features.Placements.HEIGHTMAP_DOUBLE));

		SOGGY_GARDEN = Registry.register(registry, Pamhc2crops.getId("soggy_garden"),
				Feature.RANDOM_PATCH.configured(FeatureConfigs.SOGGY_GARDEN_CONFIG)
				.decorated(Features.Placements.HEIGHTMAP_DOUBLE));

		TROPICAL_GARDEN = Registry.register(registry, Pamhc2crops.getId("tropical_garden"),
				Feature.RANDOM_PATCH.configured(FeatureConfigs.TROPICAL_GARDEN_CONFIG)
				.decorated(Features.Placements.HEIGHTMAP_DOUBLE));

		WINDY_GARDEN = Registry.register(registry, Pamhc2crops.getId("windy_garden"),
				Feature.RANDOM_PATCH.configured(FeatureConfigs.WINDY_GARDEN_CONFIG)
				.decorated(Features.Placements.HEIGHTMAP_DOUBLE));
	}
}