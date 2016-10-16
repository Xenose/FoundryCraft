package xenose.foundrycraft.blocks.ores;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import xenose.foundrycraft.blocks.baseblock.FoundryBlock;

public class BlockLithiumOre extends FoundryBlock
{

	Random random;
	public static final PropertyBool EXPLODE = PropertyBool.create("explode");
	
	public BlockLithiumOre(Material materialIn, String unlocalizedName, String registryName, float hardness) 
	{
		super(materialIn, unlocalizedName, registryName, hardness);
		setUnlocalizedNameAndRegistry(unlocalizedName, registryName);
		random = new Random();
	}
	
	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) 
	{
		if (random.nextInt(100) <= 1 && !player.isCreative())
		{
			int dmg = random.nextInt(21);
			
			if (!worldIn.isRemote)
				worldIn.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), dmg, true);
			
			player.attackEntityFrom(DamageSource.generic, dmg - (int) 
					Math.sqrt(
							Math.abs((pos.getX() - player.posX) * (pos.getX() - player.posX)) +  
							Math.abs((pos.getY() - player.posY) * (pos.getY() - player.posX)) +  
							Math.abs((pos.getZ() - player.posZ) * (pos.getZ() - player.posZ))
							)
					);
			
			System.out.println("the size of the explosion was: " + dmg);
		}
		
		super.onBlockHarvested(worldIn, pos, state, player);
	}
	
	
	
}
