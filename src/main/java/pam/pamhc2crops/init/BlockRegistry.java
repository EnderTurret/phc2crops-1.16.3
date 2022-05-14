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

	public static void registerAll(RegistryEvent.Register<Block> event) {
		if (!event.getName().equals(ForgeRegistries.BLOCKS.getRegistryName()))
			return;

		pamagavecrop = register("pamagavecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamamaranthcrop = register("pamamaranthcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamarrowrootcrop = register("pamarrowrootcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamartichokecrop = register("pamartichokecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamasparaguscrop = register("pamasparaguscrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pambarleycrop = register("pambarleycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pambeancrop = register("pambeancrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pambellpeppercrop = register("pambellpeppercrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamblackberrycrop = register("pamblackberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamblueberrycrop = register("pamblueberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pambroccolicrop = register("pambroccolicrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pambrusselsproutcrop = register("pambrusselsproutcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamcabbagecrop = register("pamcabbagecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamcactusfruitcrop = register("pamcactusfruitcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamcandleberrycrop = register("pamcandleberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamcantaloupecrop = register("pamcantaloupecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamcassavacrop = register("pamcassavacrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamcauliflowercrop = register("pamcauliflowercrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamcelerycrop = register("pamcelerycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamchickpeacrop = register("pamchickpeacrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamchilipeppercrop = register("pamchilipeppercrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamcoffeebeancrop = register("pamcoffeebeancrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamcorncrop = register("pamcorncrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamcottoncrop = register("pamcottoncrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamcranberrycrop = register("pamcranberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamcucumbercrop = register("pamcucumbercrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pameggplantcrop = register("pameggplantcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamelderberrycrop = register("pamelderberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamflaxcrop = register("pamflaxcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamgarliccrop = register("pamgarliccrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamgingercrop = register("pamgingercrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamgrapecrop = register("pamgrapecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamgreengrapecrop = register("pamgreengrapecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamhuckleberrycrop = register("pamhuckleberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamjicamacrop = register("pamjicamacrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamjuniperberrycrop = register("pamjuniperberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamjutecrop = register("pamjutecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamkalecrop = register("pamkalecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamkenafcrop = register("pamkenafcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamkiwicrop = register("pamkiwicrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamkohlrabicrop = register("pamkohlrabicrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamleekcrop = register("pamleekcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamlentilcrop = register("pamlentilcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamlettucecrop = register("pamlettucecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pammilletcrop = register("pammilletcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pammulberrycrop = register("pammulberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pammustardseedscrop = register("pammustardseedscrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamoatscrop = register("pamoatscrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamokracrop = register("pamokracrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamonioncrop = register("pamonioncrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamparsnipcrop = register("pamparsnipcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pampeanutcrop = register("pampeanutcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pampeascrop = register("pampeascrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pampineapplecrop = register("pampineapplecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamquinoacrop = register("pamquinoacrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamradishcrop = register("pamradishcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamraspberrycrop = register("pamraspberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamrhubarbcrop = register("pamrhubarbcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamricecrop = register("pamricecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamrutabagacrop = register("pamrutabagacrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamryecrop = register("pamryecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamscallioncrop = register("pamscallioncrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamsesameseedscrop = register("pamsesameseedscrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamsisalcrop = register("pamsisalcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamsoybeancrop = register("pamsoybeancrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamspiceleafcrop = register("pamspiceleafcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamspinachcrop = register("pamspinachcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamstrawberrycrop = register("pamstrawberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamsweetpotatocrop = register("pamsweetpotatocrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamtarocrop = register("pamtarocrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamtealeafcrop = register("pamtealeafcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamtomatillocrop = register("pamtomatillocrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamtomatocrop = register("pamtomatocrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamturnipcrop = register("pamturnipcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamwaterchestnutcrop = register("pamwaterchestnutcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamwhitemushroomcrop = register("pamwhitemushroomcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamwintersquashcrop = register("pamwintersquashcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));
		pamzucchinicrop = register("pamzucchinicrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0).sound(SoundType.CROP)));

		aridgarden = register("aridgarden", new BlockPamAridGarden(Block.Properties.of(Material.PLANT)
				.noCollission().strength(0).sound(SoundType.GRASS)));
		frostgarden = register("frostgarden", new BlockPamGarden(Block.Properties.of(Material.PLANT)
				.noCollission().strength(0).sound(SoundType.GRASS)));
		tropicalgarden = register("tropicalgarden", new BlockPamGarden(Block.Properties.of(Material.PLANT)
				.noCollission().strength(0).sound(SoundType.GRASS)));
		windygarden = register("windygarden", new BlockPamGarden(Block.Properties.of(Material.PLANT)
				.noCollission().strength(0).sound(SoundType.GRASS)));
		shadedgarden = register("shadedgarden", new BlockPamGarden(Block.Properties.of(Material.PLANT)
				.noCollission().strength(0).sound(SoundType.GRASS)));
		soggygarden = register("soggygarden", new BlockPamGarden(Block.Properties.of(Material.PLANT)
				.noCollission().strength(0).sound(SoundType.GRASS)));



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