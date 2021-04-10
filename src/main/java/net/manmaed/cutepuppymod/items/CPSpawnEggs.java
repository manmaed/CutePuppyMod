package net.manmaed.cutepuppymod.items;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.items.spawn_eggs.RedEgg;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Created by manmaed on 10/04/2021.
 */
public class CPSpawnEggs {

    @ObjectHolder(Refs.Register + "red_spawn_egg")
    public static Item red_spawn_egg;

    public static void load() {
        //TODO eggs
        red_spawn_egg = new RedEgg("red_spawn_egg");

        CutePuppyMod.getRegisteryHandler().registerItem(red_spawn_egg);
    }
}
