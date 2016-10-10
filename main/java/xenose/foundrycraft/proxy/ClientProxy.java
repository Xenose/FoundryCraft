package xenose.foundrycraft.proxy;

import xenose.foundrycraft.init.FoundryBlocks;

public class ClientProxy implements CommonProxy
{

	@Override
	public void init() 
	{
		FoundryBlocks.registerRenders();
	}

}
