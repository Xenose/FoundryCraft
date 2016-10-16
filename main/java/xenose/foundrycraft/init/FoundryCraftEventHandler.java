package xenose.foundrycraft.init;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FoundryCraftEventHandler 
{
	
	public void init()
	{
		MinecraftForge.EVENT_BUS.register(this);
	}

}
