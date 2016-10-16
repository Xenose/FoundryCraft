package xenose.foundrycraft.init;

import net.minecraftforge.oredict.OreDictionary;

public class FoundryDictionary 
{
	public static void init()
	{
		OreDictionary.registerOre("blockAluminium", FoundryBlocks.aluminiumBlock);
	}
}
