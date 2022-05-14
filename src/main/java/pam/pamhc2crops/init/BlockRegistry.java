package pam.pamhc2crops.init;

import javax.annotation.Nullable;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.blocks.BlockPamAridGarden;
import pam.pamhc2crops.blocks.BlockPamCrop;
import pam.pamhc2crops.blocks.BlockPamGarden;

public class BlockRegistry {

	public static Block pamagavecrop;
	public static Block pamamaranthcrop;
	public static Block pamarrowrootcrop;
	public static Block pamartichokecrop;
	public static Block pamasparaguscrop;
	public static Block pambarleycrop;
	public static Block pambeancrop;
	public static Block pambellpeppercrop;
	public static Block pamblackberrycrop;
	public static Block pamblueberrycrop;
	public static Block pambroccolicrop;
	public static Block pambrusselsproutcrop;
	public static Block pamcabbagecrop;
	public static Block pamcactusfruitcrop;
	public static Block pamcandleberrycrop;
	public static Block pamcantaloupecrop;
	public static Block pamcassavacrop;
	public static Block pamcauliflowercrop;
	public static Block pamcelerycrop;
	public static Block pamchickpeacrop;
	public static Block pamchilipeppercrop;
	public static Block pamcoffeebeancrop;
	public static Block pamcorncrop;
	public static Block pamcottoncrop;
	public static Block pamcranberrycrop;
	public static Block pamcucumbercrop;
	public static Block pameggplantcrop;
	public static Block pamelderberrycrop;
	public static Block pamflaxcrop;
	public static Block pamgarliccrop;
	public static Block pamgingercrop;
	public static Block pamgrapecrop;
	public static Block pamgreengrapecrop;
	public static Block pamhuckleberrycrop;
	public static Block pamjicamacrop;
	public static Block pamjuniperberrycrop;
	public static Block pamjutecrop;
	public static Block pamkalecrop;
	public static Block pamkenafcrop;
	public static Block pamkiwicrop;
	public static Block pamkohlrabicrop;
	public static Block pamleekcrop;
	public static Block pamlentilcrop;
	public static Block pamlettucecrop;
	public static Block pammilletcrop;
	public static Block pammulberrycrop;
	public static Block pammustardseedscrop;
	public static Block pamoatscrop;
	public static Block pamokracrop;
	public static Block pamonioncrop;
	public static Block pamparsnipcrop;
	public static Block pampeanutcrop;
	public static Block pampeascrop;
	public static Block pampineapplecrop;
	public static Block pamquinoacrop;
	public static Block pamradishcrop;
	public static Block pamraspberrycrop;
	public static Block pamrhubarbcrop;
	public static Block pamricecrop;
	public static Block pamrutabagacrop;
	public static Block pamryecrop;
	public static Block pamscallioncrop;
	public static Block pamsesameseedscrop;
	public static Block pamsisalcrop;
	public static Block pamsoybeancrop;
	public static Block pamspiceleafcrop;
	public static Block pamspinachcrop;
	public static Block pamstrawberrycrop;
	public static Block pamsweetpotatocrop;
	public static Block pamtarocrop;
	public static Block pamtealeafcrop;
	public static Block pamtomatillocrop;
	public static Block pamtomatocrop;
	public static Block pamturnipcrop;
	public static Block pamwaterchestnutcrop;
	public static Block pamwhitemushroomcrop;
	public static Block pamwintersquashcrop;
	public static Block pamzucchinicrop;

	public static Block aridgarden;
	public static Block frostgarden;
	public static Block tropicalgarden;
	public static Block windygarden;
	public static Block shadedgarden;
	public static Block soggygarden;

	private static Block.Properties crop() {
		return Block.Properties.of(Material.PLANT).noCollission().randomTicks().strength(0).sound(SoundType.CROP);
	}

	private static Block.Properties garden() {
		return Block.Properties.of(Material.PLANT).noCollission().strength(0).sound(SoundType.GRASS);
	}

