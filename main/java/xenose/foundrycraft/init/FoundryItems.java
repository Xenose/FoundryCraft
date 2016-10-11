package xenose.foundrycraft.init;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;
import static xenose.foundrycraft.Refercence.FoundryCraftItems;

import xenose.foundrycraft.Refercence;
import xenose.foundrycraft.items.tools.*;

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
		magnesiumIngot,
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
		magnesiumDust,
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
		bluestoneDust,
		
		// Tools
		aluminiumHammer,
		aluminiumPickAxe,
		aluminiumAxe,
		aluminiumHoe,
		aluminiumShovel,
		
		cobaltHammer,
		cobaltPickAxe,
		cobaltAxe,
		cobaltHoe,
		cobaltShovel,
		
		copperHammer,
		copperPickAxe,
		copperAxe,
		copperHoe,
		copperShovel,
		
		leadHammer,
		leadPickAxe,
		leadAxe,
		leadHoe,
		leadShovel,
		
		lithiumHammer,
		lithiumPickAxe,
		lithiumAxe,
		lithiumHoe,
		lithiumShovel,
		
		magnesiumHammer,
		magnesiumPickAxe,
		magnesiumAxe,
		magnesiumHoe,
		magnesiumShovel,
		
		nickelHammer,
		nickelPickAxe,
		nickelAxe,
		nickelHoe,
		nickelShovel,
		
		platinumHammer,
		platinumPickAxe,
		platinumAxe,
		platinumHoe,
		platinumShovel,
		
		silverHammmer,
		silverPickAxe,
		silverAxe,
		silverHoe,
		silverShovel,
		
		tinHammer,
		tinPickAxe,
		tinAxe,
		tinHoe,
		tinShovel,
	
		titaniumHammer,
		titaniumPickAxe,
		titaniumAxe,
		titaniumHoe,
		titaniumShovel,
		
		tungstenHammer,
		tungstenPickAxe,
		tungstenAxe,
		tungstenHoe,
		tungstenShovel,
		
		uraniumHammer,
		uraniumPickAxe,
		uraniumAxe,
		uraniumHoe,
		uraniumShovel,
		
		zincHammer,
		zincPickAxe,
		zincAxe,
		zincHoe,
		zincShovel;
	
	public static Item[] itemList = new Item[FoundryCraftItems.values().length];
	
	public static void init()
	{
		itemIndex = 0;
		aluminiumHammer = itemList[itemIndex++] = new ItemAluminiumHammer(FoundryCraftItems.ALUMINIUM_HAMMER.getUnlocalizedName(), FoundryCraftItems.ALUMINIUM_HAMMER.getRegistryName(), 1F, 1F, Refercence.aluminium, Refercence.HAMMER_EFFECTIVE_ON, 3);
		tungstenHammer = itemList[itemIndex++] = new ItemTungstenHammer(FoundryCraftItems.TUNGSTEN_HAMMER.getUnlocalizedName(), FoundryCraftItems.TUNGSTEN_HAMMER.getRegistryName(), 2F, 2F, Refercence.tungsten, Refercence.HAMMER_EFFECTIVE_ON, 3);
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
