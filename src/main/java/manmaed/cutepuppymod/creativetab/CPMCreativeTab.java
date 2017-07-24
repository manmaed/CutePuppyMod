package manmaed.cutepuppymod.creativetab;

import manmaed.cutepuppymod.items.CPMItems;
import manmaed.cutepuppymod.libs.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CPMCreativeTab extends CreativeTabs {

	public CPMCreativeTab(int id) {
		super(Reference.MOD_ID);
	}

	@SideOnly(Side.CLIENT)
	@Override

	public ItemStack getTabIconItem() {

		return  new ItemStack(CPMItems.iconfortab);
	}

	public String getTranslatedTabLabel()
	{
		return I18n.translateToLocal("creativePuppyTab.name");
	}
}
