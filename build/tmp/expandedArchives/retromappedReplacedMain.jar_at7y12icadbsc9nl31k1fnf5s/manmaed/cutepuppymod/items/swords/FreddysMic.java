package manmaed.cutepuppymod.items.swords;

import manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import java.util.List;

/**
 * Created by manmaed on 08/02/2015.
 */
public class FreddysMic extends ItemSword {
    private static String name = "FreddysMic";
    public static String getName() {

        return name;
    }
    public FreddysMic(Item.ToolMaterial material) {
        super(material);
        func_77655_b(name);
        func_77637_a(CutePuppyMod.tabsCMP);
    }
    public void func_77624_a(ItemStack itemStack, EntityPlayer entityPlayer, List result, boolean expanded) {
        result.add("How Did that Get there?");
    }
}
