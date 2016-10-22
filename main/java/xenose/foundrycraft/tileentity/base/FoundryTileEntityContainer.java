package xenose.foundrycraft.tileentity.base;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import xenose.foundrycraft.Refercence;

public class FoundryTileEntityContainer extends TileEntity
{
	public static int INV_SIZE = 0;
	private static String cName;
	
	public FoundryTileEntityContainer(int invSize, String containerName) 
	{
		INV_SIZE = invSize;
		cName = containerName;
	}
	
	private ItemStackHandler itemStackHandler = new ItemStackHandler(INV_SIZE)
	{
		protected void onContentsChanged(int slot) 
		{
			FoundryTileEntityContainer.this.markDirty();
		};
	};
	
	public boolean canIteractWith(EntityPlayer playerIn)
	{
		return !isInvalid() && playerIn.getDistance(0.6, 0.6, 0.6) <= 64;
	}
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) 
	{
		if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
			return true;
		
		return super.hasCapability(capability, facing);
	}
	
	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) 
	{
		if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
			return (T) itemStackHandler;
		
		return super.getCapability(capability, facing);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) 
	{
		super.readFromNBT(compound);
		
		if (compound.hasKey(Refercence.MOD_ID + ":" + cName + ":" + "Container"))
			itemStackHandler.deserializeNBT((NBTTagCompound)compound.getTag(Refercence.MOD_ID + ":" + cName + ":" + "Container"));
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) 
	{
		super.writeToNBT(compound);
		compound.setTag(Refercence.MOD_ID + ":" + cName + ":" + "Container", itemStackHandler.serializeNBT());
		return compound;
	}
}
