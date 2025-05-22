package net.manmaed.cutepuppymod.items;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Created by manmaed on 05/01/2020.
 */
public class CPPuppyDrops {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CutePuppyMod.MOD_ID);

    /**
     * Example Item:
     * public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
     **/

    public static final RegistryObject<Item> RED_CORE = ITEMS.register("red_core", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> BLUE_CORE = ITEMS.register("blue_core", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> GREEN_CORE = ITEMS.register("green_core", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> PURPLE_CORE = ITEMS.register("purple_core", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> YELLOW_CORE = ITEMS.register("yellow_core", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> ENDER_CORE = ITEMS.register("ender_core", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> STEVE_CORE = ITEMS.register("steve_core", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> HEROBRINE_CORE = ITEMS.register("herobrine_core", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));


}
