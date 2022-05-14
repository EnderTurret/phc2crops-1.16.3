package pam.pamhc2crops.items;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class ItemPamFoodSeed extends ItemNameBlockItem {
	public ItemPamFoodSeed(Block blockIn, Properties properties) {
		super(blockIn, properties);

	}

	@Override
	public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items) {
		if (this.allowdedIn(group))
			items.add(new ItemStack(this));

	}

}
