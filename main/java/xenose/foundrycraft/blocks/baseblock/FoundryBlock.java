package xenose.foundrycraft.blocks.baseblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FoundryBlock extends Block
{
	public FoundryBlock(Material materialIn, String unlocalizedName, String registryName)
	{
		super(materialIn);
		
		setUnlocalizedName(unlocalizedName);
		setRegistryName(registryName);
		
		setHardness(1);
	}

	public FoundryBlock(Material materialIn, String unlocalizedName, String registryName, float hardness) 
	{
		super(materialIn);
		
		setUnlocalizedName(unlocalizedName);
		setRegistryName(registryName);
		
		setHardness(hardness);
	}

}
