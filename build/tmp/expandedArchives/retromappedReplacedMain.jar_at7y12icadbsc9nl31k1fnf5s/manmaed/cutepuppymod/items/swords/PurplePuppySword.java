package manmaed.cutepuppymod.items.swords;

import manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.item.ItemSword;

import net.minecraft.item.Item.ToolMaterial;

/**
 * Created by manmaed on 08/02/2015.
 */
public class PurplePuppySword extends ItemSword {
    private static String name = "PurplePuppySword";
    public static String getName() {

        return name;
    }
    public PurplePuppySword(ToolMaterial material) {
        super(material);
        func_77655_b(name);
        func_77637_a(CutePuppyMod.tabsCMP);

    }
}
