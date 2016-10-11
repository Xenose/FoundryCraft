package xenose.foundrycraft.items.baseitem;

import net.minecraft.item.Item;
import xenose.foundrycraft.Refercence;

public class FoundryItem extends Item
{
	public FoundryItem(String unlocalizedName, String registryName) 
	{
		setCreativeTab(Refercence.CREATIVE_TAB);
	}
	
	public void setunlocalizedAndRegistryName(String unlocalizedName,String registryName)
	{
		setUnlocalizedName(unlocalizedName);
		setRegistryName(registryName);
	}
}
