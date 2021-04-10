package net.manmaed.cutepuppymod.items;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Created by manmaed on 05/01/2020.
 */
public class CPPuppyDrops {

    @ObjectHolder(Refs.Register + "redcore")
    public static Item redcore;

    @ObjectHolder(Refs.Register + "bluecore")
    public static Item bluecore;

    @ObjectHolder(Refs.Register + "greencore")
    public static Item greencore;

    @ObjectHolder(Refs.Register + "purplecore")
    public static Item purplecore;

    @ObjectHolder(Refs.Register + "yellowcore")
    public static Item yellowcore;

    @ObjectHolder(Refs.Register + "endercore")
    public static Item endercore;

    @ObjectHolder(Refs.Register + "stevecore")
    public static Item stevecore;

    @ObjectHolder(Refs.Register + "herobrinecore")
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
