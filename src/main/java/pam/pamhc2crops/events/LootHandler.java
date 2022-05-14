package pam.pamhc2crops.events;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootTableReference;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.config.FeatureConfig;

public class LootHandler {

	private static final ResourceLocation grass_drops = new ResourceLocation("minecraft", "blocks/grass");
	private static final ResourceLocation tall_grass_drops = new ResourceLocation("minecraft", "blocks/tall_grass");
	private static final ResourceLocation fern_drops = new ResourceLocation("minecraft", "blocks/fern");

	@SubscribeEvent
	public void lootTableLoad(LootTableLoadEvent event) {
		if (FeatureConfig.grass_drop_seeds.get() && event.getName().equals(grass_drops))
			event.getTable().addPool(LootPool.lootPool()
					.add(LootTableReference.lootTableReference(Pamhc2crops.getId("blocks/grass_drops")))
					.name("sf_grass_drops").build());

		if (FeatureConfig.tallgrass_drop_seeds.get() && event.getName().equals(tall_grass_drops))
			event.getTable().addPool(LootPool.lootPool()
					.add(LootTableReference.lootTableReference(Pamhc2crops.getId("blocks/tall_grass_drops")))
					.name("sf_grass_drops").build());

		if (FeatureConfig.fern_drop_seeds.get() && event.getName().equals(fern_drops))
			event.getTable().addPool(LootPool.lootPool()
					.add(LootTableReference.lootTableReference(Pamhc2crops.getId("blocks/fern_drops")))
					.name("sf_grass_drops").build());
	}
}