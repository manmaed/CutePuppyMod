package net.manmaed.cutepuppymod.items;


import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.entitys.CPEntityTypes;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Created by manmaed on 10/04/2021.
 */
public class CPSpawnEggs {

    public static final int COLOR = 16777215;

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CutePuppyMod.MOD_ID);


    /**
     * Example Item:
     * public static final RegistryObject<Item> EXAMPLE_ITEM = CPItems.ITEMS.register("example_item", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
     **/

    public static final RegistryObject<Item> RED_SPAWN_EGG = ITEMS.register("red_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.RED, COLOR, COLOR, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> BLUE_SPAWN_EGG = ITEMS.register("blue_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.BLUE, COLOR, COLOR, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> GREEN_SPAWN_EGG = ITEMS.register("green_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.GREEN, COLOR, COLOR, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> YELLOW_SPAWN_EGG = ITEMS.register("yellow_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.YELLOW, COLOR, COLOR, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> PURPLE_SPAWN_EGG = ITEMS.register("purple_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.PURPLE, COLOR, COLOR, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> STEVE_SPAWN_EGG = ITEMS.register("steve_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.STEVE, COLOR, COLOR, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> HEROBRINE_SPAWN_EGG = ITEMS.register("herobrine_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.HEROBRINE, COLOR, COLOR, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> ENDER_SPAWN_EGG = ITEMS.register("ender_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.ENDER, COLOR, COLOR, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> BOSS_SPAWN_EGG = ITEMS.register("boss_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.BOSS, COLOR, COLOR, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> SIX_SPAWN_EGG = ITEMS.register("six_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.SIX, COLOR, COLOR, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> ENDER_BOSS_SPAWN_EGG = ITEMS.register("ender_boss_spawn_egg", () -> new ForgeSpawnEggItem(CPEntityTypes.ENDER_BOSS, COLOR, COLOR, new Item.Properties().tab(CutePuppyMod.itemGroup)));

}
