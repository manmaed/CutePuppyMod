package net.manmaed.cutepuppymod.items;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

/**
 * Created by manmaed on 05/01/2020.
 */
public class CPPuppyDrops {

    /**
     * Example Item:
     * public static final RegistryObject<Item> EXAMPLE_ITEM = CPItems.ITEMS.register("example_item", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
     **/

    public static final RegistryObject<Item> RED_CORE = CPItems.ITEMS.register("red_core", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> BLUE_CORE = CPItems.ITEMS.register("blue_core", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> GREEN_CORE = CPItems.ITEMS.register("green_core", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> PURPLE_CORE = CPItems.ITEMS.register("purple_core", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> ENDER_CORE = CPItems.ITEMS.register("ender_core", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> STEVE_CORE = CPItems.ITEMS.register("steve_core", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> HEROBRINE_CORE = CPItems.ITEMS.register("herobrine_core", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));


}
