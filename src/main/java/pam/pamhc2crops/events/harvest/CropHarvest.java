package pam.pamhc2crops.events.harvest;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.util.List;

import org.jetbrains.annotations.Nullable;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.NetherWartBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

import pam.pamhc2crops.Pamhc2crops;

public class CropHarvest {

	private static final MethodHandle CROPBLOCK_GETBASESEEDID;

	static {
		try {
			Method getBaseSeedId = ObfuscationReflectionHelper.findMethod(CropBlock.class, "m_6404_");
			CROPBLOCK_GETBASESEEDID = MethodHandles.publicLookup().unreflect(getBaseSeedId);
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	@Nullable
	private ItemLike getCropSeed(CropBlock block) {
		try {
			return (ItemLike) CROPBLOCK_GETBASESEEDID.invoke(block);
		} catch (Throwable e) {
			Pamhc2crops.LOGGER.error("Failed to get crop seed!", e);
		}

		return null;
	}

	@SubscribeEvent
	public void onCropHarvest(RightClickBlock event) {
		if (event.getPlayer().getMainHandItem().getItem() != Items.BONE_MEAL) {
			BlockState state = event.getWorld().getBlockState(event.getPos());
			if (state.getBlock() instanceof CropBlock crop) {
				if (!event.getPlayer().getMainHandItem().isEmpty())
					event.setCanceled(true); // prevents blocks from being placed

				if (crop.isMaxAge(state)) {
					if (!event.getWorld().isClientSide) {
						List<ItemStack> drops = Block.getDrops(state,
								(ServerLevel) event.getWorld(), event.getPos(),
								event.getWorld().getBlockEntity(event.getPos()));

						Item seed = getCropSeed(crop).asItem();

						for (ItemStack stack : drops) {
							if (stack.getItem() != seed)
								event.getWorld()
								.addFreshEntity(new ItemEntity(event.getWorld(), event.getPos().getX(),
										event.getPos().getY(), event.getPos().getZ(), stack));
						}

						// TODO: What is the purpose of this loop?
						// Wouldn't the remove() call cause an IOOBE?
						for (int i = 0; i < drops.size(); i++) {
							if (crop == Blocks.POTATOES || crop == Blocks.CARROTS ||
									drops.stream().distinct().limit(3).count() <= 1) {

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

			if (state.getBlock() instanceof NetherWartBlock nether) {
				if (!event.getPlayer().getMainHandItem().isEmpty())
					event.setCanceled(true);

				if (state.getValue(NetherWartBlock.AGE) == 3) {
					if (!event.getWorld().isClientSide) {
						List<ItemStack> drops = Block.getDrops(state,
								(ServerLevel) event.getWorld(), event.getPos(),
								event.getWorld().getBlockEntity(event.getPos()));

						for (ItemStack stack : drops) {
							event.getWorld()
							.addFreshEntity(new ItemEntity(event.getWorld(), event.getPos().getX(),
									event.getPos().getY(), event.getPos().getZ(), stack));
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