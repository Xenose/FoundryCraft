package xenose.foundrycraft.blocks;

import java.util.List;

import javax.annotation.Nullable;

import akka.dispatch.sysmsg.Create;
import akka.io.Tcp.Register;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import xenose.foundrycraft.blocks.baseblock.FoundryBlock;

public class BlockDyedPlanks extends FoundryBlock
{
	public static final PropertyEnum<BlockDyedPlanks.EnumTypes> VARIANTS = PropertyEnum.<BlockDyedPlanks.EnumTypes>create("variant",BlockDyedPlanks.EnumTypes.class);
	
	public BlockDyedPlanks(Material materialIn, String unlocalizedName, String registryName, float hardness) 
	{
		super(materialIn, unlocalizedName, registryName, hardness);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANTS, EnumTypes.BLACK));
	}
	
	@Override
	public int damageDropped(IBlockState state) 
	{
		return ((EnumTypes)state.getValue(VARIANTS)).getMeta();
	}
	
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) 
	{
		super.getSubBlocks(itemIn, tab, list);
	}
	
	public static enum EnumTypes implements IStringSerializable
	{
		BLACK(0, "blackPlanks", MapColor.BLACK),
		BLUE(1, "bluePlanks", MapColor.BLUE),
		BROWN(2, "brownPlanks", MapColor.BROWN),
		CYAN(3, "cyanPlanks", MapColor.CYAN),
		
		GRAY(4, "grayPlanks", MapColor.GRAY),
		GREEN(5, "greenPlanks", MapColor.GREEN),
		LIGTH_BLUE(6, "ligthBluePlanks", MapColor.LIGHT_BLUE),
		LIME(7, "limePlanks", MapColor.LIME),
		
		MAGENTA(8, "magentaPlanks", MapColor.MAGENTA),
		ORANGE(9, "orangePlanks", MapColor.RED),
		PINK(10, "pinkPlanks", MapColor.PINK),
		PURPLE(11, "purplePlanks", MapColor.PURPLE),
		
		RED(12, "redPlanks", MapColor.RED),
		SILVER(13, "silverPlanks", MapColor.SILVER),
		WHITE(14, "whitePlanks", MapColor.SNOW),
		YELLOW(15, "yellowPlanks", MapColor.YELLOW);
		
		private static final EnumTypes[] META_LOOKUP = new EnumTypes[values().length];
		
		private final int meta;
		private final String name;
		private final String unlocalizedName;
		private final MapColor color;
		
		private EnumTypes(int metaIn, String nameIn, MapColor colorIn) 
		{
			this(metaIn, nameIn,"Block" + nameIn, colorIn);
		}
		
		private EnumTypes(int metaIn, String nameIn, String unlocalizedNameIn, MapColor colorIn) 
		{
			meta = metaIn;
			name = nameIn;
			unlocalizedName = unlocalizedNameIn;
			color = colorIn;
		}
		
		public EnumTypes getFromMeta(int meta)
		{
			if(meta < 0 || meta >= values().length)
			{
				meta = 0;
			}
			
			return META_LOOKUP[meta];
		}
		
		public int getMeta() 
		{
			return meta;
		}
		
		public MapColor getMapColor()
		{
			return color;
		}
		
		@Override
		public String toString() 
		{
			return name;
		}

		@Override
		public String getName() 
		{
			return null;
		}
		
		public String getUnlocalizedName() 
		{
			return unlocalizedName;
		}
		
		static
		{
			for (EnumTypes enumTypes : values()) 
			{
				META_LOOKUP[enumTypes.getMeta()] = enumTypes;
			}
		}
		
	}

}
