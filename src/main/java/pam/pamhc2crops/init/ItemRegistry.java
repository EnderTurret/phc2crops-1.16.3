package pam.pamhc2crops.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.items.ItemPamFoodSeed;
import pam.pamhc2crops.items.ItemPamGrain;
import pam.pamhc2crops.items.ItemPamPig;
import pam.pamhc2crops.items.ItemPamRabbit;
import pam.pamhc2crops.items.ItemPamSeed;

public class ItemRegistry {

	public static Item aridgarden;
	public static Item frostgarden;
	public static Item shadedgarden;
	public static Item soggygarden;
	public static Item tropicalgarden;
	public static Item windygarden;

	public static Item agaveitem;
	public static Item amaranthitem;
	public static Item arrowrootitem;
	public static Item artichokeitem;
	public static Item asparagusitem;
	public static Item barleyitem;
	public static Item beanitem;
	public static Item bellpepperitem;
	public static Item blackberryitem;
	public static Item blueberryitem;
	public static Item broccoliitem;
	public static Item brusselsproutitem;
	public static Item cabbageitem;
	public static Item cactusfruititem;
	public static Item candleberryitem;
	public static Item cantaloupeitem;
	public static Item cassavaitem;
	public static Item caulifloweritem;
	public static Item celeryitem;
	public static Item chickpeaitem;
	public static Item chilipepperitem;
	public static Item coffeebeanitem;
	public static Item cornitem;
	public static Item cottonitem;
	public static Item cranberryitem;
	public static Item cucumberitem;
	public static Item curryleafitem;
	public static Item eggplantitem;
	public static Item elderberryitem;
	public static Item flaxitem;
	public static Item garlicitem;
	public static Item gingeritem;
	public static Item grapeitem;
	public static Item greengrapeitem;
	public static Item huckleberryitem;
	public static Item jicamaitem;
	public static Item juniperberryitem;
	public static Item juteitem;
	public static Item kaleitem;
	public static Item kenafitem;
	public static Item kiwiitem;
	public static Item kohlrabiitem;
	public static Item leekitem;
	public static Item lentilitem;
	public static Item lettuceitem;
	public static Item milletitem;
	public static Item mulberryitem;
	public static Item mustardseedsitem;
	public static Item oatsitem;
	public static Item okraitem;
	public static Item onionitem;
	public static Item parsnipitem;
	public static Item peanutitem;
	public static Item peasitem;
	public static Item pineappleitem;
	public static Item quinoaitem;
	public static Item radishitem;
	public static Item raspberryitem;
	public static Item rhubarbitem;
	public static Item riceitem;
	public static Item rutabagaitem;
	public static Item ryeitem;
	public static Item scallionitem;
	public static Item sesameseedsitem;
	public static Item sisalitem;
	public static Item soybeanitem;
	public static Item spiceleafitem;
	public static Item spinachitem;
	public static Item strawberryitem;
	public static Item sweetpotatoitem;
	public static Item taroitem;
	public static Item tealeafitem;
	public static Item tomatilloitem;
	public static Item tomatoitem;
	public static Item turnipitem;
	public static Item waterchestnutitem;
	public static Item whitemushroomitem;
	public static Item wintersquashitem;
	public static Item zucchiniitem;

	public static Item bakedarrowrootitem;
	public static Item bakedcassavaitem;
	public static Item roastedgarlicitem;
	public static Item bakedjicamaitem;
	public static Item roastedleekitem;
	public static Item roastedkohlrabiitem;
	public static Item roastedonionitem;
	public static Item bakedparsnipitem;
	public static Item roastedpeanutitem;
	public static Item roastedradishitem;
	public static Item roastedrhubarbitem;
	public static Item bakedrutabagaitem;
	public static Item roastedscallionitem;
	public static Item bakedsweetpotatoitem;
	public static Item bakedtaroitem;
	public static Item bakedturnipitem;
	public static Item bakedwaterchestnutitem;
	public static Item roastedmushroomitem;
	public static Item hotteaitem;
	public static Item hotcoffeeitem;


