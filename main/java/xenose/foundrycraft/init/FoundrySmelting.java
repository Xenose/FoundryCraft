package xenose.foundrycraft.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FoundrySmelting 
{
	
	public static void init()
	{
		GameRegistry.addSmelting(FoundryItems.wetDarkStoneBrick, new ItemStack(FoundryBlocks.blackStoneBrick, 1), 0);
		
		GameRegistry.addSmelting(FoundryBlocks.aluminiumOre, new ItemStack(FoundryItems.aluminiumIngot, 1), 0);
		GameRegistry.addSmelting(FoundryBlocks.cobaltOre, new ItemStack(FoundryItems.cobaltIngot, 1), 0);
		GameRegistry.addSmelting(FoundryBlocks.copperOre, new ItemStack(FoundryItems.copperIngot, 1), 0);
		GameRegistry.addSmelting(FoundryBlocks.leadOre, new ItemStack(FoundryItems.leadIngot, 1), 0);
		GameRegistry.addSmelting(FoundryBlocks.lithiumOre, new ItemStack(FoundryItems.lithiumIngot, 1), 0);
		GameRegistry.addSmelting(FoundryBlocks.magnesiumOre, new ItemStack(FoundryItems.magnesiumIngot, 1), 0);
		GameRegistry.addSmelting(FoundryBlocks.nickelOre, new ItemStack(FoundryItems.nickelIngot, 1), 0);
		GameRegistry.addSmelting(FoundryBlocks.platinumOre, new ItemStack(FoundryItems.platinumIngot, 1), 0);
		GameRegistry.addSmelting(FoundryBlocks.silverOre, new ItemStack(FoundryItems.silverIngot, 1), 0);
		GameRegistry.addSmelting(FoundryBlocks.tinOre, new ItemStack(FoundryItems.tinIngot, 1),  0);
		GameRegistry.addSmelting(FoundryBlocks.titaniumOre, new ItemStack(FoundryItems.titaniumIngot, 1), 0);
		GameRegistry.addSmelting(FoundryBlocks.tungstenOre, new ItemStack(FoundryItems.tungstenIngot, 1), 0);
		GameRegistry.addSmelting(FoundryBlocks.uraniumOre, new ItemStack(FoundryItems.uraniumIngot, 1),  0);
		GameRegistry.addSmelting(FoundryBlocks.zincOre, new ItemStack(FoundryItems.zincIngot, 1), 0);
		
		GameRegistry.addSmelting(FoundryItems.aluminiumDust, new ItemStack(FoundryItems.aluminiumIngot, 1), 0);
		GameRegistry.addSmelting(FoundryItems.cobaltDust, new ItemStack(FoundryItems.cobaltIngot, 1), 0);
		GameRegistry.addSmelting(FoundryItems.copperDust, new ItemStack(FoundryItems.copperIngot, 1), 0);
		GameRegistry.addSmelting(FoundryItems.leadDust, new ItemStack(FoundryItems.leadIngot, 1), 0);
		GameRegistry.addSmelting(FoundryItems.lithiumDust, new ItemStack(FoundryItems.lithiumIngot, 1), 0);
		GameRegistry.addSmelting(FoundryItems.magnesiumDust, new ItemStack(FoundryItems.magnesiumIngot, 1), 0);
		GameRegistry.addSmelting(FoundryItems.nickelDust, new ItemStack(FoundryItems.nickelIngot, 1), 0);
		GameRegistry.addSmelting(FoundryItems.platinumDust, new ItemStack(FoundryItems.platinumIngot, 1), 0);
		GameRegistry.addSmelting(FoundryItems.silverDust, new ItemStack(FoundryItems.silverIngot, 1), 0);
		GameRegistry.addSmelting(FoundryItems.tinDust, new ItemStack(FoundryItems.tinIngot, 1),  0);
		GameRegistry.addSmelting(FoundryItems.titaniumDust, new ItemStack(FoundryItems.titaniumIngot, 1), 0);
		GameRegistry.addSmelting(FoundryItems.tungstenDust, new ItemStack(FoundryItems.tungstenIngot, 1), 0);
		GameRegistry.addSmelting(FoundryItems.uraniumDust, new ItemStack(FoundryItems.uraniumIngot, 1),  0);
		GameRegistry.addSmelting(FoundryItems.zincDust, new ItemStack(FoundryItems.zincIngot, 1), 0);
	}
}
