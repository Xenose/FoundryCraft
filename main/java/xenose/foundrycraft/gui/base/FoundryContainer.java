package xenose.foundrycraft.gui.base;

import jline.internal.Nullable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;
import xenose.foundrycraft.tileentity.base.FoundryTileEntityContainer;

public class FoundryContainer extends Container
{
	private FoundryTileEntityContainer ftec;
	
	public FoundryContainer(IInventory playerInventory, FoundryTileEntityContainer ftec) 
	{
		this.ftec = ftec;
	}
	
	public void addPlayerSlots(IInventory playerInv)
	{
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{
				int x = 9 + j * 18,
					y = 58 +70;
				
				this.addSlotToContainer(new Slot(playerInv, j + i * 9 + 10, x, y));
			}
		}
		
		for (int i = 0; i < 9; i++)
		{
			int x = 9 + i * 18,
				y = 58 + 70;
			
			this.addSlotToContainer(new Slot(playerInv, i, x, y));
		}
	}
	
	public void addContainerSlots()
	{
		IItemHandler itemHandler = this.ftec.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		
		int x = 9,
			y = 6;
		
		int slotIndex = 0;
		
		for (int i = 0; i < itemHandler.getSlots(); i++) 
		{
			addSlotToContainer(new SlotItemHandler(itemHandler, slotIndex, x, y));
			slotIndex++;
			x+= 18;
		}
	}
	
	@Nullable
	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) 
	{
		ItemStack itemStack = null;
		Slot slot = this.inventorySlots.get(index);
		
		if(slot != null && slot.getHasStack())
		{
			ItemStack itemStack0 = slot.getStack();
			itemStack = itemStack0.copy();
			
			if(index < FoundryTileEntityContainer.INV_SIZE)
			{
				if(!this.mergeItemStack(itemStack0, FoundryTileEntityContainer.INV_SIZE, this.inventorySlots.size(), true))
				{
					return null;
				}
				
				else if (!this.mergeItemStack(itemStack0, 0, FoundryTileEntityContainer.INV_SIZE, false))
				{
					return null;
				}
				
				if (itemStack0.stackSize == 0)
				{
					slot.putStack(null);
				}
				
				else
				{
					slot.onSlotChanged();
				}
				
			}
		}
		
		return itemStack;
	}

	@Override
	public boolean canInteractWith(EntityPlayer playerIn) 
	{
		return this.ftec.canIteractWith(playerIn);
	}
}