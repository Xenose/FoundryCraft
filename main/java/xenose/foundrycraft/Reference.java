package xenose.foundrycraft;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import xenose.foundrycraft.FoundryTab;

public class Reference 
{
	
	public static final String MOD_ID = "xfc";
	public static final String NAME = "Xenose's FoundryCraft Mod";
	
	public static final String VERSION = "1.0.A";
	public static final String ACCEPTED_VERSIONS = "1.10.2";
	
	public static final String CLIENT_PROXY_CLASS = "xenose.foundrycraft.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "xenose.foundrycraft.proxy.ServerProxy";
	
	public static final CreativeTabs 
		CREATIVE_TAB = new FoundryTab("tabFoundryTab", 0),
		CREATIVE_TAB_TOOLS = new FoundryTab("tabFoundryTools", 1),
		CRETIVE_TAB_DEBUG_TOOLS = new FoundryTab("tabFoundryDebugTools", 2);
	
	public static final Set<Block> HAMMER_EFFECTIVE_ON = Sets.newHashSet(new Block[] 
			{
						Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, 
						Blocks.DOUBLE_STONE_SLAB, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, 
						Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE,
						Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB
					}),
			
			PICKAXE_EFFECTIVE_ON = Sets.newHashSet(new Block[] 
					{
						Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, 
						Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, 
						Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, 
						Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, 
						Blocks.STONE_PRESSURE_PLATE
					}),
			
			AXE_EFFECTIVE_ON = Sets.newHashSet(new Block[] 
					{
						Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, 
						Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE
					}),
			
			SHOVEL_EFFECTIVE_ON = Sets.newHashSet(new Block[] 
					{
						Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, 
						Blocks.SOUL_SAND, Blocks.GRASS_PATH
					}),
			
			EFFECTIVE_ON = Sets.newHashSet(new Block[]{});


    
	
	//IRON(2, 250, 6.0F, 2.0F, 14), 			mining levels in use 1 2 3 4 5 6 . 8 . 10 . 12 
	//EnumHelper.addToolMaterial(				name, harvestLevel, maxUses, efficiency, damage, enchantability) 
	public static ToolMaterial
		debug		= EnumHelper.addToolMaterial("DEBUG", 		9999, 	9999, 	9999, 	9999, 	99999),
	
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
		WET_DARK_STONE_BRICK("wetDarkStoneBrick","ItemWetDarkStoneBrick"),
		SHOVEL_OF_DIRE("shovelOfDire","ItemShovelOfDire"),
		
		ALUMINIUM_AXE("aluminiumAxe","ItemAluminiumAxe"),
		ALUMINIUM_HAMMER("aluminiumHammer","ItemAluminiumHammer"),
		ALUMINIUM_HOE("aluminiumHoe","ItemAluminiumHoe"),
		ALUMINIUM_PICKAXE("aluminiumPickaxe","ItemAluminiumPickaxe"),
		ALUMINIUM_SHOVEL("aluminiumShovel","ItemAluminiumShovel"),
		ALUMINIUM_SWORD("aluminiumSword","ItemAluminiumSword"),
		
		COBALT_AXE("cobaltAxe","ItemCobaltAxe"),
		COBALT_HAMMER("cobaltHammer","ItemCobaltHammer"),
		COBALT_HOE("cobaltHoe","ItemCobaltHoe"),
		COBALT_PICKAXE("cobaltPickaxe","ItemCobaltPickaxe"),
		COBALT_SHOVEL("cobaltShovel","ItemCobaltShovel"),
		COBALT_SWORD("cobaltSword","ItemCobaltSword"),
		
		COPPER_AXE("copperAxe","ItemCopperAxe"),
		COPPER_HAMMER("copperHammer","ItemCopperHammer"),
		COPPER_HOE("copperHoe","ItemCopperHoe"),
		COPPER_PICKAXE("copperPickaxe","ItemCopperPickaxe"),
		COPPER_SHOVEL("copperShovel","ItemCopperShovel"),
		COPPER_SWORD("copperSword","ItemCopperSword"),
		
