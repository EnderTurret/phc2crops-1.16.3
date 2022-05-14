package pam.pamhc2crops.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.items.ItemPamFoodSeed;
import pam.pamhc2crops.items.ItemPamGrain;
import pam.pamhc2crops.items.ItemPamPig;
import pam.pamhc2crops.items.ItemPamRabbit;
import pam.pamhc2crops.items.ItemPamSeed;

public class ItemRegistry {

	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Pamhc2crops.MOD_ID);

	//Garden Item Blocks
	public static final RegistryObject<Item> aridgarden = REGISTRY.register("aridgarden", () -> new BlockItem(BlockRegistry.aridgarden.get(), properties()));
	public static final RegistryObject<Item> frostgarden = REGISTRY.register("frostgarden", () -> new BlockItem(BlockRegistry.frostgarden.get(), properties()));
	public static final RegistryObject<Item> shadedgarden = REGISTRY.register("shadedgarden", () -> new BlockItem(BlockRegistry.shadedgarden.get(), properties()));
	public static final RegistryObject<Item> soggygarden = REGISTRY.register("soggygarden", () -> new BlockItem(BlockRegistry.soggygarden.get(), properties()));
	public static final RegistryObject<Item> tropicalgarden = REGISTRY.register("tropicalgarden", () -> new BlockItem(BlockRegistry.tropicalgarden.get(), properties()));
	public static final RegistryObject<Item> windygarden = REGISTRY.register("windygarden", () -> new BlockItem(BlockRegistry.windygarden.get(), properties()));

	//Grains
	public static final RegistryObject<Item> amaranthitem = REGISTRY.register("amaranthitem", () -> new ItemPamGrain(BlockRegistry.pamamaranthcrop.get(), properties()));
	public static final RegistryObject<Item> barleyitem = REGISTRY.register("barleyitem", () -> new ItemPamGrain(BlockRegistry.pambarleycrop.get(), properties()));
	public static final RegistryObject<Item> beanitem = REGISTRY.register("beanitem", () -> new ItemPamGrain(BlockRegistry.pambeancrop.get(), properties()));
	public static final RegistryObject<Item> chickpeaitem = REGISTRY.register("chickpeaitem", () -> new ItemPamGrain(BlockRegistry.pamchickpeacrop.get(), properties()));
	public static final RegistryObject<Item> cornitem = REGISTRY.register("cornitem", () -> new ItemPamGrain(BlockRegistry.pamcorncrop.get(), properties()));
	public static final RegistryObject<Item> lentilitem = REGISTRY.register("lentilitem", () -> new ItemPamGrain(BlockRegistry.pamlentilcrop.get(), properties()));
	public static final RegistryObject<Item> milletitem = REGISTRY.register("milletitem", () -> new ItemPamGrain(BlockRegistry.pammilletcrop.get(), properties()));
	public static final RegistryObject<Item> oatsitem = REGISTRY.register("oatsitem", () -> new ItemPamGrain(BlockRegistry.pamoatscrop.get(), properties()));
	public static final RegistryObject<Item> quinoaitem = REGISTRY.register("quinoaitem", () -> new ItemPamGrain(BlockRegistry.pamquinoacrop.get(), properties()));
	public static final RegistryObject<Item> riceitem = REGISTRY.register("riceitem", () -> new ItemPamGrain(BlockRegistry.pamricecrop.get(), properties()));
	public static final RegistryObject<Item> ryeitem = REGISTRY.register("ryeitem", () -> new ItemPamGrain(BlockRegistry.pamryecrop.get(), properties()));
	public static final RegistryObject<Item> soybeanitem = REGISTRY.register("soybeanitem", () -> new ItemPamGrain(BlockRegistry.pamsoybeancrop.get(), properties()));

	//Fiber
	public static final RegistryObject<Item> cottonitem = REGISTRY.register("cottonitem", () -> new ItemPamFoodSeed(BlockRegistry.pamcottoncrop.get(), properties()));
	public static final RegistryObject<Item> flaxitem = REGISTRY.register("flaxitem", () -> new ItemPamFoodSeed(BlockRegistry.pamflaxcrop.get(), properties()));
	public static final RegistryObject<Item> kenafitem = REGISTRY.register("kenafitem", () -> new ItemPamFoodSeed(BlockRegistry.pamkenafcrop.get(), properties()));
	public static final RegistryObject<Item> juteitem = REGISTRY.register("juteitem", () -> new ItemPamFoodSeed(BlockRegistry.pamjutecrop.get(), properties()));
	public static final RegistryObject<Item> sisalitem = REGISTRY.register("sisalitem", () -> new ItemPamFoodSeed(BlockRegistry.pamsisalcrop.get(), properties()));

	//Vegetables
	public static final RegistryObject<Item> artichokeitem = REGISTRY.register("artichokeitem", () -> new ItemPamPig(BlockRegistry.pamartichokecrop.get(), properties().food(FoodBuilderRegistry.ARTICHOKEITEM)));
	public static final RegistryObject<Item> asparagusitem = REGISTRY.register("asparagusitem", () -> new ItemPamPig(BlockRegistry.pamasparaguscrop.get(), properties().food(FoodBuilderRegistry.ASPARAGUSITEM)));
	public static final RegistryObject<Item> bellpepperitem = REGISTRY.register("bellpepperitem", () -> new ItemPamPig(BlockRegistry.pambellpeppercrop.get(), properties().food(FoodBuilderRegistry.BELLPEPPERITEM)));
	public static final RegistryObject<Item> broccoliitem = REGISTRY.register("broccoliitem", () -> new ItemPamPig(BlockRegistry.pambroccolicrop.get(), properties().food(FoodBuilderRegistry.BROCCOLIITEM)));
	public static final RegistryObject<Item> brusselsproutitem = REGISTRY.register("brusselsproutitem", () -> new ItemPamPig(BlockRegistry.pambrusselsproutcrop.get(), properties().food(FoodBuilderRegistry.BRUSSELSPROUTITEM)));
	public static final RegistryObject<Item> cabbageitem = REGISTRY.register("cabbageitem", () -> new ItemPamPig(BlockRegistry.pamcabbagecrop.get(), properties().food(FoodBuilderRegistry.CABBAGEITEM)));
	public static final RegistryObject<Item> caulifloweritem = REGISTRY.register("caulifloweritem", () -> new ItemPamPig(BlockRegistry.pamcauliflowercrop.get(), properties().food(FoodBuilderRegistry.CAULIFLOWERITEM)));
	public static final RegistryObject<Item> celeryitem = REGISTRY.register("celeryitem", () -> new ItemPamPig(BlockRegistry.pamcelerycrop.get(), properties().food(FoodBuilderRegistry.CELERYITEM)));
	public static final RegistryObject<Item> chilipepperitem = REGISTRY.register("chilipepperitem", () -> new ItemPamPig(BlockRegistry.pamchilipeppercrop.get(), properties().food(FoodBuilderRegistry.CHILIPEPPERITEM)));
	public static final RegistryObject<Item> cucumberitem = REGISTRY.register("cucumberitem", () -> new ItemPamPig(BlockRegistry.pamcucumbercrop.get(), properties().food(FoodBuilderRegistry.CUCUMBERITEM)));
	public static final RegistryObject<Item> eggplantitem = REGISTRY.register("eggplantitem", () -> new ItemPamPig(BlockRegistry.pameggplantcrop.get(), properties().food(FoodBuilderRegistry.EGGPLANTITEM)));
	public static final RegistryObject<Item> kaleitem = REGISTRY.register("kaleitem", () -> new ItemPamPig(BlockRegistry.pamkalecrop.get(), properties().food(FoodBuilderRegistry.KALEITEM)));
	public static final RegistryObject<Item> lettuceitem = REGISTRY.register("lettuceitem", () -> new ItemPamPig(BlockRegistry.pamlettucecrop.get(), properties().food(FoodBuilderRegistry.LETTUCEITEM)));
	public static final RegistryObject<Item> okraitem = REGISTRY.register("okraitem", () -> new ItemPamPig(BlockRegistry.pamokracrop.get(), properties().food(FoodBuilderRegistry.OKRAITEM)));
	public static final RegistryObject<Item> peasitem = REGISTRY.register("peasitem", () -> new ItemPamPig(BlockRegistry.pampeascrop.get(), properties().food(FoodBuilderRegistry.PEASITEM)));
	public static final RegistryObject<Item> spinachitem = REGISTRY.register("spinachitem", () -> new ItemPamPig(BlockRegistry.pamspinachcrop.get(), properties().food(FoodBuilderRegistry.SPINACHITEM)));
	public static final RegistryObject<Item> tomatilloitem = REGISTRY.register("tomatilloitem", () -> new ItemPamPig(BlockRegistry.pamtomatillocrop.get(), properties().food(FoodBuilderRegistry.TOMATILLOITEM)));
	public static final RegistryObject<Item> tomatoitem = REGISTRY.register("tomatoitem", () -> new ItemPamPig(BlockRegistry.pamtomatocrop.get(), properties().food(FoodBuilderRegistry.TOMATOITEM)));
	public static final RegistryObject<Item> wintersquashitem = REGISTRY.register("wintersquashitem", () -> new ItemPamPig(BlockRegistry.pamwintersquashcrop.get(), properties().food(FoodBuilderRegistry.WINTERSQUASHITEM)));
	public static final RegistryObject<Item> zucchiniitem = REGISTRY.register("zucchiniitem", () -> new ItemPamPig(BlockRegistry.pamzucchinicrop.get(), properties().food(FoodBuilderRegistry.ZUCCHINIITEM)));

	//Root Vegetable
	public static final RegistryObject<Item> arrowrootitem = REGISTRY.register("arrowrootitem", () -> new ItemPamPig(BlockRegistry.pamarrowrootcrop.get(), properties().food(FoodBuilderRegistry.ARROWROOTITEM)));
	public static final RegistryObject<Item> cassavaitem = REGISTRY.register("cassavaitem", () -> new ItemPamPig(BlockRegistry.pamcassavacrop.get(), properties().food(FoodBuilderRegistry.CASSAVAITEM)));
	public static final RegistryObject<Item> garlicitem = REGISTRY.register("garlicitem", () -> new ItemPamPig(BlockRegistry.pamgarliccrop.get(), properties().food(FoodBuilderRegistry.GARLICITEM)));
	public static final RegistryObject<Item> jicamaitem = REGISTRY.register("jicamaitem", () -> new ItemPamPig(BlockRegistry.pamjicamacrop.get(), properties().food(FoodBuilderRegistry.JICAMAITEM)));
	public static final RegistryObject<Item> leekitem = REGISTRY.register("leekitem", () -> new ItemPamPig(BlockRegistry.pamleekcrop.get(), properties().food(FoodBuilderRegistry.LEEKITEM)));
	public static final RegistryObject<Item> kohlrabiitem = REGISTRY.register("kohlrabiitem", () -> new ItemPamPig(BlockRegistry.pamkohlrabicrop.get(), properties().food(FoodBuilderRegistry.KOHLRABIITEM)));
	public static final RegistryObject<Item> onionitem = REGISTRY.register("onionitem", () -> new ItemPamPig(BlockRegistry.pamonioncrop.get(), properties().food(FoodBuilderRegistry.ONIONITEM)));
	public static final RegistryObject<Item> parsnipitem = REGISTRY.register("parsnipitem", () -> new ItemPamPig(BlockRegistry.pamparsnipcrop.get(), properties().food(FoodBuilderRegistry.PARSNIPITEM)));
	public static final RegistryObject<Item> peanutitem = REGISTRY.register("peanutitem", () -> new ItemPamPig(BlockRegistry.pampeanutcrop.get(), properties().food(FoodBuilderRegistry.PEANUTITEM)));
	public static final RegistryObject<Item> radishitem = REGISTRY.register("radishitem", () -> new ItemPamPig(BlockRegistry.pamradishcrop.get(), properties().food(FoodBuilderRegistry.RADISHITEM)));
	public static final RegistryObject<Item> rhubarbitem = REGISTRY.register("rhubarbitem", () -> new ItemPamPig(BlockRegistry.pamrhubarbcrop.get(), properties().food(FoodBuilderRegistry.RHUBARBITEM)));
	public static final RegistryObject<Item> rutabagaitem = REGISTRY.register("rutabagaitem", () -> new ItemPamPig(BlockRegistry.pamrutabagacrop.get(), properties().food(FoodBuilderRegistry.RUTABAGAITEM)));
	public static final RegistryObject<Item> scallionitem = REGISTRY.register("scallionitem", () -> new ItemPamPig(BlockRegistry.pamscallioncrop.get(), properties().food(FoodBuilderRegistry.SCALLIONITEM)));
	public static final RegistryObject<Item> sweetpotatoitem = REGISTRY.register("sweetpotatoitem", () -> new ItemPamPig(BlockRegistry.pamsweetpotatocrop.get(), properties().food(FoodBuilderRegistry.SWEETPOTATOITEM)));
	public static final RegistryObject<Item> taroitem = REGISTRY.register("taroitem", () -> new ItemPamPig(BlockRegistry.pamtarocrop.get(), properties().food(FoodBuilderRegistry.TAROITEM)));
	public static final RegistryObject<Item> turnipitem = REGISTRY.register("turnipitem", () -> new ItemPamPig(BlockRegistry.pamturnipcrop.get(), properties().food(FoodBuilderRegistry.TURNIPITEM)));
	public static final RegistryObject<Item> waterchestnutitem = REGISTRY.register("waterchestnutitem", () -> new ItemPamPig(BlockRegistry.pamwaterchestnutcrop.get(), properties().food(FoodBuilderRegistry.WATERCHESTNUTITEM)));

	//Fruits
	public static final RegistryObject<Item> blackberryitem = REGISTRY.register("blackberryitem", () -> new ItemPamRabbit(BlockRegistry.pamblackberrycrop.get(), properties().food(FoodBuilderRegistry.BLACKBERRYITEM)));
	public static final RegistryObject<Item> blueberryitem = REGISTRY.register("blueberryitem", () -> new ItemPamRabbit(BlockRegistry.pamblueberrycrop.get(), properties().food(FoodBuilderRegistry.BLUEBERRYITEM)));
	public static final RegistryObject<Item> cactusfruititem = REGISTRY.register("cactusfruititem", () -> new ItemPamRabbit(BlockRegistry.pamcactusfruitcrop.get(), properties().food(FoodBuilderRegistry.CACTUSFRUITITEM)));
	public static final RegistryObject<Item> candleberryitem = REGISTRY.register("candleberryitem", () -> new ItemPamRabbit(BlockRegistry.pamcandleberrycrop.get(), properties().food(FoodBuilderRegistry.CANDLEBERRYITEM)));
	public static final RegistryObject<Item> cantaloupeitem = REGISTRY.register("cantaloupeitem", () -> new ItemPamRabbit(BlockRegistry.pamcantaloupecrop.get(), properties().food(FoodBuilderRegistry.CANTALOUPEITEM)));
	public static final RegistryObject<Item> cranberryitem = REGISTRY.register("cranberryitem", () -> new ItemPamRabbit(BlockRegistry.pamcranberrycrop.get(), properties().food(FoodBuilderRegistry.CRANBERRYITEM)));
	public static final RegistryObject<Item> elderberryitem = REGISTRY.register("elderberryitem", () -> new ItemPamRabbit(BlockRegistry.pamelderberrycrop.get(), properties().food(FoodBuilderRegistry.ELDERBERRYITEM)));
	public static final RegistryObject<Item> grapeitem = REGISTRY.register("grapeitem", () -> new ItemPamRabbit(BlockRegistry.pamgrapecrop.get(), properties().food(FoodBuilderRegistry.GRAPEITEM)));
	public static final RegistryObject<Item> greengrapeitem = REGISTRY.register("greengrapeitem", () -> new ItemPamRabbit(BlockRegistry.pamgreengrapecrop.get(), properties().food(FoodBuilderRegistry.GREENGRAPEITEM)));
	public static final RegistryObject<Item> huckleberryitem = REGISTRY.register("huckleberryitem", () -> new ItemPamRabbit(BlockRegistry.pamhuckleberrycrop.get(), properties().food(FoodBuilderRegistry.HUCKLEBERRYITEM)));
	public static final RegistryObject<Item> juniperberryitem = REGISTRY.register("juniperberryitem", () -> new ItemPamRabbit(BlockRegistry.pamjuniperberrycrop.get(), properties().food(FoodBuilderRegistry.JUNIPERBERRYITEM)));
	public static final RegistryObject<Item> kiwiitem = REGISTRY.register("kiwiitem", () -> new ItemPamRabbit(BlockRegistry.pamkiwicrop.get(), properties().food(FoodBuilderRegistry.KIWIITEM)));
	public static final RegistryObject<Item> mulberryitem = REGISTRY.register("mulberryitem", () -> new ItemPamRabbit(BlockRegistry.pammulberrycrop.get(), properties().food(FoodBuilderRegistry.MULBERRYITEM)));
	public static final RegistryObject<Item> pineappleitem = REGISTRY.register("pineappleitem", () -> new ItemPamRabbit(BlockRegistry.pampineapplecrop.get(), properties().food(FoodBuilderRegistry.PINEAPPLEITEM)));
	public static final RegistryObject<Item> raspberryitem = REGISTRY.register("raspberryitem", () -> new ItemPamRabbit(BlockRegistry.pamraspberrycrop.get(), properties().food(FoodBuilderRegistry.RASPBERRYITEM)));
	public static final RegistryObject<Item> strawberryitem = REGISTRY.register("strawberryitem", () -> new ItemPamRabbit(BlockRegistry.pamstrawberrycrop.get(), properties().food(FoodBuilderRegistry.STRAWBERRYITEM)));

	//Drink
	public static final RegistryObject<Item> coffeebeanitem = REGISTRY.register("coffeebeanitem", () -> new ItemPamFoodSeed(BlockRegistry.pamcoffeebeancrop.get(), properties()));
	public static final RegistryObject<Item> tealeafitem = REGISTRY.register("tealeafitem", () -> new ItemPamFoodSeed(BlockRegistry.pamtealeafcrop.get(), properties()));

	//Sugar
	public static final RegistryObject<Item> agaveitem = REGISTRY.register("agaveitem", () -> new ItemPamFoodSeed(BlockRegistry.pamagavecrop.get(), properties()));

	//Mushroom
	public static final RegistryObject<Item> whitemushroomitem = REGISTRY.register("whitemushroomitem", () -> new ItemPamFoodSeed(BlockRegistry.pamwhitemushroomcrop.get(), properties().food(FoodBuilderRegistry.WHITEMUSHROOMITEM)));

	//Spice
	public static final RegistryObject<Item> gingeritem = REGISTRY.register("gingeritem", () -> new ItemPamFoodSeed(BlockRegistry.pamgingercrop.get(), properties()));
	public static final RegistryObject<Item> mustardseedsitem = REGISTRY.register("mustardseedsitem", () -> new ItemPamGrain(BlockRegistry.pammustardseedscrop.get(), properties()));
	public static final RegistryObject<Item> sesameseedsitem = REGISTRY.register("sesameseedsitem", () -> new ItemPamFoodSeed(BlockRegistry.pamsesameseedscrop.get(), properties()));
	public static final RegistryObject<Item> spiceleafitem = REGISTRY.register("spiceleafitem", () -> new ItemPamRabbit(BlockRegistry.pamspiceleafcrop.get(), properties().food(FoodBuilderRegistry.SPICELEAF)));

	// TODO: Is this leftover from The Spice Purge?
	//public static final RegistryObject<Item> curryleafitem = REGISTRY.register("curryleafitem", () -> new ItemPamFoodSeed(BlockRegistry.pamcurryleafcrop.get(), properties()));
	//public static final RegistryObject<Item> curryleafseeditem = REGISTRY.register("curryleafseeditem", () -> new ItemPamSeed(BlockRegistry.pamcurryleafcrop.get(), properties()));

	public static final RegistryObject<Item> bakedarrowrootitem = REGISTRY.register("bakedarrowrootitem", () -> new Item(properties().food(FoodBuilderRegistry.BAKEDARROWROOTITEM)));
	public static final RegistryObject<Item> bakedcassavaitem = REGISTRY.register("bakedcassavaitem", () -> new Item(properties().food(FoodBuilderRegistry.BAKEDCASSAVAITEM)));
	public static final RegistryObject<Item> roastedgarlicitem = REGISTRY.register("roastedgarlicitem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDGARLICITEM)));
	public static final RegistryObject<Item> bakedjicamaitem = REGISTRY.register("bakedjicamaitem", () -> new Item(properties().food(FoodBuilderRegistry.BAKEDJICAMAITEM)));
	public static final RegistryObject<Item> roastedleekitem = REGISTRY.register("roastedleekitem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDLEEKITEM)));
	public static final RegistryObject<Item> roastedkohlrabiitem = REGISTRY.register("roastedkohlrabiitem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDKOHLRABIITEM)));
	public static final RegistryObject<Item> roastedonionitem = REGISTRY.register("roastedonionitem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDONIONITEM)));
	public static final RegistryObject<Item> bakedparsnipitem = REGISTRY.register("bakedparsnipitem", () -> new Item(properties().food(FoodBuilderRegistry.BAKEDPARSNIPITEM)));
	public static final RegistryObject<Item> roastedpeanutitem = REGISTRY.register("roastedpeanutitem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDPEANUTITEM)));
	public static final RegistryObject<Item> roastedradishitem = REGISTRY.register("roastedradishitem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDRADISHITEM)));
	public static final RegistryObject<Item> roastedrhubarbitem = REGISTRY.register("roastedrhubarbitem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDRHUBARBITEM)));
	public static final RegistryObject<Item> bakedrutabagaitem = REGISTRY.register("bakedrutabagaitem", () -> new Item(properties().food(FoodBuilderRegistry.BAKEDRUTABAGAITEM)));
	public static final RegistryObject<Item> roastedscallionitem = REGISTRY.register("roastedscallionitem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDSCALLIONITEM)));
	public static final RegistryObject<Item> bakedsweetpotatoitem = REGISTRY.register("bakedsweetpotatoitem", () -> new Item(properties().food(FoodBuilderRegistry.BAKEDSWEETPOTATOITEM)));
	public static final RegistryObject<Item> bakedtaroitem = REGISTRY.register("bakedtaroitem", () -> new Item(properties().food(FoodBuilderRegistry.BAKEDTAROITEM)));
	public static final RegistryObject<Item> bakedturnipitem = REGISTRY.register("bakedturnipitem", () -> new Item(properties().food(FoodBuilderRegistry.BAKEDTURNIPITEM)));
	public static final RegistryObject<Item> bakedwaterchestnutitem = REGISTRY.register("bakedwaterchestnutitem", () -> new Item(properties().food(FoodBuilderRegistry.BAKEDWATERCHESTNUTITEM)));
	public static final RegistryObject<Item> roastedmushroomitem = REGISTRY.register("roastedmushroomitem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDMUSHROOMITEM)));
	public static final RegistryObject<Item> hotteaitem = REGISTRY.register("hotteaitem", () -> new Item(properties().food(FoodBuilderRegistry.HOTTEAITEM)));
	public static final RegistryObject<Item> hotcoffeeitem = REGISTRY.register("hotcoffeeitem", () -> new Item(properties().food(FoodBuilderRegistry.HOTCOFFEEITEM)));


	public static final RegistryObject<Item> agaveseeditem = REGISTRY.register("agaveseeditem", () -> new ItemPamSeed(BlockRegistry.pamagavecrop.get(), properties()));
	public static final RegistryObject<Item> amaranthseeditem = REGISTRY.register("amaranthseeditem", () -> new ItemPamSeed(BlockRegistry.pamamaranthcrop.get(), properties()));
	public static final RegistryObject<Item> arrowrootseeditem = REGISTRY.register("arrowrootseeditem", () -> new ItemPamSeed(BlockRegistry.pamarrowrootcrop.get(), properties()));
	public static final RegistryObject<Item> artichokeseeditem = REGISTRY.register("artichokeseeditem", () -> new ItemPamSeed(BlockRegistry.pamartichokecrop.get(), properties()));
	public static final RegistryObject<Item> asparagusseeditem = REGISTRY.register("asparagusseeditem", () -> new ItemPamSeed(BlockRegistry.pamasparaguscrop.get(), properties()));
	public static final RegistryObject<Item> barleyseeditem = REGISTRY.register("barleyseeditem", () -> new ItemPamSeed(BlockRegistry.pambarleycrop.get(), properties()));
	public static final RegistryObject<Item> beanseeditem = REGISTRY.register("beanseeditem", () -> new ItemPamSeed(BlockRegistry.pambeancrop.get(), properties()));
	public static final RegistryObject<Item> bellpepperseeditem = REGISTRY.register("bellpepperseeditem", () -> new ItemPamSeed(BlockRegistry.pambellpeppercrop.get(), properties()));
	public static final RegistryObject<Item> blackberryseeditem = REGISTRY.register("blackberryseeditem", () -> new ItemPamSeed(BlockRegistry.pamblackberrycrop.get(), properties()));
	public static final RegistryObject<Item> blueberryseeditem = REGISTRY.register("blueberryseeditem", () -> new ItemPamSeed(BlockRegistry.pamblueberrycrop.get(), properties()));
	public static final RegistryObject<Item> broccoliseeditem = REGISTRY.register("broccoliseeditem", () -> new ItemPamSeed(BlockRegistry.pambroccolicrop.get(), properties()));
	public static final RegistryObject<Item> brusselsproutseeditem = REGISTRY.register("brusselsproutseeditem", () -> new ItemPamSeed(BlockRegistry.pambrusselsproutcrop.get(), properties()));
	public static final RegistryObject<Item> cabbageseeditem = REGISTRY.register("cabbageseeditem", () -> new ItemPamSeed(BlockRegistry.pamcabbagecrop.get(), properties()));
	public static final RegistryObject<Item> cactusfruitseeditem = REGISTRY.register("cactusfruitseeditem", () -> new ItemPamSeed(BlockRegistry.pamcactusfruitcrop.get(), properties()));
	public static final RegistryObject<Item> candleberryseeditem = REGISTRY.register("candleberryseeditem", () -> new ItemPamSeed(BlockRegistry.pamcandleberrycrop.get(), properties()));
	public static final RegistryObject<Item> cantaloupeseeditem = REGISTRY.register("cantaloupeseeditem", () -> new ItemPamSeed(BlockRegistry.pamcantaloupecrop.get(), properties()));
	public static final RegistryObject<Item> cassavaseeditem = REGISTRY.register("cassavaseeditem", () -> new ItemPamSeed(BlockRegistry.pamcassavacrop.get(), properties()));
	public static final RegistryObject<Item> cauliflowerseeditem = REGISTRY.register("cauliflowerseeditem", () -> new ItemPamSeed(BlockRegistry.pamcauliflowercrop.get(), properties()));
	public static final RegistryObject<Item> celeryseeditem = REGISTRY.register("celeryseeditem", () -> new ItemPamSeed(BlockRegistry.pamcelerycrop.get(), properties()));
	public static final RegistryObject<Item> chickpeaseeditem = REGISTRY.register("chickpeaseeditem", () -> new ItemPamSeed(BlockRegistry.pamchickpeacrop.get(), properties()));
	public static final RegistryObject<Item> chilipepperseeditem = REGISTRY.register("chilipepperseeditem", () -> new ItemPamSeed(BlockRegistry.pamchilipeppercrop.get(), properties()));
	public static final RegistryObject<Item> coffeebeanseeditem = REGISTRY.register("coffeebeanseeditem", () -> new ItemPamSeed(BlockRegistry.pamcoffeebeancrop.get(), properties()));
	public static final RegistryObject<Item> cornseeditem = REGISTRY.register("cornseeditem", () -> new ItemPamSeed(BlockRegistry.pamcorncrop.get(), properties()));
	public static final RegistryObject<Item> cottonseeditem = REGISTRY.register("cottonseeditem", () -> new ItemPamSeed(BlockRegistry.pamcottoncrop.get(), properties()));
	public static final RegistryObject<Item> cranberryseeditem = REGISTRY.register("cranberryseeditem", () -> new ItemPamSeed(BlockRegistry.pamcranberrycrop.get(), properties()));
	public static final RegistryObject<Item> cucumberseeditem = REGISTRY.register("cucumberseeditem", () -> new ItemPamSeed(BlockRegistry.pamcucumbercrop.get(), properties()));
	public static final RegistryObject<Item> eggplantseeditem = REGISTRY.register("eggplantseeditem", () -> new ItemPamSeed(BlockRegistry.pameggplantcrop.get(), properties()));
	public static final RegistryObject<Item> elderberryseeditem = REGISTRY.register("elderberryseeditem", () -> new ItemPamSeed(BlockRegistry.pamelderberrycrop.get(), properties()));
	public static final RegistryObject<Item> flaxseeditem = REGISTRY.register("flaxseeditem", () -> new ItemPamSeed(BlockRegistry.pamflaxcrop.get(), properties()));
	public static final RegistryObject<Item> garlicseeditem = REGISTRY.register("garlicseeditem", () -> new ItemPamSeed(BlockRegistry.pamgarliccrop.get(), properties()));
	public static final RegistryObject<Item> gingerseeditem = REGISTRY.register("gingerseeditem", () -> new ItemPamSeed(BlockRegistry.pamgingercrop.get(), properties()));
	public static final RegistryObject<Item> grapeseeditem = REGISTRY.register("grapeseeditem", () -> new ItemPamSeed(BlockRegistry.pamgrapecrop.get(), properties()));
	public static final RegistryObject<Item> greengrapeseeditem = REGISTRY.register("greengrapeseeditem", () -> new ItemPamSeed(BlockRegistry.pamgreengrapecrop.get(), properties()));
	public static final RegistryObject<Item> huckleberryseeditem = REGISTRY.register("huckleberryseeditem", () -> new ItemPamSeed(BlockRegistry.pamhuckleberrycrop.get(), properties()));
	public static final RegistryObject<Item> jicamaseeditem = REGISTRY.register("jicamaseeditem", () -> new ItemPamSeed(BlockRegistry.pamjicamacrop.get(), properties()));
	public static final RegistryObject<Item> juniperberryseeditem = REGISTRY.register("juniperberryseeditem", () -> new ItemPamSeed(BlockRegistry.pamjuniperberrycrop.get(), properties()));
	public static final RegistryObject<Item> juteseeditem = REGISTRY.register("juteseeditem", () -> new ItemPamSeed(BlockRegistry.pamjutecrop.get(), properties()));
	public static final RegistryObject<Item> kaleseeditem = REGISTRY.register("kaleseeditem", () -> new ItemPamSeed(BlockRegistry.pamkalecrop.get(), properties()));
	public static final RegistryObject<Item> kenafseeditem = REGISTRY.register("kenafseeditem", () -> new ItemPamSeed(BlockRegistry.pamkenafcrop.get(), properties()));
	public static final RegistryObject<Item> kiwiseeditem = REGISTRY.register("kiwiseeditem", () -> new ItemPamSeed(BlockRegistry.pamkiwicrop.get(), properties()));
	public static final RegistryObject<Item> kohlrabiseeditem = REGISTRY.register("kohlrabiseeditem", () -> new ItemPamSeed(BlockRegistry.pamkohlrabicrop.get(), properties()));
	public static final RegistryObject<Item> leekseeditem = REGISTRY.register("leekseeditem", () -> new ItemPamSeed(BlockRegistry.pamleekcrop.get(), properties()));
	public static final RegistryObject<Item> lentilseeditem = REGISTRY.register("lentilseeditem", () -> new ItemPamSeed(BlockRegistry.pamlentilcrop.get(), properties()));
	public static final RegistryObject<Item> lettuceseeditem = REGISTRY.register("lettuceseeditem", () -> new ItemPamSeed(BlockRegistry.pamlettucecrop.get(), properties()));
	public static final RegistryObject<Item> milletseeditem = REGISTRY.register("milletseeditem", () -> new ItemPamSeed(BlockRegistry.pammilletcrop.get(), properties()));
	public static final RegistryObject<Item> mulberryseeditem = REGISTRY.register("mulberryseeditem", () -> new ItemPamSeed(BlockRegistry.pammulberrycrop.get(), properties()));
	public static final RegistryObject<Item> mustardseedsseeditem = REGISTRY.register("mustardseedsseeditem", () -> new ItemPamSeed(BlockRegistry.pammustardseedscrop.get(), properties()));
	public static final RegistryObject<Item> oatsseeditem = REGISTRY.register("oatsseeditem", () -> new ItemPamSeed(BlockRegistry.pamoatscrop.get(), properties()));
	public static final RegistryObject<Item> okraseeditem = REGISTRY.register("okraseeditem", () -> new ItemPamSeed(BlockRegistry.pamokracrop.get(), properties()));
	public static final RegistryObject<Item> onionseeditem = REGISTRY.register("onionseeditem", () -> new ItemPamSeed(BlockRegistry.pamonioncrop.get(), properties()));
	public static final RegistryObject<Item> parsnipseeditem = REGISTRY.register("parsnipseeditem", () -> new ItemPamSeed(BlockRegistry.pamparsnipcrop.get(), properties()));
	public static final RegistryObject<Item> peanutseeditem = REGISTRY.register("peanutseeditem", () -> new ItemPamSeed(BlockRegistry.pampeanutcrop.get(), properties()));
	public static final RegistryObject<Item> peasseeditem = REGISTRY.register("peasseeditem", () -> new ItemPamSeed(BlockRegistry.pampeascrop.get(), properties()));
	public static final RegistryObject<Item> pineappleseeditem = REGISTRY.register("pineappleseeditem", () -> new ItemPamSeed(BlockRegistry.pampineapplecrop.get(), properties()));
	public static final RegistryObject<Item> quinoaseeditem = REGISTRY.register("quinoaseeditem", () -> new ItemPamSeed(BlockRegistry.pamquinoacrop.get(), properties()));
	public static final RegistryObject<Item> radishseeditem = REGISTRY.register("radishseeditem", () -> new ItemPamSeed(BlockRegistry.pamradishcrop.get(), properties()));
	public static final RegistryObject<Item> raspberryseeditem = REGISTRY.register("raspberryseeditem", () -> new ItemPamSeed(BlockRegistry.pamraspberrycrop.get(), properties()));
	public static final RegistryObject<Item> rhubarbseeditem = REGISTRY.register("rhubarbseeditem", () -> new ItemPamSeed(BlockRegistry.pamrhubarbcrop.get(), properties()));
	public static final RegistryObject<Item> riceseeditem = REGISTRY.register("riceseeditem", () -> new ItemPamSeed(BlockRegistry.pamricecrop.get(), properties()));
	public static final RegistryObject<Item> rutabagaseeditem = REGISTRY.register("rutabagaseeditem", () -> new ItemPamSeed(BlockRegistry.pamrutabagacrop.get(), properties()));
	public static final RegistryObject<Item> ryeseeditem = REGISTRY.register("ryeseeditem", () -> new ItemPamSeed(BlockRegistry.pamryecrop.get(), properties()));
	public static final RegistryObject<Item> scallionseeditem = REGISTRY.register("scallionseeditem", () -> new ItemPamSeed(BlockRegistry.pamscallioncrop.get(), properties()));
	public static final RegistryObject<Item> sesameseedsseeditem = REGISTRY.register("sesameseedsseeditem", () -> new ItemPamSeed(BlockRegistry.pamsesameseedscrop.get(), properties()));
	public static final RegistryObject<Item> sisalseeditem = REGISTRY.register("sisalseeditem", () -> new ItemPamSeed(BlockRegistry.pamsisalcrop.get(), properties()));
	public static final RegistryObject<Item> soybeanseeditem = REGISTRY.register("soybeanseeditem", () -> new ItemPamSeed(BlockRegistry.pamsoybeancrop.get(), properties()));
	public static final RegistryObject<Item> spiceleafseeditem = REGISTRY.register("spiceleafseeditem", () -> new ItemPamSeed(BlockRegistry.pamspiceleafcrop.get(), properties()));
	public static final RegistryObject<Item> spinachseeditem = REGISTRY.register("spinachseeditem", () -> new ItemPamSeed(BlockRegistry.pamspinachcrop.get(), properties()));
	public static final RegistryObject<Item> strawberryseeditem = REGISTRY.register("strawberryseeditem", () -> new ItemPamSeed(BlockRegistry.pamstrawberrycrop.get(), properties()));
	public static final RegistryObject<Item> sweetpotatoseeditem = REGISTRY.register("sweetpotatoseeditem", () -> new ItemPamSeed(BlockRegistry.pamsweetpotatocrop.get(), properties()));
	public static final RegistryObject<Item> taroseeditem = REGISTRY.register("taroseeditem", () -> new ItemPamSeed(BlockRegistry.pamtarocrop.get(), properties()));
	public static final RegistryObject<Item> tealeafseeditem = REGISTRY.register("tealeafseeditem", () -> new ItemPamSeed(BlockRegistry.pamtealeafcrop.get(), properties()));
	public static final RegistryObject<Item> tomatilloseeditem = REGISTRY.register("tomatilloseeditem", () -> new ItemPamSeed(BlockRegistry.pamtomatillocrop.get(), properties()));
	public static final RegistryObject<Item> tomatoseeditem = REGISTRY.register("tomatoseeditem", () -> new ItemPamSeed(BlockRegistry.pamtomatocrop.get(), properties()));
	public static final RegistryObject<Item> turnipseeditem = REGISTRY.register("turnipseeditem", () -> new ItemPamSeed(BlockRegistry.pamturnipcrop.get(), properties()));
	public static final RegistryObject<Item> waterchestnutseeditem = REGISTRY.register("waterchestnutseeditem", () -> new ItemPamSeed(BlockRegistry.pamwaterchestnutcrop.get(), properties()));
	public static final RegistryObject<Item> whitemushroomseeditem = REGISTRY.register("whitemushroomseeditem", () -> new ItemPamSeed(BlockRegistry.pamwhitemushroomcrop.get(), properties()));
	public static final RegistryObject<Item> wintersquashseeditem = REGISTRY.register("wintersquashseeditem", () -> new ItemPamSeed(BlockRegistry.pamwintersquashcrop.get(), properties()));
	public static final RegistryObject<Item> zucchiniseeditem = REGISTRY.register("zucchiniseeditem", () -> new ItemPamSeed(BlockRegistry.pamzucchinicrop.get(), properties()));

	private static Item.Properties properties() {
		return new Item.Properties().tab(Pamhc2crops.ITEM_GROUP);
	}
}