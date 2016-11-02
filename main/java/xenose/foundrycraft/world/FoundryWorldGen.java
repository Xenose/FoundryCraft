package xenose.foundrycraft.world;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.common.registry.IForgeRegistry;
import xenose.foundrycraft.Reference;
import xenose.foundrycraft.init.FoundryBlocks;
import xenose.foundrycraft.world.biomes.FoundryBiome;

public class FoundryWorldGen implements IWorldGenerator
{
	
	private WorldGenMinable gMinable;
	
	private WorldGenerator
		aluminiumOre,
		cobaltOre,
		copperOre,
		leadOre,
		lithiumOre,
		magnesiumOre,
		nickelOre,
		platinumOre,
		silverOre,
		tinOre,
		titaniumOre,
		tungstenOre,
		uraniumOre,
		zincOre;
	
	public FoundryWorldGen() 
	{
		
		aluminiumOre = new WorldGenMinable(FoundryBlocks.aluminiumOre.getDefaultState(), 8);
		cobaltOre = new WorldGenMinable(FoundryBlocks.cobaltOre.getDefaultState(), 8);
		copperOre = new WorldGenMinable(FoundryBlocks.copperOre.getDefaultState(), 8);
		
		leadOre = new WorldGenMinable(FoundryBlocks.leadOre.getDefaultState(), 8);
		lithiumOre = new WorldGenMinable(FoundryBlocks.lithiumOre.getDefaultState(), 10);
		magnesiumOre = new WorldGenMinable(FoundryBlocks.magnesiumOre.getDefaultState(), 5);
		
		nickelOre = new WorldGenMinable(FoundryBlocks.nickelOre.getDefaultState(), 20);
		platinumOre = new WorldGenMinable(FoundryBlocks.platinumOre.getDefaultState(), 2);
		silverOre = new WorldGenMinable(FoundryBlocks.silverOre.getDefaultState(), 10);
		
		tinOre = new WorldGenMinable(FoundryBlocks.tinOre.getDefaultState(), 15);
		titaniumOre = new WorldGenMinable(FoundryBlocks.titaniumOre.getDefaultState(), 1);
		tungstenOre = new WorldGenMinable(FoundryBlocks.tungstenOre.getDefaultState(), 2);
		
		uraniumOre = new WorldGenMinable(FoundryBlocks.uraniumOre.getDefaultState(), 5);
		zincOre = new WorldGenMinable(FoundryBlocks.zincOre.getDefaultState(), 7);
		
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.getDimension()) {
		case 0:
			
			runGenerate(aluminiumOre, world, random, chunkX, chunkZ, 25, 12, 75);
			runGenerate(cobaltOre, world, random, chunkX, chunkZ, 5, 0, 10);
			runGenerate(copperOre, world, random, chunkX, chunkZ, 15, 40, 65);
			
			runGenerate(leadOre, world, random, chunkX, chunkZ, 20, 0, 45);
			runGenerate(lithiumOre, world, random, chunkX, chunkZ, 8, 0, 75);
			runGenerate(magnesiumOre, world, random, chunkX, chunkZ, 12, 20, 25);
			
			runGenerate(nickelOre, world, random, chunkX, chunkZ, 14, 50, 65);
			runGenerate(platinumOre, world, random, chunkX, chunkZ, 2, 0, 5);
			runGenerate(silverOre, world, random, chunkX, chunkZ, 20, 0, 45);
			
			runGenerate(tinOre, world, random, chunkX, chunkZ, 18, 30, 45);
			runGenerate(titaniumOre, world, random, chunkX, chunkZ, 1, 5, 15);
			runGenerate(tungstenOre, world, random, chunkX, chunkZ, 3, 4, 6);
			
			runGenerate(uraniumOre, world, random, chunkX, chunkZ, 5, 0, 75);
			runGenerate(zincOre, world, random, chunkX, chunkZ, 10, 20, 65);
			
			break;	
			
		default:
			break;
		}
	}
	
	private void runGenerate(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chancesToSpawn, int minHeight, int maxHeight)
	{
		if (maxHeight > 256 || minHeight < 0 || maxHeight < minHeight)
		{
			throw new IllegalArgumentException(Reference.MOD_ID + ": HEIGTH IS INVALID!!!");
		}
		
		int heigthDiff = maxHeight - minHeight + 1;
		
		for (int i = 0; i < chancesToSpawn; i++) 
		{
			int wX = chunkX * 16 + random.nextInt(16),
				wY = minHeight + random.nextInt(heigthDiff),
				wZ = chunkZ * 16 + random.nextInt(16);
			
			generator.generate(world, random, new BlockPos(wX,wY,wZ));
			
		}
	}

}
