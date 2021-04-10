package net.manmaed.cutepuppymod.items;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.items.tbf.EmptySyringe;
import net.manmaed.cutepuppymod.items.tbf.FullSyringe;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Created by manmaed on 09/04/2021.
 */
public class CPItems {

    @ObjectHolder(Refs.Register + "tabicon")
    public static Item tabicon;

    @ObjectHolder(Refs.Register + "emptysyringe")
    public static Item emptysyringe;

    @ObjectHolder(Refs.Register + "fullsyringe")
    public static Item fullsyringe;

    @ObjectHolder(Refs.Register + "doggokibble")
    public static Item doggokibble;


    public static void load() {

        tabicon = new Item(new Item.Properties()).setRegistryName("itemfortab");
        emptysyringe = new EmptySyringe(new Item.Properties().group(CutePuppyMod.itemGroup).maxStackSize(1), "emptysyringe");
        fullsyringe = new FullSyringe(new Item.Properties().group(CutePuppyMod.itemGroup).maxStackSize(1), "fullsyringe");
        doggokibble = new Item(new Item.Properties().group(CutePuppyMod.itemGroup)).setRegistryName("doggokibble");

        CutePuppyMod.getRegisteryHandler().registerItem(tabicon);
        CutePuppyMod.getRegisteryHandler().registerItem(emptysyringe);
        CutePuppyMod.getRegisteryHandler().registerItem(fullsyringe);
        CutePuppyMod.getRegisteryHandler().registerItem(doggokibble);

        CPWeapons.load();
        CPPuppyDrops.load();
        CPSpawnEggs.load();
    }
}
