package xenose.foundrycraft.items.tools.hammer;

import java.util.Set;

import net.minecraft.block.Block;
import xenose.foundrycraft.Reference.FoundryCraftItems;
import xenose.foundrycraft.items.baseitem.FoundryHammer;

public class ItemTitaniumHammer extends FoundryHammer 
{

	public ItemTitaniumHammer(FoundryCraftItems foundryEnum, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn, int harrvestArea) 
	{
		super(foundryEnum, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn, harrvestArea);
		setunlocalizedAndRegistryName(foundryEnum);
	}

}
