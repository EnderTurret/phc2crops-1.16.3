package pam.pamhc2crops.init;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import net.minecraft.core.Vec3i;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraftforge.event.RegistryEvent;

import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.config.ClusterConfig;
import pam.pamhc2crops.util.FeatureHolder;

public class WorldGenRegistry {

	private static final List<FeatureHolder<?, ?>> HOLDERS = new ArrayList<>();

	public static final FeatureHolder<?, ?> ARID_GARDEN = garden("arid_garden", BlockRegistry.aridgarden);
	public static final FeatureHolder<?, ?> FROST_GARDEN = garden("frost_garden", BlockRegistry.frostgarden);
	public static final FeatureHolder<?, ?> TROPICAL_GARDEN = garden("tropical_garden", BlockRegistry.tropicalgarden);
	public static final FeatureHolder<?, ?> WINDY_GARDEN = garden("windy_garden", BlockRegistry.windygarden);
	public static final FeatureHolder<?, ?> SHADED_GARDEN = garden("shaded_garden", BlockRegistry.shadedgarden);
	public static final FeatureHolder<?, ?> SOGGY_GARDEN = garden("soggy_garden", BlockRegistry.soggygarden);

	private static FeatureHolder<Feature<RandomPatchConfiguration>, RandomPatchConfiguration> garden(String key, Supplier<Block> block) {
		return holder(key,
				() -> Feature.RANDOM_PATCH,
				() -> gardenConfig(block.get()));
	}

	private static RandomPatchConfiguration gardenConfig(Block block) {
		return new RandomPatchConfiguration(ClusterConfig.garden_cluster_amount.get(), 7, 3,
				PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(block)),
						BlockPredicate.allOf(BlockPredicate.ONLY_IN_AIR_PREDICATE, BlockPredicate.wouldSurvive(block.defaultBlockState(), Vec3i.ZERO))));
	}

	private static <T extends Feature<C>, C extends FeatureConfiguration> FeatureHolder<T, C> holder(String key, Supplier<T> feature, Supplier<C> config) {
		final FeatureHolder<T, C> holder = new FeatureHolder<>(Pamhc2crops.getId(key),
				feature, config,
				() -> List.of(InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
		HOLDERS.add(holder);
		return holder;
	}

	public static void registerConfiguredFeatures() {
		for (FeatureHolder<?, ?> holder : HOLDERS)
			holder.registerConfiguredFeature();
	}

	public static void registerPlacedFeatures() {
		for (FeatureHolder<?, ?> holder : HOLDERS)
			holder.registerPlacedFeature();

		// We don't need them anymore.
		HOLDERS.clear();
	}

}