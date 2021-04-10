package net.manmaed.cutepuppymod.items;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.items.spawn_eggs.*;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Created by manmaed on 10/04/2021.
 */
public class CPSpawnEggs {

    @ObjectHolder(Refs.Register + "red_spawn_egg")
    public static Item red_spawn_egg;

    @ObjectHolder(Refs.Register + "blue_spawn_egg")
    public static Item blue_spawn_egg;

    @ObjectHolder(Refs.Register + "green_spawn_egg")
    public static Item green_spawn_egg;

    @ObjectHolder(Refs.Register + "yellow_spawn_egg")
    public static Item yellow_spawn_egg;

    @ObjectHolder(Refs.Register + "purple_spawn_egg")
    public static Item purple_spawn_egg;

    @ObjectHolder(Refs.Register + "steve_spawn_egg")
    public static Item steve_spawn_egg;

    @ObjectHolder(Refs.Register + "herobrine_spawn_egg")
    public static Item herobrine_spawn_egg;

    @ObjectHolder(Refs.Register + "ender_spawn_egg")
    public static Item ender_spawn_egg;

    @ObjectHolder(Refs.Register + "boss_spawn_egg")
    public static Item boss_spawn_egg;

    public static void load() {
        //TODO eggs
        red_spawn_egg = new RedEgg("red_spawn_egg");
        blue_spawn_egg = new BlueEgg("blue_spawn_egg");
        green_spawn_egg = new GreenEgg("green_spawn_egg");
        yellow_spawn_egg = new YellowEgg("yellow_spawn_egg");
        purple_spawn_egg = new PurpleEgg("purple_spawn_egg");
        steve_spawn_egg = new SteveEgg("steve_spawn_egg");
        herobrine_spawn_egg = new HerobrineEgg("herobrine_spawn_egg");
        ender_spawn_egg = new EnderEgg("ender_spawn_egg");
        boss_spawn_egg = new BossEgg("boss_spawn_egg");

        CutePuppyMod.getRegisteryHandler().registerItem(red_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(blue_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(green_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(yellow_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(purple_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(steve_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(herobrine_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(ender_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(boss_spawn_egg);
    }
}
