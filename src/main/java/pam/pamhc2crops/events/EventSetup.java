package pam.pamhc2crops.events;

import net.minecraftforge.common.MinecraftForge;

import pam.pamhc2crops.events.harvest.CropHarvest;

public class EventSetup {

	public static void setupEvents() {
		MinecraftForge.EVENT_BUS.register(new TemptationTask());
		MinecraftForge.EVENT_BUS.register(new CropHarvest());
		MinecraftForge.EVENT_BUS.register(new LootHandler());
	}
}