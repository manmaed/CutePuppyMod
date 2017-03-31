package manmaed.cutepuppymod.items.puppydrops;

import manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.item.Item;

/**
 * Created by manmaed on 08/02/2015.
 */
public class EnderCore extends Item {

    private static String name = "EnderCore";
    public static String getName() {

        return name;
    }
    public EnderCore() {
        super();
        setUnlocalizedName(name);
        setCreativeTab(CutePuppyMod.tabsCMP);
    }
}
