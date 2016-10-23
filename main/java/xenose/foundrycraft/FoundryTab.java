package xenose.foundrycraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import xenose.foundrycraft.init.FoundryBlocks;
import xenose.foundrycraft.init.FoundryItems;

public class FoundryTab extends CreativeTabs
{
	
	private int iconIndex;

	public FoundryTab(String tabName, int iconIndex) 
	{
		super(tabName);
		this.iconIndex = iconIndex;
	}
	
	@Override
	public Item getTabIconItem() 
	{
		switch (iconIndex) {
		case 1:
			return FoundryItems.tungstenPickaxe;
			
		default:
			return Item.getItemFromBlock(FoundryBlocks.tungstenBlock);
		}
	}

}
