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
        setUnlocalizedName(name);
    }
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List result, boolean expanded) {
        result.add("Nothing To See here");
    }
}
