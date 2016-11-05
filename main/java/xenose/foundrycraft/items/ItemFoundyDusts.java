package xenose.foundrycraft.items;

import xenose.foundrycraft.Reference.FoundryCraftItems;
import xenose.foundrycraft.items.baseitem.FoundryItem;

public class ItemFoundyDusts extends FoundryItem
{
	public ItemFoundyDusts(FoundryCraftItems foundryEnum) 
	{
		super(foundryEnum);
		setunlocalizedAndRegistryName(foundryEnum);
	}
}
