package xenose.foundrycraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import xenose.foundrycraft.init.FoundryBlocks;

public class FoundryTab extends CreativeTabs
{

	public FoundryTab() 
	{
		super("tabFoundryTab");
	}
	
	@Override
	public Item getTabIconItem() 
	{
		return Item.getItemFromBlock(FoundryBlocks.blockList[11]);
	}

}
