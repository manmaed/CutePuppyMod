package net.manmaed.cutepuppymod.loot_table;

import net.manmaed.cutepuppymod.libs.RLHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;

public class CutePuppyCustomLootTables {

    public static final ResourceKey<LootTable> PUPPY_RED = register("puppy/red");
    public static final ResourceKey<LootTable> PUPPY_BLUE = register("puppy/blue");
    public static final ResourceKey<LootTable> PUPPY_GREEN = register("puppy/green");
    public static final ResourceKey<LootTable> PUPPY_PURPLE = register("puppy/purple");
    public static final ResourceKey<LootTable> PUPPY_YELLOW = register("puppy/yellow");

    public static final ResourceKey<LootTable> PUPPY_STEVE = register("puppy/steve");
    public static final ResourceKey<LootTable> PUPPY_ALEX = register("puppy/alex");

    public static final ResourceKey<LootTable> PUPPY_SIX = register("six_puppy");
    public static final ResourceKey<LootTable> PUPPY_HEROBRINE = register("puppy/herobrine");
    public static final ResourceKey<LootTable> PUPPY_ENDER = register("ender_puppy");
    public static final ResourceKey<LootTable> PUPPY_ENDER_BOSS = register("ender_boss_puppy");
    public static final ResourceKey<LootTable> PUPPY_BOSS = register("boss_puppy");


    private static ResourceKey<LootTable> register(String name) {
        return ResourceKey.create(Registries.LOOT_TABLE, RLHelper.location("entities/" + name));
    }
}
