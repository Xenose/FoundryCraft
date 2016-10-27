package xenose.foundrycraft.world.biomes;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;

public class FoundryBiome extends Biome
{

	public FoundryBiome(BiomeProperties properties) 
	{
		super(properties);
	}
	
	@Override
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) 
	{
		this.topBlock = Blocks.ICE.getDefaultState();
		this.fillerBlock = Blocks.SNOW.getDefaultState();
		this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
	}
	
	@Override
	public boolean getEnableSnow() 
	{
		return true;
	}
	
	@Override
	public float getSpawningChance() 
	{
		return 0;
	}

}
