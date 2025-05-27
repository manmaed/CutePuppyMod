package net.manmaed.cutepuppymod.item;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.entity.CutePuppyEntityTypes;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CutePuppySpawnEggs {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CutePuppyMod.MOD_ID);
    public static final int COLOR = 16777215;

    public static final DeferredItem<Item> HEROBRINE_SPAWN_EGG = ITEMS.register("herobrine_spawn_egg", () -> new DeferredSpawnEggItem(CutePuppyEntityTypes.HEROBRINE, COLOR, COLOR, new Item.Properties()));
    public static final DeferredItem<Item> ENDER_SPAWN_EGG = ITEMS.register("ender_spawn_egg", () -> new DeferredSpawnEggItem(CutePuppyEntityTypes.ENDER, COLOR, COLOR, new Item.Properties()));
    public static final DeferredItem<Item> PUPPY_SPAWN_EGG = ITEMS.register("puppy_spawn_egg", () -> new DeferredSpawnEggItem(CutePuppyEntityTypes.PUPPY, COLOR, COLOR, new Item.Properties()));
    public static final DeferredItem<Item> HUMAN_PUPPY_SPAWN_EGG = ITEMS.register("human_puppy_spawn_egg", () -> new DeferredSpawnEggItem(CutePuppyEntityTypes.HUMAN_PUPPY, COLOR, COLOR, new Item.Properties()));
    public static final DeferredItem<Item> BOSS_SPAWN_EGG = ITEMS.register("boss_spawn_egg", () -> new DeferredSpawnEggItem(CutePuppyEntityTypes.BOSS, COLOR, COLOR, new Item.Properties()));
    public static final DeferredItem<Item> SIX_SPAWN_EGG = ITEMS.register("six_spawn_egg", () -> new DeferredSpawnEggItem(CutePuppyEntityTypes.SIX, COLOR, COLOR, new Item.Properties()));
    public static final DeferredItem<Item> ENDER_BOSS_SPAWN_EGG = ITEMS.register("ender_boss_spawn_egg", () -> new DeferredSpawnEggItem(CutePuppyEntityTypes.ENDER_BOSS, COLOR, COLOR, new Item.Properties()));

    public static final DeferredItem<Item> RED_SPAWN_EGG = ITEMS.register("red_spawn_egg",() -> new PuppySpawnEgg(CutePuppyEntityTypes.PUPPY.get(),0));
    public static final DeferredItem<Item> BLUE_SPAWN_EGG = ITEMS.register("blue_spawn_egg", () -> new PuppySpawnEgg(CutePuppyEntityTypes.PUPPY.get(),1));
    public static final DeferredItem<Item> GREEN_SPAWN_EGG = ITEMS.register("green_spawn_egg", () -> new PuppySpawnEgg(CutePuppyEntityTypes.PUPPY.get(),2));
    public static final DeferredItem<Item> YELLOW_SPAWN_EGG = ITEMS.register("yellow_spawn_egg", () -> new PuppySpawnEgg(CutePuppyEntityTypes.PUPPY.get(),4));
    public static final DeferredItem<Item> PURPLE_SPAWN_EGG = ITEMS.register("purple_spawn_egg", () -> new PuppySpawnEgg(CutePuppyEntityTypes.PUPPY.get(),3));
    public static final DeferredItem<Item> STEVE_SPAWN_EGG = ITEMS.register("steve_spawn_egg",() -> new PuppySpawnEgg(CutePuppyEntityTypes.HUMAN_PUPPY.get(),0));
    public static final DeferredItem<Item> ALEX_SPAWN_EGG = ITEMS.register("alex_spawn_egg", () -> new PuppySpawnEgg(CutePuppyEntityTypes.HUMAN_PUPPY.get(),1));
}
