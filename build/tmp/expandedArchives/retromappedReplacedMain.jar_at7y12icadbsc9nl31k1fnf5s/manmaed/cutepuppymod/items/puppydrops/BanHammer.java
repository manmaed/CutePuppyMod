package manmaed.cutepuppymod.items.puppydrops;

import manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import net.minecraft.item.Item.ToolMaterial;

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
        func_77655_b(name);
        func_77637_a(CutePuppyMod.tabsCMP);
    }

    @Override
    public int func_77619_b() {
        return 0;
    }
    @Override
    public boolean func_82789_a(ItemStack toRepair, ItemStack repair)
    {
        return false;
    }

}
