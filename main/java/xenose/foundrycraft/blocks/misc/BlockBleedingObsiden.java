package xenose.foundrycraft.blocks.misc;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import xenose.foundrycraft.Reference.FoundryCraftBlocks;
import xenose.foundrycraft.blocks.baseblock.FoundryBlock;
import xenose.foundrycraft.init.FoundryBlocks;
import xenose.foundrycraft.misc.FoundryMultiblock;

public class BlockBleedingObsiden extends FoundryBlock
{
	
	public BlockBleedingObsiden(Material materialIn, FoundryCraftBlocks foundryEnum, float hardness) 
	{
		super(materialIn, foundryEnum, hardness);
		setUnlocalizedNameAndRegistry(foundryEnum);
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) 
	{
		super.onBlockActivated(worldIn, pos, state, playerIn, hand, heldItem, side, hitX, hitY, hitZ);
		
		System.out.println("pressed on the bleeding obsiden");
		
		playerIn.addChatComponentMessage(new TextComponentTranslation("Set the spawn point to: " + pos.add(0, 1, 0)));
		playerIn.setSpawnPoint(pos.add(0, 1, 0), true);
		
		/*if(FoundryMultiblock.checkWorldForBlocks(pos.add(-2, -1, -2), worldIn, multiBlockMap, multiBlockMap.length/2, 2))
		{
			playerIn.addChatComponentMessage(new TextComponentTranslation("Set the spawn point to: " + pos.add(0, 1, 0)));
			playerIn.setSpawnPoint(pos.add(0, 1, 0), true);
		}*/
		
		return true;
	}

}
