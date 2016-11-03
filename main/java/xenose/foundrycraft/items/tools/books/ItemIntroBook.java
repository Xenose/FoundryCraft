package xenose.foundrycraft.items.tools.books;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import xenose.foundrycraft.FoundryCraft;
import xenose.foundrycraft.Reference.FoundryCraftItems;
import xenose.foundrycraft.init.FoundryGUIHandler;
import xenose.foundrycraft.items.baseitem.FoundryItem;

public class ItemIntroBook extends FoundryItem	
{
	public ItemIntroBook(FoundryCraftItems foundryEnum) 
	{
		super(foundryEnum);
		setunlocalizedAndRegistryName(foundryEnum);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) 
	{
		System.out.println("used the Foundrypieda");
		
		if(!worldIn.isRemote)
			playerIn.openGui(FoundryCraft.instance, FoundryGUIHandler.GUI_TEST_GUI, worldIn, (int)playerIn.posX, (int)playerIn.posY, (int)playerIn.posZ);
		
		return null;
	}
}
