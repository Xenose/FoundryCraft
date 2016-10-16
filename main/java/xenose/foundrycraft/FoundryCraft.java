package xenose.foundrycraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xenose.foundrycraft.gui.FoundryGUIHandler;
import xenose.foundrycraft.init.FoundryBlocks;
import xenose.foundrycraft.init.FoundryDictionary;
import xenose.foundrycraft.init.FoundryItems;
import xenose.foundrycraft.init.FoundrySmelting;
import xenose.foundrycraft.init.FoundryWorldGen;
import xenose.foundrycraft.items.baseitem.FoundryItem;
import xenose.foundrycraft.proxy.CommonProxy;

@Mod(modid = Refercence.MOD_ID, name = Refercence.NAME, version = Refercence.VERSION, acceptedMinecraftVersions = Refercence.ACCEPTED_VERSIONS)
public class FoundryCraft 
{
	
	@Instance
	public static FoundryCraft instance;
	
	@SidedProxy(clientSide = Refercence.CLIENT_PROXY_CLASS, serverSide = Refercence.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("Starting Xenose FoundryCraft Mod");
		System.out.println("===================================================================================================================================================");
		
		System.out.println("initializing FoundryBlocks");
		FoundryBlocks.init();
		System.out.println("Register FoundryBlocks");
		FoundryBlocks.register();
		
		System.out.println("initializing FoundryItems");
		FoundryItems.init();
		System.out.println("Register FoundryItems");
		FoundryItems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		FoundryDictionary.init();
		FoundrySmelting.init();
		
		System.out.println("initializing Common Proxy");
		proxy.init();
		
		GameRegistry.registerWorldGenerator(new FoundryWorldGen(), 0);
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new FoundryGUIHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{	
	}
	

}
