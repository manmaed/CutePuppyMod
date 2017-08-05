package manmaed.cutepuppymod.items.puppydrops;

import manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

/**
 * Created by manmaed on 12/02/2015.
 */
public class BanHammer extends ItemSword {

    private static String name = "BanHammer";
    public static String getName()
    {

        return name;
    }

    public BanHammer(ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setCreativeTab(CutePuppyMod.tabsCMP);
    }

    @Override
    public int getItemEnchantability() {
        return 0;
    }
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return false;
    }


}
