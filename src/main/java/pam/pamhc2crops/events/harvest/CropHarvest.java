package pam.pamhc2crops.events.harvest;

import java.lang.reflect.Method;
import java.util.List;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.NetherWartBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.server.level.ServerLevel;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.config.RightClickConfig;

public class CropHarvest {

	private static final Method seedDrops;

	static {
		seedDrops = ObfuscationReflectionHelper.findMethod(CropBlock.class, "getBaseSeedId");
	}

	private Item getCropSeed(Block block) {
		try {
			return (Item) seedDrops.invoke(block);
		} catch (Exception e) {
			Pamhc2crops.LOGGER.error("Where the heck is the seed", e.getLocalizedMessage());
		}

		return null;
	}

	@SubscribeEvent
	public void onCropHarvest(RightClickBlock event) {
		if (event.getPlayer().getMainHandItem().getItem() != Items.BONE_MEAL) {
			List<ItemStack> drops;
			BlockState state = event.getWorld().getBlockState(event.getPos());
			if (state.getBlock() instanceof CropBlock crop) {
				if (!event.getPlayer().getMainHandItem().isEmpty())
					event.setCanceled(true); // prevents blocks from being placed

				if (crop.isMaxAge(state)) {
					if (!event.getWorld().isClientSide) {
						drops = Block.getDrops(state,
								(ServerLevel) event.getWorld(), event.getPos(),
								event.getWorld().getBlockEntity(event.getPos()));

						for (ItemStack stack : drops) {
							if (stack.getItem() != getCropSeed(crop))
								event.getWorld()
								.addFreshEntity(new ItemEntity(event.getWorld(), event.getPos().getX(),
										event.getPos().getY(), event.getPos().getZ(), stack));
						}

						for (int i = 0; i < drops.size(); i++) {
							if (drops.stream().distinct().limit(3).count() <= 1 || crop == Blocks.POTATOES
									|| crop == Blocks.CARROTS) {

								event.getWorld()
								.addFreshEntity(new ItemEntity(event.getWorld(), event.getPos().getX(),
										event.getPos().getY(), event.getPos().getZ(),
										drops.get(i)));
								drops.remove(0);
							}

						}

						event.getPlayer().causeFoodExhaustion(.05F);
						event.getWorld().playSound(null, event.getPos(), SoundEvents.CROP_BREAK,
								SoundSource.BLOCKS, 1.0F, 0.8F + event.getWorld().random.nextFloat() * 0.4F);
						event.getWorld().setBlock(event.getPos(), crop.defaultBlockState(), 2);
					}

					event.getPlayer().swing(InteractionHand.MAIN_HAND);
				}
			}

			if (RightClickConfig.crop_right_click.get())
				if (state.getBlock() instanceof NetherWartBlock nether) {
					if (!event.getPlayer().getMainHandItem().isEmpty())
						event.setCanceled(true);

					if (state.getValue(NetherWartBlock.AGE) == 3) {
						if (!event.getWorld().isClientSide) {
							drops = Block.getDrops(state,
									(ServerLevel) event.getWorld(), event.getPos(),
									event.getWorld().getBlockEntity(event.getPos()));

							for (int i = 0; i < drops.size(); i++) {
								event.getWorld()
								.addFreshEntity(new ItemEntity(event.getWorld(), event.getPos().getX(),
										event.getPos().getY(), event.getPos().getZ(),
										drops.get(i)));
							}

							event.getPlayer().causeFoodExhaustion(.05F);
							event.getWorld().playSound(null, event.getPos(),
									SoundEvents.NETHER_WART_BREAK, SoundSource.BLOCKS, 1.0F,
									0.8F + event.getWorld().random.nextFloat() * 0.4F);
							event.getWorld().setBlock(event.getPos(), nether.defaultBlockState(), 2);
						}
						event.getPlayer().swing(InteractionHand.MAIN_HAND);
					}
				}
		}
	}
}