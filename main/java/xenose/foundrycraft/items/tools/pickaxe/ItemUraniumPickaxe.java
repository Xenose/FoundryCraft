package xenose.foundrycraft.items.tools.pickaxe;

import java.util.Set;

import net.minecraft.block.Block;
import xenose.foundrycraft.Reference.FoundryCraftItems;
import xenose.foundrycraft.items.baseitem.FoundryHammer;
import xenose.foundrycraft.items.baseitem.FoundryPickaxe;

public class ItemUraniumPickaxe extends FoundryPickaxe
{

	public ItemUraniumPickaxe(FoundryCraftItems foundryEnum, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) 
	{
		super(foundryEnum, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		setunlocalizedAndRegistryName(foundryEnum);
	}
	
}
