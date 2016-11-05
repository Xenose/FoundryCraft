package xenose.foundrycraft.items.tools;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;
import xenose.foundrycraft.FoundryCraft;
import xenose.foundrycraft.Reference.FoundryCraftItems;
import xenose.foundrycraft.client.gui.GuiTestGui;
import xenose.foundrycraft.init.FoundryGUIHandler;
import xenose.foundrycraft.items.baseitem.FoundryItem;

public class ItemIntroBook extends FoundryItem	
{
	IInteractionObject testGui;
	
	public ItemIntroBook(FoundryCraftItems foundryEnum) 
	{
		super(foundryEnum);
		setunlocalizedAndRegistryName(foundryEnum);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) 
	{
		System.out.println("used the Foundrypieda");
		
		//if(!worldIn.isRemote)
			
		
		return null;
	}
}
