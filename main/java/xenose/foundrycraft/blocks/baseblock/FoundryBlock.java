package xenose.foundrycraft.blocks.baseblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FoundryBlock extends Block
{
	public FoundryBlock(Material materialIn, String UnlocalizedName, String RegistryName)
	{
		super(materialIn);
		
		setUnlocalizedName(UnlocalizedName);
		setRegistryName(RegistryName);
		
		setHardness(1);
	}

	public FoundryBlock(Material materialIn, float hardness) 
	{
		super(materialIn);
		setHardness(hardness);
	}

}
