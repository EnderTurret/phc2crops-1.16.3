package pam.pamhc2crops.items;

import net.minecraft.block.Block;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.NonNullList;

import net.minecraft.item.Item.Properties;

public class ItemPamRabbit extends BlockNamedItem {
	public ItemPamRabbit(Block blockIn, Properties properties) {
		super(blockIn, properties);

	}

	@Override
	public void fillItemCategory(ItemGroup group, NonNullList<ItemStack> items) {
		if (this.allowdedIn(group)) {
			items.add(new ItemStack(this));
		}

	}

	@Override
	public ActionResultType interactLivingEntity(ItemStack itemstack, PlayerEntity player,
			LivingEntity entity, Hand hand) {

		ItemStack stack = player.getItemInHand(hand);

		if (!entity.level.isClientSide && !entity.isBaby() && entity instanceof AgeableEntity && ((AgeableEntity) entity).getAge() == 0) {
			if (entity instanceof RabbitEntity) {
				if (((RabbitEntity) entity).isInLove()) {
					return ActionResultType.FAIL;
				} else {
					((RabbitEntity) entity).setInLove(player);
					if (!player.isCreative())
						stack.shrink(1);
					return ActionResultType.PASS;
				}

			}

		}

		if (entity.isBaby()) {
			if (!player.isCreative())
				stack.shrink(1);
			((AgeableEntity) entity).ageUp((int) (-((AgeableEntity) entity).getAge() / 20 * 0.1F),
					true);
			return ActionResultType.PASS;
		}

		return ActionResultType.FAIL;

	}

}
