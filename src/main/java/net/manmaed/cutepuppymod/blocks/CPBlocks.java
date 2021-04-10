package net.manmaed.cutepuppymod.blocks;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Created by manmaed on 09/04/2021.
 */
public class CPBlocks {

    private static float hard = 3.0F;
    private static float ress = 5.0F;

    @ObjectHolder(Refs.Register + "redcoreblock")
    public static Block redcoreblock;

    @ObjectHolder(Refs.Register + "greencoreblock")
    public static Block greencoreblock;

    @ObjectHolder(Refs.Register + "bluecoreblock")
    public static Block bluecoreblock;

    @ObjectHolder(Refs.Register + "yellowcoreblock")
    public static Block yellowcoreblock;

    @ObjectHolder(Refs.Register + "purplecoreblock")
    public static Block purplecoreblock;

    @ObjectHolder(Refs.Register + "stevecoreblock")
    public static Block stevecoreblock;

    @ObjectHolder(Refs.Register + "herobrinecoreblock")
    public static Block herobrinecoreblock;

    @ObjectHolder(Refs.Register + "endercoreblock")
    public static Block endercoreblock;

    @ObjectHolder(Refs.Register + "thecoreblock")
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
