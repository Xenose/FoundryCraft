package xenose.foundrycraft;

public class Refercence 
{
	
	public static final String MOD_ID = "xfc";
	public static final String NAME = "Xenose's FoundryCraft Mod";
	
	public static final String VERSION = "1.0.A";
	public static final String ACCEPTED_VERSIONS = "1.10.2";
	
	public static final String CLIENT_PROXY_CLASS = "xenose.foundrycraft.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "xenose.foundrycraft.proxy.ServerProxy";
	
	public static enum FoundryCraftItems
	{	;
		
		
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
		ZINC_ORE("zincOre","BlockZincOre");
		
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