	public static void registerAll(RegistryEvent.Register<Block> event) {
		if (!event.getName().equals(ForgeRegistries.BLOCKS.getRegistryName()))
			return;

		pamagavecrop = register("pamagavecrop", new BlockPamCrop(crop()));
		pamamaranthcrop = register("pamamaranthcrop", new BlockPamCrop(crop()));
		pamarrowrootcrop = register("pamarrowrootcrop", new BlockPamCrop(crop()));
		pamartichokecrop = register("pamartichokecrop", new BlockPamCrop(crop()));
		pamasparaguscrop = register("pamasparaguscrop", new BlockPamCrop(crop()));
		pambarleycrop = register("pambarleycrop", new BlockPamCrop(crop()));
		pambeancrop = register("pambeancrop", new BlockPamCrop(crop()));
		pambellpeppercrop = register("pambellpeppercrop", new BlockPamCrop(crop()));
		pamblackberrycrop = register("pamblackberrycrop", new BlockPamCrop(crop()));
		pamblueberrycrop = register("pamblueberrycrop", new BlockPamCrop(crop()));
		pambroccolicrop = register("pambroccolicrop", new BlockPamCrop(crop()));
		pambrusselsproutcrop = register("pambrusselsproutcrop", new BlockPamCrop(crop()));
		pamcabbagecrop = register("pamcabbagecrop", new BlockPamCrop(crop()));
		pamcactusfruitcrop = register("pamcactusfruitcrop", new BlockPamCrop(crop()));
		pamcandleberrycrop = register("pamcandleberrycrop", new BlockPamCrop(crop()));
		pamcantaloupecrop = register("pamcantaloupecrop", new BlockPamCrop(crop()));
		pamcassavacrop = register("pamcassavacrop", new BlockPamCrop(crop()));
		pamcauliflowercrop = register("pamcauliflowercrop", new BlockPamCrop(crop()));
		pamcelerycrop = register("pamcelerycrop", new BlockPamCrop(crop()));
		pamchickpeacrop = register("pamchickpeacrop", new BlockPamCrop(crop()));
		pamchilipeppercrop = register("pamchilipeppercrop", new BlockPamCrop(crop()));
		pamcoffeebeancrop = register("pamcoffeebeancrop", new BlockPamCrop(crop()));
		pamcorncrop = register("pamcorncrop", new BlockPamCrop(crop()));
		pamcottoncrop = register("pamcottoncrop", new BlockPamCrop(crop()));
		pamcranberrycrop = register("pamcranberrycrop", new BlockPamCrop(crop()));
		pamcucumbercrop = register("pamcucumbercrop", new BlockPamCrop(crop()));
		pameggplantcrop = register("pameggplantcrop", new BlockPamCrop(crop()));
		pamelderberrycrop = register("pamelderberrycrop", new BlockPamCrop(crop()));
		pamflaxcrop = register("pamflaxcrop", new BlockPamCrop(crop()));
		pamgarliccrop = register("pamgarliccrop", new BlockPamCrop(crop()));
		pamgingercrop = register("pamgingercrop", new BlockPamCrop(crop()));
		pamgrapecrop = register("pamgrapecrop", new BlockPamCrop(crop()));
		pamgreengrapecrop = register("pamgreengrapecrop", new BlockPamCrop(crop()));
		pamhuckleberrycrop = register("pamhuckleberrycrop", new BlockPamCrop(crop()));
		pamjicamacrop = register("pamjicamacrop", new BlockPamCrop(crop()));
		pamjuniperberrycrop = register("pamjuniperberrycrop", new BlockPamCrop(crop()));
		pamjutecrop = register("pamjutecrop", new BlockPamCrop(crop()));
		pamkalecrop = register("pamkalecrop", new BlockPamCrop(crop()));
		pamkenafcrop = register("pamkenafcrop", new BlockPamCrop(crop()));
		pamkiwicrop = register("pamkiwicrop", new BlockPamCrop(crop()));
		pamkohlrabicrop = register("pamkohlrabicrop", new BlockPamCrop(crop()));
		pamleekcrop = register("pamleekcrop", new BlockPamCrop(crop()));
		pamlentilcrop = register("pamlentilcrop", new BlockPamCrop(crop()));
		pamlettucecrop = register("pamlettucecrop", new BlockPamCrop(crop()));
		pammilletcrop = register("pammilletcrop", new BlockPamCrop(crop()));
		pammulberrycrop = register("pammulberrycrop", new BlockPamCrop(crop()));
		pammustardseedscrop = register("pammustardseedscrop", new BlockPamCrop(crop()));
		pamoatscrop = register("pamoatscrop", new BlockPamCrop(crop()));
		pamokracrop = register("pamokracrop", new BlockPamCrop(crop()));
		pamonioncrop = register("pamonioncrop", new BlockPamCrop(crop()));
		pamparsnipcrop = register("pamparsnipcrop", new BlockPamCrop(crop()));
		pampeanutcrop = register("pampeanutcrop", new BlockPamCrop(crop()));
		pampeascrop = register("pampeascrop", new BlockPamCrop(crop()));
		pampineapplecrop = register("pampineapplecrop", new BlockPamCrop(crop()));
		pamquinoacrop = register("pamquinoacrop", new BlockPamCrop(crop()));
		pamradishcrop = register("pamradishcrop", new BlockPamCrop(crop()));
		pamraspberrycrop = register("pamraspberrycrop", new BlockPamCrop(crop()));
		pamrhubarbcrop = register("pamrhubarbcrop", new BlockPamCrop(crop()));
		pamricecrop = register("pamricecrop", new BlockPamCrop(crop()));
		pamrutabagacrop = register("pamrutabagacrop", new BlockPamCrop(crop()));
		pamryecrop = register("pamryecrop", new BlockPamCrop(crop()));
		pamscallioncrop = register("pamscallioncrop", new BlockPamCrop(crop()));
		pamsesameseedscrop = register("pamsesameseedscrop", new BlockPamCrop(crop()));
		pamsisalcrop = register("pamsisalcrop", new BlockPamCrop(crop()));
		pamsoybeancrop = register("pamsoybeancrop", new BlockPamCrop(crop()));
		pamspiceleafcrop = register("pamspiceleafcrop", new BlockPamCrop(crop()));
		pamspinachcrop = register("pamspinachcrop", new BlockPamCrop(crop()));
		pamstrawberrycrop = register("pamstrawberrycrop", new BlockPamCrop(crop()));
		pamsweetpotatocrop = register("pamsweetpotatocrop", new BlockPamCrop(crop()));
		pamtarocrop = register("pamtarocrop", new BlockPamCrop(crop()));
		pamtealeafcrop = register("pamtealeafcrop", new BlockPamCrop(crop()));
		pamtomatillocrop = register("pamtomatillocrop", new BlockPamCrop(crop()));
		pamtomatocrop = register("pamtomatocrop", new BlockPamCrop(crop()));
		pamturnipcrop = register("pamturnipcrop", new BlockPamCrop(crop()));
		pamwaterchestnutcrop = register("pamwaterchestnutcrop", new BlockPamCrop(crop()));
		pamwhitemushroomcrop = register("pamwhitemushroomcrop", new BlockPamCrop(crop()));
		pamwintersquashcrop = register("pamwintersquashcrop", new BlockPamCrop(crop()));
		pamzucchinicrop = register("pamzucchinicrop", new BlockPamCrop(crop()));

		aridgarden = register("aridgarden", new BlockPamAridGarden(garden()));
		frostgarden = register("frostgarden", new BlockPamGarden(garden()));
		tropicalgarden = register("tropicalgarden", new BlockPamGarden(garden()));
		windygarden = register("windygarden", new BlockPamGarden(garden()));
		shadedgarden = register("shadedgarden", new BlockPamGarden(garden()));
		soggygarden = register("soggygarden", new BlockPamGarden(garden()));
	}

	private static <T extends Block> T register(String name, T block) {
		BlockItem item = new BlockItem(block, new Item.Properties().tab(Pamhc2crops.ITEM_GROUP));
		return register(name, block, item);
	}

	private static <T extends Block> T register(String name, T block, @Nullable BlockItem item) {
		ResourceLocation id = Pamhc2crops.getId(name);
		block.setRegistryName(id);
		ForgeRegistries.BLOCKS.register(block);
		return block;
	}
}