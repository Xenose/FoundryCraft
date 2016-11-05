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
import xenose.foundrycraft.items.ItemFoundryIngots;
import xenose.foundrycraft.items.ItemFoundyDusts;
import xenose.foundrycraft.items.ItemWetDarkStoneBrick;
import xenose.foundrycraft.items.baseitem.FoundryAxe;
import xenose.foundrycraft.items.baseitem.FoundryItem;
import xenose.foundrycraft.items.tools.*;
import xenose.foundrycraft.items.tools.debug.ItemShovelOfDire;

public class FoundryItems
{	
	
	public static Item 
	
		introBook,
	
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
		
		itemList.add(introBook = new ItemIntroBook(FoundryCraftItems.INTRO_BOOK));
		itemList.add(wetDarkStoneBrick = new ItemWetDarkStoneBrick(FoundryCraftItems.WET_DARK_STONE_BRICK));
		
		itemList.add(shovelOfDire = new ItemShovelOfDire(FoundryCraftItems.SHOVEL_OF_DIRE, 10, 10, Reference.debug, Reference.HAMMER_EFFECTIVE_ON));
		
		itemList.add(aluminiumDust = new ItemFoundyDusts(FoundryCraftItems.ALUMINIUM_DUST));
		itemList.add(cobaltDust = new ItemFoundyDusts(FoundryCraftItems.COBALT_DUST));
		itemList.add(copperDust = new ItemFoundyDusts(FoundryCraftItems.COPPER_DUST));
		itemList.add(leadDust = new ItemFoundyDusts(FoundryCraftItems.LEAD_DUST));
		itemList.add(lithiumDust = new ItemFoundyDusts(FoundryCraftItems.LITHIUM_DUST));
		itemList.add(magnesiumDust = new ItemFoundyDusts(FoundryCraftItems.MAGNESIUM_DUST));
		itemList.add(nickelDust = new ItemFoundyDusts(FoundryCraftItems.NICKEL_DUST));
		itemList.add(platinumDust = new ItemFoundyDusts(FoundryCraftItems.PLATINUM_DUST));
		itemList.add(silverDust = new ItemFoundyDusts(FoundryCraftItems.SILVER_DUST));
		itemList.add(tinDust = new ItemFoundyDusts(FoundryCraftItems.TIN_DUST));
		itemList.add(titaniumDust = new ItemFoundyDusts(FoundryCraftItems.TITANIUM_DUST));
		itemList.add(tungstenDust = new ItemFoundyDusts(FoundryCraftItems.TUNGSTEN_DUST));
		itemList.add(uraniumDust = new ItemFoundyDusts(FoundryCraftItems.URANIUM_DUST));
		itemList.add(zincDust = new ItemFoundyDusts(FoundryCraftItems.ZINC_DUST));
		
		itemList.add(aluminiumIngot = new ItemFoundryIngots(FoundryCraftItems.ALUMINIUM_INGOT));
		itemList.add(cobaltIngot = new ItemFoundryIngots(FoundryCraftItems.COBALT_INGOT));
		itemList.add(copperIngot = new ItemFoundryIngots(FoundryCraftItems.COPPER_INGOT));
		itemList.add(leadIngot = new ItemFoundryIngots(FoundryCraftItems.LEAD_INGOT));
		itemList.add(lithiumIngot = new ItemFoundryIngots(FoundryCraftItems.LITHIUM_INGOT));
		itemList.add(magnesiumIngot = new ItemFoundryIngots(FoundryCraftItems.MAGNESIUM_INGOT));
		itemList.add(nickelIngot = new ItemFoundryIngots(FoundryCraftItems.NICKEL_INGOT));
		itemList.add(platinumIngot = new ItemFoundryIngots(FoundryCraftItems.PLATINUM_INGOT));
		itemList.add(silverIngot = new ItemFoundryIngots(FoundryCraftItems.SILVER_INGOT));
		itemList.add(tinIngot = new ItemFoundryIngots(FoundryCraftItems.TIN_INGOT));
		itemList.add(titaniumIngot = new ItemFoundryIngots(FoundryCraftItems.TITANIUM_INGOT));
		itemList.add(tungstenIngot = new ItemFoundryIngots(FoundryCraftItems.TUNGSTEN_INGOT));
		itemList.add(uraniumIngot = new ItemFoundryIngots(FoundryCraftItems.URANIUM_INGOT));
		itemList.add(zincIngot = new ItemFoundryIngots(FoundryCraftItems.ZINC_INGOT));
		
