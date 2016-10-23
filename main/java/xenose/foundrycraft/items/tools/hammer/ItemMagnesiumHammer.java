package xenose.foundrycraft.items.tools.hammer;

import java.util.Set;

import net.minecraft.block.Block;
import xenose.foundrycraft.items.baseitem.FoundryHammer;

public class ItemMagnesiumHammer extends FoundryHammer  
{

	public ItemMagnesiumHammer(String unlocalizedName, String registryName, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn, int harrvestArea) 
	{
		super(unlocalizedName, registryName, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn, harrvestArea);
		setunlocalizedAndRegistryName(unlocalizedName, registryName);
	}

}