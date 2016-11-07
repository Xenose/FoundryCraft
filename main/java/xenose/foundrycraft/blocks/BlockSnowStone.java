package xenose.foundrycraft.blocks;

import net.minecraft.block.material.Material;
import xenose.foundrycraft.Reference.FoundryCraftBlocks;
import xenose.foundrycraft.blocks.baseblock.FoundryBlock;

public class BlockSnowStone extends FoundryBlock {

	public BlockSnowStone(Material materialIn, FoundryCraftBlocks foundryEnumBlock, float hardness) 
	{
		super(materialIn, foundryEnumBlock, hardness);
		setUnlocalizedNameAndRegistry(foundryEnumBlock);
	}

}