		LEAD_AXE("leadAxe","ItemLeadAxe"),
		LEAD_HAMMER("leadHammer","ItemLeadHammer"),
		LEAD_HOE("leadHoe","ItemLeadHoe"),
		LEAD_PICKAXE("leadPickaxe","ItemLeadPickaxe"),
		LEAD_SHOVEL("leadShovel","ItemLeadShovel"),
		LEAD_SWORD("leadSword","ItemLeadSowrd"),
		
		LITHIUM_AXE("lithiumAxe","ItemLithiumAxe"),
		LITHIUM_HAMMER("lithiumHammer","ItemLithiumHammer"),
		LITHIUM_HOE("lithiumHoe","ItemLithiumHoe"),
		LITHIUM_PICKAXE("lithiumPickaxe","ItemLithiumPickaxe"),
		LITHIUM_SHOVEL("lithiumShovel","ItemLithiumShovel"),
		LITHIUM_SWORD("lithiumSword","ItemLithiumSword"),
		
		MAGNESIUM_AXE("magnesiumAxe","ItemMagnesiumAxe"),
		MAGNESIUM_HAMMER("magnesiumHammer","ItemMagnesiumHammer"),
		MAGNESIUM_HOE("magnesiumHoe","ItemMagnesiumHoe"),
		MAGNESIUM_PICKAXE("magnesiumPickaxe","ItemMagnesiumPickAxe"),
		MAGNESIUM_SHOVEL("magnesiumShovel","ItemMagnesiumShovel"),
		MAGNESIUM_SWORD("magnesiumSword","ItemMagnesiumSword"),
		
		NICKEL_AXE("nickelAxe","ItemNickelAxe"),
		NICKEL_HAMMER("nickelHammer","ItemNickelHammer"),
		NICKEL_HOE("nickelHoe","ItemNickelHoe"),
		NICKEL_PICKAXE("nickelPickaxe","ItemNickelPickaxe"),
		NICKEL_SHOVEL("nickelShovel","ItemNickelShovel"),
		NICKEL_SWORD("nickelSword","ItemNickelSword"),
		
		PLATINUM_AXE("platinumAxe","ItemPlatinumAxe"),
		PLATINUM_HAMMER("platinumHammer","ItemPlatinumHammer"),
		PLATINUM_HOE("platinumHoe","ItemPlatinumHoe"),
		PLATINUM_PICKAXE("platinumPickaxe","ItemPlatinumPickaxe"),
		PLATINUM_SHOVEL("platinumShovel","ItemPlatinumShovel"),
		PLATINUM_SWORD("platinumSword","ItemPlatinumSword"),
		
		SILVER_AXE("silverAxe","ItemSilverAxe"),
		SILVER_HAMMER("silverHammer","ItemSilverHammer"),
		SILVER_HOE("silverHoe","ItemSilverHoe"),
		SILVER_PICKAXE("silverPickaxe","ItemSilverPickaxe"),
		SILVER_SHOVEL("silverShovel","ItemSilverShovel"),
		SILVER_SWORD("silverSword","ItemSilverSword"),
		
		TIN_AXE("tinAxe","ItemTinAxe"),
		TIN_HAMMER("tinHammer","ItemTinHammer"),
		TIN_HOE("tinHoe","ItemTinHoe"),
		TIN_PICLAXE("tinPickaxe","ItemTinPickAxe"),
		TIN_SHOVEL("tinShovel","ItemTinShovel"),
		TIN_SWORD("tinSword","ItemTinSword"),
		
		TITANIUM_AXE("titaniumAxe","ItemTitaniumAxe"),
		TITANIUM_HAMMER("titaniumHammer","ItemTitaniumHammer"),
		TITANIUM_HOE("titaniumHoe","ItemTitaniumHoe"),
		TITANIUM_PICKAXE("titaniumPickaxe","ItemTitaniumPickaxe"),
		TITANIUM_SHOVEL("titaniumShovel","ItemTitaniumShovel"),
		TITANIUM_SWORD("titaniumSword","ItemTitaniumSword"),
		
