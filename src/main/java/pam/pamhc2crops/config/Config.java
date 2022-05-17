package pam.pamhc2crops.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {

	public static final ForgeConfigSpec CONFIG;

	static {
		ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

		builder.push("Tweak Garden World Generation Rates");
		ChanceConfig.init(builder);
		builder.pop();

		builder.push("Tweak Garden Cluster Rates");
		ChanceConfig.init(builder);
		builder.pop();

		builder.push("Tweak Garden Cluster Sizes");
		ClusterConfig.init(builder);
		builder.pop();

		builder.push("Miscellaneous Features");
		FeatureConfig.init(builder);
		builder.pop();

		builder.push("Enable/Disable Garden World Generation");
		EnableConfig.init(builder);
		builder.pop();

		builder.push("Dimensions Settings");
		DimensionConfig.init(builder);
		builder.pop();

		CONFIG = builder.build();
	}

	/*public static void loadConfig(ForgeConfigSpec config, String path) {
		CommentedFileConfig file = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE)
				.build();
		file.load();
		config.setConfig(file);
	}*/
}