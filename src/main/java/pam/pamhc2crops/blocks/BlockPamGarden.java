package pam.pamhc2crops.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.PlantType;
import net.minecraft.world.level.BlockGetter;

public class BlockPamGarden extends BushBlock {

	protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);

	public BlockPamGarden(Block.Properties properties, String name) {
		super(properties);
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.PLAINS;
	}

	@SuppressWarnings("deprecation")
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}

	@Override
	public Block.OffsetType getOffsetType() {
		return Block.OffsetType.XZ;
	}

	@Override
	public boolean isPathfindable(BlockState state, BlockGetter worldIn, BlockPos pos, PathComputationType type) {
		return true;
	}
}