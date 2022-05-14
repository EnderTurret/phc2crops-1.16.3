package pam.pamhc2crops;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

import pam.pamhc2crops.config.Config;
import pam.pamhc2crops.events.EventSetup;
import pam.pamhc2crops.init.BlockRegistry;
import pam.pamhc2crops.init.CompostRegistry;
import pam.pamhc2crops.init.ItemRegistry;
import pam.pamhc2crops.init.WorldGenRegistry;
import pam.pamhc2crops.worldgen.GardenGeneration;

@Mod("pamhc2crops")
public class Pamhc2crops {

	public static final String MOD_ID = "pamhc2crops";
	public static final Logger LOGGER = LogManager.getLogger();

	public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab("pamhc2crops") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemRegistry.barleyitem.get());
		}
	};

	public Pamhc2crops() {
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.CONFIG, "pamhc2crops.toml");
		Config.loadConfig(Config.CONFIG, FMLPaths.CONFIGDIR.get().resolve("pamhc2crops.toml").toString());

		final IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
		modBus.addListener(Pamhc2crops::commonSetup);
		BlockRegistry.REGISTRY.register(modBus);
		ItemRegistry.REGISTRY.register(modBus);

		MinecraftForge.EVENT_BUS.addListener(GardenGeneration::addFeaturesToBiomes);

		DistExecutor.safeRunForDist(() -> SideProxy.Client::new, () -> SideProxy.Server::new);
	}

	private static void commonSetup(FMLCommonSetupEvent event) {
		EventSetup.setupEvents();

		event.enqueueWork(() -> {
			WorldGenRegistry.registerConfiguredFeatures();
			WorldGenRegistry.registerPlacedFeatures();
			CompostRegistry.register();
		});
	}

	@Nonnull
	public static ResourceLocation getId(String path) {
		return new ResourceLocation(MOD_ID, path);
	}
}