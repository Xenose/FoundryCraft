package xenose.foundrycraft;

import net.minecraft.client.gui.Gui;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xenose.foundrycraft.Reference.FoundryCraftItems;
import xenose.foundrycraft.eventhandler.FoundryEventHandler;
import xenose.foundrycraft.init.FoundryBiomes;
import xenose.foundrycraft.init.FoundryBlocks;
import xenose.foundrycraft.init.FoundryCrafting;
import xenose.foundrycraft.init.FoundryDictionary;
import xenose.foundrycraft.init.FoundryGUIHandler;
import xenose.foundrycraft.init.FoundryItems;
import xenose.foundrycraft.init.FoundrySmelting;
import xenose.foundrycraft.items.baseitem.FoundryItem;
import xenose.foundrycraft.proxy.CommonProxy;
import xenose.foundrycraft.world.FoundryWorldGen;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class FoundryCraft 
{
	
	@Instance
	public static FoundryCraft instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new FoundryEventHandler());
		
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
		FoundryCrafting.register();
		FoundrySmelting.init();
		
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new FoundryGUIHandler());
		
		System.out.println("initializing Common Proxy");
		proxy.init();
		
		GameRegistry.registerWorldGenerator(new FoundryWorldGen(), 0);
		FoundryBiomes.register();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{	
	}
	

}
