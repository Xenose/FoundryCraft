package xenose.foundrycraft.items.tools.pickaxe;

import java.util.Set;

import net.minecraft.block.Block;
import xenose.foundrycraft.items.baseitem.FoundryPickaxe;

public class ItemCopperPickaxe extends FoundryPickaxe
{

	public ItemCopperPickaxe(String unlocalizedName, String registryName, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) 
	{
		super(unlocalizedName, registryName, attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		setunlocalizedAndRegistryName(unlocalizedName, registryName);
	}

}