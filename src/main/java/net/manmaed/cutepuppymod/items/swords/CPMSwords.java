package net.manmaed.cutepuppymod.items.swords;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Created by manmaed on 05/01/2020.
 */
public class CPMSwords {

    @ObjectHolder(Reference.Register + "banhammer")
    public static Item banhammer;

    public static void load() {

        banhammer = new BanHammer(new Item.Properties().group(CutePuppyMod.itemGroup).maxStackSize(1), "banhammer");

        CutePuppyMod.getRegisteryHandler().registerItem(banhammer);
    }
}
