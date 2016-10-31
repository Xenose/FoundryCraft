package xenose.foundrycraft.init;

import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import xenose.foundrycraft.Refercence.FoundryCraftItems;
import xenose.foundrycraft.items.baseitem.FoundryItem;

public class FoundryCrafting 
{
	//mod.addRecipe("woodenBoots 1", 3, 2, ":woodPlank", "", ":woodPlank", ":woodPlank", "", ":woodPlank");	
	
	public static void register()
	{
		
		GameRegistry.addShapelessRecipe(new ItemStack(FoundryItems.wetDarkStoneBrick), Blocks.STONEBRICK, new ItemStack(Items.DYE,1,EnumDyeColor.BLACK.getDyeDamage()));
		
		GameRegistry.addShapedRecipe(new ItemStack(FoundryBlocks.bleedingObsiden), "ODO","LNL","ODO", 'O', Blocks.OBSIDIAN, 'D', Blocks.DIAMOND_BLOCK, 'N', Items.NETHER_STAR, 'L', Blocks.LAPIS_BLOCK);
		
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.aluminiumAxe, "HH ", "HS ", " S ", 'H', "ingotAluminium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.cobaltAxe, "HH ", "HS ", " S ", 'H', "ingotCobalt", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.copperAxe, "HH ", "HS ", " S ", 'H', "ingotCopper", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.leadAxe, "HH ", "HS ", " S ", 'H', "ingotLead", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.lithiumAxe, "HH ", "HS ", " S ", 'H', "ingotLithium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.magnesiumAxe, "HH ", "HS ", " S ", 'H', "ingotMagnesium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.nickelAxe, "HH ", "HS ", " S ", 'H', "ingotNickel", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.platinumAxe, "HH ", "HS ", " S ", 'H', "ingotPlatinum", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.silverAxe, "HH ", "HS ", " S ", 'H', "ingotSilver", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.tinAxe, "HH ", "HS ", " S ", 'H', "ingotTin", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.titaniumAxe, "HH ", "HS ", " S ", 'H', "ingotTitanium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.tungstenAxe, "HH ", "HS ", " S ", 'H', "ingotTungsten", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.uraniumAxe, "HH ", "HS ", " S ", 'H', "ingotUranium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.zincAxe, "HH ", "HS ", " S ", 'H', "ingotZinc", 'S', Items.STICK));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.aluminiumHammer, "HHH", "HSH", " S ", 'H', "ingotAluminium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.cobaltHammer, "HHH", "HSH", " S ", 'H', "ingotCobalt", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.copperHammer, "HHH", "HSH", " S ", 'H', "ingotCopper", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.leadHammer, "HHH", "HSH", " S ", 'H', "ingotLead", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.lithiumHammer, "HHH", "HSH", " S ", 'H', "ingotLithium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.magnesiumHammer, "HHH", "HSH", " S ", 'H', "ingotMagnesium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.nickelHammer, "HHH", "HSH", " S ", 'H', "ingotNickel", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.platinumHammer, "HHH", "HSH", " S ", 'H', "ingotPlatinum", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.silverHammmer, "HHH", "HSH", " S ", 'H', "ingotSilver", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.tinHammer, "HHH", "HSH", " S ", 'H', "ingotTin", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.titaniumHammer, "HHH", "HSH", " S ", 'H', "ingotTitanium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.tungstenHammer, "HHH", "HSH", " S ", 'H', "ingotTungsten", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.uraniumHammer, "HHH", "HSH", " S ", 'H', "ingotUranium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.zincHammer, "HHH", "HSH", " S ", 'H', "ingotZinc", 'S', Items.STICK));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.aluminiumPickaxe, "HHH", " S ", " S ", 'H', "ingotAluminium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.cobaltPickaxe, "HHH", " S ", " S ", 'H', "ingotCobalt", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.copperPickaxe, "HHH", " S ", " S ", 'H', "ingotCopper", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.leadPickaxe, "HHH", " S ", " S ", 'H', "ingotLead", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.lithiumPickaxe, "HHH", " S ", " S ", 'H', "ingotLithium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.magnesiumPickaxe, "HHH", " S ", " S ", 'H', "ingotMagnesium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.nickelPickaxe, "HHH", " S ", " S ", 'H', "ingotNickel", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.platinumPickaxe, "HHH", " S ", " S ", 'H', "ingotPlatinum", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.silverPickaxe, "HHH", " S ", " S ", 'H', "ingotSilver", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.tinPickaxe, "HHH", " S ", " S ", 'H', "ingotTin", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.titaniumPickaxe, "HHH", " S ", " S ", 'H', "ingotTitanium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.tungstenPickaxe, "HHH", " S ", " S ", 'H', "ingotTungsten", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.uraniumPickaxe, "HHH", " S ", " S ", 'H', "ingotUranium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.zincPickaxe, "HHH", " S ", " S ", 'H', "ingotZinc", 'S', Items.STICK));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.aluminiumShovel, " H ", " S ", " S ", 'H', "ingotAluminium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.cobaltShovel, " H ", " S ", " S ", 'H', "ingotCobalt", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.copperShovel, " H ", " S ", " S ", 'H', "ingotCopper", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.leadShovel, " H ", " S ", " S ", 'H', "ingotLead", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.lithiumShovel, " H ", " S ", " S ", 'H', "ingotLithium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.magnesiumShovel, " H ", " S ", " S ", 'H', "ingotMagnesium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.nickelShovel, " H ", " S ", " S ", 'H', "ingotNickel", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.platinumShovel, " H ", " S ", " S ", 'H', "ingotPlatinum", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.silverShovel, " H ", " S ", " S ", 'H', "ingotSilver", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.tinShovel, " H ", " S ", " S ", 'H', "ingotTin", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.titaniumShovel, " H ", " S ", " S ", 'H', "ingotTitanium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.tungstenShovel, " H ", " S ", " S ", 'H', "ingotTungsten", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.uraniumShovel, " H ", " S ", " S ", 'H', "ingotUranium", 'S', Items.STICK));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryItems.zincShovel, " H ", " S ", " S ", 'H', "ingotZink", 'S', Items.STICK));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryBlocks.aluminiumBlock, "III", "III", "III", 'I', "ingotAluminium"));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryBlocks.cobaltBlock, "III", "III", "III", 'I', "ingotCobalt"));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryBlocks.copperBlock, "III", "III", "III", 'I', "ingotCopper"));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryBlocks.leadBlock, "III", "III", "III", 'I', "ingotLead"));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryBlocks.lithiumBlock, "III", "III", "III", 'I', "ingotLithium"));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryBlocks.magnesiumBlock, "III", "III", "III", 'I', "ingotMagnesium"));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryBlocks.nickelBlock, "III", "III", "III", 'I', "ingotNickel"));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryBlocks.platinumBlock, "III", "III", "III", 'I', "ingotPlatinum"));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryBlocks.silverBlock, "III", "III", "III", 'I', "ingotSilver"));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryBlocks.tinBlock, "III", "III", "III", 'I', "ingotTin"));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryBlocks.titaniumBlock, "III", "III", "III", 'I', "ingotTitanium"));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryBlocks.tungstenBlock, "III", "III", "III", 'I', "ingotTungsten"));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryBlocks.uraniumBlock, "III", "III", "III", 'I', "ingotUranium"));
		GameRegistry.addRecipe(new ShapedOreRecipe(FoundryBlocks.zincBlock, "III", "III", "III", 'I', "ingotZink"));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FoundryItems.aluminiumIngot,9), new Object[] {"blockAluminium"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FoundryItems.cobaltIngot,9), new Object[] {"blockCobalt"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FoundryItems.copperIngot,9), new Object[] {"blockCopper"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FoundryItems.leadIngot,9), new Object[] {"blockLead"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FoundryItems.lithiumIngot,9), new Object[] {"blockLithium"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FoundryItems.magnesiumIngot,9), new Object[] {"blockMagnesium"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FoundryItems.nickelIngot,9), new Object[] {"blockNickel"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FoundryItems.platinumIngot,9), new Object[] {"blockPlatinum"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FoundryItems.silverIngot,9), new Object[] {"blockSilver"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FoundryItems.tinIngot,9), new Object[] {"blockTin"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FoundryItems.titaniumIngot,9), new Object[] {"blockTitanium"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FoundryItems.tungstenIngot,9), new Object[] {"blockTungsten"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FoundryItems.uraniumIngot,9), new Object[] {"blockUranium"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(FoundryItems.zincIngot,9), new Object[] {"blockZink"}));
	}

}
