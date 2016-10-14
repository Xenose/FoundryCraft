package xenose.foundrycraft.init;

import java.util.Set;

import org.apache.http.client.ConnectionBackoffStrategy;

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
		aluminiumPickaxe,
		aluminiumAxe,
		aluminiumHoe,
		aluminiumShovel,
		
		cobaltHammer,
		cobaltPickaxe,
		cobaltAxe,
		cobaltHoe,
		cobaltShovel,
		
		copperHammer,
		copperPickaxe,
		copperAxe,
		copperHoe,
		copperShovel,
		
		leadHammer,
		leadPickaxe,
		leadAxe,
		leadHoe,
		leadShovel,
		
		lithiumHammer,
		lithiumPickaxe,
		lithiumAxe,
		lithiumHoe,
		lithiumShovel,
		
		magnesiumHammer,
		magnesiumPickaxe,
		magnesiumAxe,
		magnesiumHoe,
		magnesiumShovel,
		
		nickelHammer,
		nickelPickaxe,
		nickelAxe,
		nickelHoe,
		nickelShovel,
		
		platinumHammer,
		platinumPickaxe,
		platinumAxe,
		platinumHoe,
		platinumShovel,
		
		silverHammmer,
		silverPickaxe,
		silverAxe,
		silverHoe,
		silverShovel,
		
		tinHammer,
		tinPickaxe,
		tinAxe,
		tinHoe,
		tinShovel,
	
		titaniumHammer,
		titaniumPickaxe,
		titaniumAxe,
		titaniumHoe,
		titaniumShovel,
		
		tungstenHammer,
		tungstenPickaxe,
		tungstenAxe,
		tungstenHoe,
		tungstenShovel,
		
		uraniumHammer,
		uraniumPickaxe,
		uraniumAxe,
		uraniumHoe,
		uraniumShovel,
		
		zincHammer,
		zincPickaxe,
		zincAxe,
		zincHoe,
		zincShovel;
	
	public static Item[] itemList = new Item[FoundryCraftItems.values().length];
	
	public static void init()
	{
		itemIndex = 0;
		aluminiumHammer = itemList[itemIndex++] = new ItemAluminiumHammer(FoundryCraftItems.ALUMINIUM_HAMMER.getUnlocalizedName(), FoundryCraftItems.ALUMINIUM_HAMMER.getRegistryName(), 1F, 1F, Refercence.aluminium, Refercence.HAMMER_EFFECTIVE_ON, 3);
		tungstenHammer = itemList[itemIndex++] = new ItemTungstenHammer(FoundryCraftItems.TUNGSTEN_HAMMER.getUnlocalizedName(), FoundryCraftItems.TUNGSTEN_HAMMER.getRegistryName(), 2F, 2F, Refercence.tungsten, Refercence.HAMMER_EFFECTIVE_ON, 3);
		
		aluminiumPickaxe = itemList[itemIndex++] = new ItemAluminiumPickaxe(FoundryCraftItems.ALUMINIUM_PICKAXE.getUnlocalizedName(), FoundryCraftItems.ALUMINIUM_PICKAXE.getRegistryName(), 1F, 5F, Refercence.aluminium, Refercence.PICKAXE_EFFECTIVE_ON);
		cobaltPickaxe = itemList[itemIndex++] = new ItemCobaltPickaxe(FoundryCraftItems.COBALT_PICKAXE.getUnlocalizedName(), FoundryCraftItems.COBALT_PICKAXE.getRegistryName(), 2F, 2F, Refercence.cobalt, Refercence.PICKAXE_EFFECTIVE_ON);
		copperPickaxe = itemList[itemIndex++] = new ItemCopperPickaxe(FoundryCraftItems.COPPER_PICKAXE.getUnlocalizedName(), FoundryCraftItems.COPPER_PICKAXE.getRegistryName(), 2F, 3F, Refercence.copper, Refercence.PICKAXE_EFFECTIVE_ON);
		leadPickaxe = itemList[itemIndex++] = new ItemLeadPickaxe(FoundryCraftItems.LEAD_PICKAXE.getUnlocalizedName(), FoundryCraftItems.LEAD_PICKAXE.getRegistryName(), 2F, 2F, Refercence.lead, Refercence.PICKAXE_EFFECTIVE_ON);
		lithiumPickaxe = itemList[itemIndex++] = new ItemLithiumPickaxe(FoundryCraftItems.LITHIUM_PICKAXE.getUnlocalizedName(), FoundryCraftItems.LITHIUM_PICKAXE.getRegistryName(), 2F, 2F, Refercence.lithium, Refercence.PICKAXE_EFFECTIVE_ON);
		magnesiumPickaxe = itemList[itemIndex++] = new ItemMagnesiumPickaxe(FoundryCraftItems.MAGNESIUM_PICKAXE.getUnlocalizedName(), FoundryCraftItems.MAGNESIUM_PICKAXE.getRegistryName(), 2F, 2F, Refercence.magnesium, Refercence.PICKAXE_EFFECTIVE_ON);
		nickelPickaxe = itemList[itemIndex++] = new ItemNickelPickaxe(FoundryCraftItems.NICKEL_PICKAXE.getUnlocalizedName(), FoundryCraftItems.NICKEL_PICKAXE.getRegistryName(), 2F, 2F, Refercence.nickel, Refercence.PICKAXE_EFFECTIVE_ON);
		platinumPickaxe = itemList[itemIndex++] = new ItemNickelPickaxe(FoundryCraftItems.PLATINUM_PICKAXE.getUnlocalizedName(), FoundryCraftItems.PLATINUM_PICKAXE.getRegistryName(), 2F, 2F, Refercence.platinum, Refercence.PICKAXE_EFFECTIVE_ON);
		silverPickaxe = itemList[itemIndex++] = new ItemSilverPickaxe(FoundryCraftItems.SILVER_PICKAXE.getUnlocalizedName(), FoundryCraftItems.SILVER_PICKAXE.getRegistryName(), 2F, 2F, Refercence.silver, Refercence.PICKAXE_EFFECTIVE_ON);
		tinPickaxe = itemList[itemIndex++] = new ItemTinPickaxe(FoundryCraftItems.TIN_PICLAXE.getUnlocalizedName(), FoundryCraftItems.TIN_PICLAXE.getRegistryName(), 2F, 2F, Refercence.tin, Refercence.PICKAXE_EFFECTIVE_ON);
		titaniumPickaxe = itemList[itemIndex++] = new ItemTitaniumPickaxe(FoundryCraftItems.TITANIUM_PICKAXE.getUnlocalizedName(), FoundryCraftItems.TITANIUM_PICKAXE.getRegistryName(), 2F, 2F, Refercence.titanium, Refercence.PICKAXE_EFFECTIVE_ON);
		tungstenPickaxe = itemList[itemIndex++] = new ItemTungstenPickaxe(FoundryCraftItems.TUNGSTEN_PICKAXE.getUnlocalizedName(), FoundryCraftItems.TUNGSTEN_PICKAXE.getRegistryName(), 2F, 2F, Refercence.tungsten, Refercence.PICKAXE_EFFECTIVE_ON);
		uraniumPickaxe = itemList[itemIndex++] = new ItemUraniumPickaxe(FoundryCraftItems.URANIUM_PICKAXE.getUnlocalizedName(), FoundryCraftItems.URANIUM_PICKAXE.getRegistryName(), 2F, 2F, Refercence.uranium, Refercence.PICKAXE_EFFECTIVE_ON);
		zincPickaxe = itemList[itemIndex++] = new ItemZincPickaxe(FoundryCraftItems.ZINC_PICKAXE.getUnlocalizedName(), FoundryCraftItems.ZINC_PICKAXE.getRegistryName(), 2F, 2F, Refercence.zinc, Refercence.PICKAXE_EFFECTIVE_ON);
		
		aluminiumShovel = itemList[itemIndex++] = new ItemAluminiumShovel(FoundryCraftItems.ALUMINIUM_SHOVEL.getUnlocalizedName(), FoundryCraftItems.ALUMINIUM_SHOVEL.getRegistryName(), 2F, 2F, Refercence.aluminium, Refercence.SHOVEL_EFFECTIVE_ON);
		cobaltShovel = itemList[itemIndex++] = new ItemCobaltShovel(FoundryCraftItems.COBALT_SHOVEL.getUnlocalizedName(), FoundryCraftItems.COBALT_SHOVEL.getRegistryName(), 2F, 2F, Refercence.cobalt, Refercence.SHOVEL_EFFECTIVE_ON);
		copperShovel = itemList[itemIndex++] = new ItemCopperShovel(FoundryCraftItems.COPPER_SHOVEL.getUnlocalizedName(), FoundryCraftItems.COPPER_SHOVEL.getRegistryName(), 2F, 2F, Refercence.copper, Refercence.SHOVEL_EFFECTIVE_ON);
		leadShovel = itemList[itemIndex++] = new ItemLeadShovel(FoundryCraftItems.LEAD_SHOVEL.getUnlocalizedName(), FoundryCraftItems.LEAD_SHOVEL.getRegistryName(), 2F, 2F, Refercence.lead, Refercence.SHOVEL_EFFECTIVE_ON);
		lithiumShovel = itemList[itemIndex++] = new ItemLithiumShovel(FoundryCraftItems.LITHIUM_SHOVEL.getUnlocalizedName(), FoundryCraftItems.LITHIUM_SHOVEL.getRegistryName(), 2F, 2F, Refercence.lithium, Refercence.SHOVEL_EFFECTIVE_ON);
		magnesiumShovel = itemList[itemIndex++] = new ItemMagnesiumShovel(FoundryCraftItems.MAGNESIUM_SHOVEL.getUnlocalizedName(), FoundryCraftItems.MAGNESIUM_SHOVEL.getRegistryName(), 2F, 2F, Refercence.magnesium, Refercence.SHOVEL_EFFECTIVE_ON);
		nickelShovel = itemList[itemIndex++] = new ItemNickelShovel(FoundryCraftItems.NICKEL_SHOVEL.getUnlocalizedName(), FoundryCraftItems.NICKEL_SHOVEL.getRegistryName(), 2F, 2F, Refercence.nickel, Refercence.SHOVEL_EFFECTIVE_ON);
		platinumShovel = itemList[itemIndex++] = new ItemPlatinumShovel(FoundryCraftItems.PLATINUM_SHOVEL.getUnlocalizedName(), FoundryCraftItems.PLATINUM_SHOVEL.getRegistryName(), 2F, 2F, Refercence.platinum, Refercence.SHOVEL_EFFECTIVE_ON);
		silverShovel = itemList[itemIndex++] = new ItemSilverShovel(FoundryCraftItems.SILVER_SHOVEL.getUnlocalizedName(), FoundryCraftItems.SILVER_SHOVEL.getRegistryName(), 2F, 2F, Refercence.silver, Refercence.SHOVEL_EFFECTIVE_ON);
		tinShovel = itemList[itemIndex++] = new ItemSilverShovel(FoundryCraftItems.TIN_SHOVEL.getUnlocalizedName(), FoundryCraftItems.TIN_SHOVEL.getRegistryName(), 2F, 2F, Refercence.tin, Refercence.SHOVEL_EFFECTIVE_ON);
		titaniumShovel = itemList[itemIndex++] = new ItemTitaniumShovel(FoundryCraftItems.TITANIUM_SHOVEL.getUnlocalizedName(), FoundryCraftItems.TITANIUM_SHOVEL.getRegistryName(), 2F, 2F, Refercence.titanium, Refercence.SHOVEL_EFFECTIVE_ON);
		tungstenShovel = itemList[itemIndex++] = new ItemTungstenShovel(FoundryCraftItems.TUNGSTEN_SHOVEL.getUnlocalizedName(), FoundryCraftItems.TUNGSTEN_SHOVEL.getRegistryName(), 2F, 2F, Refercence.tungsten, Refercence.SHOVEL_EFFECTIVE_ON);
		uraniumShovel = itemList[itemIndex++] = new ItemUraniumShovel(FoundryCraftItems.URANIUM_SHOVEL.getUnlocalizedName(), FoundryCraftItems.URANIUM_SHOVEL.getRegistryName(), 2F, 2F, Refercence.uranium, Refercence.SHOVEL_EFFECTIVE_ON);
		zincShovel = itemList[itemIndex++] = new ItemZincShovel(FoundryCraftItems.ZINC_SHOVEL.getUnlocalizedName(), FoundryCraftItems.ZINC_SHOVEL.getRegistryName(), 2F, 2F, Refercence.zinc, Refercence.SHOVEL_EFFECTIVE_ON);
		
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
