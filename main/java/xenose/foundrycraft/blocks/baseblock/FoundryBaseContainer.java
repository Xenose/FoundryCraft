package xenose.foundrycraft.blocks.baseblock;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import xenose.foundrycraft.Refercence;

public class FoundryBaseContainer extends BlockContainer
{
	public FoundryBaseContainer(Material materialIn)
	{
		super(materialIn);
	}
	
	public void setUnlocalizedNameAndRegistry(String unlocalized, String registry)
	{
		setUnlocalizedName(unlocalized);
		setRegistryName(registry);
		
		setCreativeTab(Refercence.CREATIVE_TAB);
	}
	
	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) 
	{
		return super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) 
	{
		return null;
	}
	
	@Override
	protected boolean isInvalidNeighbor(World worldIn, BlockPos pos, EnumFacing facing) 
	{
		return false;
	}
	
	@Override
	protected boolean hasInvalidNeighbor(World worldIn, BlockPos pos) 
	{
		return false;
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) 
	{
		return EnumBlockRenderType.MODEL;
	}
	
	
}
