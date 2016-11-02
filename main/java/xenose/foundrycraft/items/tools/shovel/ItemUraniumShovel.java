package xenose.foundrycraft.items.tools.shovel;

import java.util.Set;

import net.minecraft.block.Block;
import xenose.foundrycraft.Reference.FoundryCraftItems;
import xenose.foundrycraft.items.baseitem.FoundryShovel;

public class ItemUraniumShovel extends FoundryShovel
{

	public ItemUraniumShovel(FoundryCraftItems foundryEnum, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) {
		super(foundryEnum, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		setunlocalizedAndRegistryName(foundryEnum);
	}

}
