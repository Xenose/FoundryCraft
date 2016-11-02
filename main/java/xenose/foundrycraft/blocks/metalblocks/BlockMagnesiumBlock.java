package xenose.foundrycraft.blocks.metalblocks;

import net.minecraft.block.material.Material;
import xenose.foundrycraft.Reference.FoundryCraftBlocks;
import xenose.foundrycraft.blocks.baseblock.FoundryBlock;

public class BlockMagnesiumBlock extends FoundryBlock
{

	public BlockMagnesiumBlock(Material materialIn, FoundryCraftBlocks foundryEnum, float hardness) 
	{
		super(materialIn, foundryEnum, hardness);
		setUnlocalizedNameAndRegistry(foundryEnum);
	}

}
