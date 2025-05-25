package net.manmaed.cutepuppymod.item;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.entity.CutePuppyEntityTypes;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CutePuppySpawnEggs {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CutePuppyMod.MOD_ID);
    public static final DeferredItem<Item> RED_SPAWN_EGG = ITEMS.register("red_spawn_egg",() -> new PuppySpawnEgg(CutePuppyEntityTypes.PUPPY.get(),0));
    public static final DeferredItem<Item> BLUE_SPAWN_EGG = ITEMS.register("blue_spawn_egg", () -> new PuppySpawnEgg(CutePuppyEntityTypes.PUPPY.get(),1));
    public static final DeferredItem<Item> GREEN_SPAWN_EGG = ITEMS.register("green_spawn_egg", () -> new PuppySpawnEgg(CutePuppyEntityTypes.PUPPY.get(),2));
    public static final DeferredItem<Item> YELLOW_SPAWN_EGG = ITEMS.register("yellow_spawn_egg", () -> new PuppySpawnEgg(CutePuppyEntityTypes.PUPPY.get(),4));
    public static final DeferredItem<Item> PURPLE_SPAWN_EGG = ITEMS.register("purple_spawn_egg", () -> new PuppySpawnEgg(CutePuppyEntityTypes.PUPPY.get(),3));
    public static final DeferredItem<Item> STEVE_SPAWN_EGG = ITEMS.register("steve_spawn_egg",() -> new PuppySpawnEgg(CutePuppyEntityTypes.HUMAN_PUPPY.get(),0));
    public static final DeferredItem<Item> ALEX_SPAWN_EGG = ITEMS.register("alex_spawn_egg", () -> new PuppySpawnEgg(CutePuppyEntityTypes.HUMAN_PUPPY.get(),1));
}
