package pam.pamhc2crops.config;

import java.util.Arrays;
import java.util.List;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec;

public class DimensionConfig {

	public static ForgeConfigSpec.ConfigValue<List<? extends String>> whitelist;
	public static ForgeConfigSpec.ConfigValue<List<? extends String>> blacklist;

	public static void init(ForgeConfigSpec.Builder config) {
		whitelist = config.comment("Enter a dimension id to whitelist feature generation").defineList("white_dim",
				Arrays.asList("minecraft:overworld"), val -> val instanceof String string && ResourceLocation.tryParse(string) != null);

		blacklist = config.comment("Enter a dimension id to blacklist feature generation").defineList("black_dim",
				Arrays.asList("minecraft:the_end", "minecraft:the_nether"), val -> val instanceof String string && ResourceLocation.tryParse(string) != null);
	}
}