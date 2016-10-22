package xenose.foundrycraft.blocks.baseblock;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xenose.foundrycraft.FoundryCraft;
import xenose.foundrycraft.Refercence;
import xenose.foundrycraft.gui.base.FoundryGui;

public class FoundryContainerBlock extends FoundryBlock implements ITileEntityProvider
{
	
	private static int GUI_ID;
	private static FoundryGui gui;

	public FoundryContainerBlock(Material materialIn, String unlocalizedName, String registryName, float hardness, int GUI_ID, FoundryGui foundryGui) 
	{
		super(materialIn, unlocalizedName, registryName, hardness);
		this.GUI_ID = GUI_ID;
	}
	
	public void foundryTERegistry()
	{
		//GameRegistry.registerTileEntity(FoundryGui.class, Refercence.MOD_ID + ":" + getUnlocalizedName() + ":" + "Container");
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) 
	{
		return null;
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) 
	{
		if(!worldIn.isRemote)
			return true;
		
		TileEntity te = worldIn.getTileEntity(pos);
		
		//if (!(te instanceof ))
			//return false;
		
		playerIn.openGui(FoundryCraft.instance, GUI_ID, worldIn, pos.getX(), pos.getY(), pos.getZ());
		
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, heldItem, side, hitX, hitY, hitZ);
	}

}
