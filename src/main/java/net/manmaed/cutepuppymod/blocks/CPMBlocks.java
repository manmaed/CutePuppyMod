package net.manmaed.cutepuppymod.blocks;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Created by manmaed on 05/01/2020.
 */
public class CPMBlocks {

    private static float hard = 3.0F;
    private static float ress = 5.0F;

    @ObjectHolder(Reference.Register + "redcoreblock")
    public static Block redcoreblock;

    @ObjectHolder(Reference.Register + "greencoreblock")
    public static Block greencoreblock;

    @ObjectHolder(Reference.Register + "bluecoreblock")
    public static Block bluecoreblock;

    @ObjectHolder(Reference.Register + "yellowcoreblock")
    public static Block yellowcoreblock;

    @ObjectHolder(Reference.Register + "purplecoreblock")
    public static Block purplecoreblock;

    @ObjectHolder(Reference.Register + "stevecoreblock")
    public static Block stevecoreblock;

    @ObjectHolder(Reference.Register + "herobrinecoreblock")
    public static Block herobrinecoreblock;

    @ObjectHolder(Reference.Register + "endercoreblock")
    public static Block endercoreblock;

    @ObjectHolder(Reference.Register + "thecoreblock")
    public static Block thecoreblock;

    public static void load() {

        redcoreblock = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(hard, ress).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("redcoreblock");
        greencoreblock = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(hard, ress).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("greencoreblock");
        bluecoreblock = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(hard, ress).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("bluecoreblock");
        yellowcoreblock = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(hard, ress).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("yellowcoreblock");
        purplecoreblock = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(hard, ress).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("purplecoreblock");
        stevecoreblock = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(hard, ress).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("stevecoreblock");
        herobrinecoreblock = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(hard, ress).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("herobrinecoreblock");

        //Magic Blocks
        endercoreblock = new EnderCoreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(hard, ress).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("endercoreblock");
        thecoreblock = new TheCoreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(hard, ress).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("thecoreblock");

        CutePuppyMod.getRegisteryHandler().registerBlock(redcoreblock);
        CutePuppyMod.getRegisteryHandler().registerBlock(greencoreblock);
        CutePuppyMod.getRegisteryHandler().registerBlock(bluecoreblock);
        CutePuppyMod.getRegisteryHandler().registerBlock(yellowcoreblock);
        CutePuppyMod.getRegisteryHandler().registerBlock(purplecoreblock);
        CutePuppyMod.getRegisteryHandler().registerBlock(stevecoreblock);
        CutePuppyMod.getRegisteryHandler().registerBlock(herobrinecoreblock);
        CutePuppyMod.getRegisteryHandler().registerBlock(endercoreblock);
        CutePuppyMod.getRegisteryHandler().registerBlock(thecoreblock);

    }
}
