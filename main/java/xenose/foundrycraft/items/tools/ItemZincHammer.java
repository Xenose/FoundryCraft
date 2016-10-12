package xenose.foundrycraft.items.tools;

import java.util.Set;

import net.minecraft.block.Block;
import xenose.foundrycraft.items.baseitem.FoundryHammer;

public class ItemZincHammer extends FoundryHammer
{

	public ItemZincHammer(String unlocalizedName, String registryName, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn, int harrvestArea) 
	{
		super(unlocalizedName, registryName, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn, harrvestArea);
		setunlocalizedAndRegistryName(unlocalizedName, registryName);
	}

}
