package manmaed.cutepuppymod.items.puppydrops;

import manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.item.Item;

/**
 * Created by manmaed on 08/02/2015.
 */
public class BluePuppyCore extends Item {

    private static String name = "BluePuppyCore";
    public static String getName() {

        return name;
    }

        public BluePuppyCore() {
        super();
        setUnlocalizedName(name);
        setCreativeTab(CutePuppyMod.tabsCMP);
    }
}
