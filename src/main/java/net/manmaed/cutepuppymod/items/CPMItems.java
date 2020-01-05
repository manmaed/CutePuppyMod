package net.manmaed.cutepuppymod.items;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.items.puppydrops.CPMPuppyDrops;
import net.manmaed.cutepuppymod.items.swords.CPMSwords;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Created by manmaed on 05/01/2020.
 */
public class CPMItems {

    @ObjectHolder(Reference.Register + "itemfortab")
    public static Item itemfortab;

    @ObjectHolder(Reference.Register + "emptysyringe")
    public static Item emptysyringe;

    @ObjectHolder(Reference.Register + "fullsyringe")
    public static Item fullsyringe;

    public static void load() {

        itemfortab = new ItemTab(new Item.Properties(), "itemfortab");
        emptysyringe = new EmptySyringe(new Item.Properties().group(CutePuppyMod.itemGroup).maxStackSize(1), "emptysyringe");
        fullsyringe = new FullSyringe(new Item.Properties().group(CutePuppyMod.itemGroup).maxStackSize(1), "fullsyringe");

        CutePuppyMod.getRegisteryHandler().registerItem(itemfortab);
        CutePuppyMod.getRegisteryHandler().registerItem(emptysyringe);
        CutePuppyMod.getRegisteryHandler().registerItem(fullsyringe);

        CPMSwords.load();
        CPMPuppyDrops.load();

    }
}
