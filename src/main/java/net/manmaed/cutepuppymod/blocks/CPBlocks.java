package net.manmaed.cutepuppymod.blocks;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Created by manmaed on 09/04/2021.
 */
public class CPBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CutePuppyMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CutePuppyMod.MOD_ID);
    private static final float hard = 3.0F;
    private static final float ress = 5.0F;

    /**
     * Example Block:
     * public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
     * public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties().tab(CutePuppyMod.itemGroup)));
     **/

    public static final RegistryObject<Block> RED_CORE_BLOCK = BLOCKS.register("red_core_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops().color(MaterialColor.COLOR_RED)));
    public static final RegistryObject<Block> GREEN_CORE_BLOCK = BLOCKS.register("green_core_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops().color(MaterialColor.COLOR_GREEN)));
    public static final RegistryObject<Block> BLUE_CORE_BLOCK = BLOCKS.register("blue_core_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops().color(MaterialColor.COLOR_BLUE)));
    public static final RegistryObject<Block> YELLOW_CORE_BLOCK = BLOCKS.register("yellow_core_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops().color(MaterialColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> PURPLE_CORE_BLOCK = BLOCKS.register("purple_core_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops().color(MaterialColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> STEVE_CORE_BLOCK = BLOCKS.register("steve_core_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> HEROBRINE_CORE_BLOCK = BLOCKS.register("herobrine_core_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ENDER_CORE_BLOCK = BLOCKS.register("ender_core_block", () -> new EnderCoreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops().color(MaterialColor.COLOR_GREEN)));
    public static final RegistryObject<Block> THE_CORE_BLOCK = BLOCKS.register("the_core_block", () -> new TheCoreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops()));

    public static final RegistryObject<Item> RED_CORE_BLOCK_ITEM = ITEMS.register("red_core_block", () -> new BlockItem(RED_CORE_BLOCK.get(), new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> GREEN_CORE_BLOCK_ITEM = ITEMS.register("green_core_block", () -> new BlockItem(GREEN_CORE_BLOCK.get(), new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> BLUE_CORE_BLOCK_ITEM = ITEMS.register("blue_core_block", () -> new BlockItem(BLUE_CORE_BLOCK.get(), new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> YELLOW_CORE_BLOCK_ITEM = ITEMS.register("yellow_core_block", () -> new BlockItem(YELLOW_CORE_BLOCK.get(), new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> PURPLE_CORE_BLOCK_ITEM = ITEMS.register("purple_core_block", () -> new BlockItem(PURPLE_CORE_BLOCK.get(), new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> STEVE_CORE_BLOCK_ITEM = ITEMS.register("steve_core_block", () -> new BlockItem(STEVE_CORE_BLOCK.get(), new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> HEROBRINE_CORE_BLOCK_ITEM = ITEMS.register("herobrine_core_block", () -> new BlockItem(HEROBRINE_CORE_BLOCK.get(), new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> ENDER_CORE_BLOCK_ITEM = ITEMS.register("ender_core_block", () -> new BlockItem(ENDER_CORE_BLOCK.get(), new Item.Properties().tab(CutePuppyMod.itemGroup)));
    public static final RegistryObject<Item> THE_CORE_BLOCK_ITEM = ITEMS.register("the_core_block", () -> new BlockItem(THE_CORE_BLOCK.get(), new Item.Properties().tab(CutePuppyMod.itemGroup)));


}
