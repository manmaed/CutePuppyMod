package manmaed.cutepuppymod.items.puppydrops;

import manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.item.Item;

/**
 * Created by manmaed on 08/02/2015.
 */
public class YellowPuppyCore extends Item {

    private static String name = "YellowPuppyCore";
    public static String getName() {

        return name;
    }
    public YellowPuppyCore() {
        super();
        func_77655_b(name);
        func_77637_a(CutePuppyMod.tabsCMP);
    }
}
