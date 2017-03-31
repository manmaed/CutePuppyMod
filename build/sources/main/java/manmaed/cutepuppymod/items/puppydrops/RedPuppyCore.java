package manmaed.cutepuppymod.items.puppydrops;

import manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.item.Item;

/**
 * Created by manmaed on 08/02/2015.
 */
public class RedPuppyCore extends Item {

    private static String name = "RedPuppyCore";
    public static String getName() {

        return name;
    }
    public RedPuppyCore() {
        super();
        setUnlocalizedName(name);
        setCreativeTab(CutePuppyMod.tabsCMP);
    }
}
