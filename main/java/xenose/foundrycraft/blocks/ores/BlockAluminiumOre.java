package xenose.foundrycraft.blocks.ores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xenose.foundrycraft.blocks.baseblock.FoundryBlock;

public class BlockAluminiumOre extends FoundryBlock
{
	public BlockAluminiumOre(Material materialIn, String unlocalizedName, String registryName, float hardness) 
	{
		super(materialIn, unlocalizedName, registryName, hardness);
		setUnlocalizedNameAndRegistry(unlocalizedName, registryName);
	}
}
