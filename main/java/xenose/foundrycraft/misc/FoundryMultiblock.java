package xenose.foundrycraft.misc;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FoundryMultiblock 
{
	
	public static boolean checkWorldForBlocks(BlockPos pos, World worldIn, Block[] blockMap, int cubeSize, int heigth)
	{
		for (int i = 0; i <= heigth; i++) 
		{
			for (int j = 0; j < cubeSize; j++) 
			{
				for (int j2 = 0; j2 < cubeSize; j2++) 
				{
					System.out.println(
							"the block that should be here is: " + blockMap[j + i + j2] + 
							" the block that is here is: " + worldIn.getBlockState(pos.add(j, i, j2)).getBlock());
					
					
					if (blockMap[j + i + j2] != Blocks.AIR)
					{
						System.out.println("cheaking block");
						
						if (blockMap[j + i + j2] == worldIn.getBlockState(pos.add(j, i, j2)).getBlock())
							System.out.println("the block is the same");
						else 
						{
							System.out.println("the wanted block: " + blockMap[j + i + j2] + ", The block: " +worldIn.getBlockState(pos.add(j, i, j2)).getBlock());
							return false;
						}
					}
					
					else System.out.println("last block cheack was: " + blockMap[j + i + j2]);
				}
			}
		}
		
		return true;
	}

}
