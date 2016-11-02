package xenose.foundrycraft.init;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.http.client.ConnectionBackoffStrategy;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scala.collection.Searching.Found;
import scala.tools.ant.sabbus.CompilationPathProperty;

import static xenose.foundrycraft.Reference.FoundryCraftItems;

import xenose.foundrycraft.Reference;
import xenose.foundrycraft.blocks.baseblock.FoundryBlock;
import xenose.foundrycraft.items.ingots.*;
import xenose.foundrycraft.items.misc.ItemWetDarkStoneBrick;
import xenose.foundrycraft.items.baseitem.FoundryItem;
import xenose.foundrycraft.items.dusts.*;
import xenose.foundrycraft.items.tools.*;
import xenose.foundrycraft.items.tools.axe.*;
import xenose.foundrycraft.items.tools.debug.ItemShovelOfDire;
import xenose.foundrycraft.items.tools.hammer.*;
import xenose.foundrycraft.items.tools.hoe.*;
import xenose.foundrycraft.items.tools.pickaxe.*;
import xenose.foundrycraft.items.tools.shovel.*;
import xenose.foundrycraft.items.tools.sword.*;

public class FoundryItems
{	
	
	public static Item 
	
		// other dusts
		lapisLazuliDust,
		bluestoneDust,
		wetDarkStoneBrick,
	
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
		
		// Tools
		shovelOfDire,
		
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
	
	public static List<Item> itemList;
	
