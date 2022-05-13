package pam.pamhc2crops.events.harvest;

import java.lang.reflect.Method;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.NetherWartBlock;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.config.RightClickConfig;

public class CropHarvest {

	private static final Method seedDrops;

	static {
		seedDrops = ObfuscationReflectionHelper.findMethod(CropsBlock.class, "getBaseSeedId");
	}

	private Item getCropSeed(Block block) {
		try {
			return (Item) seedDrops.invoke(block);
		}

		catch (Exception e) {
			Pamhc2crops.LOGGER.error("Where the heck is the seed", e.getLocalizedMessage());
		}

		return null;
	}

	@SubscribeEvent
	public void onCropHarvest(RightClickBlock event) {
		if (event.getPlayer().getMainHandItem().getItem() != Items.BONE_MEAL) {
			List<ItemStack> drops;
			if (event.getWorld().getBlockState(event.getPos()).getBlock() instanceof CropsBlock) {
				if (!event.getPlayer().getMainHandItem().isEmpty())
					event.setCanceled(true); // prevents blocks from being placed
				CropsBlock crop = (CropsBlock) event.getWorld().getBlockState(event.getPos()).getBlock();
				if (crop.isMaxAge(event.getWorld().getBlockState(event.getPos()))) {
					if (!event.getWorld().isClientSide) {
						drops = Block.getDrops(event.getWorld().getBlockState(event.getPos()),
								(ServerWorld) event.getWorld(), event.getPos(),
								event.getWorld().getBlockEntity(event.getPos()));
						for (int i = 0; i < drops.size(); i++) {
							if (drops.get(i).getItem() != getCropSeed(crop))
								event.getWorld()
								.addFreshEntity(new ItemEntity(event.getWorld(), event.getPos().getX(),
										event.getPos().getY(), event.getPos().getZ(),
										drops.get(i)));
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
						event.getWorld().playSound((PlayerEntity) null, event.getPos(), SoundEvents.CROP_BREAK,
								SoundCategory.BLOCKS, 1.0F, 0.8F + event.getWorld().random.nextFloat() * 0.4F);
						event.getWorld().setBlock(event.getPos(), crop.defaultBlockState(), 2);

					}
					event.getPlayer().swing(Hand.MAIN_HAND);
				}
			}

			if (RightClickConfig.crop_right_click.get())
				if (event.getWorld().getBlockState(event.getPos()).getBlock() instanceof NetherWartBlock) {
					if (!event.getPlayer().getMainHandItem().isEmpty())
						event.setCanceled(true);
					NetherWartBlock nether = (NetherWartBlock) event.getWorld().getBlockState(event.getPos())
							.getBlock();

					if (event.getWorld().getBlockState(event.getPos()).getValue(NetherWartBlock.AGE) == 3) {
						if (!event.getWorld().isClientSide) {
							drops = Block.getDrops(event.getWorld().getBlockState(event.getPos()),
									(ServerWorld) event.getWorld(), event.getPos(),
									event.getWorld().getBlockEntity(event.getPos()));
							for (int i = 0; i < drops.size(); i++) {
								event.getWorld()
								.addFreshEntity(new ItemEntity(event.getWorld(), event.getPos().getX(),
										event.getPos().getY(), event.getPos().getZ(),
										drops.get(i)));
							}
							event.getPlayer().causeFoodExhaustion(.05F);
							event.getWorld().playSound((PlayerEntity) null, event.getPos(),
									SoundEvents.NETHER_WART_BREAK, SoundCategory.BLOCKS, 1.0F,
									0.8F + event.getWorld().random.nextFloat() * 0.4F);
							event.getWorld().setBlock(event.getPos(), nether.defaultBlockState(), 2);
						}
						event.getPlayer().swing(Hand.MAIN_HAND);
					}

				}
		}
	}

}