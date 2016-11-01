package xenose.foundrycraft.init;

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

import static xenose.foundrycraft.Refercence.FoundryCraftItems;

import xenose.foundrycraft.Refercence;
import xenose.foundrycraft.items.ingots.*;
import xenose.foundrycraft.items.misc.ItemWetDarkStoneBrick;
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
	
	private static int itemIndex;
	
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
	
	public static Item[] itemList = new Item[FoundryCraftItems.values().length];
	
	public static void init()
	{
		itemIndex = 0;
		
		wetDarkStoneBrick = itemList[itemIndex++] = new ItemWetDarkStoneBrick(FoundryCraftItems.WET_DARK_STONE_BRICK.getUnlocalizedName(), FoundryCraftItems.WET_DARK_STONE_BRICK.getRegistryName());
		shovelOfDire = itemList[itemIndex++] = new ItemShovelOfDire(FoundryCraftItems.SHOVEL_OF_DIRE.getUnlocalizedName(), FoundryCraftItems.SHOVEL_OF_DIRE.getRegistryName(), 10, 10, Refercence.debug, Refercence.HAMMER_EFFECTIVE_ON);
		
		aluminiumDust = itemList[itemIndex++] = new ItemAluminiumDust(FoundryCraftItems.ALUMINIUM_DUST.getUnlocalizedName(), FoundryCraftItems.ALUMINIUM_DUST.getRegistryName());
		cobaltDust = itemList[itemIndex++] = new ItemAluminiumDust(FoundryCraftItems.COBALT_DUST.getUnlocalizedName(), FoundryCraftItems.COBALT_DUST.getRegistryName());
		copperDust = itemList[itemIndex++] = new ItemCopperDust(FoundryCraftItems.COPPER_DUST.getUnlocalizedName(), FoundryCraftItems.COPPER_DUST.getRegistryName());
		leadDust = itemList[itemIndex++] = new ItemLeadDust(FoundryCraftItems.LEAD_DUST.getUnlocalizedName(), FoundryCraftItems.LEAD_DUST.getRegistryName());
		lithiumDust = itemList[itemIndex++] = new ItemLithiumDust(FoundryCraftItems.LITHIUM_DUST.getUnlocalizedName(), FoundryCraftItems.LITHIUM_DUST.getRegistryName());
		magnesiumDust = itemList[itemIndex++] = new ItemMagnesiumDust(FoundryCraftItems.MAGNESIUM_DUST.getUnlocalizedName(), FoundryCraftItems.MAGNESIUM_DUST.getRegistryName());
		nickelDust = itemList[itemIndex++] = new ItemNickelDust(FoundryCraftItems.NICKEL_DUST.getUnlocalizedName(), FoundryCraftItems.NICKEL_DUST.getRegistryName());
		platinumDust = itemList[itemIndex++] = new ItemPlatinumDust(FoundryCraftItems.PLATINUM_DUST.getUnlocalizedName(), FoundryCraftItems.PLATINUM_DUST.getRegistryName());
		silverDust = itemList[itemIndex++] = new ItemSilverDust(FoundryCraftItems.SILVER_DUST.getUnlocalizedName(), FoundryCraftItems.SILVER_DUST.getRegistryName());
		tinDust = itemList[itemIndex++] = new ItemTinDust(FoundryCraftItems.TIN_DUST.getUnlocalizedName(), FoundryCraftItems.TIN_DUST.getRegistryName());
		titaniumDust = itemList[itemIndex++] = new ItemTitaniumDust(FoundryCraftItems.TITANIUM_DUST.getUnlocalizedName(), FoundryCraftItems.TITANIUM_DUST.getRegistryName());
		tungstenDust = itemList[itemIndex++] = new ItemTungstenDust(FoundryCraftItems.TUNGSTEN_DUST.getUnlocalizedName(), FoundryCraftItems.TUNGSTEN_DUST.getRegistryName());
		uraniumDust = itemList[itemIndex++] = new ItemUraniumDust(FoundryCraftItems.URANIUM_DUST.getUnlocalizedName(), FoundryCraftItems.URANIUM_DUST.getRegistryName());
		zincDust = itemList[itemIndex++] = new ItemZincDust(FoundryCraftItems.ZINC_DUST.getUnlocalizedName(), FoundryCraftItems.ZINC_DUST.getRegistryName());
		
		aluminiumIngot = itemList[itemIndex++] = new ItemAluminiumIngot(FoundryCraftItems.ALUMINIUM_INGOT.getUnlocalizedName(), FoundryCraftItems.ALUMINIUM_INGOT.getRegistryName());
		cobaltIngot = itemList[itemIndex++] = new ItemAluminiumIngot(FoundryCraftItems.COBALT_INGOT.getUnlocalizedName(), FoundryCraftItems.COBALT_INGOT.getRegistryName());
		copperIngot = itemList[itemIndex++] = new ItemCopperIngot(FoundryCraftItems.COPPER_INGOT.getUnlocalizedName(), FoundryCraftItems.COPPER_INGOT.getRegistryName());
		leadIngot = itemList[itemIndex++] = new ItemLeadIngot(FoundryCraftItems.LEAD_INGOT.getUnlocalizedName(), FoundryCraftItems.LEAD_INGOT.getRegistryName());
		lithiumIngot = itemList[itemIndex++] = new ItemLithiumIngot(FoundryCraftItems.LITHIUM_INGOT.getUnlocalizedName(), FoundryCraftItems.LITHIUM_INGOT.getRegistryName());
		magnesiumIngot = itemList[itemIndex++] = new ItemMagnesiumIngot(FoundryCraftItems.MAGNESIUM_INGOT.getUnlocalizedName(), FoundryCraftItems.MAGNESIUM_INGOT.getRegistryName());
		nickelIngot = itemList[itemIndex++] = new ItemNickelIngot(FoundryCraftItems.NICKEL_INGOT.getUnlocalizedName(), FoundryCraftItems.NICKEL_INGOT.getRegistryName());
		platinumIngot = itemList[itemIndex++] = new ItemPlatinumIngot(FoundryCraftItems.PLATINUM_INGOT.getUnlocalizedName(), FoundryCraftItems.PLATINUM_INGOT.getRegistryName());
		silverIngot = itemList[itemIndex++] = new ItemSilverIngot(FoundryCraftItems.SILVER_INGOT.getUnlocalizedName(), FoundryCraftItems.SILVER_INGOT.getRegistryName());
		tinIngot = itemList[itemIndex++] = new ItemTinIngot(FoundryCraftItems.TIN_INGOT.getUnlocalizedName(), FoundryCraftItems.TIN_INGOT.getRegistryName());
		titaniumIngot = itemList[itemIndex++] = new ItemTitaniumIngot(FoundryCraftItems.TITANIUM_INGOT.getUnlocalizedName(), FoundryCraftItems.TITANIUM_INGOT.getRegistryName());
		tungstenIngot = itemList[itemIndex++] = new ItemTungstenIngot(FoundryCraftItems.TUNGSTEN_INGOT.getUnlocalizedName(), FoundryCraftItems.TUNGSTEN_INGOT.getRegistryName());
		uraniumIngot = itemList[itemIndex++] = new ItemUraniumIngot(FoundryCraftItems.URANIUM_INGOT.getUnlocalizedName(), FoundryCraftItems.URANIUM_INGOT.getRegistryName());
		zincIngot = itemList[itemIndex++] = new ItemZincIngot(FoundryCraftItems.ZINC_INGOT.getUnlocalizedName(), FoundryCraftItems.ZINC_INGOT.getRegistryName());
		
		aluminiumAxe = itemList[itemIndex++] = new ItemAluminiumAxe(FoundryCraftItems.ALUMINIUM_AXE.getUnlocalizedName(), FoundryCraftItems.ALUMINIUM_AXE.getRegistryName(), 2F, 3F, Refercence.aluminium, Refercence.AXE_EFFECTIVE_ON);
		cobaltAxe = itemList[itemIndex++] = new ItemCobaltAxe(FoundryCraftItems.COBALT_AXE.getUnlocalizedName(), FoundryCraftItems.COBALT_AXE.getRegistryName(), 2F, 2F, Refercence.cobalt, Refercence.AXE_EFFECTIVE_ON);
		copperAxe = itemList[itemIndex++] = new ItemCopperAxe(FoundryCraftItems.COPPER_AXE.getUnlocalizedName(), FoundryCraftItems.COPPER_AXE.getRegistryName(), 2F, 2F, Refercence.copper, Refercence.AXE_EFFECTIVE_ON);
		leadAxe = itemList[itemIndex++] = new ItemLeadAxe(FoundryCraftItems.LEAD_AXE.getUnlocalizedName(), FoundryCraftItems.LEAD_AXE.getRegistryName(), 2F, 2F, Refercence.lead, Refercence.AXE_EFFECTIVE_ON);
		lithiumAxe = itemList[itemIndex++] = new ItemLithiumAxe(FoundryCraftItems.LITHIUM_AXE.getUnlocalizedName(), FoundryCraftItems.LITHIUM_AXE.getRegistryName(), 2F, 2F, Refercence.lithium, Refercence.AXE_EFFECTIVE_ON);
		magnesiumAxe = itemList[itemIndex++] = new ItemMagnesiumAxe(FoundryCraftItems.MAGNESIUM_AXE.getUnlocalizedName(), FoundryCraftItems.MAGNESIUM_AXE.getRegistryName(), 2F, 2F, Refercence.magnesium, Refercence.AXE_EFFECTIVE_ON);
		nickelAxe = itemList[itemIndex++] = new ItemNickelAxe(FoundryCraftItems.NICKEL_AXE.getUnlocalizedName(), FoundryCraftItems.NICKEL_AXE.getRegistryName(), 2F, 2F, Refercence.nickel, Refercence.AXE_EFFECTIVE_ON);
		platinumAxe = itemList[itemIndex++] = new ItemPlatinumAxe(FoundryCraftItems.PLATINUM_AXE.getUnlocalizedName(), FoundryCraftItems.PLATINUM_AXE.getRegistryName(), 2F, 2F, Refercence.platinum, Refercence.AXE_EFFECTIVE_ON);
		silverAxe = itemList[itemIndex++] = new ItemSilverAxe(FoundryCraftItems.SILVER_AXE.getUnlocalizedName(), FoundryCraftItems.SILVER_AXE.getRegistryName(), 2F, 2F, Refercence.silver, Refercence.AXE_EFFECTIVE_ON);
		tinAxe = itemList[itemIndex++] = new ItemTinAxe(FoundryCraftItems.TIN_AXE.getUnlocalizedName(), FoundryCraftItems.TIN_AXE.getRegistryName(), 2F , 2F, Refercence.tin, Refercence.AXE_EFFECTIVE_ON);
		titaniumAxe = itemList[itemIndex++] = new ItemTitaniumAxe(FoundryCraftItems.TITANIUM_AXE.getUnlocalizedName(), FoundryCraftItems.TITANIUM_AXE.getRegistryName(), 2F, 2F, Refercence.titanium, Refercence.AXE_EFFECTIVE_ON);
		tungstenAxe = itemList[itemIndex++] = new ItemTungstenAxe(FoundryCraftItems.TUNGSTEN_AXE.getUnlocalizedName(), FoundryCraftItems.TUNGSTEN_AXE.getRegistryName(), 2F, 2F, Refercence.tungsten, Refercence.AXE_EFFECTIVE_ON);
		uraniumAxe = itemList[itemIndex++] = new ItemUraniumAxe(FoundryCraftItems.URANIUM_AXE.getUnlocalizedName(), FoundryCraftItems.URANIUM_AXE.getRegistryName(), 2F, 2F, Refercence.uranium, Refercence.AXE_EFFECTIVE_ON);
		zincAxe = itemList[itemIndex++] = new ItemZincAxe(FoundryCraftItems.ZINC_AXE.getUnlocalizedName(), FoundryCraftItems.ZINC_AXE.getRegistryName(), 2F, 2F, Refercence.zinc, Refercence.AXE_EFFECTIVE_ON);
		
		aluminiumHammer = itemList[itemIndex++] = new ItemAluminiumHammer(FoundryCraftItems.ALUMINIUM_HAMMER.getUnlocalizedName(), FoundryCraftItems.ALUMINIUM_HAMMER.getRegistryName(), 2F, 3F, Refercence.aluminium, Refercence.HAMMER_EFFECTIVE_ON, 3);
		cobaltHammer = itemList[itemIndex++] = new ItemAluminiumHammer(FoundryCraftItems.COBALT_HAMMER.getUnlocalizedName(), FoundryCraftItems.COBALT_HAMMER.getRegistryName(), 2F, 2F, Refercence.cobalt, Refercence.HAMMER_EFFECTIVE_ON, 3);
		copperHammer = itemList[itemIndex++] = new ItemCopperHammer(FoundryCraftItems.COPPER_HAMMER.getUnlocalizedName(), FoundryCraftItems.COPPER_HAMMER.getRegistryName(), 2F, 2F, Refercence.copper, Refercence.HAMMER_EFFECTIVE_ON, 3);
		leadHammer = itemList[itemIndex++] = new ItemLeadHammer(FoundryCraftItems.LEAD_HAMMER.getUnlocalizedName(), FoundryCraftItems.LEAD_HAMMER.getRegistryName(), 2F, 1F, Refercence.lead, Refercence.HAMMER_EFFECTIVE_ON, 3);
		lithiumHammer = itemList[itemIndex++] = new ItemLithiumHammer(FoundryCraftItems.LITHIUM_HAMMER.getUnlocalizedName(), FoundryCraftItems.LITHIUM_HAMMER.getRegistryName(), 2F, 2F, Refercence.lithium, Refercence.HAMMER_EFFECTIVE_ON, 3);
		magnesiumHammer = itemList[itemIndex++] = new ItemMagnesiumHammer(FoundryCraftItems.MAGNESIUM_HAMMER.getUnlocalizedName(), FoundryCraftItems.MAGNESIUM_HAMMER.getRegistryName(), 2F, 2F, Refercence.magnesium, Refercence.HAMMER_EFFECTIVE_ON, 3);
		nickelHammer = itemList[itemIndex++] = new ItemNickelHammer(FoundryCraftItems.NICKEL_HAMMER.getUnlocalizedName(), FoundryCraftItems.NICKEL_HAMMER.getRegistryName(), 2F, 2F, Refercence.nickel, Refercence.HAMMER_EFFECTIVE_ON,	 3);
		platinumHammer = itemList[itemIndex++] = new ItemPlatinumHammer(FoundryCraftItems.PLATINUM_HAMMER.getUnlocalizedName(), FoundryCraftItems.PLATINUM_HAMMER.getRegistryName(), 2F, 2F, Refercence.platinum, Refercence.HAMMER_EFFECTIVE_ON, 3);
		silverHammmer = itemList[itemIndex++] = new ItemSilverHammer(FoundryCraftItems.SILVER_HAMMER.getUnlocalizedName(), FoundryCraftItems.SILVER_HAMMER.getRegistryName(), 2F, 2F, Refercence.silver, Refercence.HAMMER_EFFECTIVE_ON, 3);
		tinHammer = itemList[itemIndex++] = new ItemTinHammer(FoundryCraftItems.TIN_HAMMER.getUnlocalizedName(), FoundryCraftItems.TIN_HAMMER.getRegistryName(), 2F, 2F, Refercence.tin, Refercence.HAMMER_EFFECTIVE_ON, 3);
		titaniumHammer = itemList[itemIndex++] = new ItemTitaniumHammer(FoundryCraftItems.TITANIUM_HAMMER.getUnlocalizedName(), FoundryCraftItems.TITANIUM_HAMMER.getRegistryName(), 2F, 2F, Refercence.titanium, Refercence.HAMMER_EFFECTIVE_ON, 3);
		tungstenHammer = itemList[itemIndex++] = new ItemTungstenHammer(FoundryCraftItems.TUNGSTEN_HAMMER.getUnlocalizedName(), FoundryCraftItems.TUNGSTEN_HAMMER.getRegistryName(), 2F, 2F, Refercence.tungsten, Refercence.HAMMER_EFFECTIVE_ON, 3);
		uraniumHammer = itemList[itemIndex++] = new ItemUraniumHammer(FoundryCraftItems.URANIUM_HAMMER.getUnlocalizedName(), FoundryCraftItems.URANIUM_HAMMER.getRegistryName(), 2F, 2F, Refercence.uranium, Refercence.HAMMER_EFFECTIVE_ON, 3);
		zincHammer = itemList[itemIndex++] = new ItemZincHammer(FoundryCraftItems.ZINC_HAMMER.getUnlocalizedName(), FoundryCraftItems.ZINC_HAMMER.getRegistryName(), 2F, 2F, Refercence.zinc, Refercence.HAMMER_EFFECTIVE_ON, 3);
		
		aluminiumHoe = itemList[itemIndex++] = new ItemAluminiumHoe(FoundryCraftItems.ALUMINIUM_HOE.getUnlocalizedName(), FoundryCraftItems.ALUMINIUM_HOE.getRegistryName(), 2F, 2F, Refercence.aluminium, null);
		cobaltHoe = itemList[itemIndex++] = new ItemCobaltHoe(FoundryCraftItems.COBALT_HOE.getUnlocalizedName(), FoundryCraftItems.COBALT_HOE.getRegistryName(), 2F, 2F, Refercence.cobalt, null);
		copperHoe = itemList[itemIndex++] = new ItemCopperHoe(FoundryCraftItems.COPPER_HOE.getUnlocalizedName(), FoundryCraftItems.COPPER_HOE.getRegistryName(), 2F, 2F, Refercence.copper, null);
		leadHoe = itemList[itemIndex++] = new ItemLeadHoe(FoundryCraftItems.LEAD_HOE.getUnlocalizedName(), FoundryCraftItems.LEAD_HOE.getRegistryName(), 2F, 2F, Refercence.lead, null);
		lithiumHoe = itemList[itemIndex++] = new ItemLithiumHoe(FoundryCraftItems.LITHIUM_HOE.getUnlocalizedName(), FoundryCraftItems.LITHIUM_HOE.getRegistryName(), 2F, 2F, Refercence.lithium, null);
		magnesiumHoe = itemList[itemIndex++] = new ItemMagnesiumHoe(FoundryCraftItems.MAGNESIUM_HOE.getUnlocalizedName(), FoundryCraftItems.MAGNESIUM_HOE.getRegistryName(), 2F, 2F, Refercence.magnesium, null);
		nickelHoe = itemList[itemIndex++] = new ItemNickelHoe(FoundryCraftItems.NICKEL_HOE.getUnlocalizedName(), FoundryCraftItems.NICKEL_HOE.getRegistryName(), 2F, 2F, Refercence.nickel, null);
		platinumHoe = itemList[itemIndex++] = new ItemPlatinumHoe(FoundryCraftItems.PLATINUM_HOE.getUnlocalizedName(), FoundryCraftItems.PLATINUM_HOE.getRegistryName(), 2F, 2F, Refercence.platinum, null);
		silverHoe = itemList[itemIndex++] = new ItemSilverHoe(FoundryCraftItems.SILVER_HOE.getUnlocalizedName(), FoundryCraftItems.SILVER_HOE.getRegistryName(), 2F, 2F, Refercence.silver, null);
		tinHoe = itemList[itemIndex++] = new ItemTinHoe(FoundryCraftItems.TIN_HOE.getUnlocalizedName(), FoundryCraftItems.TIN_HOE.getRegistryName(), 2F, 2F, Refercence.tin, null);
		titaniumHoe = itemList[itemIndex++] = new ItemTitaniumHoe(FoundryCraftItems.TITANIUM_HOE.getUnlocalizedName(), FoundryCraftItems.TITANIUM_HOE.getRegistryName(), 2F, 2F, Refercence.titanium, null);
		tungstenHoe = itemList[itemIndex++] = new ItemTungstenHoe(FoundryCraftItems.TUNGSTEN_HOE.getUnlocalizedName(), FoundryCraftItems.TUNGSTEN_HOE.getRegistryName(), 2F, 2F, Refercence.tungsten, null);
		uraniumHoe = itemList[itemIndex++] = new ItemUraniumHoe(FoundryCraftItems.URANIUM_HOE.getUnlocalizedName(), FoundryCraftItems.URANIUM_HOE.getRegistryName(), 2F, 2F, Refercence.zinc, null);
		zincHoe = itemList[itemIndex++] = new ItemZincHoe(FoundryCraftItems.ZINC_HOE.getUnlocalizedName(), FoundryCraftItems.ZINC_HOE.getRegistryName(), 2F, 2F, Refercence.zinc, null);
				
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
		
		System.out.println("Number of items in FoundryItems init: " + itemList.length);
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
