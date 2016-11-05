package xenose.foundrycraft.items.tools;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.Item.ToolMaterial;
import xenose.foundrycraft.Reference.FoundryCraftItems;
import xenose.foundrycraft.items.baseitem.FoundryHoe;

public class ItemFoundryHoes extends FoundryHoe
{
	public ItemFoundryHoes(FoundryCraftItems foundryEnum, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) 
	{
		super(foundryEnum, attackDamageIn, attackSpeedIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		setunlocalizedAndRegistryName(foundryEnum);
	}
}
