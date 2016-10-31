package xenose.foundrycraft.items.tools.hoe;

import java.util.Set;

import net.minecraft.block.Block;
import xenose.foundrycraft.items.baseitem.FoundryHoe;
import xenose.foundrycraft.items.baseitem.FoundryTool;

public class ItemMagnesiumHoe extends FoundryHoe
{
	public ItemMagnesiumHoe(String unlocalizedName, String registryName, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) 
	{
		super(unlocalizedName, registryName, attackDamageIn, attackSpeedIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		setunlocalizedAndRegistryName(unlocalizedName, registryName);
	}
}