		TUNGSTEN_AXE("tungstenAxe","ItemTungstenAxe"),
		TUNGSTEN_HAMMER("tungstenHammer","ItemTungstenHammer"),
		TUNGSTEN_HOE("tungstenHoe","ItemTungstenHoe"),
		TUNGSTEN_PICKAXE("tungstenPickaxe","ItemTungstenPickaxe"),
		TUNGSTEN_SHOVEL("tungstenShovel","ItemTungstenShovel"),
		TUNGSTEN_SWORD("tungstenSword","ItemTungstenSword"),
		
		URANIUM_AXE("uraniumAxe","ItemUraniumAxe"),
		URANIUM_HAMMER("uraniumHammer","ItemUraniumHammer"),
		URANIUM_HOE("uraniumHoe","ItemUraniumHoe"),
		URANIUM_PICKAXE("uraniumPickaxe","ItemUraniumPickaxe"),
		URANIUM_SHOVEL("uraniumShovel","ItemUraniumShovel"),
		URANIUM_SWORD("uraniumSword","ItemUraniumSword"),
		
		ZINC_AXE("zincAxe","ItemZincAxe"),
		ZINC_HAMMER("zincHammer","ItemZincHammer"),
		ZINC_HOE("zincHoe","ItemZincHoe"),
		ZINC_PICKAXE("zincPickaxe","ItemZincPickaxe"),
		ZINC_SHOVEL("zincShovel","ItemZincShovel"),
		ZINC_SWORD("zincSword","ItemZincSword"),
		
		ALUMINIUM_DUST("aluminiumDust","ItemAluminiumDust"),
		COBALT_DUST("cobaltDust","ItemCobaltDust"),
		COPPER_DUST("copperDust","ItemCopperDust"),
		LEAD_DUST("leadDust","ItemLeadDust"),
		LITHIUM_DUST("lithiumDust","ItemLithiumDust"),
		MAGNESIUM_DUST("magnesiumDust","ItemMagnesiumDust"),
		NICKEL_DUST("nickelDust","ItemNickelDust"),
		PLATINUM_DUST("platinumDust","ItemPlatinumDust"),
		SILVER_DUST("silverDust","ItemSilverDust"),
		TIN_DUST("tinDust","ItemTinDust"),
		TITANIUM_DUST("titaniumDust","ItemTitaniumDust"),
		TUNGSTEN_DUST("tungstenDust","ItemTungstenDust"),
		URANIUM_DUST("uraniumDust","ItemUraniumDust"),
		ZINC_DUST("zincDust","ItemZincDust"),
		
		ALUMINIUM_INGOT("aluminiumIngot","ItemAluminiumIngot"),
		COBALT_INGOT("cobaltIngot","ItemCobaltIngot"),
		COPPER_INGOT("copperIngot","ItemCopperIngot"),
		LEAD_INGOT("leadIngot","ItemLeadIngot"),
		LITHIUM_INGOT("lithiumIngot","ItemLithiumIngot"),
		MAGNESIUM_INGOT("magnesiumIngot","ItemMagnesiumIngot"),
		NICKEL_INGOT("nickelIngot","ItemNickelIngot"),
		PLATINUM_INGOT("platinumIngot","ItemPlatinumIngot"),
		SILVER_INGOT("silverIngot","ItemSilverIngot"),
		TIN_INGOT("tinIngot","ItemTinIngot"),
		TITANIUM_INGOT("titaniumIngot","ItemTitaniumIngot"),
		TUNGSTEN_INGOT("tungstenIngot","ItemTungstenIngot"),
		URANIUM_INGOT("uraniumIngot","ItemUraniumIngot"),
		ZINC_INGOT("zincIngot","ItemZincIngot");
		
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
		VIRUS_BLOCK("virusBlock","BlockVirusBlock"),
		TEST_CONTAINER_BLOCK("testContainerBlock","BlockTestContainerBlock"),
		
		BLACK_STONE_BRICK("blackStoneBrick","BlockBlackStoneBrick"),
		BLEEDING_OBSIDEN("bleedingObsiden","BlockBleedingObsiden"),
		COLORED_PLANKS("coloredPlanks","blockColoredPlanks"),
		
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
