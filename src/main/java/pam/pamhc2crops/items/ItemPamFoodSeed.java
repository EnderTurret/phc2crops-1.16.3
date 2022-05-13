package pam.pamhc2crops.items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

import net.minecraft.item.Item.Properties;

public class ItemPamFoodSeed extends BlockNamedItem {
	public ItemPamFoodSeed(Block blockIn, Properties properties) {
		super(blockIn, properties);

	}

	@Override
	public void fillItemCategory(ItemGroup group, NonNullList<ItemStack> items) {
		if (this.allowdedIn(group)) {
			items.add(new ItemStack(this));
		}

	}

}
