package xenose.foundrycraft.init;

import com.mojang.realmsclient.dto.RealmsServer.WorldType;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xenose.foundrycraft.world.biomes.FoundryBiome;

public class FoundryBiomes 
{
	
	public static void register()
	{
		Biome.BiomeProperties a  = new Biome.BiomeProperties("artic");
		FoundryBiome test = new FoundryBiome(a);
		BiomeManager.addBiome(BiomeType.COOL,new BiomeEntry(test, 100));
		BiomeManager.addSpawnBiome(test);
		BiomeDictionary.registerBiomeType(test, BiomeDictionary.Type.COLD);
	}
	
}
