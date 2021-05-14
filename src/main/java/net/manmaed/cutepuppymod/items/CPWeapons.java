package net.manmaed.cutepuppymod.items;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.items.weapon.BanHammer;
import net.manmaed.cutepuppymod.libs.Refs;
import net.manmaed.cutepuppymod.materials.ToolMaterials;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Created by manmaed on 05/01/2020.
 */
public class CPWeapons {

    @ObjectHolder(Refs.Register + "banhammer")
    public static Item banhammer;

    public static void load() {

        /*banhammer = new BanHammer(ToolMaterials.BAN, 20, 2f, new Item.Properties().group(CutePuppyMod.itemGroup));*/

        /*CutePuppyMod.getRegisteryHandler().registerItem(banhammer);*/
    }
}
