package xenose.foundrycraft.blocks.ores;

import net.minecraft.block.material.Material;
import xenose.foundrycraft.blocks.baseblock.FoundryBlock;

public class BlockTitaniumOre extends FoundryBlock
{

	public BlockTitaniumOre(Material materialIn, String unlocalizedName, String registryName, float hardness) 
	{
		super(materialIn, unlocalizedName, registryName, hardness);
		setUnlocalizedNameAndRegistry(unlocalizedName, registryName);
	}
	
}
