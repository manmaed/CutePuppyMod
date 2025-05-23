package net.manmaed.cutepuppymod.item;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.item.tools.EmptySyringe;
import net.manmaed.cutepuppymod.item.tools.materials.CutePuppyToolMaterials;
import net.manmaed.cutepuppymod.item.weapon.BanHammer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Created by manmaed on 09/04/2021.
 */
public class CutePuppyItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CutePuppyMod.MOD_ID);

    /**
     * Example Item:
     * public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties()));
     **/
    public static final DeferredItem<Item> TAB_ICON = ITEMS.register("tab_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DOGGO_KIBBLE = ITEMS.register("doggo_kibble", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SYRINGE_FULL = ITEMS.register("syringe_full", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SYRINGE_EMPTY = ITEMS.register("syringe_empty", () -> new EmptySyringe(new Item.Properties()));

    //Puppy Drops
    public static final DeferredItem<Item> RED_CORE = ITEMS.register("red_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLUE_CORE = ITEMS.register("blue_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GREEN_CORE = ITEMS.register("green_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PURPLE_CORE = ITEMS.register("purple_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> YELLOW_CORE = ITEMS.register("yellow_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENDER_CORE = ITEMS.register("ender_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEVE_CORE = ITEMS.register("steve_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEROBRINE_CORE = ITEMS.register("herobrine_core", () -> new Item(new Item.Properties()));

    //Puppy Weapons  3, -2.4F,
    public static final DeferredItem<Item> RED_SWORD = ITEMS.register("red_sword", () -> new SwordItem(CutePuppyToolMaterials.RED_CORES, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SWORD = ITEMS.register("green_sword", () -> new SwordItem(CutePuppyToolMaterials.GREEN_CORES, new Item.Properties()));
    public static final DeferredItem<Item> BLUE_SWORD = ITEMS.register("blue_sword", () -> new SwordItem(CutePuppyToolMaterials.BLUE_CORES, new Item.Properties()));
    public static final DeferredItem<Item> PURPLE_SWORD = ITEMS.register("purple_sword", () -> new SwordItem(CutePuppyToolMaterials.PURPLE_CORES, new Item.Properties()));
    public static final DeferredItem<Item> YELLOW_SWORD = ITEMS.register("yellow_sword", () -> new SwordItem(CutePuppyToolMaterials.YELLOW_CORES, new Item.Properties()));
    public static final DeferredItem<Item> BAN_HAMMER = ITEMS.register("ban_hammer", BanHammer::new);

    //Spawn Eggs
    /*
    public static final DeferredItem<Item> RED_SPAWN_EGG = ITEMS.register("red_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.RED, COLOR, COLOR, new Item.Properties()));
    public static final DeferredItem<Item> BLUE_SPAWN_EGG = ITEMS.register("blue_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.BLUE, COLOR, COLOR, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SPAWN_EGG = ITEMS.register("green_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.GREEN, COLOR, COLOR, new Item.Properties()));
    public static final DeferredItem<Item> YELLOW_SPAWN_EGG = ITEMS.register("yellow_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.YELLOW, COLOR, COLOR, new Item.Properties()));
    public static final DeferredItem<Item> PURPLE_SPAWN_EGG = ITEMS.register("purple_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.PURPLE, COLOR, COLOR, new Item.Properties()));
    public static final DeferredItem<Item> STEVE_SPAWN_EGG = ITEMS.register("steve_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.STEVE, COLOR, COLOR, new Item.Properties()));
    public static final DeferredItem<Item> HEROBRINE_SPAWN_EGG = ITEMS.register("herobrine_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.HEROBRINE, COLOR, COLOR, new Item.Properties()));
    public static final DeferredItem<Item> ENDER_SPAWN_EGG = ITEMS.register("ender_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.ENDER, COLOR, COLOR, new Item.Properties()));
    public static final DeferredItem<Item> BOSS_SPAWN_EGG = ITEMS.register("boss_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.BOSS, COLOR, COLOR, new Item.Properties()));
    public static final DeferredItem<Item> SIX_SPAWN_EGG = ITEMS.register("six_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.SIX, COLOR, COLOR, new Item.Properties()));
    public static final DeferredItem<Item> ENDER_BOSS_SPAWN_EGG = ITEMS.register("ender_boss_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.ENDER_BOSS, COLOR, COLOR, new Item.Properties()));

     */

}
