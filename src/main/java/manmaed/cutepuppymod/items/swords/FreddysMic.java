package manmaed.cutepuppymod.items.swords;

import manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

import javax.annotation.Nullable;
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
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("Nothing To See here");
    }
}
