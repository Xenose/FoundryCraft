package xenose.foundrycraft.blocks.misc;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import xenose.foundrycraft.Reference;
import xenose.foundrycraft.Reference.FoundryCraftBlocks;
import xenose.foundrycraft.blocks.baseblock.FoundryBlock;
import xenose.foundrycraft.init.FoundryBlocks;

public class BlockVirusBlock extends FoundryBlock
{
	public BlockVirusBlock(Material materialIn, FoundryCraftBlocks foundryEnum, float hardness) 
	{
		super(materialIn, foundryEnum, hardness);
		setUnlocalizedNameAndRegistry(foundryEnum);
		setTickRandomly(true);
		setCreativeTab(Reference.CRETIVE_TAB_DEBUG_TOOLS);
	}
	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) 
	{
		super.updateTick(worldIn, pos, state, rand);
		
		if (worldIn.getBlockState(pos.east()) != Blocks.AIR.getDefaultState() && worldIn.getBlockState(pos.east()) != FoundryBlocks.virusBlock.getDefaultState())
			worldIn.setBlockState(pos.east(), this.getDefaultState());
		
		if (worldIn.getBlockState(pos.west()) != Blocks.AIR.getDefaultState() && worldIn.getBlockState(pos.west()) != FoundryBlocks.virusBlock.getDefaultState())
			worldIn.setBlockState(pos.west(), this.getDefaultState());
		
		if (worldIn.getBlockState(pos.up()) != Blocks.AIR.getDefaultState() && worldIn.getBlockState(pos.up()) != FoundryBlocks.virusBlock.getDefaultState())
			worldIn.setBlockState(pos.up(), this.getDefaultState());
		
		if (worldIn.getBlockState(pos.down()) != Blocks.AIR.getDefaultState() && worldIn.getBlockState(pos.down()) != FoundryBlocks.virusBlock.getDefaultState())
			worldIn.setBlockState(pos.down(), this.getDefaultState());
		
		if (worldIn.getBlockState(pos.south()) != Blocks.AIR.getDefaultState() && worldIn.getBlockState(pos.south()) != FoundryBlocks.virusBlock.getDefaultState())
			worldIn.setBlockState(pos.south(), this.getDefaultState());
		
		if (worldIn.getBlockState(pos.north()) != Blocks.AIR.getDefaultState() && worldIn.getBlockState(pos.north()) != FoundryBlocks.virusBlock.getDefaultState())
			worldIn.setBlockState(pos.north(), this.getDefaultState());
	}
	
	@Override
	public int tickRate(World worldIn)
	{
		return 20;
	}
}
