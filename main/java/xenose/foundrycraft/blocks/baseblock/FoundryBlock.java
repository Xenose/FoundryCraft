package xenose.foundrycraft.blocks.baseblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FoundryBlock extends Block
{
	public FoundryBlock(Material materialIn, float hardness)
	{
		super(materialIn);
		
		setHardness(1);
	}
}
