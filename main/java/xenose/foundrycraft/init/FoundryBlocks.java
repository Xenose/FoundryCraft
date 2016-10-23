package xenose.foundrycraft.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xenose.foundrycraft.Refercence;
import static xenose.foundrycraft.Refercence.FoundryCraftBlocks;
import xenose.foundrycraft.blocks.baseblock.FoundryBlock;
import xenose.foundrycraft.blocks.chest.*;
import xenose.foundrycraft.blocks.metalblocks.*;
import xenose.foundrycraft.blocks.misc.*;
import xenose.foundrycraft.blocks.ores.*;

public class FoundryBlocks 
{	
	
	private static int blockIndex;
	
	public static FoundryBlock
	
		test2con,
	
		blackStoneBrick,
	
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
	
	public static FoundryBlock[] blockList = new FoundryBlock[FoundryCraftBlocks.values().length];
	
	public static void init()
	{
		blockIndex = 0;
		
		//test2con		= 	blockList[blockIndex++] = new Test2Con(Material.IRON, FoundryCraftBlocks.TEST_CONTAINER_BLOCK.getUnlocalizedName(), FoundryCraftBlocks.TEST_CONTAINER_BLOCK.getRegistryName(), 1, 1);
		
		blackStoneBrick	= 	blockList[blockIndex++] = new BlockBlackStoneBrick(Material.ROCK, FoundryCraftBlocks.BLACK_STONE_BRICK.getUnlocalizedName(), FoundryCraftBlocks.BLACK_STONE_BRICK.getRegistryName(), 1F);
		
		// ores 
		aluminiumOre 	= 	blockList[blockIndex++] = new BlockAluminiumOre(Material.ROCK, FoundryCraftBlocks.ALUMINIUM_ORE.getUnlocalizedName(), FoundryCraftBlocks.ALUMINIUM_ORE.getRegistryName(), 15F);
		cobaltOre 		= 	blockList[blockIndex++] = new BlockCobaltOre(Material.ROCK, FoundryCraftBlocks.COBALT_ORE.getUnlocalizedName(), FoundryCraftBlocks.COBALT_ORE.getRegistryName(), 15F);
		copperOre 		= 	blockList[blockIndex++] = new BlockCopperOre(Material.ROCK, FoundryCraftBlocks.COPPER_ORE.getUnlocalizedName(), FoundryCraftBlocks.COPPER_ORE.getRegistryName(), 15F);
		leadOre 		= 	blockList[blockIndex++] = new BlockLeadOre(Material.ROCK, FoundryCraftBlocks.LEAD_ORE.getUnlocalizedName(), FoundryCraftBlocks.LEAD_ORE.getRegistryName(), 15F);
		lithiumOre 		= 	blockList[blockIndex++] = new BlockLithiumOre(Material.ROCK, FoundryCraftBlocks.LITHIUM_ORE.getUnlocalizedName(), FoundryCraftBlocks.LITHIUM_ORE.getRegistryName(), 15F);
		magnesiumOre 	=	blockList[blockIndex++] = new BlockMagnesiumOre(Material.ROCK, FoundryCraftBlocks.MAGNESIUM_ORE.getUnlocalizedName(), FoundryCraftBlocks.MAGNESIUM_ORE.getRegistryName(), 15F);
		nickelOre 		= 	blockList[blockIndex++] = new BlockNickelOre(Material.ROCK, FoundryCraftBlocks.NICKEL_ORE.getUnlocalizedName(), FoundryCraftBlocks.NICKEL_ORE.getRegistryName(), 15F);
		platinumOre 	= 	blockList[blockIndex++] = new BlockPlatinumOre(Material.ROCK, FoundryCraftBlocks.PLATINUM_ORE.getUnlocalizedName(), FoundryCraftBlocks.PLATINUM_ORE.getRegistryName(), 15F);
		silverOre 		= 	blockList[blockIndex++] = new BlockSilverOre(Material.ROCK, FoundryCraftBlocks.SILVER_ORE.getUnlocalizedName(), FoundryCraftBlocks.SILVER_ORE.getRegistryName(), 15F);
		tinOre 			= 	blockList[blockIndex++] = new BlockTinOre(Material.ROCK, FoundryCraftBlocks.TIN_ORE.getUnlocalizedName(), FoundryCraftBlocks.TIN_ORE.getRegistryName(), 15F);
		titaniumOre 	= 	blockList[blockIndex++] = new BlockTitaniumOre(Material.ROCK, FoundryCraftBlocks.TITANIUM_ORE.getUnlocalizedName(), FoundryCraftBlocks.TITANIUM_ORE.getRegistryName(), 15F);
		tungstenOre 	= 	blockList[blockIndex++] = new BlockTungstenOre(Material.ROCK, FoundryCraftBlocks.TUNGSTEN_ORE.getUnlocalizedName(), FoundryCraftBlocks.TUNGSTEN_ORE.getRegistryName(), 15F);
		uraniumOre 		= 	blockList[blockIndex++] = new BlockUraniumOre(Material.ROCK, FoundryCraftBlocks.URANIUM_ORE.getUnlocalizedName(), FoundryCraftBlocks.URANIUM_ORE.getRegistryName(), 15F);
		zincOre 		= 	blockList[blockIndex++] = new BlockZincOre(Material.ROCK, FoundryCraftBlocks.ZINC_ORE.getUnlocalizedName(),FoundryCraftBlocks.ZINC_ORE.getRegistryName(), 15F);
		
		//metal blocks
		aluminiumBlock 	= 	blockList[blockIndex++] = new BlockAluminiumBlock(Material.IRON, FoundryCraftBlocks.ALUMINIUM_BLOCK.getUnlocalizedName(), FoundryCraftBlocks.ALUMINIUM_BLOCK.getRegistryName(), 15F);
		cobaltBlock 	= 	blockList[blockIndex++] = new BlockCobaltBlock(Material.IRON, FoundryCraftBlocks.COBALT_BLOCK.getUnlocalizedName(), FoundryCraftBlocks.COBALT_BLOCK.getRegistryName(), 15F);
		copperBlock 	= 	blockList[blockIndex++] = new BlockCopperBlock(Material.IRON, FoundryCraftBlocks.COPPER_BLOCK.getUnlocalizedName(), FoundryCraftBlocks.COPPER_BLOCK.getRegistryName(), 15F);
		leadBlock 		= 	blockList[blockIndex++] = new BlockLeadBlock(Material.IRON, FoundryCraftBlocks.LEAD_BLOCK.getUnlocalizedName(), FoundryCraftBlocks.LEAD_BLOCK.getRegistryName(), 15F);
		lithiumBlock 	= 	blockList[blockIndex++] = new BlockLithiumBlock(Material.IRON, FoundryCraftBlocks.LITHIUM_BLOCK.getUnlocalizedName(), FoundryCraftBlocks.LITHIUM_BLOCK.getRegistryName(), 15F);
		magnesiumBlock 	= 	blockList[blockIndex++] = new BlockMagnesiumBlock(Material.IRON, FoundryCraftBlocks.MAGNESIUM_BLOCK.getUnlocalizedName(), FoundryCraftBlocks.MAGNESIUM_BLOCK.getRegistryName(), 15F);
		nickelBlock 	= 	blockList[blockIndex++] = new BlockNickelBlock(Material.IRON, FoundryCraftBlocks.NICKEL_BLOCK.getUnlocalizedName(), FoundryCraftBlocks.NICKEL_BLOCK.getRegistryName(), 15F);
		platinumBlock 	= 	blockList[blockIndex++] = new BlockPlatinumBlock(Material.IRON, FoundryCraftBlocks.PLATINUM_BLOCK.getUnlocalizedName(), FoundryCraftBlocks.PLATINUM_BLOCK.getRegistryName(), 15F);
		silverBlock 	= 	blockList[blockIndex++] = new BlockSilverBlock(Material.IRON, FoundryCraftBlocks.SILVER_BLOCK.getUnlocalizedName(), FoundryCraftBlocks.SILVER_BLOCK.getRegistryName(), 15F);
		tinBlock 		= 	blockList[blockIndex++] = new BlockTinBlock(Material.IRON, FoundryCraftBlocks.TIN_BLOCK.getUnlocalizedName(), FoundryCraftBlocks.TIN_BLOCK.getRegistryName(), 15F);
		titaniumBlock 	= 	blockList[blockIndex++] = new BlockTitaniumBlock(Material.IRON, FoundryCraftBlocks.TITANIUM_BLOCK.getUnlocalizedName(), FoundryCraftBlocks.TITANIUM_BLOCK.getRegistryName(), 15F);
		tungstenBlock 	=	blockList[blockIndex++] = new BlockTungstenBlock(Material.IRON, FoundryCraftBlocks.TUNGSTEN_BLOCK.getUnlocalizedName(), FoundryCraftBlocks.TUNGSTEN_BLOCK.getRegistryName(), 15F);
		uraniumBlock 	= 	blockList[blockIndex++] = new BlockUraniumBlock(Material.IRON, FoundryCraftBlocks.URANIUM_BLOCK.getUnlocalizedName(), FoundryCraftBlocks.URANIUM_BLOCK.getRegistryName(), 15F);
		zincBlock 		= 	blockList[blockIndex++] = new BlockZincBlock(Material.IRON, FoundryCraftBlocks.ZINC_BLOCK.getUnlocalizedName(), FoundryCraftBlocks.ZINC_BLOCK.getRegistryName(), 15f);
		
		blockIndex = 0;
		
		System.out.println("Number of blocks in FoundryBlocks init: " + blockList.length);
	}
	
	public static void register()
	{
		System.out.println("Loading in Blocks:");
		
		for (int i = 0; i < blockList.length; i++) 
		{
			if(blockList[i] != null)
			{
				System.out.println(blockList[i].getUnlocalizedName());
				registerFoundryBlock(blockList[i]);
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
		for (int i = 0; i < blockList.length; i++) 
		{
			if(blockList[i] != null)
				if (!blockList[i].hasCustomModel())
					registerRender(blockList[i]);
				else blockList[i].loadCustomModel();
		}
	}
	
	private static void registerRender(Block block)
	{
		System.out.println("Registery name of current item: " + block.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}