	public static Item agaveseeditem;
	public static Item amaranthseeditem;
	public static Item arrowrootseeditem;
	public static Item artichokeseeditem;
	public static Item asparagusseeditem;
	public static Item barleyseeditem;
	public static Item beanseeditem;
	public static Item bellpepperseeditem;
	public static Item blackberryseeditem;
	public static Item blueberryseeditem;
	public static Item broccoliseeditem;
	public static Item brusselsproutseeditem;
	public static Item cabbageseeditem;
	public static Item cactusfruitseeditem;
	public static Item candleberryseeditem;
	public static Item cantaloupeseeditem;
	public static Item cassavaseeditem;
	public static Item cauliflowerseeditem;
	public static Item celeryseeditem;
	public static Item chickpeaseeditem;
	public static Item chilipepperseeditem;
	public static Item coffeebeanseeditem;
	public static Item cornseeditem;
	public static Item cottonseeditem;
	public static Item cranberryseeditem;
	public static Item cucumberseeditem;
	public static Item curryleafseeditem;
	public static Item eggplantseeditem;
	public static Item elderberryseeditem;
	public static Item flaxseeditem;
	public static Item garlicseeditem;
	public static Item gingerseeditem;
	public static Item grapeseeditem;
	public static Item greengrapeseeditem;
	public static Item huckleberryseeditem;
	public static Item jicamaseeditem;
	public static Item juniperberryseeditem;
	public static Item juteseeditem;
	public static Item kaleseeditem;
	public static Item kenafseeditem;
	public static Item kiwiseeditem;
	public static Item kohlrabiseeditem;
	public static Item leekseeditem;
	public static Item lentilseeditem;
	public static Item lettuceseeditem;
	public static Item milletseeditem;
	public static Item mulberryseeditem;
	public static Item mustardseedsseeditem;
	public static Item oatsseeditem;
	public static Item okraseeditem;
	public static Item onionseeditem;
	public static Item parsnipseeditem;
	public static Item peanutseeditem;
	public static Item peasseeditem;
	public static Item pineappleseeditem;
	public static Item quinoaseeditem;
	public static Item radishseeditem;
	public static Item raspberryseeditem;
	public static Item rhubarbseeditem;
	public static Item riceseeditem;
	public static Item rutabagaseeditem;
	public static Item ryeseeditem;
	public static Item scallionseeditem;
	public static Item sesameseedsseeditem;
	public static Item sisalseeditem;
	public static Item soybeanseeditem;
	public static Item spiceleafseeditem;
	public static Item spinachseeditem;
	public static Item strawberryseeditem;
	public static Item sweetpotatoseeditem;
	public static Item taroseeditem;
	public static Item tealeafseeditem;
	public static Item tomatilloseeditem;
	public static Item tomatoseeditem;
	public static Item turnipseeditem;
	public static Item waterchestnutseeditem;
	public static Item whitemushroomseeditem;
	public static Item wintersquashseeditem;
	public static Item zucchiniseeditem;

	private static Item.Properties properties() {
		return new Item.Properties().tab(Pamhc2crops.ITEM_GROUP);
	}

