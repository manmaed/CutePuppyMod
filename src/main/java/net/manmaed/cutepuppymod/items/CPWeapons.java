package net.manmaed.cutepuppymod.items;


import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.items.weapon.BanHammer;
import net.manmaed.cutepuppymod.materials.ToolMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Created by manmaed on 05/01/2020.
 */
public class CPWeapons {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CutePuppyMod.MOD_ID);

    /**
     * Example Item:
     * public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().tab(CutePuppyMod.itemGroup)));
     **/

    public static final RegistryObject<Item> RED_SWORD = ITEMS.register("red_sword", () -> new SwordItem(ToolMaterials.RED_CORE, 3, -2.4F, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> GREEN_SWORD = ITEMS.register("green_sword", () -> new SwordItem(ToolMaterials.GREEN_CORE, 3, -2.4F, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> BLUE_SWORD = ITEMS.register("blue_sword", () -> new SwordItem(ToolMaterials.BLUE_CORE, 3, -2.4F, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> PURPLE_SWORD = ITEMS.register("purple_sword", () -> new SwordItem(ToolMaterials.PURPLE_CORE, 3, -2.4F, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> YELLOW_SWORD = ITEMS.register("yellow_sword", () -> new SwordItem(ToolMaterials.YELLOW_CORE, 3, -2.4F, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> BAN_HAMMER = ITEMS.register("ban_hammer", () -> new BanHammer(new Item.Properties().tab(CutePuppyMod.itemGroup)));

}
