package xenose.foundrycraft.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import static xenose.foundrycraft.Refercence.FoundryCraftItems;

public class FoundryItems
{	
	
	private static int itemIndex;
	
	public static Item 
	
		// ingots
		aluminiumIngot,
		cobaltIngot,
		copperIngot,
		leadIngot,
		lithiumIngot,
		MagnesiumIngot,
		nickelIngot,
		platinumIngot,
		silverIngot,
		tinIngot,
		titaniumIngot,
		tungstenIngot,
		uraniumIngot,
		zincIngot,
		
		// Minecraft Items Dusts
		coalDust,
		ironDust,
		diamondDust,
		
		// Foundry metal dusts
		aluminiumDust,
		cobaltDust,
		copperDust,
		leadDust,
		lithiumDust,
		MagnesiumDust,
		nickelDust,
		platinumDust,
		silverDust,
		tinDust,
		titaniumDust,
		tungstenDust,
		uraniumDust,
		zincDust,
		
		// other dusts
		lapisLazuliDust,
		bluestoneDust;
	
	
	
	public static Item[] itemList = new Item[FoundryCraftItems.values().length];
	
	public static void init()
	{
		itemIndex = 0;
		itemIndex = 0;
		
		System.out.println("Number of blocks in FoundryItems init: " + itemList.length);
	}
	
	public static void register()
	{
		System.out.println("Loading in Blocks:");
		
		for (int i = 0; i < itemList.length; i++) 
		{
			if(itemList[i] != null)
			{
				System.out.println(itemList[i].getUnlocalizedName());
				GameRegistry.register(itemList[i]);
			}
		}
	}
	
	public static void registerRenders()
	{
		for (int i = 0; i < itemList.length; i++) 
		{
			if(itemList[i] != null)
				registerRender(itemList[i]);
		}
	}
	
	private static void registerRender(Item item)
	{
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
