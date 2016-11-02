package xenose.foundrycraft.items.tools.hoe;

import java.util.Set;

import net.minecraft.block.Block;
import xenose.foundrycraft.Reference.FoundryCraftItems;
import xenose.foundrycraft.items.baseitem.FoundryHoe;
import xenose.foundrycraft.items.baseitem.FoundryTool;

public class ItemAluminiumHoe extends FoundryHoe
{

	public ItemAluminiumHoe(FoundryCraftItems foundryEnum, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) 
	{
		super(foundryEnum, attackDamageIn, attackSpeedIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		setunlocalizedAndRegistryName(foundryEnum);
	}

}
