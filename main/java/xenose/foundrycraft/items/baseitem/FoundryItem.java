package xenose.foundrycraft.items.baseitem;

import net.minecraft.item.Item;

public class FoundryItem extends Item
{
	public FoundryItem() 
	{
		
	}
	
	public void setunlocalizedAndRegistryName(String unlocalizedName,String registryName)
	{
		setUnlocalizedName(unlocalizedName);
		setRegistryName(registryName);
	}
}
