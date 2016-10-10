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
import xenose.foundrycraft.blocks.ores.*;

public class FoundryBlocks 
{	
	
	public static Block[] blockList = new Block[FoundryCraftBlocks.values().length];
	
	public static void init()
	{
		blockList[0] = new BlockAluminiumOre(Material.ROCK, FoundryCraftBlocks.ALUMINIUM_ORE.getUnlocalizedName(), FoundryCraftBlocks.ALUMINIUM_ORE.getRegistryName(), 15F);
		blockList[1] = new BlockCobaltOre(Material.ROCK, FoundryCraftBlocks.COBALT_ORE.getUnlocalizedName(), FoundryCraftBlocks.COBALT_ORE.getRegistryName(), 15F);
		blockList[2] = new BlockCopperOre(Material.ROCK, FoundryCraftBlocks.COPPER_ORE.getUnlocalizedName(), FoundryCraftBlocks.COPPER_ORE.getRegistryName(), 15F);
		blockList[3] = new BlockLeadOre(Material.ROCK, FoundryCraftBlocks.LEAD_ORE.getUnlocalizedName(), FoundryCraftBlocks.LEAD_ORE.getRegistryName(), 15F);
		
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
				registerRender(blockList[i]);
		}
	}
	
	private static void registerRender(Block block)
	{
		System.out.println("Registery name of current item: " + block.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}
