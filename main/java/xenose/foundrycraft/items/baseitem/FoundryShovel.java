package xenose.foundrycraft.items.baseitem;

import java.util.Set;

import net.minecraft.block.Block;

public class FoundryShovel extends FoundryTool
{

	public FoundryShovel(String unlocalizedName, String registryName, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) 
	{
		super(unlocalizedName, registryName, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
	}

}
