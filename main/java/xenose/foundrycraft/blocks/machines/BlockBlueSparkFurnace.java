package xenose.foundrycraft.blocks.machines;

import net.minecraft.block.material.Material;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.items.IItemHandler;
import xenose.foundrycraft.Reference.FoundryCraftBlocks;
import xenose.foundrycraft.blocks.baseblock.FoundryBaseContainer;

public class BlockBlueSparkFurnace extends FoundryBaseContainer
{
	@CapabilityInject(IItemHandler.class)
	static Capability<IItemHandler> ITEM_HANDLER_CAPABILITY = null;
	
	public BlockBlueSparkFurnace(Material materialIn, FoundryCraftBlocks foundryEnumBlock, float blockHardness) 
	{
		super(materialIn, foundryEnumBlock, blockHardness);
		setUnlocalizedNameAndRegistry(foundryEnumBlock);
	}
	
}
