package xenose.foundrycraft.blocks.baseblock;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import xenose.foundrycraft.Reference;
import xenose.foundrycraft.Reference.FoundryCraftBlocks;

public class FoundryBlock extends Block
{
	private String subFolderModels;
	private FoundryCraftBlocks fcBlock;
	
	public FoundryBlock(Material materialIn, FoundryCraftBlocks foundryEnumBlock, float hardness)
	{
		super(materialIn);
		setHardness(1);
	}
	
	public void setUnlocalizedNameAndRegistry(FoundryCraftBlocks foundryEnumBlock)
	{
		setUnlocalizedName(foundryEnumBlock.getUnlocalizedName());
		setRegistryName(foundryEnumBlock.getRegistryName());
		
		fcBlock = foundryEnumBlock;
		
		setCreativeTab(Reference.CREATIVE_TAB);
	}
	
	public void setSubFolder(String subFolder)
	{
		subFolderModels = subFolder;
	}
	
	public String getFolderAndFile()
	{
		return Reference.MOD_ID + ":" + subFolderModels + "/" + fcBlock.getRegistryName();
	}
	
	public boolean hasSubFolderModels()
	{
		if(subFolderModels != null)
			return true;
		return false;
	}
	
	@Deprecated
	public FoundryBlock(Material materialIn, String unlocalizedName, String registryName, float hardness)
	{
		super(materialIn);
		setHardness(1);
	}
	
	@Deprecated
	public void setUnlocalizedNameAndRegistry(String unlocalized, String registry)
	{
		setUnlocalizedName(unlocalized);
		setRegistryName(registry);
		
		setCreativeTab(Reference.CREATIVE_TAB);
	}
	
	public boolean hasCustomModel()
	{
		return false;
	}
	
	public void loadCustomModel()
	{
		
	}
}