	public static void init()
	{
		itemList = new ArrayList<Item>();
		
		itemList.add(wetDarkStoneBrick = new ItemWetDarkStoneBrick(FoundryCraftItems.WET_DARK_STONE_BRICK));
		itemList.add(shovelOfDire = new ItemShovelOfDire(FoundryCraftItems.SHOVEL_OF_DIRE, 10, 10, Reference.debug, Reference.HAMMER_EFFECTIVE_ON));
		
		itemList.add(aluminiumDust = new ItemAluminiumDust(FoundryCraftItems.ALUMINIUM_DUST));
		itemList.add(cobaltDust = new ItemCobaltDust(FoundryCraftItems.COBALT_DUST));
		itemList.add(copperDust = new ItemCopperDust(FoundryCraftItems.COPPER_DUST));
		itemList.add(leadDust = new ItemLeadDust(FoundryCraftItems.LEAD_DUST));
		itemList.add(lithiumDust = new ItemLithiumDust(FoundryCraftItems.LITHIUM_DUST));
		itemList.add(magnesiumDust = new ItemMagnesiumDust(FoundryCraftItems.MAGNESIUM_DUST));
		itemList.add(nickelDust = new ItemNickelDust(FoundryCraftItems.NICKEL_DUST));
		itemList.add(platinumDust = new ItemPlatinumDust(FoundryCraftItems.PLATINUM_DUST));
		itemList.add(silverDust = new ItemSilverDust(FoundryCraftItems.SILVER_DUST));
		itemList.add(tinDust = new ItemTinDust(FoundryCraftItems.TIN_DUST));
		itemList.add(titaniumDust = new ItemTitaniumDust(FoundryCraftItems.TITANIUM_DUST));
		itemList.add(tungstenDust = new ItemTungstenDust(FoundryCraftItems.TUNGSTEN_DUST));
		itemList.add(uraniumDust = new ItemUraniumDust(FoundryCraftItems.URANIUM_DUST));
		itemList.add(zincDust = new ItemZincDust(FoundryCraftItems.ZINC_DUST));
		
		itemList.add(aluminiumIngot = new ItemAluminiumIngot(FoundryCraftItems.ALUMINIUM_INGOT));
		itemList.add(cobaltIngot = new ItemCobaltIngot(FoundryCraftItems.COBALT_INGOT));
		itemList.add(copperIngot = new ItemCopperIngot(FoundryCraftItems.COPPER_INGOT));
		itemList.add(leadIngot = new ItemLeadIngot(FoundryCraftItems.LEAD_INGOT));
		itemList.add(lithiumIngot = new ItemLithiumIngot(FoundryCraftItems.LITHIUM_INGOT));
		itemList.add(magnesiumIngot = new ItemMagnesiumIngot(FoundryCraftItems.MAGNESIUM_INGOT));
		itemList.add(nickelIngot = new ItemNickelIngot(FoundryCraftItems.NICKEL_INGOT));
		itemList.add(platinumIngot = new ItemPlatinumIngot(FoundryCraftItems.PLATINUM_INGOT));
		itemList.add(silverIngot = new ItemSilverIngot(FoundryCraftItems.SILVER_INGOT));
		itemList.add(tinIngot = new ItemTinIngot(FoundryCraftItems.TIN_INGOT));
		itemList.add(titaniumIngot = new ItemTitaniumIngot(FoundryCraftItems.TITANIUM_INGOT));
		itemList.add(tungstenIngot = new ItemTungstenIngot(FoundryCraftItems.TUNGSTEN_INGOT));
		itemList.add(uraniumIngot = new ItemUraniumIngot(FoundryCraftItems.URANIUM_INGOT));
		itemList.add(zincIngot = new ItemZincIngot(FoundryCraftItems.ZINC_INGOT));
		
		itemList.add(aluminiumAxe = new ItemAluminiumAxe(FoundryCraftItems.ALUMINIUM_AXE, 2F, 3F, Reference.aluminium, Reference.AXE_EFFECTIVE_ON));
		itemList.add(cobaltAxe = new ItemCobaltAxe(FoundryCraftItems.COBALT_AXE, 2F, 2F, Reference.cobalt, Reference.AXE_EFFECTIVE_ON));
		itemList.add(copperAxe = new ItemCopperAxe(FoundryCraftItems.COPPER_AXE, 2F, 2F, Reference.copper, Reference.AXE_EFFECTIVE_ON));
		itemList.add(leadAxe = new ItemLeadAxe(FoundryCraftItems.LEAD_AXE, 2F, 2F, Reference.lead, Reference.AXE_EFFECTIVE_ON));
		itemList.add(lithiumAxe = new ItemLithiumAxe(FoundryCraftItems.LITHIUM_AXE, 2F, 2F, Reference.lithium, Reference.AXE_EFFECTIVE_ON));
		itemList.add(magnesiumAxe = new ItemMagnesiumAxe(FoundryCraftItems.MAGNESIUM_AXE, 2F, 2F, Reference.magnesium, Reference.AXE_EFFECTIVE_ON));
		itemList.add(nickelAxe = new ItemNickelAxe(FoundryCraftItems.NICKEL_AXE, 2F, 2F, Reference.nickel, Reference.AXE_EFFECTIVE_ON));
		itemList.add(platinumAxe = new ItemPlatinumAxe(FoundryCraftItems.PLATINUM_AXE, 2F, 2F, Reference.platinum, Reference.AXE_EFFECTIVE_ON));
		itemList.add(silverAxe = new ItemSilverAxe(FoundryCraftItems.SILVER_AXE, 2F, 2F, Reference.silver, Reference.AXE_EFFECTIVE_ON));
		itemList.add(tinAxe = new ItemTinAxe(FoundryCraftItems.TIN_AXE, 2F , 2F, Reference.tin, Reference.AXE_EFFECTIVE_ON));
		itemList.add(titaniumAxe = new ItemTitaniumAxe(FoundryCraftItems.TITANIUM_AXE, 2F, 2F, Reference.titanium, Reference.AXE_EFFECTIVE_ON));
		itemList.add(tungstenAxe = new ItemTungstenAxe(FoundryCraftItems.TUNGSTEN_AXE, 2F, 2F, Reference.tungsten, Reference.AXE_EFFECTIVE_ON));
		itemList.add(uraniumAxe = new ItemUraniumAxe(FoundryCraftItems.URANIUM_AXE, 2F, 2F, Reference.uranium, Reference.AXE_EFFECTIVE_ON));
		itemList.add(zincAxe = new ItemZincAxe(FoundryCraftItems.ZINC_AXE, 2F, 2F, Reference.zinc, Reference.AXE_EFFECTIVE_ON));
		
		itemList.add(aluminiumHammer = new ItemAluminiumHammer(FoundryCraftItems.ALUMINIUM_HAMMER, 2F, 3F, Reference.aluminium, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(cobaltHammer = new ItemCobaltHammer(FoundryCraftItems.COBALT_HAMMER, 2F, 2F, Reference.cobalt, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(copperHammer = new ItemCopperHammer(FoundryCraftItems.COPPER_HAMMER, 2F, 2F, Reference.copper, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(leadHammer = new ItemLeadHammer(FoundryCraftItems.LEAD_HAMMER, 2F, 1F, Reference.lead, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(lithiumHammer = new ItemLithiumHammer(FoundryCraftItems.LITHIUM_HAMMER, 2F, 2F, Reference.lithium, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(magnesiumHammer = new ItemMagnesiumHammer(FoundryCraftItems.MAGNESIUM_HAMMER, 2F, 2F, Reference.magnesium, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(nickelHammer = new ItemNickelHammer(FoundryCraftItems.NICKEL_HAMMER, 2F, 2F, Reference.nickel, Reference.HAMMER_EFFECTIVE_ON,	 3));
		itemList.add(platinumHammer = new ItemPlatinumHammer(FoundryCraftItems.PLATINUM_HAMMER, 2F, 2F, Reference.platinum, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(silverHammmer = new ItemSilverHammer(FoundryCraftItems.SILVER_HAMMER, 2F, 2F, Reference.silver, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(tinHammer = new ItemTinHammer(FoundryCraftItems.TIN_HAMMER, 2F, 2F, Reference.tin, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(titaniumHammer = new ItemTitaniumHammer(FoundryCraftItems.TITANIUM_HAMMER, 2F, 2F, Reference.titanium, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(tungstenHammer = new ItemTungstenHammer(FoundryCraftItems.TUNGSTEN_HAMMER, 2F, 2F, Reference.tungsten, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(uraniumHammer = new ItemUraniumHammer(FoundryCraftItems.URANIUM_HAMMER, 2F, 2F, Reference.uranium, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(zincHammer = new ItemZincHammer(FoundryCraftItems.ZINC_HAMMER, 2F, 2F, Reference.zinc, Reference.HAMMER_EFFECTIVE_ON, 3));
		
		itemList.add(aluminiumHoe = new ItemAluminiumHoe(FoundryCraftItems.ALUMINIUM_HOE, 2F, 2F, Reference.aluminium, null));
		itemList.add(cobaltHoe = new ItemCobaltHoe(FoundryCraftItems.COBALT_HOE, 2F, 2F, Reference.cobalt, null));
		itemList.add(copperHoe = new ItemCopperHoe(FoundryCraftItems.COPPER_HOE, 2F, 2F, Reference.copper, null));
		itemList.add(leadHoe = new ItemLeadHoe(FoundryCraftItems.LEAD_HOE, 2F, 2F, Reference.lead, null));
		itemList.add(lithiumHoe = new ItemLithiumHoe(FoundryCraftItems.LITHIUM_HOE, 2F, 2F, Reference.lithium, null));
		itemList.add(magnesiumHoe = new ItemMagnesiumHoe(FoundryCraftItems.MAGNESIUM_HOE, 2F, 2F, Reference.magnesium, null));
		itemList.add(nickelHoe = new ItemNickelHoe(FoundryCraftItems.NICKEL_HOE, 2F, 2F, Reference.nickel, null));
		itemList.add(platinumHoe = new ItemPlatinumHoe(FoundryCraftItems.PLATINUM_HOE, 2F, 2F, Reference.platinum, null));
		itemList.add(silverHoe = new ItemSilverHoe(FoundryCraftItems.SILVER_HOE, 2F, 2F, Reference.silver, null));
		itemList.add(tinHoe = new ItemTinHoe(FoundryCraftItems.TIN_HOE, 2F, 2F, Reference.tin, null));
		itemList.add(titaniumHoe = new ItemTitaniumHoe(FoundryCraftItems.TITANIUM_HOE, 2F, 2F, Reference.titanium, null));
		itemList.add(tungstenHoe = new ItemTungstenHoe(FoundryCraftItems.TUNGSTEN_HOE, 2F, 2F, Reference.tungsten, null));
		itemList.add(uraniumHoe = new ItemUraniumHoe(FoundryCraftItems.URANIUM_HOE, 2F, 2F, Reference.zinc, null));
		itemList.add(zincHoe = new ItemZincHoe(FoundryCraftItems.ZINC_HOE, 2F, 2F, Reference.zinc, null));
				
		itemList.add(aluminiumPickaxe = new ItemAluminiumPickaxe(FoundryCraftItems.ALUMINIUM_PICKAXE, 1F, 5F, Reference.aluminium, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(cobaltPickaxe = new ItemCobaltPickaxe(FoundryCraftItems.COBALT_PICKAXE, 2F, 2F, Reference.cobalt, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(copperPickaxe = new ItemCopperPickaxe(FoundryCraftItems.COPPER_PICKAXE, 2F, 3F, Reference.copper, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(leadPickaxe = new ItemLeadPickaxe(FoundryCraftItems.LEAD_PICKAXE, 2F, 2F, Reference.lead, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(lithiumPickaxe = new ItemLithiumPickaxe(FoundryCraftItems.LITHIUM_PICKAXE, 2F, 2F, Reference.lithium, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(magnesiumPickaxe = new ItemMagnesiumPickaxe(FoundryCraftItems.MAGNESIUM_PICKAXE, 2F, 2F, Reference.magnesium, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(nickelPickaxe = new ItemNickelPickaxe(FoundryCraftItems.NICKEL_PICKAXE, 2F, 2F, Reference.nickel, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(platinumPickaxe = new ItemPlatinumPickaxe(FoundryCraftItems.PLATINUM_PICKAXE, 2F, 2F, Reference.platinum, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(silverPickaxe = new ItemSilverPickaxe(FoundryCraftItems.SILVER_PICKAXE, 2F, 2F, Reference.silver, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(tinPickaxe = new ItemTinPickaxe(FoundryCraftItems.TIN_PICLAXE, 2F, 2F, Reference.tin, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(titaniumPickaxe = new ItemTitaniumPickaxe(FoundryCraftItems.TITANIUM_PICKAXE, 2F, 2F, Reference.titanium, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(tungstenPickaxe = new ItemTungstenPickaxe(FoundryCraftItems.TUNGSTEN_PICKAXE, 2F, 2F, Reference.tungsten, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(uraniumPickaxe = new ItemUraniumPickaxe(FoundryCraftItems.URANIUM_PICKAXE, 2F, 2F, Reference.uranium, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(zincPickaxe = new ItemZincPickaxe(FoundryCraftItems.ZINC_PICKAXE, 2F, 2F, Reference.zinc, Reference.PICKAXE_EFFECTIVE_ON));
		
		itemList.add(aluminiumShovel = new ItemAluminiumShovel(FoundryCraftItems.ALUMINIUM_SHOVEL, 2F, 2F, Reference.aluminium, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(cobaltShovel = new ItemCobaltShovel(FoundryCraftItems.COBALT_SHOVEL, 2F, 2F, Reference.cobalt, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(copperShovel = new ItemCopperShovel(FoundryCraftItems.COPPER_SHOVEL, 2F, 2F, Reference.copper, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(leadShovel = new ItemLeadShovel(FoundryCraftItems.LEAD_SHOVEL, 2F, 2F, Reference.lead, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(lithiumShovel = new ItemLithiumShovel(FoundryCraftItems.LITHIUM_SHOVEL, 2F, 2F, Reference.lithium, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(magnesiumShovel = new ItemMagnesiumShovel(FoundryCraftItems.MAGNESIUM_SHOVEL, 2F, 2F, Reference.magnesium, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(nickelShovel = new ItemNickelShovel(FoundryCraftItems.NICKEL_SHOVEL, 2F, 2F, Reference.nickel, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(platinumShovel = new ItemPlatinumShovel(FoundryCraftItems.PLATINUM_SHOVEL, 2F, 2F, Reference.platinum, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(silverShovel = new ItemSilverShovel(FoundryCraftItems.SILVER_SHOVEL, 2F, 2F, Reference.silver, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(tinShovel = new ItemSilverShovel(FoundryCraftItems.TIN_SHOVEL, 2F, 2F, Reference.tin, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(titaniumShovel = new ItemTitaniumShovel(FoundryCraftItems.TITANIUM_SHOVEL, 2F, 2F, Reference.titanium, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(tungstenShovel = new ItemTungstenShovel(FoundryCraftItems.TUNGSTEN_SHOVEL, 2F, 2F, Reference.tungsten, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(uraniumShovel = new ItemUraniumShovel(FoundryCraftItems.URANIUM_SHOVEL, 2F, 2F, Reference.uranium, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(zincShovel = new ItemZincShovel(FoundryCraftItems.ZINC_SHOVEL, 2F, 2F, Reference.zinc, Reference.SHOVEL_EFFECTIVE_ON));
		
		System.out.println("Number of items in FoundryItems init: " + itemList.size());
	}
	
	
	public static void register()
	{
		System.out.println("Loading in Blocks:");
		
		for (int i = 0; i < itemList.size(); i++) 
		{
			if(itemList.get(i) != null)
			{
				System.out.println(itemList.get(i).getUnlocalizedName());
				GameRegistry.register(itemList.get(i));
			}
		}
	}
	
	public static void registerRenders()
	{
		for (int i = 0; i < itemList.size(); i++) 
		{
			if(itemList.get(i) != null)
				registerRender(itemList.get(i));
		}
	}
	
	private static void registerRender(Item item)
	{
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
