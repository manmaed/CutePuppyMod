package net.manmaed.cutepuppymod.items.puppydrops;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Created by manmaed on 05/01/2020.
 */
public class CPMPuppyDrops {

    @ObjectHolder(Reference.Register + "redcore")
    public static Item redcore;

    @ObjectHolder(Reference.Register + "bluecore")
    public static Item bluecore;

    @ObjectHolder(Reference.Register + "greencore")
    public static Item greencore;

    @ObjectHolder(Reference.Register + "purplecore")
    public static Item purplecore;

    @ObjectHolder(Reference.Register + "yellowcore")
    public static Item yellowcore;

    @ObjectHolder(Reference.Register + "endercore")
    public static Item endercore;

    @ObjectHolder(Reference.Register + "stevecore")
    public static Item stevecore;

    @ObjectHolder(Reference.Register + "herobrinecore")
    public static Item herobrinecore;

    public static void load() {

        redcore = new Item(new Item.Properties().group(CutePuppyMod.itemGroup)).setRegistryName("redcore");
        bluecore = new Item(new Item.Properties().group(CutePuppyMod.itemGroup)).setRegistryName("bluecore");
        greencore = new Item(new Item.Properties().group(CutePuppyMod.itemGroup)).setRegistryName("greencore");
        purplecore = new Item(new Item.Properties().group(CutePuppyMod.itemGroup)).setRegistryName("purplecore");
        yellowcore = new Item(new Item.Properties().group(CutePuppyMod.itemGroup)).setRegistryName("yellowcore");
        endercore = new Item(new Item.Properties().group(CutePuppyMod.itemGroup)).setRegistryName("endercore");
        stevecore = new Item(new Item.Properties().group(CutePuppyMod.itemGroup)).setRegistryName("stevecore");
        herobrinecore = new Item(new Item.Properties().group(CutePuppyMod.itemGroup)).setRegistryName("herobrinecore");

        CutePuppyMod.getRegisteryHandler().registerItem(bluecore);
        CutePuppyMod.getRegisteryHandler().registerItem(greencore);
        CutePuppyMod.getRegisteryHandler().registerItem(purplecore);
        CutePuppyMod.getRegisteryHandler().registerItem(redcore);
        CutePuppyMod.getRegisteryHandler().registerItem(yellowcore);
        CutePuppyMod.getRegisteryHandler().registerItem(endercore);
        CutePuppyMod.getRegisteryHandler().registerItem(stevecore);
        CutePuppyMod.getRegisteryHandler().registerItem(herobrinecore);

    }

}
