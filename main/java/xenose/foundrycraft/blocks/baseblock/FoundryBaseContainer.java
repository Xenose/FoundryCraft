package xenose.foundrycraft.blocks.baseblock;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import xenose.foundrycraft.Reference;
import xenose.foundrycraft.Reference.FoundryCraftBlocks;

public class FoundryBaseContainer extends FoundryBlock implements ITileEntityProvider
{
	private final static PropertyDirection FACING = BlockHorizontal.FACING;
	private static boolean keepInventory;
	
	public FoundryBaseContainer(Material materialIn, FoundryCraftBlocks foundryEnumBlock, float blockHardness)
	{
		super(materialIn, foundryEnumBlock, blockHardness);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
	}
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) 
	{
		setDefaultFacing(worldIn, pos, state);
	}
	
	public void setDefaultFacing(World worldIn, BlockPos pos, IBlockState blockState)
	{
		if(!worldIn.isRemote)
		{
			IBlockState 
			ibsNorth = worldIn.getBlockState(pos.north()),
			ibsSouth = worldIn.getBlockState(pos.south()),
			ibsWest = worldIn.getBlockState(pos.west()),
			ibsEast = worldIn.getBlockState(pos.east());
			
			EnumFacing eFacing = (EnumFacing)blockState.getValue(FACING);
			
			if (eFacing == EnumFacing.NORTH && ibsNorth.isFullBlock() && !ibsSouth.isFullBlock())
				eFacing = EnumFacing.SOUTH;
			
			else if (eFacing == EnumFacing.SOUTH && ibsSouth.isFullBlock() && !ibsNorth.isFullBlock())
				eFacing = EnumFacing.NORTH;
			
			else if (eFacing == EnumFacing.WEST && ibsWest.isFullBlock() && !ibsEast.isFullBlock())
				eFacing = EnumFacing.EAST;
			
			else if (eFacing == EnumFacing.EAST && ibsEast.isFullBlock() && !ibsWest.isFullBlock())
				eFacing = EnumFacing.WEST;
			
			worldIn.setBlockState(pos, blockState.withProperty(FACING, eFacing), 2);
		}
	}
	
	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) 
	{
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) 
	{
		return null;
	}
	
	@Override
	protected BlockStateContainer createBlockState() 
	{
		return new BlockStateContainer(this, new IProperty[]{FACING});
	}
	
	public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }
	
    public IBlockState getStateFromMeta(int meta)
    {
        EnumFacing enumfacing = EnumFacing.getFront(meta);

        if (enumfacing.getAxis() == EnumFacing.Axis.Y)
        {
            enumfacing = EnumFacing.NORTH;
        }

        return this.getDefaultState().withProperty(FACING, enumfacing);
    }
    
    public int getMetaFromState(IBlockState state)
    {
        return ((EnumFacing)state.getValue(FACING)).getIndex();
    }
	
	
}
