package xenose.foundrycraft.items.tools.debug;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import xenose.foundrycraft.Refercence;
import xenose.foundrycraft.items.baseitem.FoundryTool;

public class ItemShovelOfDire extends FoundryTool
{
	private final int harrvestArea = 16;
	
	public ItemShovelOfDire(String unlocalizedName, String registryName, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) 
	{
		super(unlocalizedName, registryName, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		setunlocalizedAndRegistryName(unlocalizedName, registryName);
		setCreativeTab(Refercence.CRETIVE_TAB_DEBUG_TOOLS);
	}
	
	@Override
	public boolean onBlockDestroyed
	(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) 
	{
		EnumFacing side = entityLiving.rayTrace(10, 1.0F).sideHit;
		
		if (side == EnumFacing.UP || side == EnumFacing.DOWN)
		{
			for (int i = 0; i < 16; i++) 
			{
				for (int j = 0; j < 16; j++) 
				{
					for (int j2 = 0; j2 < pos.getY() - 1; j2++) 
					{
						worldIn.destroyBlock(new BlockPos(pos.getX() - 8 + i, pos.getY() - j2, pos.getZ() - 8 + j), false);
					}
				}
			}
		}
			
		return super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);
	}
}
