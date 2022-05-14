package pam.pamhc2crops.items;

import net.minecraft.core.NonNullList;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Rabbit;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class ItemPamRabbit extends ItemNameBlockItem {

	public ItemPamRabbit(Block blockIn, Properties properties) {
		super(blockIn, properties);
	}

	@Override
	public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items) {
		if (this.allowdedIn(group))
			items.add(new ItemStack(this));
	}

	@Override
	public InteractionResult interactLivingEntity(ItemStack itemstack, Player player,
			LivingEntity entity, InteractionHand hand) {

		ItemStack stack = player.getItemInHand(hand);

		if (entity instanceof AgeableMob ageable) {
			if (!entity.level.isClientSide && !entity.isBaby() && ageable.getAge() == 0)
				if (entity instanceof Rabbit rabbit)
					if (rabbit.isInLove())
						return InteractionResult.FAIL;
					else {
						rabbit.setInLove(player);
						if (!player.isCreative())
							stack.shrink(1);
						return InteractionResult.PASS;
					}

			if (entity.isBaby()) {
				if (!player.isCreative())
					stack.shrink(1);
				ageable.ageUp((int) (-ageable.getAge() / 20 * 0.1F), true);
				return InteractionResult.PASS;
			}
		}

		return InteractionResult.FAIL;
	}
}