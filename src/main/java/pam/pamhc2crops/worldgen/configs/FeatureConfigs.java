package pam.pamhc2crops.worldgen.configs;

import net.minecraft.world.level.levelgen.feature.blockplacers.SimpleBlockPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;

import pam.pamhc2crops.config.ClusterConfig;
import pam.pamhc2crops.init.BlockRegistry;

public class FeatureConfigs {

	public static final RandomPatchConfiguration ARID_GARDEN_CONFIG = (new RandomPatchConfiguration.GrassConfigurationBuilder
			(new SimpleStateProvider(BlockRegistry.aridgarden.defaultBlockState()),
					new SimpleBlockPlacer())).tries(ClusterConfig.garden_cluster_amount.get()).noProjection().build();

	public static final RandomPatchConfiguration FROST_GARDEN_CONFIG = (new RandomPatchConfiguration.GrassConfigurationBuilder
			(new SimpleStateProvider(BlockRegistry.frostgarden.defaultBlockState()),
					new SimpleBlockPlacer())).tries(ClusterConfig.garden_cluster_amount.get()).build();

	public static final RandomPatchConfiguration TROPICAL_GARDEN_CONFIG = (new RandomPatchConfiguration.GrassConfigurationBuilder
			(new SimpleStateProvider(BlockRegistry.tropicalgarden.defaultBlockState()),
					new SimpleBlockPlacer())).tries(ClusterConfig.garden_cluster_amount.get()).build();

	public static final RandomPatchConfiguration WINDY_GARDEN_CONFIG = (new RandomPatchConfiguration.GrassConfigurationBuilder
			(new SimpleStateProvider(BlockRegistry.windygarden.defaultBlockState()),
					new SimpleBlockPlacer())).tries(ClusterConfig.garden_cluster_amount.get()).build();

	public static final RandomPatchConfiguration SHADED_GARDEN_CONFIG = (new RandomPatchConfiguration.GrassConfigurationBuilder
			(new SimpleStateProvider(BlockRegistry.shadedgarden.defaultBlockState()),
					new SimpleBlockPlacer())).tries(ClusterConfig.garden_cluster_amount.get()).build();

	public static final RandomPatchConfiguration SOGGY_GARDEN_CONFIG = (new RandomPatchConfiguration.GrassConfigurationBuilder
			(new SimpleStateProvider(BlockRegistry.soggygarden.defaultBlockState()),
					new SimpleBlockPlacer())).tries(ClusterConfig.garden_cluster_amount.get()).build();


}
