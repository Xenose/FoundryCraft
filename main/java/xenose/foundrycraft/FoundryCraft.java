package xenose.foundrycraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xenose.foundrycraft.proxy.CommonProxy;

@Mod(modid = "", name = "", version = "", acceptedMinecraftVersions = "")
public class FoundryCraft 
{
	
	@Instance
	public static FoundryCraft instance;
	
	@SidedProxy(clientSide = Refercence.CLIENT_PROXY_CLASS, serverSide = Refercence.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	

}
