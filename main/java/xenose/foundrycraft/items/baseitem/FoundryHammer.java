package xenose.foundrycraft.items.baseitem;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import xenose.foundrycraft.Reference.FoundryCraftItems;

public class FoundryHammer extends FoundryTool
{
	private int harrvestArea;

	public FoundryHammer(FoundryCraftItems foundryEnum, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn, int harrvestArea) 
	{
		super(foundryEnum, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		this.harrvestArea = harrvestArea;
	}
	
	@Override
	public boolean canHarvestBlock(IBlockState blockIn) 
	{
		Block block = blockIn.getBlock();
		return checkBlockCanBeHarvested(block, blockIn);
	}
	
	@Override
	public boolean onBlockDestroyed
	(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) 
	{
		EnumFacing side = entityLiving.rayTrace(10, 1.0F).sideHit;
		
		if (side == EnumFacing.UP || side == EnumFacing.DOWN)
		{
			for (int i = 0; i < harrvestArea; i++) 
			{
				for (int j = 0; j < 3; j++) 
				{
					worldIn.destroyBlock(new BlockPos(pos.getX() - 1 + i, pos.getY(), pos.getZ() - 1 + j), true);
				}
			}
		}
		
		if (side == EnumFacing.SOUTH || side == EnumFacing.NORTH)
		{
			for (int i = 0; i < harrvestArea; i++) 
			{
				for (int j = 0; j < 3; j++) 
				{
					worldIn.destroyBlock(new BlockPos(pos.getX() - 1 + i, pos.getY() - 1 + j, pos.getZ()), true);
				}
			}
		}
		
		if (side == EnumFacing.EAST || side == EnumFacing.WEST)
		{
			for (int i = 0; i < harrvestArea; i++) 
			{
				for (int j = 0; j < 3; j++) 
				{
					worldIn.destroyBlock(new BlockPos(pos.getX(), pos.getY() - 1 + j, pos.getZ() - 1 + i), true);
				}
			}
		}	
			
		return super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);
	}
	
}
