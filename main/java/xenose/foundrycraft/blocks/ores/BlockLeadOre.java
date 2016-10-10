package xenose.foundrycraft.blocks.ores;

import net.minecraft.block.material.Material;
import xenose.foundrycraft.blocks.baseblock.FoundryBlock;

public class BlockLeadOre extends FoundryBlock
{

	public BlockLeadOre(Material materialIn, String UnlocalizedName, String registryName, float hardness) 
	{
		super(materialIn, UnlocalizedName, registryName, hardness);
		setUnlocalizedNameAndRegistry(UnlocalizedName, registryName);
	}

}
