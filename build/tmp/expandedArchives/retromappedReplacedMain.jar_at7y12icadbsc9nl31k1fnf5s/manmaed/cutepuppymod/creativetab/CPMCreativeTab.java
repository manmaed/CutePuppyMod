package manmaed.cutepuppymod.creativetab;

import manmaed.cutepuppymod.items.CPMItems;
import manmaed.cutepuppymod.libs.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CPMCreativeTab extends CreativeTabs {

	public CPMCreativeTab(int id) {
		super(Reference.MOD_ID);
	}

	@SideOnly(Side.CLIENT)
	@Override

	public Item func_78016_d() {

		return CPMItems.iconfortab;
	}

	public String func_78024_c()
	{
		return I18n.func_74838_a("creativePuppyTab.name");
	}
}
