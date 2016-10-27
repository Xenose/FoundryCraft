package xenose.foundrycraft.tileentity.base;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.gen.feature.WorldGenReed;

public class FoundryTileEntity extends TileEntity implements IInventory
{
	private int numberOfPlayerUseing = 0;
	private ItemStack[] storageContainerInv;
	
	public FoundryTileEntity(int storageContainerInvSize) 
	{
		this.storageContainerInv = new ItemStack[storageContainerInvSize];
	}

	@Override
	public String getName() 
	{
		return null;
	}

	@Override
	public boolean hasCustomName() 
	{
		return false;
	}

	@Override
	public int getSizeInventory() 
	{
		return storageContainerInv.length;
	}

	@Override
	public ItemStack getStackInSlot(int index) 
	{
		return storageContainerInv[index];
	}

	@Override
	public ItemStack decrStackSize(int index, int count) 
	{
		ItemStack itemStack = ItemStackHelper.getAndSplit(storageContainerInv, index, count);
		
		if (itemStack != null)
			this.markDirty();
		
		return itemStack;
	}

	@Override
	public ItemStack removeStackFromSlot(int index) 
	{
		return ItemStackHelper.getAndRemove(this.storageContainerInv, index);
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) 
	{
		this.storageContainerInv[index] = stack;
		
		if (stack != null && stack.stackSize > this.getInventoryStackLimit())
			stack.stackSize = this.getInventoryStackLimit();
		
		this.markDirty();
	}

	@Override
	public int getInventoryStackLimit() 
	{
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) 
	{
		return this.worldObj.getTileEntity(this.pos) != this ? false : player.getDistanceSq(
				(double)this.pos.getX() + 0.5D, 
				(double)this.pos.getY() + 0.5D, 
				(double)this.pos.getZ() + 0.5D) 
				<= 64.0D;
	}

	@Override
	public void openInventory(EntityPlayer player) 
	{	
		if(!player.isSpectator())
		{
			if (numberOfPlayerUseing < 0)
				numberOfPlayerUseing = 0;
			
			++numberOfPlayerUseing;
			worldObj.addBlockEvent(pos, getBlockType(), 1, numberOfPlayerUseing);
				
		}
	}

	@Override
	public void closeInventory(EntityPlayer player) 
	{
		
	}

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) 
	{
		return true;
	}

	@Override
	public int getField(int id) 
	{
		return 0;
	}

	@Override
	public void setField(int id, int value) 
	{
		
	}

	@Override
	public int getFieldCount() 
	{
		return 0;
	}

	@Override
	public void clear() 
	{
		for (int i = 0; i < storageContainerInv.length; i++) 
		{
			storageContainerInv[i] = null;
		}
	}
}
