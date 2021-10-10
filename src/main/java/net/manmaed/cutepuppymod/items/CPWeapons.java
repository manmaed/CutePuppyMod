package net.manmaed.cutepuppymod.items;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.items.weapon.BanHammer;
import net.manmaed.cutepuppymod.libs.Reference;
import net.manmaed.cutepuppymod.materials.ToolMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Created by manmaed on 05/01/2020.
 */
public class CPWeapons {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    private static final int attackDanage = 3;
    private static final float attackSpeed = -2.4F;

    public static final RegistryObject<Item> BAN_HAMMER = ITEMS.register("ban_hammer", () -> new BanHammer(new Item.Properties().tab(CutePuppyMod.itemGroup).stacksTo(1)));
    public static final RegistryObject<Item> RED_SWORD = ITEMS.register("red_sword", () -> new SwordItem(ToolMaterials.RED_CORE, attackDanage, attackSpeed, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> GREEN_SWORD = ITEMS.register("greeen_sword", () -> new SwordItem(ToolMaterials.GREEN_CORE, attackDanage, attackSpeed, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> BLUE_SWORD = ITEMS.register("blue_sword", () -> new SwordItem(ToolMaterials.BLUE_CORE, attackDanage, attackSpeed, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> YELLOW_SWORD = ITEMS.register("yellow_sword", () -> new SwordItem(ToolMaterials.YELLOW_CORE, attackDanage, attackSpeed, new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> PURPLE_SWORD = ITEMS.register("purple_sword", () -> new SwordItem(ToolMaterials.PURPLE_CORE, attackDanage, attackSpeed, new Item.Properties().tab(CutePuppyMod.itemGroup)));

}
