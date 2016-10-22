package xenose.foundrycraft.blocks.chest;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xenose.foundrycraft.FoundryCraft;
import xenose.foundrycraft.blocks.baseblock.FoundryBlock;
import xenose.foundrycraft.tileentity.base.FoundryTileEntityContainer;

public class Test2Con extends FoundryBlock implements ITileEntityProvider
{
	
	private int cID;

	public Test2Con(Material materialIn, String unlocalizedName, String registryName, float hardness, int containerID) 
	{
		super(materialIn, unlocalizedName, registryName, hardness);
		
		cID = containerID;
		
		setUnlocalizedNameAndRegistry(unlocalizedName, registryName);
		GameRegistry.registerTileEntity(FoundryTileEntityContainer.class, unlocalizedName);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) 
	{
		return new FoundryTileEntityContainer(9, "con2");
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) 
	{
		if(!worldIn.isRemote)
			return true;
		
		TileEntity te = worldIn.getTileEntity(pos);
		
		if(!(te instanceof FoundryTileEntityContainer))
			return false;
		
		playerIn.openGui(FoundryCraft.instance, cID , worldIn, pos.getX(), pos.getY(), pos.getZ());
		
		return true;
	}

}
