package xenose.foundrycraft.items.tools.pickaxe;

import java.util.Set;

import net.minecraft.block.Block;
import xenose.foundrycraft.Reference.FoundryCraftItems;
import xenose.foundrycraft.items.baseitem.FoundryPickaxe;

public class ItemCopperPickaxe extends FoundryPickaxe
{

	public ItemCopperPickaxe(FoundryCraftItems foundryEnum, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) 
	{
		super(foundryEnum, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		setunlocalizedAndRegistryName(foundryEnum);
	}

}
