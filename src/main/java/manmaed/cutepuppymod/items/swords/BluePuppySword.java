package manmaed.cutepuppymod.items.swords;

import manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.item.ItemSword;

/**
 * Created by manmaed on 08/02/2015.
 */
public class BluePuppySword extends ItemSword {
    private static String name = "BluePuppySword";
    public static String getName() {

        return name;
    }
    public BluePuppySword(ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setCreativeTab(CutePuppyMod.tabsCMP);

    }
}
