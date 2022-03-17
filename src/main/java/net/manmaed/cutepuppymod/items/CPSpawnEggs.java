package net.manmaed.cutepuppymod.items;


import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.entitys.CPEntityTypes;
import net.manmaed.cutepuppymod.items.spawn_eggs.BaseEgg;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

/**
 * Created by manmaed on 10/04/2021.
 */
public class CPSpawnEggs {

    /**
     * Example Item:
     * public static final RegistryObject<Item> EXAMPLE_ITEM = CPItems.ITEMS.register("example_item", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
     **/

    public static final RegistryObject<Item> RED_SPAWN_EGG = CPItems.ITEMS.register("red_spawn_egg", () -> new BaseEgg(new Item.Properties().tab(CutePuppyMod.itemGroup), CPEntityTypes.RED.get()));
    public static final RegistryObject<Item> BLUE_SPAWN_EGG = CPItems.ITEMS.register("blue_spawn_egg", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> GREEN_SPAWN_EGG = CPItems.ITEMS.register("green_spawn_egg", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> YELLOW_SPAWN_EGG = CPItems.ITEMS.register("yellow_spawn_egg", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> PURPLE_SPAWN_EGG = CPItems.ITEMS.register("purple_spawn_egg", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> STEVE_SPAWN_EGG = CPItems.ITEMS.register("steve_spawn_egg", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> HEROBRINE_SPAWN_EGG = CPItems.ITEMS.register("herobrine_spawn_egg", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> ENDER_SPAWN_EGG = CPItems.ITEMS.register("ender_spawn_egg", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> BOSS_SPAWN_EGG = CPItems.ITEMS.register("boss_spawn_egg", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> SIX_SPAWN_EGG = CPItems.ITEMS.register("six_spawn_egg", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> ENDER_BOSS_SPAWN_EGG = CPItems.ITEMS.register("ender_boss_spawn_egg", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));




    /*public static void load() {
        red_spawn_egg = new RedEgg("red_spawn_egg");
        blue_spawn_egg = new BlueEgg("blue_spawn_egg");
        green_spawn_egg = new GreenEgg("green_spawn_egg");
        yellow_spawn_egg = new YellowEgg("yellow_spawn_egg");
        purple_spawn_egg = new PurpleEgg("purple_spawn_egg");
        steve_spawn_egg = new SteveEgg("steve_spawn_egg");
        herobrine_spawn_egg = new HerobrineEgg("herobrine_spawn_egg");
        ender_spawn_egg = new EnderEgg("ender_spawn_egg");
        boss_spawn_egg = new BossEgg("boss_spawn_egg");
        six_spawn_egg = new SixEgg("six_spawn_egg");
        boss_ender_spawn_egg = new BossEnderEgg("boss_ender_spawn_egg");

        CutePuppyMod.getRegisteryHandler().registerItem(red_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(blue_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(green_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(yellow_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(purple_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(steve_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(herobrine_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(ender_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(boss_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(six_spawn_egg);
        CutePuppyMod.getRegisteryHandler().registerItem(boss_ender_spawn_egg);
    }*/
}