	public static void registerAll(RegistryEvent.Register<Item> event) {
		if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName()))
			return;

		//Garden Item Blocks
		aridgarden = register("aridgarden",new BlockItem(BlockRegistry.aridgarden, properties()));
		frostgarden = register("frostgarden",new BlockItem(BlockRegistry.frostgarden, properties()));
		shadedgarden = register("shadedgarden",new BlockItem(BlockRegistry.shadedgarden, properties()));
		soggygarden = register("soggygarden",new BlockItem(BlockRegistry.soggygarden, properties()));
		tropicalgarden = register("tropicalgarden",new BlockItem(BlockRegistry.tropicalgarden, properties()));
		windygarden = register("windygarden",new BlockItem(BlockRegistry.windygarden, properties()));

		//Grains
		amaranthitem = register("amaranthitem", new ItemPamGrain(BlockRegistry.pamamaranthcrop, properties()));
		barleyitem = register("barleyitem", new ItemPamGrain(BlockRegistry.pambarleycrop, properties()));
		beanitem = register("beanitem", new ItemPamGrain(BlockRegistry.pambeancrop, properties()));
		chickpeaitem = register("chickpeaitem", new ItemPamGrain(BlockRegistry.pamchickpeacrop, properties()));
		cornitem = register("cornitem", new ItemPamGrain(BlockRegistry.pamcorncrop, properties()));
		lentilitem = register("lentilitem", new ItemPamGrain(BlockRegistry.pamlentilcrop, properties()));
		milletitem = register("milletitem", new ItemPamGrain(BlockRegistry.pammilletcrop, properties()));
		oatsitem = register("oatsitem", new ItemPamGrain(BlockRegistry.pamoatscrop, properties()));
		quinoaitem = register("quinoaitem", new ItemPamGrain(BlockRegistry.pamquinoacrop, properties()));
		riceitem = register("riceitem", new ItemPamGrain(BlockRegistry.pamricecrop, properties()));
		ryeitem = register("ryeitem", new ItemPamGrain(BlockRegistry.pamryecrop, properties()));
		soybeanitem = register("soybeanitem", new ItemPamGrain(BlockRegistry.pamsoybeancrop, properties()));

		//Fiber
		cottonitem = register("cottonitem", new ItemPamFoodSeed(BlockRegistry.pamcottoncrop, properties()));
		flaxitem = register("flaxitem", new ItemPamFoodSeed(BlockRegistry.pamflaxcrop, properties()));
		kenafitem = register("kenafitem", new ItemPamFoodSeed(BlockRegistry.pamkenafcrop, properties()));
		juteitem = register("juteitem", new ItemPamFoodSeed(BlockRegistry.pamjutecrop, properties()));
		sisalitem = register("sisalitem", new ItemPamFoodSeed(BlockRegistry.pamsisalcrop, properties()));

		//Vegetables
		artichokeitem = register("artichokeitem", new ItemPamPig(BlockRegistry.pamartichokecrop, properties().food(FoodBuilderRegistry.ARTICHOKEITEM)));
		asparagusitem = register("asparagusitem", new ItemPamPig(BlockRegistry.pamasparaguscrop, properties().food(FoodBuilderRegistry.ASPARAGUSITEM)));
		bellpepperitem = register("bellpepperitem", new ItemPamPig(BlockRegistry.pambellpeppercrop, properties().food(FoodBuilderRegistry.BELLPEPPERITEM)));
		broccoliitem = register("broccoliitem", new ItemPamPig(BlockRegistry.pambroccolicrop, properties().food(FoodBuilderRegistry.BROCCOLIITEM)));
		brusselsproutitem = register("brusselsproutitem", new ItemPamPig(BlockRegistry.pambrusselsproutcrop, properties().food(FoodBuilderRegistry.BRUSSELSPROUTITEM)));
		cabbageitem = register("cabbageitem", new ItemPamPig(BlockRegistry.pamcabbagecrop, properties().food(FoodBuilderRegistry.CABBAGEITEM)));
		caulifloweritem = register("caulifloweritem", new ItemPamPig(BlockRegistry.pamcauliflowercrop, properties().food(FoodBuilderRegistry.CAULIFLOWERITEM)));
		celeryitem = register("celeryitem", new ItemPamPig(BlockRegistry.pamcelerycrop, properties().food(FoodBuilderRegistry.CELERYITEM)));
		chilipepperitem = register("chilipepperitem", new ItemPamPig(BlockRegistry.pamchilipeppercrop, properties().food(FoodBuilderRegistry.CHILIPEPPERITEM)));
		cucumberitem = register("cucumberitem", new ItemPamPig(BlockRegistry.pamcucumbercrop, properties().food(FoodBuilderRegistry.CUCUMBERITEM)));
		eggplantitem = register("eggplantitem", new ItemPamPig(BlockRegistry.pameggplantcrop, properties().food(FoodBuilderRegistry.EGGPLANTITEM)));
		kaleitem = register("kaleitem", new ItemPamPig(BlockRegistry.pamkalecrop, properties().food(FoodBuilderRegistry.KALEITEM)));
		lettuceitem = register("lettuceitem", new ItemPamPig(BlockRegistry.pamlettucecrop, properties().food(FoodBuilderRegistry.LETTUCEITEM)));
		okraitem = register("okraitem", new ItemPamPig(BlockRegistry.pamokracrop, properties().food(FoodBuilderRegistry.OKRAITEM)));
		peasitem = register("peasitem", new ItemPamPig(BlockRegistry.pampeascrop, properties().food(FoodBuilderRegistry.PEASITEM)));
		spinachitem	= register("spinachitem", new ItemPamPig(BlockRegistry.pamspinachcrop, properties().food(FoodBuilderRegistry.SPINACHITEM)));
		tomatilloitem = register("tomatilloitem", new ItemPamPig(BlockRegistry.pamtomatillocrop, properties().food(FoodBuilderRegistry.TOMATILLOITEM)));
		tomatoitem = register("tomatoitem", new ItemPamPig(BlockRegistry.pamtomatocrop, properties().food(FoodBuilderRegistry.TOMATOITEM)));
		wintersquashitem = register("wintersquashitem", new ItemPamPig(BlockRegistry.pamwintersquashcrop, properties().food(FoodBuilderRegistry.WINTERSQUASHITEM)));
		zucchiniitem = register("zucchiniitem", new ItemPamPig(BlockRegistry.pamzucchinicrop, properties().food(FoodBuilderRegistry.ZUCCHINIITEM)));

		//Root Vegetable
		arrowrootitem = register("arrowrootitem", new ItemPamPig(BlockRegistry.pamarrowrootcrop, properties().food(FoodBuilderRegistry.ARROWROOTITEM)));
		cassavaitem = register("cassavaitem", new ItemPamPig(BlockRegistry.pamcassavacrop, properties().food(FoodBuilderRegistry.CASSAVAITEM)));
		garlicitem = register("garlicitem", new ItemPamPig(BlockRegistry.pamgarliccrop, properties().food(FoodBuilderRegistry.GARLICITEM)));
		jicamaitem = register("jicamaitem", new ItemPamPig(BlockRegistry.pamjicamacrop, properties().food(FoodBuilderRegistry.JICAMAITEM)));
		leekitem = register("leekitem", new ItemPamPig(BlockRegistry.pamleekcrop, properties().food(FoodBuilderRegistry.LEEKITEM)));
		kohlrabiitem = register("kohlrabiitem", new ItemPamPig(BlockRegistry.pamkohlrabicrop, properties().food(FoodBuilderRegistry.KOHLRABIITEM)));
		onionitem = register("onionitem", new ItemPamPig(BlockRegistry.pamonioncrop, properties().food(FoodBuilderRegistry.ONIONITEM)));
		parsnipitem = register("parsnipitem", new ItemPamPig(BlockRegistry.pamparsnipcrop, properties().food(FoodBuilderRegistry.PARSNIPITEM)));
		peanutitem = register("peanutitem", new ItemPamPig(BlockRegistry.pampeanutcrop, properties().food(FoodBuilderRegistry.PEANUTITEM)));
		radishitem = register("radishitem", new ItemPamPig(BlockRegistry.pamradishcrop, properties().food(FoodBuilderRegistry.RADISHITEM)));
		rhubarbitem	 = register("rhubarbitem", new ItemPamPig(BlockRegistry.pamrhubarbcrop, properties().food(FoodBuilderRegistry.RHUBARBITEM)));
		rutabagaitem = register("rutabagaitem", new ItemPamPig(BlockRegistry.pamrutabagacrop, properties().food(FoodBuilderRegistry.RUTABAGAITEM)));
		scallionitem = register("scallionitem", new ItemPamPig(BlockRegistry.pamscallioncrop, properties().food(FoodBuilderRegistry.SCALLIONITEM)));
		sweetpotatoitem = register("sweetpotatoitem", new ItemPamPig(BlockRegistry.pamsweetpotatocrop, properties().food(FoodBuilderRegistry.SWEETPOTATOITEM)));
		taroitem = register("taroitem", new ItemPamPig(BlockRegistry.pamtarocrop, properties().food(FoodBuilderRegistry.TAROITEM)));
		turnipitem = register("turnipitem", new ItemPamPig(BlockRegistry.pamturnipcrop, properties().food(FoodBuilderRegistry.TURNIPITEM)));
		waterchestnutitem = register("waterchestnutitem", new ItemPamPig(BlockRegistry.pamwaterchestnutcrop, properties().food(FoodBuilderRegistry.WATERCHESTNUTITEM)));

		//Fruits
		blackberryitem = register("blackberryitem", new ItemPamRabbit(BlockRegistry.pamblackberrycrop, properties().food(FoodBuilderRegistry.BLACKBERRYITEM)));
		blueberryitem = register("blueberryitem", new ItemPamRabbit(BlockRegistry.pamblueberrycrop, properties().food(FoodBuilderRegistry.BLUEBERRYITEM)));
		cactusfruititem = register("cactusfruititem", new ItemPamRabbit(BlockRegistry.pamcactusfruitcrop, properties().food(FoodBuilderRegistry.CACTUSFRUITITEM)));
		candleberryitem = register("candleberryitem", new ItemPamRabbit(BlockRegistry.pamcandleberrycrop, properties().food(FoodBuilderRegistry.CANDLEBERRYITEM)));
		cantaloupeitem = register("cantaloupeitem", new ItemPamRabbit(BlockRegistry.pamcantaloupecrop, properties().food(FoodBuilderRegistry.CANTALOUPEITEM)));
		cranberryitem = register("cranberryitem", new ItemPamRabbit(BlockRegistry.pamcranberrycrop, properties().food(FoodBuilderRegistry.CRANBERRYITEM)));
		elderberryitem = register("elderberryitem", new ItemPamRabbit(BlockRegistry.pamelderberrycrop, properties().food(FoodBuilderRegistry.ELDERBERRYITEM)));
		grapeitem = register("grapeitem", new ItemPamRabbit(BlockRegistry.pamgrapecrop, properties().food(FoodBuilderRegistry.GRAPEITEM)));
		greengrapeitem = register("greengrapeitem", new ItemPamRabbit(BlockRegistry.pamgreengrapecrop, properties().food(FoodBuilderRegistry.GREENGRAPEITEM)));
		huckleberryitem = register("huckleberryitem", new ItemPamRabbit(BlockRegistry.pamhuckleberrycrop, properties().food(FoodBuilderRegistry.HUCKLEBERRYITEM)));
		juniperberryitem = register("juniperberryitem", new ItemPamRabbit(BlockRegistry.pamjuniperberrycrop, properties().food(FoodBuilderRegistry.JUNIPERBERRYITEM)));
		kiwiitem = register("kiwiitem", new ItemPamRabbit(BlockRegistry.pamkiwicrop, properties().food(FoodBuilderRegistry.KIWIITEM)));
		mulberryitem = register("mulberryitem", new ItemPamRabbit(BlockRegistry.pammulberrycrop, properties().food(FoodBuilderRegistry.MULBERRYITEM)));
		pineappleitem = register("pineappleitem", new ItemPamRabbit(BlockRegistry.pampineapplecrop, properties().food(FoodBuilderRegistry.PINEAPPLEITEM)));
		raspberryitem = register("raspberryitem", new ItemPamRabbit(BlockRegistry.pamraspberrycrop, properties().food(FoodBuilderRegistry.RASPBERRYITEM)));
		strawberryitem = register("strawberryitem", new ItemPamRabbit(BlockRegistry.pamstrawberrycrop, properties().food(FoodBuilderRegistry.STRAWBERRYITEM)));

		//Misc

		//Drink
		coffeebeanitem = register("coffeebeanitem", new ItemPamFoodSeed(BlockRegistry.pamcoffeebeancrop, properties()));
		tealeafitem = register("tealeafitem", new ItemPamFoodSeed(BlockRegistry.pamtealeafcrop, properties()));
		//Sugar
		agaveitem = register("agaveitem", new ItemPamFoodSeed(BlockRegistry.pamagavecrop, properties()));
		//Mushroom
		whitemushroomitem = register("whitemushroomitem", new ItemPamFoodSeed(BlockRegistry.pamwhitemushroomcrop, properties().food(FoodBuilderRegistry.WHITEMUSHROOMITEM)));//EDIBLE
		//Spice
		gingeritem = register("gingeritem", new ItemPamFoodSeed(BlockRegistry.pamgingercrop, properties()));
		sesameseedsitem = register("sesameseedsitem", new ItemPamFoodSeed(BlockRegistry.pamsesameseedscrop, properties()));
		spiceleafitem = register("spiceleafitem", new ItemPamRabbit(BlockRegistry.pamspiceleafcrop, properties().food(FoodBuilderRegistry.SPICELEAF)));//EDIBLE
		mustardseedsitem = register("mustardseedsitem", new ItemPamGrain(BlockRegistry.pammustardseedscrop, properties()));

		//Foods
		bakedarrowrootitem = register("bakedarrowrootitem", new Item(properties().food(FoodBuilderRegistry.BAKEDARROWROOTITEM)));
		bakedcassavaitem = register("bakedcassavaitem", new Item(properties().food(FoodBuilderRegistry.BAKEDCASSAVAITEM)));
		roastedgarlicitem = register("roastedgarlicitem", new Item(properties().food(FoodBuilderRegistry.ROASTEDGARLICITEM)));
		bakedjicamaitem = register("bakedjicamaitem", new Item(properties().food(FoodBuilderRegistry.BAKEDJICAMAITEM)));
		roastedleekitem = register("roastedleekitem", new Item(properties().food(FoodBuilderRegistry.ROASTEDLEEKITEM)));
		roastedkohlrabiitem = register("roastedkohlrabiitem", new Item(properties().food(FoodBuilderRegistry.ROASTEDKOHLRABIITEM)));
		roastedonionitem = register("roastedonionitem", new Item(properties().food(FoodBuilderRegistry.ROASTEDONIONITEM)));
		bakedparsnipitem = register("bakedparsnipitem", new Item(properties().food(FoodBuilderRegistry.BAKEDPARSNIPITEM)));
		roastedpeanutitem = register("roastedpeanutitem", new Item(properties().food(FoodBuilderRegistry.ROASTEDPEANUTITEM)));
		roastedradishitem = register("roastedradishitem", new Item(properties().food(FoodBuilderRegistry.ROASTEDRADISHITEM)));
		roastedrhubarbitem = register("roastedrhubarbitem", new Item(properties().food(FoodBuilderRegistry.ROASTEDRHUBARBITEM)));
		bakedrutabagaitem = register("bakedrutabagaitem", new Item(properties().food(FoodBuilderRegistry.BAKEDRUTABAGAITEM)));
		roastedscallionitem = register("roastedscallionitem", new Item(properties().food(FoodBuilderRegistry.ROASTEDSCALLIONITEM)));
		bakedsweetpotatoitem = register("bakedsweetpotatoitem", new Item(properties().food(FoodBuilderRegistry.BAKEDSWEETPOTATOITEM)));
		bakedtaroitem = register("bakedtaroitem", new Item(properties().food(FoodBuilderRegistry.BAKEDTAROITEM)));
		bakedturnipitem = register("bakedturnipitem", new Item(properties().food(FoodBuilderRegistry.BAKEDTURNIPITEM)));
		bakedwaterchestnutitem = register("bakedwaterchestnutitem", new Item(properties().food(FoodBuilderRegistry.BAKEDWATERCHESTNUTITEM)));
		roastedmushroomitem = register("roastedmushroomitem", new Item(properties().food(FoodBuilderRegistry.ROASTEDMUSHROOMITEM)));
		hotteaitem = register("hotteaitem", new Item(properties().food(FoodBuilderRegistry.HOTTEAITEM)));
		hotcoffeeitem = register("hotcoffeeitem", new Item(properties().food(FoodBuilderRegistry.HOTCOFFEEITEM)));

		//Seeds
		agaveseeditem = register("agaveseeditem", new ItemPamSeed(BlockRegistry.pamagavecrop, properties()));
		amaranthseeditem = register("amaranthseeditem", new ItemPamSeed(BlockRegistry.pamamaranthcrop, properties()));
		arrowrootseeditem = register("arrowrootseeditem", new ItemPamSeed(BlockRegistry.pamarrowrootcrop, properties()));
		artichokeseeditem = register("artichokeseeditem", new ItemPamSeed(BlockRegistry.pamartichokecrop, properties()));
		asparagusseeditem = register("asparagusseeditem", new ItemPamSeed(BlockRegistry.pamasparaguscrop, properties()));
		barleyseeditem = register("barleyseeditem", new ItemPamSeed(BlockRegistry.pambarleycrop, properties()));
		beanseeditem = register("beanseeditem", new ItemPamSeed(BlockRegistry.pambeancrop, properties()));
		bellpepperseeditem = register("bellpepperseeditem", new ItemPamSeed(BlockRegistry.pambellpeppercrop, properties()));
		blackberryseeditem = register("blackberryseeditem", new ItemPamSeed(BlockRegistry.pamblackberrycrop, properties()));
		blueberryseeditem = register("blueberryseeditem", new ItemPamSeed(BlockRegistry.pamblueberrycrop, properties()));
		broccoliseeditem = register("broccoliseeditem", new ItemPamSeed(BlockRegistry.pambroccolicrop, properties()));
		brusselsproutseeditem = register("brusselsproutseeditem", new ItemPamSeed(BlockRegistry.pambrusselsproutcrop, properties()));
		cabbageseeditem = register("cabbageseeditem", new ItemPamSeed(BlockRegistry.pamcabbagecrop, properties()));
		cactusfruitseeditem = register("cactusfruitseeditem", new ItemPamSeed(BlockRegistry.pamcactusfruitcrop, properties()));
		candleberryseeditem = register("candleberryseeditem", new ItemPamSeed(BlockRegistry.pamcandleberrycrop, properties()));
		cantaloupeseeditem = register("cantaloupeseeditem", new ItemPamSeed(BlockRegistry.pamcantaloupecrop, properties()));
		cassavaseeditem = register("cassavaseeditem", new ItemPamSeed(BlockRegistry.pamcassavacrop, properties()));
		cauliflowerseeditem = register("cauliflowerseeditem", new ItemPamSeed(BlockRegistry.pamcauliflowercrop, properties()));
		celeryseeditem = register("celeryseeditem", new ItemPamSeed(BlockRegistry.pamcelerycrop, properties()));
		chickpeaseeditem = register("chickpeaseeditem", new ItemPamSeed(BlockRegistry.pamchickpeacrop, properties()));
		chilipepperseeditem = register("chilipepperseeditem", new ItemPamSeed(BlockRegistry.pamchilipeppercrop, properties()));
		coffeebeanseeditem = register("coffeebeanseeditem", new ItemPamSeed(BlockRegistry.pamcoffeebeancrop, properties()));
		cornseeditem = register("cornseeditem", new ItemPamSeed(BlockRegistry.pamcorncrop, properties()));
		cottonseeditem = register("cottonseeditem", new ItemPamSeed(BlockRegistry.pamcottoncrop, properties()));
		cranberryseeditem = register("cranberryseeditem", new ItemPamSeed(BlockRegistry.pamcranberrycrop, properties()));
		cucumberseeditem = register("cucumberseeditem", new ItemPamSeed(BlockRegistry.pamcucumbercrop, properties()));
		eggplantseeditem = register("eggplantseeditem", new ItemPamSeed(BlockRegistry.pameggplantcrop, properties()));
		elderberryseeditem = register("elderberryseeditem", new ItemPamSeed(BlockRegistry.pamelderberrycrop, properties()));
		flaxseeditem = register("flaxseeditem", new ItemPamSeed(BlockRegistry.pamflaxcrop, properties()));
		garlicseeditem = register("garlicseeditem", new ItemPamSeed(BlockRegistry.pamgarliccrop, properties()));
		gingerseeditem = register("gingerseeditem", new ItemPamSeed(BlockRegistry.pamgingercrop, properties()));
		grapeseeditem = register("grapeseeditem", new ItemPamSeed(BlockRegistry.pamgrapecrop, properties()));
		greengrapeseeditem = register("greengrapeseeditem", new ItemPamSeed(BlockRegistry.pamgreengrapecrop, properties()));
		huckleberryseeditem = register("huckleberryseeditem", new ItemPamSeed(BlockRegistry.pamhuckleberrycrop, properties()));
		jicamaseeditem = register("jicamaseeditem", new ItemPamSeed(BlockRegistry.pamjicamacrop, properties()));
		juniperberryseeditem = register("juniperberryseeditem", new ItemPamSeed(BlockRegistry.pamjuniperberrycrop, properties()));
		juteseeditem = register("juteseeditem", new ItemPamSeed(BlockRegistry.pamjutecrop, properties()));
		kaleseeditem = register("kaleseeditem", new ItemPamSeed(BlockRegistry.pamkalecrop, properties()));
		kenafseeditem = register("kenafseeditem", new ItemPamSeed(BlockRegistry.pamkenafcrop, properties()));
		kiwiseeditem = register("kiwiseeditem", new ItemPamSeed(BlockRegistry.pamkiwicrop, properties()));
		kohlrabiseeditem = register("kohlrabiseeditem", new ItemPamSeed(BlockRegistry.pamkohlrabicrop, properties()));
		leekseeditem = register("leekseeditem", new ItemPamSeed(BlockRegistry.pamleekcrop, properties()));
		lentilseeditem = register("lentilseeditem", new ItemPamSeed(BlockRegistry.pamlentilcrop, properties()));
		lettuceseeditem = register("lettuceseeditem", new ItemPamSeed(BlockRegistry.pamlettucecrop, properties()));
		milletseeditem = register("milletseeditem", new ItemPamSeed(BlockRegistry.pammilletcrop, properties()));
		mulberryseeditem = register("mulberryseeditem", new ItemPamSeed(BlockRegistry.pammulberrycrop, properties()));
		mustardseedsseeditem = register("mustardseedsseeditem", new ItemPamSeed(BlockRegistry.pammustardseedscrop, properties()));
		oatsseeditem = register("oatsseeditem", new ItemPamSeed(BlockRegistry.pamoatscrop, properties()));
		okraseeditem = register("okraseeditem", new ItemPamSeed(BlockRegistry.pamokracrop, properties()));
		onionseeditem = register("onionseeditem", new ItemPamSeed(BlockRegistry.pamonioncrop, properties()));
		parsnipseeditem = register("parsnipseeditem", new ItemPamSeed(BlockRegistry.pamparsnipcrop, properties()));
		peanutseeditem = register("peanutseeditem", new ItemPamSeed(BlockRegistry.pampeanutcrop, properties()));
		peasseeditem = register("peasseeditem", new ItemPamSeed(BlockRegistry.pampeascrop, properties()));
		pineappleseeditem = register("pineappleseeditem", new ItemPamSeed(BlockRegistry.pampineapplecrop, properties()));
		quinoaseeditem = register("quinoaseeditem", new ItemPamSeed(BlockRegistry.pamquinoacrop, properties()));
		radishseeditem = register("radishseeditem", new ItemPamSeed(BlockRegistry.pamradishcrop, properties()));
		raspberryseeditem = register("raspberryseeditem", new ItemPamSeed(BlockRegistry.pamraspberrycrop, properties()));
		rhubarbseeditem = register("rhubarbseeditem", new ItemPamSeed(BlockRegistry.pamrhubarbcrop, properties()));
		riceseeditem = register("riceseeditem", new ItemPamSeed(BlockRegistry.pamricecrop, properties()));
		rutabagaseeditem = register("rutabagaseeditem", new ItemPamSeed(BlockRegistry.pamrutabagacrop, properties()));
		ryeseeditem = register("ryeseeditem", new ItemPamSeed(BlockRegistry.pamryecrop, properties()));
		scallionseeditem = register("scallionseeditem", new ItemPamSeed(BlockRegistry.pamscallioncrop, properties()));
		sesameseedsseeditem = register("sesameseedsseeditem", new ItemPamSeed(BlockRegistry.pamsesameseedscrop, properties()));
		sisalseeditem = register("sisalseeditem", new ItemPamSeed(BlockRegistry.pamsisalcrop, properties()));
		soybeanseeditem = register("soybeanseeditem", new ItemPamSeed(BlockRegistry.pamsoybeancrop, properties()));
		spiceleafseeditem = register("spiceleafseeditem", new ItemPamSeed(BlockRegistry.pamspiceleafcrop, properties()));
		spinachseeditem = register("spinachseeditem", new ItemPamSeed(BlockRegistry.pamspinachcrop, properties()));
		strawberryseeditem = register("strawberryseeditem", new ItemPamSeed(BlockRegistry.pamstrawberrycrop, properties()));
		sweetpotatoseeditem = register("sweetpotatoseeditem", new ItemPamSeed(BlockRegistry.pamsweetpotatocrop, properties()));
		taroseeditem = register("taroseeditem", new ItemPamSeed(BlockRegistry.pamtarocrop, properties()));
		tealeafseeditem = register("tealeafseeditem", new ItemPamSeed(BlockRegistry.pamtealeafcrop, properties()));
		tomatilloseeditem = register("tomatilloseeditem", new ItemPamSeed(BlockRegistry.pamtomatillocrop, properties()));
		tomatoseeditem = register("tomatoseeditem", new ItemPamSeed(BlockRegistry.pamtomatocrop, properties()));
		turnipseeditem = register("turnipseeditem", new ItemPamSeed(BlockRegistry.pamturnipcrop, properties()));
		waterchestnutseeditem = register("waterchestnutseeditem", new ItemPamSeed(BlockRegistry.pamwaterchestnutcrop, properties()));
		whitemushroomseeditem = register("whitemushroomseeditem", new ItemPamSeed(BlockRegistry.pamwhitemushroomcrop, properties()));
		wintersquashseeditem = register("wintersquashseeditem", new ItemPamSeed(BlockRegistry.pamwintersquashcrop, properties()));
		zucchiniseeditem = register("zucchiniseeditem", new ItemPamSeed(BlockRegistry.pamzucchinicrop, properties()));
	}

	private static <T extends Item> T register(String name, T item) {
		ResourceLocation id = Pamhc2crops.getId(name);
		item.setRegistryName(id);
		ForgeRegistries.ITEMS.register(item);
		return item;
	}
}