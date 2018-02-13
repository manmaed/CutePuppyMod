package manmaed.cutepuppymod.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;
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
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("Nothing To See here");
    }
}
