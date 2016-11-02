package xenose.foundrycraft.items.baseitem;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import xenose.foundrycraft.Reference;
import xenose.foundrycraft.Reference.FoundryCraftItems;

public class FoundryPickaxe extends FoundryTool
{

	public FoundryPickaxe(FoundryCraftItems foundryEnum, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) 
	{
		super(foundryEnum, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
	}
	
	@Override
	public boolean canHarvestBlock(IBlockState blockIn)
	{
		Block block = blockIn.getBlock();
		return checkBlockCanBeHarvested(block, blockIn);
	}
	


    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }
}
