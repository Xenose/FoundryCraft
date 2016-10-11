package xenose.foundrycraft.blocks.baseblock;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import xenose.foundrycraft.Refercence;

public class FoundryBlock extends Block
{
	public FoundryBlock(Material materialIn, String unlocalizedName, String registryName, float hardness)
	{
		super(materialIn);
		
		setHardness(1);
	}
	
	public void setUnlocalizedNameAndRegistry(String unlocalized, String registry)
	{
		setUnlocalizedName(unlocalized);
		setRegistryName(registry);
		
		setCreativeTab(Refercence.CREATIVE_TAB);
	}
}
