package xenose.foundrycraft.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.util.ResourceLocation;

public class GuiTestGui extends GuiScreen
{
	private static final ResourceLocation testGui = new ResourceLocation("xfc:textures/gui/container/testcontainer.png");
	
	public GuiTestGui() 
	{
		super();
		setGuiSize(176, 165);
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) 
	{
		this.drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
	
	@Override
	public boolean doesGuiPauseGame() 
	{
		return true;
	}
}
