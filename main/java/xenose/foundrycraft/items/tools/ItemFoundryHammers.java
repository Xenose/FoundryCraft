package xenose.foundrycraft.items.tools;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.Item.ToolMaterial;
import xenose.foundrycraft.Reference.FoundryCraftItems;
import xenose.foundrycraft.items.baseitem.FoundryHammer;

public class ItemFoundryHammers extends FoundryHammer 
{
	public ItemFoundryHammers(FoundryCraftItems foundryEnum, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn, int harrvestArea) 
	{
		super(foundryEnum, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn, harrvestArea);
		setunlocalizedAndRegistryName(foundryEnum);
	}
}
