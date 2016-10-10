package xenose.foundrycraft.init;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xenose.foundrycraft.Refercence;
import static xenose.foundrycraft.Refercence.FoundryCraftBlocks;

import java.util.List;

import xenose.foundrycraft.blocks.baseblock.FoundryBlock;
import xenose.foundrycraft.blocks.ores.*;

public class FoundryBlocks 
{	
	
	public static FoundryBlock[] blockList = new FoundryBlock[1];
	
	public static void init()
	{
		blockList[0] = new BlockAluminiumOre(Material.ROCK, FoundryCraftBlocks.ALUMINIUM_ORE.getUnlocalizedName(), FoundryCraftBlocks.ALUMINIUM_ORE.getRegistryName(), 15F);
		
		System.out.println("Number of blocks in FoundryBlocks init: " + blockList.length);
	}
	
	public static void register()
	{
		for (int i = 0; i < blockList.length; i++) 
		{
			registerFoundryBlock(blockList[i]);
		}
	}
	
	private static void registerFoundryBlock(FoundryBlock block)
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
			registerRender(blockList[i]);
		}
	}
	
	private static void registerRender(FoundryBlock block)
	{
		System.out.println(block.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}
