package xenose.foundrycraft.items.baseitem;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;
import xenose.foundrycraft.Refercence;

public class FoundryTool extends ItemTool 
{

	public FoundryTool(String unlocalizedName, String registryName, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) 
	{
		super(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		setCreativeTab(Refercence.CREATIVE_TAB);
	}
	
	public void setunlocalizedAndRegistryName(String unlocalizedName,String registryName)
	{
		setUnlocalizedName(unlocalizedName);
		setRegistryName(registryName);
	}
	
	public boolean checkBlockCanBeHarvested(Block block, IBlockState blockIn)
	{
		if (block == Blocks.OBSIDIAN)
        {
            return this.toolMaterial.getHarvestLevel() == 3;
        }
		
        else if (block != Blocks.DIAMOND_BLOCK && block != Blocks.DIAMOND_ORE)
        {
            if (block != Blocks.EMERALD_ORE && block != Blocks.EMERALD_BLOCK)
            {
                if (block != Blocks.GOLD_BLOCK && block != Blocks.GOLD_ORE)
                {
                    if (block != Blocks.IRON_BLOCK && block != Blocks.IRON_ORE)
                    {
                        if (block != Blocks.LAPIS_BLOCK && block != Blocks.LAPIS_ORE)
                        {
                            if (block != Blocks.REDSTONE_ORE && block != Blocks.LIT_REDSTONE_ORE)
                            {
                                Material material = blockIn.getMaterial();
                                return material == Material.ROCK ? true : (material == Material.IRON ? true : material == Material.ANVIL);
                            }
                            else
                            {
                                return this.toolMaterial.getHarvestLevel() >= 2;
                            }
                        }
                        else
                        {
                            return this.toolMaterial.getHarvestLevel() >= 1;
                        }
                    }
                    else
                    {
                        return this.toolMaterial.getHarvestLevel() >= 1;
                    }
                }
                else
                {
                    return this.toolMaterial.getHarvestLevel() >= 2;
                }
            }
            else
            {
                return this.toolMaterial.getHarvestLevel() >= 2;
            }
        }
		
        else
        {
            return this.toolMaterial.getHarvestLevel() >= 2;
        }
	}

}