		itemList.add(aluminiumAxe = new ItemFoundryAxes(FoundryCraftItems.ALUMINIUM_AXE, 2F, 3F, Reference.aluminium, Reference.AXE_EFFECTIVE_ON));
		itemList.add(cobaltAxe = new ItemFoundryAxes(FoundryCraftItems.COBALT_AXE, 2F, 2F, Reference.cobalt, Reference.AXE_EFFECTIVE_ON));
		itemList.add(copperAxe = new ItemFoundryAxes(FoundryCraftItems.COPPER_AXE, 2F, 2F, Reference.copper, Reference.AXE_EFFECTIVE_ON));
		itemList.add(leadAxe = new ItemFoundryAxes(FoundryCraftItems.LEAD_AXE, 2F, 2F, Reference.lead, Reference.AXE_EFFECTIVE_ON));
		itemList.add(lithiumAxe = new ItemFoundryAxes(FoundryCraftItems.LITHIUM_AXE, 2F, 2F, Reference.lithium, Reference.AXE_EFFECTIVE_ON));
		itemList.add(magnesiumAxe = new ItemFoundryAxes(FoundryCraftItems.MAGNESIUM_AXE, 2F, 2F, Reference.magnesium, Reference.AXE_EFFECTIVE_ON));
		itemList.add(nickelAxe = new ItemFoundryAxes(FoundryCraftItems.NICKEL_AXE, 2F, 2F, Reference.nickel, Reference.AXE_EFFECTIVE_ON));
		itemList.add(platinumAxe = new ItemFoundryAxes(FoundryCraftItems.PLATINUM_AXE, 2F, 2F, Reference.platinum, Reference.AXE_EFFECTIVE_ON));
		itemList.add(silverAxe = new ItemFoundryAxes(FoundryCraftItems.SILVER_AXE, 2F, 2F, Reference.silver, Reference.AXE_EFFECTIVE_ON));
		itemList.add(tinAxe = new ItemFoundryAxes(FoundryCraftItems.TIN_AXE, 2F , 2F, Reference.tin, Reference.AXE_EFFECTIVE_ON));
		itemList.add(titaniumAxe = new ItemFoundryAxes(FoundryCraftItems.TITANIUM_AXE, 2F, 2F, Reference.titanium, Reference.AXE_EFFECTIVE_ON));
		itemList.add(tungstenAxe = new ItemFoundryAxes(FoundryCraftItems.TUNGSTEN_AXE, 2F, 2F, Reference.tungsten, Reference.AXE_EFFECTIVE_ON));
		itemList.add(uraniumAxe = new ItemFoundryAxes(FoundryCraftItems.URANIUM_AXE, 2F, 2F, Reference.uranium, Reference.AXE_EFFECTIVE_ON));
		itemList.add(zincAxe = new ItemFoundryAxes(FoundryCraftItems.ZINC_AXE, 2F, 2F, Reference.zinc, Reference.AXE_EFFECTIVE_ON));
		
