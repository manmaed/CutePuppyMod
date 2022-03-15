package net.manmaed.cutepuppymod.items;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.items.tools.FullSyringe;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Created by manmaed on 09/04/2021.
 */
public class CPItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CutePuppyMod.MOD_ID);

    /**
     * Example Item:
     * public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().tab(PetRock.itemGroup)));
     **/
    public static final RegistryObject<Item> TAB_ICON = ITEMS.register("tab_icon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DOGGO_KIBBLE = ITEMS.register("doggo_kibble", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> SYRINGE_FULL = ITEMS.register("syringe_full", () -> new FullSyringe(new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> SYRINGE_EMPTY = ITEMS.register("syringe_empty", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
}
