package xenose.foundrycraft;

public class Refercence 
{
	
	public static final String MOD_ID = "";
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
	{	;
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
