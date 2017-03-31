package manmaed.cutepuppymod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemTab extends Item {
    private static String name = "ItemTab";
    public static String getName() {

        return name;
    }
    public ItemTab() {
        super();
        func_77655_b(name);
    }
    public void func_77624_a(ItemStack itemStack, EntityPlayer entityPlayer, List result, boolean expanded) {
        result.add("Nothing To See here");
    }
}
