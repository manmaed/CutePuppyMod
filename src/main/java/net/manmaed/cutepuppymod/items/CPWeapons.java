package net.manmaed.cutepuppymod.items;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.items.weapon.BanHammer;
import net.manmaed.cutepuppymod.libs.Refs;
import net.manmaed.cutepuppymod.materials.ToolMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Created by manmaed on 05/01/2020.
 */
public class CPWeapons {


    @ObjectHolder(Refs.Register + "ban_hammer")
    public static Item ban_hammer;

    //Core Swords
    @ObjectHolder(Refs.Register + "red_sword")
    public static Item red_sword;

    @ObjectHolder(Refs.Register + "red_sword")
    public static Item blue_sword;

    @ObjectHolder(Refs.Register + "red_sword")
    public static Item yellow_sword;

    @ObjectHolder(Refs.Register + "red_sword")
    public static Item purple_sword;

    @ObjectHolder(Refs.Register + "red_sword")
    public static Item green_sword;


    public static void load() {

        ban_hammer = new BanHammer(new Item.Properties().group(CutePuppyMod.itemGroup).maxStackSize(1)).setRegistryName("ban_hammer");
        red_sword = new SwordItem(ToolMaterials.RED_CORE,3, -2.4F, (new Item.Properties().group(CutePuppyMod.itemGroup))).setRegistryName("red_sword");
        blue_sword = new SwordItem(ToolMaterials.BLUE_CORE,3, -2.4F, (new Item.Properties().group(CutePuppyMod.itemGroup))).setRegistryName("blue_sword");
        yellow_sword = new SwordItem(ToolMaterials.YELLOW_CORE,3, -2.4F, (new Item.Properties().group(CutePuppyMod.itemGroup))).setRegistryName("yellow_sword");
        purple_sword = new SwordItem(ToolMaterials.PURPLE_CORE,3, -2.4F, (new Item.Properties().group(CutePuppyMod.itemGroup))).setRegistryName("purple_sword");
        green_sword = new SwordItem(ToolMaterials.GREEN_CORE,3, -2.4F, (new Item.Properties().group(CutePuppyMod.itemGroup))).setRegistryName("green_sword");




        CutePuppyMod.getRegisteryHandler().registerItem(ban_hammer);
        CutePuppyMod.getRegisteryHandler().registerItem(red_sword);
        CutePuppyMod.getRegisteryHandler().registerItem(blue_sword);
        CutePuppyMod.getRegisteryHandler().registerItem(yellow_sword);
        CutePuppyMod.getRegisteryHandler().registerItem(purple_sword);
        CutePuppyMod.getRegisteryHandler().registerItem(green_sword);


    }
}
