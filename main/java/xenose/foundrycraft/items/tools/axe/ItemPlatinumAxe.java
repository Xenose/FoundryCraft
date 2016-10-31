package xenose.foundrycraft.items.tools.axe;

import java.util.Set;

import net.minecraft.block.Block;
import xenose.foundrycraft.items.baseitem.FoundryAxe;
import xenose.foundrycraft.items.baseitem.FoundryTool;

public class ItemPlatinumAxe extends FoundryAxe
{
	public ItemPlatinumAxe(String unlocalizedName, String registryName, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) 
	{
		super(unlocalizedName, registryName, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		setunlocalizedAndRegistryName(unlocalizedName, registryName);
	}
}
