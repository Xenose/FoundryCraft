package xenose.foundrycraft.gui.base;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import xenose.foundrycraft.Refercence;

public class FoundryGui extends GuiContainer 
{
	public static int 
		WIDTH = 0,
		HEIGTH = 0;
	
	private static ResourceLocation background;

	public FoundryGui(Container inventorySlotsIn, int picSizX, int picSizeY, String imgName) 
	{
		super(inventorySlotsIn);
		
		background = new ResourceLocation(Refercence.MOD_ID, "textures/gui/" + imgName);
		
		HEIGTH = picSizeY;
		WIDTH = picSizX;
				
		ySize = HEIGTH;
		xSize = WIDTH;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) 
	{
		mc.getTextureManager().bindTexture(background);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}

}
