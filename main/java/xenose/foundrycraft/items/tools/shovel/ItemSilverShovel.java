package xenose.foundrycraft.items.tools.shovel;

import java.util.Set;

import net.minecraft.block.Block;
import xenose.foundrycraft.items.baseitem.FoundryShovel;

public class ItemSilverShovel extends FoundryShovel
{

	public ItemSilverShovel(String unlocalizedName, String registryName, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) 
	{
		super(unlocalizedName, registryName, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		setunlocalizedAndRegistryName(unlocalizedName, registryName);
	}

}