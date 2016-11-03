package xenose.foundrycraft.init;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import xenose.foundrycraft.client.gui.GuiTestGui;

public class FoundryGUIHandler implements IGuiHandler
{
	
	public final static int GUI_TEST_GUI = 0;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		switch (ID) 
		{
		default:
			return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		
		switch (ID) 
		{
		case GUI_TEST_GUI:
			return new GuiTestGui();

		default:
			return null;
		}
	}
}
