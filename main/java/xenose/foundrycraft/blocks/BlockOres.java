package xenose.foundrycraft.blocks;

import net.minecraft.block.material.Material;
import xenose.foundrycraft.Reference.FoundryCraftBlocks;
import xenose.foundrycraft.blocks.baseblock.FoundryBlock;

public class BlockOres extends FoundryBlock
{

	public BlockOres(Material materialIn, FoundryCraftBlocks foundryEnumBlock, float hardness) 
	{
		super(materialIn, foundryEnumBlock, hardness);
		setUnlocalizedNameAndRegistry(foundryEnumBlock);
	}
	
}
