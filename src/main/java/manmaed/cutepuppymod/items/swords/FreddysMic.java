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
        setUnlocalizedName(name);
        setCreativeTab(CutePuppyMod.tabsCMP);
    }
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List result, boolean expanded) {
        result.add("How Did that Get there?");
    }
}
