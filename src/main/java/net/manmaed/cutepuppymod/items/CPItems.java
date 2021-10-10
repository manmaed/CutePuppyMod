package net.manmaed.cutepuppymod.items;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.items.tools.EmptySyringe;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Created by manmaed on 09/04/2021.
 */
public class CPItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<Item> TAB_ICON = ITEMS.register("tab_icon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMPTY_SYRINGE = ITEMS.register("empty_syringe", () -> new EmptySyringe(new Item.Properties().tab(CutePuppyMod.itemGroup).stacksTo(1)));
    public static final RegistryObject<Item> FULL_SYRINGE = ITEMS.register("full_syringe", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup).stacksTo(1)));
    public static final RegistryObject<Item> DOGGO_KIBBLE = ITEMS.register("doggo_kibble", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));

}
