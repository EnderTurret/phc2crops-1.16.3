package pam.pamhc2crops.init;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModRenderers {

	public static void registerBlocks() {
		for (RegistryObject<Block> block : BlockRegistry.REGISTRY.getEntries())
			ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout());
	}
}