		itemList.add(aluminiumHammer = new ItemFoundryHammers(FoundryCraftItems.ALUMINIUM_HAMMER, 2F, 3F, Reference.aluminium, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(cobaltHammer = new ItemFoundryHammers(FoundryCraftItems.COBALT_HAMMER, 2F, 2F, Reference.cobalt, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(copperHammer = new ItemFoundryHammers(FoundryCraftItems.COPPER_HAMMER, 2F, 2F, Reference.copper, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(leadHammer = new ItemFoundryHammers(FoundryCraftItems.LEAD_HAMMER, 2F, 1F, Reference.lead, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(lithiumHammer = new ItemFoundryHammers(FoundryCraftItems.LITHIUM_HAMMER, 2F, 2F, Reference.lithium, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(magnesiumHammer = new ItemFoundryHammers(FoundryCraftItems.MAGNESIUM_HAMMER, 2F, 2F, Reference.magnesium, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(nickelHammer = new ItemFoundryHammers(FoundryCraftItems.NICKEL_HAMMER, 2F, 2F, Reference.nickel, Reference.HAMMER_EFFECTIVE_ON,	 3));
		itemList.add(platinumHammer = new ItemFoundryHammers(FoundryCraftItems.PLATINUM_HAMMER, 2F, 2F, Reference.platinum, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(silverHammmer = new ItemFoundryHammers(FoundryCraftItems.SILVER_HAMMER, 2F, 2F, Reference.silver, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(tinHammer = new ItemFoundryHammers(FoundryCraftItems.TIN_HAMMER, 2F, 2F, Reference.tin, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(titaniumHammer = new ItemFoundryHammers(FoundryCraftItems.TITANIUM_HAMMER, 2F, 2F, Reference.titanium, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(tungstenHammer = new ItemFoundryHammers(FoundryCraftItems.TUNGSTEN_HAMMER, 2F, 2F, Reference.tungsten, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(uraniumHammer = new ItemFoundryHammers(FoundryCraftItems.URANIUM_HAMMER, 2F, 2F, Reference.uranium, Reference.HAMMER_EFFECTIVE_ON, 3));
		itemList.add(zincHammer = new ItemFoundryHammers(FoundryCraftItems.ZINC_HAMMER, 2F, 2F, Reference.zinc, Reference.HAMMER_EFFECTIVE_ON, 3));
		
		itemList.add(aluminiumHoe = new ItemFoundryHoes(FoundryCraftItems.ALUMINIUM_HOE, 2F, 2F, Reference.aluminium, null));
		itemList.add(cobaltHoe = new ItemFoundryHoes(FoundryCraftItems.COBALT_HOE, 2F, 2F, Reference.cobalt, null));
		itemList.add(copperHoe = new ItemFoundryHoes(FoundryCraftItems.COPPER_HOE, 2F, 2F, Reference.copper, null));
		itemList.add(leadHoe = new ItemFoundryHoes(FoundryCraftItems.LEAD_HOE, 2F, 2F, Reference.lead, null));
		itemList.add(lithiumHoe = new ItemFoundryHoes(FoundryCraftItems.LITHIUM_HOE, 2F, 2F, Reference.lithium, null));
		itemList.add(magnesiumHoe = new ItemFoundryHoes(FoundryCraftItems.MAGNESIUM_HOE, 2F, 2F, Reference.magnesium, null));
		itemList.add(nickelHoe = new ItemFoundryHoes(FoundryCraftItems.NICKEL_HOE, 2F, 2F, Reference.nickel, null));
		itemList.add(platinumHoe = new ItemFoundryHoes(FoundryCraftItems.PLATINUM_HOE, 2F, 2F, Reference.platinum, null));
		itemList.add(silverHoe = new ItemFoundryHoes(FoundryCraftItems.SILVER_HOE, 2F, 2F, Reference.silver, null));
		itemList.add(tinHoe = new ItemFoundryHoes(FoundryCraftItems.TIN_HOE, 2F, 2F, Reference.tin, null));
		itemList.add(titaniumHoe = new ItemFoundryHoes(FoundryCraftItems.TITANIUM_HOE, 2F, 2F, Reference.titanium, null));
		itemList.add(tungstenHoe = new ItemFoundryHoes(FoundryCraftItems.TUNGSTEN_HOE, 2F, 2F, Reference.tungsten, null));
		itemList.add(uraniumHoe = new ItemFoundryHoes(FoundryCraftItems.URANIUM_HOE, 2F, 2F, Reference.zinc, null));
		itemList.add(zincHoe = new ItemFoundryHoes(FoundryCraftItems.ZINC_HOE, 2F, 2F, Reference.zinc, null));
				
		itemList.add(aluminiumPickaxe = new ItemFoundryPickaxes(FoundryCraftItems.ALUMINIUM_PICKAXE, 1F, 5F, Reference.aluminium, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(cobaltPickaxe = new ItemFoundryPickaxes(FoundryCraftItems.COBALT_PICKAXE, 2F, 2F, Reference.cobalt, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(copperPickaxe = new ItemFoundryPickaxes(FoundryCraftItems.COPPER_PICKAXE, 2F, 3F, Reference.copper, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(leadPickaxe = new ItemFoundryPickaxes(FoundryCraftItems.LEAD_PICKAXE, 2F, 2F, Reference.lead, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(lithiumPickaxe = new ItemFoundryPickaxes(FoundryCraftItems.LITHIUM_PICKAXE, 2F, 2F, Reference.lithium, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(magnesiumPickaxe = new ItemFoundryPickaxes(FoundryCraftItems.MAGNESIUM_PICKAXE, 2F, 2F, Reference.magnesium, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(nickelPickaxe = new ItemFoundryPickaxes(FoundryCraftItems.NICKEL_PICKAXE, 2F, 2F, Reference.nickel, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(platinumPickaxe = new ItemFoundryPickaxes(FoundryCraftItems.PLATINUM_PICKAXE, 2F, 2F, Reference.platinum, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(silverPickaxe = new ItemFoundryPickaxes(FoundryCraftItems.SILVER_PICKAXE, 2F, 2F, Reference.silver, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(tinPickaxe = new ItemFoundryPickaxes(FoundryCraftItems.TIN_PICLAXE, 2F, 2F, Reference.tin, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(titaniumPickaxe = new ItemFoundryPickaxes(FoundryCraftItems.TITANIUM_PICKAXE, 2F, 2F, Reference.titanium, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(tungstenPickaxe = new ItemFoundryPickaxes(FoundryCraftItems.TUNGSTEN_PICKAXE, 2F, 2F, Reference.tungsten, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(uraniumPickaxe = new ItemFoundryPickaxes(FoundryCraftItems.URANIUM_PICKAXE, 2F, 2F, Reference.uranium, Reference.PICKAXE_EFFECTIVE_ON));
		itemList.add(zincPickaxe = new ItemFoundryPickaxes(FoundryCraftItems.ZINC_PICKAXE, 2F, 2F, Reference.zinc, Reference.PICKAXE_EFFECTIVE_ON));
		
		itemList.add(aluminiumShovel = new ItemFoundryShovels(FoundryCraftItems.ALUMINIUM_SHOVEL, 2F, 2F, Reference.aluminium, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(cobaltShovel = new ItemFoundryShovels(FoundryCraftItems.COBALT_SHOVEL, 2F, 2F, Reference.cobalt, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(copperShovel = new ItemFoundryShovels(FoundryCraftItems.COPPER_SHOVEL, 2F, 2F, Reference.copper, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(leadShovel = new ItemFoundryShovels(FoundryCraftItems.LEAD_SHOVEL, 2F, 2F, Reference.lead, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(lithiumShovel = new ItemFoundryShovels(FoundryCraftItems.LITHIUM_SHOVEL, 2F, 2F, Reference.lithium, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(magnesiumShovel = new ItemFoundryShovels(FoundryCraftItems.MAGNESIUM_SHOVEL, 2F, 2F, Reference.magnesium, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(nickelShovel = new ItemFoundryShovels(FoundryCraftItems.NICKEL_SHOVEL, 2F, 2F, Reference.nickel, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(platinumShovel = new ItemFoundryShovels(FoundryCraftItems.PLATINUM_SHOVEL, 2F, 2F, Reference.platinum, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(silverShovel = new ItemFoundryShovels(FoundryCraftItems.SILVER_SHOVEL, 2F, 2F, Reference.silver, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(tinShovel = new ItemFoundryShovels(FoundryCraftItems.TIN_SHOVEL, 2F, 2F, Reference.tin, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(titaniumShovel = new ItemFoundryShovels(FoundryCraftItems.TITANIUM_SHOVEL, 2F, 2F, Reference.titanium, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(tungstenShovel = new ItemFoundryShovels(FoundryCraftItems.TUNGSTEN_SHOVEL, 2F, 2F, Reference.tungsten, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(uraniumShovel = new ItemFoundryShovels(FoundryCraftItems.URANIUM_SHOVEL, 2F, 2F, Reference.uranium, Reference.SHOVEL_EFFECTIVE_ON));
		itemList.add(zincShovel = new ItemFoundryShovels(FoundryCraftItems.ZINC_SHOVEL, 2F, 2F, Reference.zinc, Reference.SHOVEL_EFFECTIVE_ON));
		
		System.out.println("Number of items in FoundryItems init: " + itemList.size());
	}
	
	
	public static void register()
	{
		System.out.println("Loading in Blocks:");
		
		for (Item item : itemList) 
		{
			if(item != null)
			{
				System.out.println(item.getUnlocalizedName());
				GameRegistry.register(item);
			}
		}
	}
	
	public static void registerRenders()
	{
		for (Item item : itemList) 
		{
			if(item != null)
				registerRender(item);
		}
	}
	
	private static void registerRender(Item item)
	{
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
