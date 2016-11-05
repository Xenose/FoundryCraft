package xenose.foundrycraft.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xenose.foundrycraft.Reference;
import static xenose.foundrycraft.Reference.FoundryCraftBlocks;

import java.util.ArrayList;
import java.util.List;

import xenose.foundrycraft.blocks.baseblock.FoundryBlock;
import xenose.foundrycraft.blocks.machines.*;
import xenose.foundrycraft.blocks.*;

public class FoundryBlocks 
{		
	public static FoundryBlock
	
		virusBlock,
		blueSparkFurnace,
	
		blackStoneBrick,
		bleedingObsiden,
		coloredPlanks,
	
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
		zincOre,
		
		aluminiumBlock,
		cobaltBlock,
		copperBlock,
		leadBlock,
		lithiumBlock,
		magnesiumBlock,
		nickelBlock,
		platinumBlock,
		silverBlock,
		tinBlock,
		titaniumBlock,
		tungstenBlock,
		uraniumBlock,
		zincBlock;
	
	public static List<FoundryBlock> blockList;
	
	public static void init()
	{
		blockList = new ArrayList<FoundryBlock>();
		
		blockList.add(virusBlock = new BlockVirusBlock(Material.CLOTH, FoundryCraftBlocks.VIRUS_BLOCK, 3F));
		blockList.add(blueSparkFurnace = new BlockBlueSparkFurnace(Material.IRON, FoundryCraftBlocks.BLUE_SPARK_FURNACE, 2F));
		blockList.add(blackStoneBrick = new BlockBlackStoneBrick(Material.ROCK, FoundryCraftBlocks.BLACK_STONE_BRICK, 1F));
		blockList.add(bleedingObsiden = new BlockBleedingObsiden(Material.ROCK, FoundryCraftBlocks.BLEEDING_OBSIDEN, 40F));

		// ores 
		blockList.add(aluminiumOre = new BlockOres(Material.ROCK, FoundryCraftBlocks.ALUMINIUM_ORE, 15F));
		blockList.add(cobaltOre = new BlockOres(Material.ROCK, FoundryCraftBlocks.COBALT_ORE, 15F));
		blockList.add(copperOre = new BlockOres(Material.ROCK, FoundryCraftBlocks.COPPER_ORE, 15F));
		blockList.add(leadOre = new BlockOres(Material.ROCK, FoundryCraftBlocks.LEAD_ORE, 15F));
		blockList.add(lithiumOre = new BlockLithiumOre(Material.ROCK, FoundryCraftBlocks.LITHIUM_ORE, 15F));
		blockList.add(magnesiumOre = new BlockOres(Material.ROCK, FoundryCraftBlocks.MAGNESIUM_ORE, 15F));
		blockList.add(nickelOre = new BlockOres(Material.ROCK, FoundryCraftBlocks.NICKEL_ORE, 15F));
		blockList.add(platinumOre = new BlockOres(Material.ROCK, FoundryCraftBlocks.PLATINUM_ORE, 15F));
		blockList.add(silverOre = new BlockOres(Material.ROCK, FoundryCraftBlocks.SILVER_ORE, 15F));
		blockList.add(tinOre = new BlockOres(Material.ROCK, FoundryCraftBlocks.TIN_ORE, 15F));
		blockList.add(titaniumOre = new BlockOres(Material.ROCK, FoundryCraftBlocks.TITANIUM_ORE, 15F));
		blockList.add(tungstenOre = new BlockOres(Material.ROCK, FoundryCraftBlocks.TUNGSTEN_ORE, 15F));
		blockList.add(uraniumOre = new BlockOres(Material.ROCK, FoundryCraftBlocks.URANIUM_ORE, 15F));
		blockList.add(zincOre = new BlockOres(Material.ROCK, FoundryCraftBlocks.ZINC_ORE, 15F));
		
		//metal blocks
		blockList.add(aluminiumBlock = new BlockMetalBlocks(Material.IRON, FoundryCraftBlocks.ALUMINIUM_BLOCK, 15F));
		blockList.add(cobaltBlock = new BlockMetalBlocks(Material.IRON, FoundryCraftBlocks.COBALT_BLOCK, 15F));
		blockList.add(copperBlock = new BlockMetalBlocks(Material.IRON, FoundryCraftBlocks.COPPER_BLOCK, 15F));
		blockList.add(leadBlock = new BlockMetalBlocks(Material.IRON, FoundryCraftBlocks.LEAD_BLOCK, 15F));
		blockList.add(lithiumBlock = new BlockMetalBlocks(Material.IRON, FoundryCraftBlocks.LITHIUM_BLOCK, 15F));
		blockList.add(magnesiumBlock = new BlockMetalBlocks(Material.IRON, FoundryCraftBlocks.MAGNESIUM_BLOCK, 15F));
		blockList.add(nickelBlock = new BlockMetalBlocks(Material.IRON, FoundryCraftBlocks.NICKEL_BLOCK, 15F));
		blockList.add(platinumBlock = new BlockMetalBlocks(Material.IRON, FoundryCraftBlocks.PLATINUM_BLOCK, 15F));
		blockList.add(silverBlock = new BlockMetalBlocks(Material.IRON, FoundryCraftBlocks.SILVER_BLOCK, 15F));
		blockList.add(tinBlock = new BlockMetalBlocks(Material.IRON, FoundryCraftBlocks.TIN_BLOCK, 15F));
		blockList.add(titaniumBlock = new BlockMetalBlocks(Material.IRON, FoundryCraftBlocks.TITANIUM_BLOCK, 15F));
		blockList.add(tungstenBlock = new BlockMetalBlocks(Material.IRON, FoundryCraftBlocks.TUNGSTEN_BLOCK, 15F));
		blockList.add(uraniumBlock = new BlockMetalBlocks(Material.IRON, FoundryCraftBlocks.URANIUM_BLOCK, 15F));
		blockList.add(zincBlock = new BlockMetalBlocks(Material.IRON, FoundryCraftBlocks.ZINC_BLOCK, 15f));
		
		System.out.println("Number of blocks in FoundryBlocks init: " + blockList.size());
	}
	
	public static void register()
	{
		System.out.println("Loading in Blocks:");
		
		for (FoundryBlock block : blockList) 
		{
			if(block != null)
			{
				System.out.println(block.getUnlocalizedName());
				registerFoundryBlock(block);
			}
		}
	}
	
	private static void registerFoundryBlock(Block block)
	{
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders()
	{
		for (FoundryBlock block : blockList) 
		{
			if(!block.hasCustomModel())
				registerRender(block);
			else;
		}
	}
	
	private static void registerRender(FoundryBlock block)
	{
		System.out.println("Registery name of current item: " + block.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}
