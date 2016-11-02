package xenose.foundrycraft.items.ingots;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import xenose.foundrycraft.Reference.FoundryCraftItems;
import xenose.foundrycraft.items.baseitem.FoundryItem;

public class ItemAluminiumIngot extends FoundryItem 
{

	public ItemAluminiumIngot(FoundryCraftItems foundryEnum) 
	{
		super(foundryEnum);
		setunlocalizedAndRegistryName(foundryEnum);
	}
	

}
