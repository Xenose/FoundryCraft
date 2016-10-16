package xenose.foundrycraft.blocks.baseblock;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class FoundryPipe extends FoundryBlock
{
	
	private String pipeName;

	public FoundryPipe(Material materialIn, String unlocalizedName, String registryName, float hardness, String pipeName) 
	{
		super(materialIn, unlocalizedName, registryName, hardness);
		this.pipeName = pipeName;
	}
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) 
	{
		super.onBlockAdded(worldIn, pos, state);
	}
	
	@Override
	public void onNeighborChange(IBlockAccess world, BlockPos pos, BlockPos neighbor) 
	{
		super.onNeighborChange(world, pos, neighbor);
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) 
	{
		return super.getCollisionBoundingBox(blockState, worldIn, pos);
	}
	
	public void updatePipe(World worldIN, BlockPos pos, IBlockState state)
	{
	}

}