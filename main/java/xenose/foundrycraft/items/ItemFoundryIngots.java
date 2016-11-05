package xenose.foundrycraft.items;

import xenose.foundrycraft.Reference.FoundryCraftItems;
import xenose.foundrycraft.items.baseitem.FoundryItem;

public class ItemFoundryIngots extends FoundryItem 
{
	public ItemFoundryIngots(FoundryCraftItems foundryEnum) 
	{
		super(foundryEnum);
		setunlocalizedAndRegistryName(foundryEnum);
	}
}
