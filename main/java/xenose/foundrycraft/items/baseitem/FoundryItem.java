package xenose.foundrycraft.items.baseitem;

import net.minecraft.item.Item;
import xenose.foundrycraft.Reference;
import xenose.foundrycraft.Reference.FoundryCraftItems;

public class FoundryItem extends Item
{
	public FoundryItem(FoundryCraftItems foundryEnum) 
	{
		setCreativeTab(Reference.CREATIVE_TAB);
	}
	
	public void setunlocalizedAndRegistryName(FoundryCraftItems foundryEnum)
	{
		setUnlocalizedName(foundryEnum.getUnlocalizedName());
		setRegistryName(foundryEnum.getRegistryName());
	}
	
	public FoundryItem(String unlocalizedName, String registryName) 
	{
		setCreativeTab(Reference.CREATIVE_TAB);
	}
	
	public void setunlocalizedAndRegistryName(String unlocalizedName,String registryName)
	{
		setUnlocalizedName(unlocalizedName);
		setRegistryName(registryName);
	}
}
