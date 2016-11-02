package xenose.foundrycraft.blocks.metalblocks;

import net.minecraft.block.material.Material;
import xenose.foundrycraft.Reference.FoundryCraftBlocks;
import xenose.foundrycraft.blocks.baseblock.FoundryBlock;

public class BlockCopperBlock extends FoundryBlock
{

	public BlockCopperBlock(Material materialIn, FoundryCraftBlocks foundryEnum, float hardness) 
	{
		super(materialIn, foundryEnum, hardness);
		setUnlocalizedNameAndRegistry(foundryEnum);
	}

}
