package xenose.foundrycraft;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import xenose.foundrycraft.FoundryTab;

public class Refercence 
{
	
	public static final String MOD_ID = "xfc";
	public static final String NAME = "Xenose's FoundryCraft Mod";
	
	public static final String VERSION = "1.0.A";
	public static final String ACCEPTED_VERSIONS = "1.10.2";
	
	public static final String CLIENT_PROXY_CLASS = "xenose.foundrycraft.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "xenose.foundrycraft.proxy.ServerProxy";
	
	public static final CreativeTabs CREATIVE_TAB = new FoundryTab();
	
	public static final Set<Block> HAMMER_EFFECTIVE_ON = Sets.newHashSet(new Block[] 
			{
					Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, 
					Blocks.DOUBLE_STONE_SLAB, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, 
					Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE,
					Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB
					});
	
	//IRON(2, 250, 6.0F, 2.0F, 14), 			mining levels in use 1 2 3 4 5 6 . 8 . 10 . 12 
	//EnumHelper.addToolMaterial(				name, harvestLevel, maxUses, efficiency, damage, enchantability) 
	public static ToolMaterial
		aluminium 	= EnumHelper.addToolMaterial("ALUMINIUM", 	2,		125, 	3, 		1, 		7),
		cobalt 		= EnumHelper.addToolMaterial("COBALT", 		4, 		500, 	12, 	6, 		24),
		copper	 	= EnumHelper.addToolMaterial("COPPER", 		1, 		125, 	1, 		1, 		6),
		lead 		= EnumHelper.addToolMaterial("LEAD", 		1, 		2, 		6, 		12, 	50),
		lithium		= EnumHelper.addToolMaterial("LITHIUM", 	1, 		1, 		1, 		5, 		0),
		magnesium	= EnumHelper.addToolMaterial("MAGNESIUM", 	1, 		83, 	2, 		3, 		0),
		nickel		= EnumHelper.addToolMaterial("NICKEL", 		2, 		250, 	6, 		2, 		14),
		platinum	= EnumHelper.addToolMaterial("PLATINUM", 	2, 		250, 	6, 		10, 	25),
		silver		= EnumHelper.addToolMaterial("SILVER", 		2, 		125, 	12, 	6, 		16),
		tin			= EnumHelper.addToolMaterial("TIN", 		1, 		4, 		1, 		0, 		0),
		titanium	= EnumHelper.addToolMaterial("TITANIUM", 	12, 	1500, 	10, 	14, 	35),
		tungsten 	= EnumHelper.addToolMaterial("TUNGSTEN", 	10, 	1255, 	8, 		8, 		30),
		uranium		= EnumHelper.addToolMaterial("URANIUM", 	8, 		1000, 	5, 		3, 		0),
		zinc		= EnumHelper.addToolMaterial("ZINC", 		2, 		200, 	2, 		1, 		10),
		
		// alloy
		steel		= EnumHelper.addToolMaterial("STEEL", 		6, 		400, 	8, 		4, 		18),
		bronze		= EnumHelper.addToolMaterial("BRONZE", 		5, 		325, 	6, 		3, 		15),
	    brass		= EnumHelper.addToolMaterial("BRASS", 		2,		312, 	2, 		2, 		14);
	
	public static enum FoundryCraftItems
	{	
		ALUMINIUM_HAMMER("aluminiumHammer","ItemAluminiumHammer"),
		TUNGSTEN_HAMMER("tungstenHammer","ItemTungstenHammer");
		
		private String UnlocalizedName;
		private String registryName;
		
		private FoundryCraftItems(String unlocalizedName, String registryName) 
		{
			this.UnlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() { return UnlocalizedName; }
		public String getRegistryName() { return registryName; }
	}
	
	public static enum FoundryCraftBlocks
	{	
		ALUMINIUM_ORE("aluminiumOre", "BlockAluminiumOre"),
		COBALT_ORE("cobaltOre","BlockCobaltOre"),
		COPPER_ORE("copperOre","BlockCopperOre"),
		LEAD_ORE("leadOre", "BlockLeadOre"),
		LITHIUM_ORE("lithiumOre","BlockLithiumOre"),
		MAGNESIUM_ORE("magnesiumOre","BlockMagnesiumOre"),
		NICKEL_ORE("nickelOre","BlockNickelOre"),
		PLATINUM_ORE("platinumOre","BlockPlatinumOre"),
		SILVER_ORE("silverOre","BlockSilverOre"),
		TIN_ORE("tinOre","BlockTinOre"),
		TITANIUM_ORE("titaniumOre","BlockTitaniumOre"),
		TUNGSTEN_ORE("tungstenOre","BlockTungstenOre"),
		URANIUM_ORE("uraniumOre","BlockUraniumOre"),
		ZINC_ORE("zincOre","BlockZincOre"),
		
		ALUMINIUM_BLOCK("aluminiumBlock","BlockAluminiumBlock"),
		COBALT_BLOCK("cobaltBlock","BlockCobaltBlock"),
		COPPER_BLOCK("copperBlock","BlockCopperBlock"),
		LEAD_BLOCK("leadBlock","BlockLeadBlock"),
		LITHIUM_BLOCK("lithiumBlock","BlockLithiumBlock"),
		MAGNESIUM_BLOCK("magnesiumBlock","BlockMagnesiumBlock"),
		NICKEL_BLOCK("nickelBlock","BlockNickelBlock"),
		PLATINUM_BLOCK("platinumBlock","BlockPlatinumBlock"),
		SILVER_BLOCK("silverBlock","BlockSilverBlock"),
		TIN_BLOCK("tinBlock","BlockTinBlock"),
		TITANIUM_BLOCK("titaniumBlock","BlockTitaniumBlock"),
		TUNGSTEN_BLOCK("tungstenBlock","BlockTungstenBlock"),
		URANIUM_BLOCK("uraniumBlock","BlockUraniumBlock"),
		ZINC_BLOCK("zincBlock","BlockZincBlock");
		
		private String UnlocalizedName;
		private String registryName;
		
		private FoundryCraftBlocks(String unlocalizedName, String registryName) 
		{
			this.UnlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() { return UnlocalizedName; }
		public String getRegistryName() { return registryName; }
	}

}
