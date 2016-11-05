package xenose.foundrycraft.items.tools;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.Item.ToolMaterial;
import xenose.foundrycraft.Reference.FoundryCraftItems;
import xenose.foundrycraft.items.baseitem.FoundryAxe;

public class ItemFoundryAxes extends FoundryAxe
{
	public ItemFoundryAxes(FoundryCraftItems foundryEnum, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) 
	{
		super(foundryEnum, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		setunlocalizedAndRegistryName(foundryEnum);
	}
}
