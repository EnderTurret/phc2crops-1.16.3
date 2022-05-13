package pam.pamhc2crops.events;

import net.minecraft.loot.LootPool;
import net.minecraft.loot.TableLootEntry;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import pam.pamhc2crops.Pamhc2crops;

public class GrassLootHandler {
	private static ResourceLocation grass_drops = new ResourceLocation("minecraft", "blocks/grass");

	@SubscribeEvent
	public void lootTableLoad(LootTableLoadEvent event) {
		if (event.getName().equals(grass_drops))
			event.getTable().addPool(LootPool.lootPool()
					.add(TableLootEntry.lootTableReference(new ResourceLocation(Pamhc2crops.MOD_ID, "blocks/grass_drops")))
					.name("sf_grass_drops").build());





	}

}
