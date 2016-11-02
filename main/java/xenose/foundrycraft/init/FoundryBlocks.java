package xenose.foundrycraft.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xenose.foundrycraft.Reference;
import static xenose.foundrycraft.Reference.FoundryCraftBlocks;

import java.util.ArrayList;
import java.util.List;

import xenose.foundrycraft.blocks.baseblock.FoundryBlock;
import xenose.foundrycraft.blocks.chest.*;
import xenose.foundrycraft.blocks.metalblocks.*;
import xenose.foundrycraft.blocks.misc.*;
import xenose.foundrycraft.blocks.ores.*;

public class FoundryBlocks 
{		
	public static FoundryBlock
	
		virusBlock,
		test2con,
	
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
		blockList.add(blackStoneBrick = new BlockBlackStoneBrick(Material.ROCK, FoundryCraftBlocks.BLACK_STONE_BRICK, 1F));
		blockList.add(bleedingObsiden = new BlockBleedingObsiden(Material.ROCK, FoundryCraftBlocks.BLEEDING_OBSIDEN, 40F));

		// ores 
		blockList.add(aluminiumOre = new BlockAluminiumOre(Material.ROCK, FoundryCraftBlocks.ALUMINIUM_ORE, 15F));
		blockList.add(cobaltOre = new BlockCobaltOre(Material.ROCK, FoundryCraftBlocks.COBALT_ORE, 15F));
		blockList.add(copperOre = new BlockCopperOre(Material.ROCK, FoundryCraftBlocks.COPPER_ORE, 15F));
		blockList.add(leadOre = new BlockLeadOre(Material.ROCK, FoundryCraftBlocks.LEAD_ORE, 15F));
		blockList.add(lithiumOre = new BlockLithiumOre(Material.ROCK, FoundryCraftBlocks.LITHIUM_ORE, 15F));
		blockList.add(magnesiumOre = new BlockMagnesiumOre(Material.ROCK, FoundryCraftBlocks.MAGNESIUM_ORE, 15F));
		blockList.add(nickelOre = new BlockNickelOre(Material.ROCK, FoundryCraftBlocks.NICKEL_ORE, 15F));
		blockList.add(platinumOre = new BlockPlatinumOre(Material.ROCK, FoundryCraftBlocks.PLATINUM_ORE, 15F));
		blockList.add(silverOre = new BlockSilverOre(Material.ROCK, FoundryCraftBlocks.SILVER_ORE, 15F));
		blockList.add(tinOre = new BlockTinOre(Material.ROCK, FoundryCraftBlocks.TIN_ORE, 15F));
		blockList.add(titaniumOre = new BlockTitaniumOre(Material.ROCK, FoundryCraftBlocks.TITANIUM_ORE, 15F));
		blockList.add(tungstenOre = new BlockTungstenOre(Material.ROCK, FoundryCraftBlocks.TUNGSTEN_ORE, 15F));
		blockList.add(uraniumOre = new BlockUraniumOre(Material.ROCK, FoundryCraftBlocks.URANIUM_ORE, 15F));
		blockList.add(zincOre = new BlockZincOre(Material.ROCK, FoundryCraftBlocks.ZINC_ORE, 15F));
		
		//coloredPlanks 	=	blockList[blockIndex++] = new BlockDyedPlanks(Material.WOOD, FoundryCraftBlocks.COLORED_PLANKS.getUnlocalizedName(), FoundryCraftBlocks.COLORED_PLANKS.getRegistryName(), 1F);
		
		//metal blocks
		blockList.add(aluminiumBlock = new BlockAluminiumBlock(Material.IRON, FoundryCraftBlocks.ALUMINIUM_BLOCK, 15F));
		blockList.add(cobaltBlock = new BlockCobaltBlock(Material.IRON, FoundryCraftBlocks.COBALT_BLOCK, 15F));
		blockList.add(copperBlock = new BlockCopperBlock(Material.IRON, FoundryCraftBlocks.COPPER_BLOCK, 15F));
		blockList.add(leadBlock = new BlockLeadBlock(Material.IRON, FoundryCraftBlocks.LEAD_BLOCK, 15F));
		blockList.add(lithiumBlock = new BlockLithiumBlock(Material.IRON, FoundryCraftBlocks.LITHIUM_BLOCK, 15F));
		blockList.add(magnesiumBlock = new BlockMagnesiumBlock(Material.IRON, FoundryCraftBlocks.MAGNESIUM_BLOCK, 15F));
		blockList.add(nickelBlock = new BlockNickelBlock(Material.IRON, FoundryCraftBlocks.NICKEL_BLOCK, 15F));
		blockList.add(platinumBlock = new BlockPlatinumBlock(Material.IRON, FoundryCraftBlocks.PLATINUM_BLOCK, 15F));
		blockList.add(silverBlock = new BlockSilverBlock(Material.IRON, FoundryCraftBlocks.SILVER_BLOCK, 15F));
		blockList.add(tinBlock = new BlockTinBlock(Material.IRON, FoundryCraftBlocks.TIN_BLOCK, 15F));
		blockList.add(titaniumBlock = new BlockTitaniumBlock(Material.IRON, FoundryCraftBlocks.TITANIUM_BLOCK, 15F));
		blockList.add(tungstenBlock = new BlockTungstenBlock(Material.IRON, FoundryCraftBlocks.TUNGSTEN_BLOCK, 15F));
		blockList.add(uraniumBlock = new BlockUraniumBlock(Material.IRON, FoundryCraftBlocks.URANIUM_BLOCK, 15F));
		blockList.add(zincBlock = new BlockZincBlock(Material.IRON, FoundryCraftBlocks.ZINC_BLOCK, 15f));
		
		System.out.println("Number of blocks in FoundryBlocks init: " + blockList.size());
	}
	
	public static void register()
	{
		System.out.println("Loading in Blocks:");
		
		for (int i = 0; i < blockList.size(); i++) 
		{
			if(blockList.get(i) != null)
			{
				System.out.println(blockList.get(i).getUnlocalizedName());
				registerFoundryBlock(blockList.get(i));
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
		for (int i = 0; i < blockList.size(); i++) 
		{
			if (!blockList.get(i).hasCustomModel())
				registerRender(blockList.get(i));
			else blockList.get(i).loadCustomModel();
		}
	}
	
	private static void registerRender(Block block)
	{
		System.out.println("Registery name of current item: " + block.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}
