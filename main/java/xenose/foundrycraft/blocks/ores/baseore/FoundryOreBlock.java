package xenose.foundrycraft.blocks.ores.baseore;

import net.minecraft.block.material.Material;
import xenose.foundrycraft.blocks.baseblock.FoundryBlock;

public class FoundryOreBlock extends FoundryBlock
{

	public FoundryOreBlock(Material materialIn, String unlocalizedName, String registryName) 
	{
		super(materialIn, unlocalizedName, unlocalizedName);
	}
	
	public FoundryOreBlock(Material materialIn, String unlocalizedName, String registryName, float hardness) 
	{
		super(materialIn, unlocalizedName, unlocalizedName, hardness);
	}

}
