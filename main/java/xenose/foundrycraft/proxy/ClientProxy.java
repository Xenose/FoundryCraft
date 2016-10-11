package xenose.foundrycraft.proxy;

import xenose.foundrycraft.init.FoundryBlocks;
import xenose.foundrycraft.init.FoundryItems;

public class ClientProxy implements CommonProxy
{

	@Override
	public void init() 
	{
		FoundryBlocks.registerRenders();
		FoundryItems.registerRenders();
	}

}
