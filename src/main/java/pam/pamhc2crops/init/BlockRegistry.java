package pam.pamhc2crops.init;

import javax.annotation.Nullable;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.blocks.BlockPamAridGarden;
import pam.pamhc2crops.blocks.BlockPamCrop;
import pam.pamhc2crops.blocks.BlockPamGarden;

public class BlockRegistry {

	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Pamhc2crops.MOD_ID);

	public static final RegistryObject<Block> pamagavecrop = REGISTRY.register("pamagavecrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamamaranthcrop = REGISTRY.register("pamamaranthcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamarrowrootcrop = REGISTRY.register("pamarrowrootcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamartichokecrop = REGISTRY.register("pamartichokecrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamasparaguscrop = REGISTRY.register("pamasparaguscrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pambarleycrop = REGISTRY.register("pambarleycrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pambeancrop = REGISTRY.register("pambeancrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pambellpeppercrop = REGISTRY.register("pambellpeppercrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamblackberrycrop = REGISTRY.register("pamblackberrycrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamblueberrycrop = REGISTRY.register("pamblueberrycrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pambroccolicrop = REGISTRY.register("pambroccolicrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pambrusselsproutcrop = REGISTRY.register("pambrusselsproutcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamcabbagecrop = REGISTRY.register("pamcabbagecrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamcactusfruitcrop = REGISTRY.register("pamcactusfruitcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamcandleberrycrop = REGISTRY.register("pamcandleberrycrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamcantaloupecrop = REGISTRY.register("pamcantaloupecrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamcassavacrop = REGISTRY.register("pamcassavacrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamcauliflowercrop = REGISTRY.register("pamcauliflowercrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamcelerycrop = REGISTRY.register("pamcelerycrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamchickpeacrop = REGISTRY.register("pamchickpeacrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamchilipeppercrop = REGISTRY.register("pamchilipeppercrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamcoffeebeancrop = REGISTRY.register("pamcoffeebeancrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamcorncrop = REGISTRY.register("pamcorncrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamcottoncrop = REGISTRY.register("pamcottoncrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamcranberrycrop = REGISTRY.register("pamcranberrycrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamcucumbercrop = REGISTRY.register("pamcucumbercrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pameggplantcrop = REGISTRY.register("pameggplantcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamelderberrycrop = REGISTRY.register("pamelderberrycrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamflaxcrop = REGISTRY.register("pamflaxcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamgarliccrop = REGISTRY.register("pamgarliccrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamgingercrop = REGISTRY.register("pamgingercrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamgrapecrop = REGISTRY.register("pamgrapecrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamgreengrapecrop = REGISTRY.register("pamgreengrapecrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamhuckleberrycrop = REGISTRY.register("pamhuckleberrycrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamjicamacrop = REGISTRY.register("pamjicamacrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamjuniperberrycrop = REGISTRY.register("pamjuniperberrycrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamjutecrop = REGISTRY.register("pamjutecrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamkalecrop = REGISTRY.register("pamkalecrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamkenafcrop = REGISTRY.register("pamkenafcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamkiwicrop = REGISTRY.register("pamkiwicrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamkohlrabicrop = REGISTRY.register("pamkohlrabicrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamleekcrop = REGISTRY.register("pamleekcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamlentilcrop = REGISTRY.register("pamlentilcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamlettucecrop = REGISTRY.register("pamlettucecrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pammilletcrop = REGISTRY.register("pammilletcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pammulberrycrop = REGISTRY.register("pammulberrycrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pammustardseedscrop = REGISTRY.register("pammustardseedscrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamoatscrop = REGISTRY.register("pamoatscrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamokracrop = REGISTRY.register("pamokracrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamonioncrop = REGISTRY.register("pamonioncrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamparsnipcrop = REGISTRY.register("pamparsnipcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pampeanutcrop = REGISTRY.register("pampeanutcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pampeascrop = REGISTRY.register("pampeascrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pampineapplecrop = REGISTRY.register("pampineapplecrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamquinoacrop = REGISTRY.register("pamquinoacrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamradishcrop = REGISTRY.register("pamradishcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamraspberrycrop = REGISTRY.register("pamraspberrycrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamrhubarbcrop = REGISTRY.register("pamrhubarbcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamricecrop = REGISTRY.register("pamricecrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamrutabagacrop = REGISTRY.register("pamrutabagacrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamryecrop = REGISTRY.register("pamryecrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamscallioncrop = REGISTRY.register("pamscallioncrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamsesameseedscrop = REGISTRY.register("pamsesameseedscrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamsisalcrop = REGISTRY.register("pamsisalcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamsoybeancrop = REGISTRY.register("pamsoybeancrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamspiceleafcrop = REGISTRY.register("pamspiceleafcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamspinachcrop = REGISTRY.register("pamspinachcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamstrawberrycrop = REGISTRY.register("pamstrawberrycrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamsweetpotatocrop = REGISTRY.register("pamsweetpotatocrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamtarocrop = REGISTRY.register("pamtarocrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamtealeafcrop = REGISTRY.register("pamtealeafcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamtomatillocrop = REGISTRY.register("pamtomatillocrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamtomatocrop = REGISTRY.register("pamtomatocrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamturnipcrop = REGISTRY.register("pamturnipcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamwaterchestnutcrop = REGISTRY.register("pamwaterchestnutcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamwhitemushroomcrop = REGISTRY.register("pamwhitemushroomcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamwintersquashcrop = REGISTRY.register("pamwintersquashcrop", () -> new BlockPamCrop(crop()));
	public static final RegistryObject<Block> pamzucchinicrop = REGISTRY.register("pamzucchinicrop", () -> new BlockPamCrop(crop()));

	public static final RegistryObject<Block> aridgarden = REGISTRY.register("aridgarden", () -> new BlockPamAridGarden(garden()));
	public static final RegistryObject<Block> frostgarden = REGISTRY.register("frostgarden", () -> new BlockPamGarden(garden()));
	public static final RegistryObject<Block> tropicalgarden = REGISTRY.register("tropicalgarden", () -> new BlockPamGarden(garden()));
	public static final RegistryObject<Block> windygarden = REGISTRY.register("windygarden", () -> new BlockPamGarden(garden()));
	public static final RegistryObject<Block> shadedgarden = REGISTRY.register("shadedgarden", () -> new BlockPamGarden(garden()));
	public static final RegistryObject<Block> soggygarden = REGISTRY.register("soggygarden", () -> new BlockPamGarden(garden()));

	private static Block.Properties crop() {
		return Block.Properties.of(Material.PLANT).noCollission().randomTicks().strength(0).sound(SoundType.CROP);
	}

	private static Block.Properties garden() {
		return Block.Properties.of(Material.PLANT).noCollission().strength(0).sound(SoundType.GRASS);
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