package xenose.foundrycraft.items.tools.axe;

import java.util.Set;

import net.minecraft.block.Block;
import xenose.foundrycraft.Reference.FoundryCraftItems;
import xenose.foundrycraft.items.baseitem.FoundryAxe;
import xenose.foundrycraft.items.baseitem.FoundryTool;

public class ItemLeadAxe extends FoundryAxe
{
	public ItemLeadAxe(FoundryCraftItems foundryEnum, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) 
	{
		super(foundryEnum, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		setunlocalizedAndRegistryName(foundryEnum);
	}
}
