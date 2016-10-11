package xenose.foundrycraft.items.tools;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.Item.ToolMaterial;
import xenose.foundrycraft.items.baseitem.FoundryHammer;

public class ItemTungstenHammer extends FoundryHammer
{
	public ItemTungstenHammer(String unlocalizedName, String registryName, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn, byte harrvestArea) 
	{
		super(unlocalizedName, registryName, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn, harrvestArea);
		setunlocalizedAndRegistryName(unlocalizedName, registryName);
	}
}
