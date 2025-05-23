package net.manmaed.cutepuppymod.block;


import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.item.CutePuppyItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Created by manmaed on 09/04/2021.
 */
public class CutePuppyBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CutePuppyMod.MOD_ID);


    /**
     * Example Block:
     * public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", CPBaseBlock::new);
     * public static final DeferredItem<Item> EXAMPLE_BLOCK_ITEM = PRItems.ITEMS.register("example_block", () -> new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties().tab(PetRock.itemGroup)));
     **/

    public static final DeferredBlock<Block> RED_CORE_BLOCK = BLOCKS.register("red_core_block", () -> new CutePuppyBaseBlock(MapColor.COLOR_RED));
    public static final DeferredBlock<Block> GREEN_CORE_BLOCK = BLOCKS.register("green_core_block", () -> new CutePuppyBaseBlock(MapColor.COLOR_GREEN));
    public static final DeferredBlock<Block> BLUE_CORE_BLOCK = BLOCKS.register("blue_core_block", () -> new CutePuppyBaseBlock(MapColor.COLOR_BLUE));
    public static final DeferredBlock<Block> YELLOW_CORE_BLOCK = BLOCKS.register("yellow_core_block", () -> new CutePuppyBaseBlock(MapColor.COLOR_YELLOW));
    public static final DeferredBlock<Block> PURPLE_CORE_BLOCK = BLOCKS.register("purple_core_block", () -> new CutePuppyBaseBlock(MapColor.COLOR_PURPLE));
    public static final DeferredBlock<Block> STEVE_CORE_BLOCK = BLOCKS.register("steve_core_block", () -> new CutePuppyBaseBlock(MapColor.STONE));
    public static final DeferredBlock<Block> HEROBRINE_CORE_BLOCK = BLOCKS.register("herobrine_core_block", () -> new CutePuppyBaseBlock(MapColor.NONE));
    public static final DeferredBlock<Block> ENDER_CORE_BLOCK = BLOCKS.register("ender_core_block", EnderCoreBlock::new);
    public static final DeferredBlock<Block> THE_CORE_BLOCK = BLOCKS.register("the_core_block", TheCoreBlock::new);

    public static final DeferredItem<Item> RED_CORE_BLOCK_ITEM = CutePuppyItems.ITEMS.register("red_core_block", () -> new BlockItem(RED_CORE_BLOCK.get(), new Item.Properties()));
    public static final DeferredItem<Item> GREEN_CORE_BLOCK_ITEM = CutePuppyItems.ITEMS.register("green_core_block", () -> new BlockItem(GREEN_CORE_BLOCK.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLUE_CORE_BLOCK_ITEM = CutePuppyItems.ITEMS.register("blue_core_block", () -> new BlockItem(BLUE_CORE_BLOCK.get(), new Item.Properties()));
    public static final DeferredItem<Item> YELLOW_CORE_BLOCK_ITEM = CutePuppyItems.ITEMS.register("yellow_core_block", () -> new BlockItem(YELLOW_CORE_BLOCK.get(), new Item.Properties()));
    public static final DeferredItem<Item> PURPLE_CORE_BLOCK_ITEM = CutePuppyItems.ITEMS.register("purple_core_block", () -> new BlockItem(PURPLE_CORE_BLOCK.get(), new Item.Properties()));
    public static final DeferredItem<Item> STEVE_CORE_BLOCK_ITEM = CutePuppyItems.ITEMS.register("steve_core_block", () -> new BlockItem(STEVE_CORE_BLOCK.get(), new Item.Properties()));
    public static final DeferredItem<Item> HEROBRINE_CORE_BLOCK_ITEM = CutePuppyItems.ITEMS.register("herobrine_core_block", () -> new BlockItem(HEROBRINE_CORE_BLOCK.get(), new Item.Properties()));
    public static final DeferredItem<Item> ENDER_CORE_BLOCK_ITEM = CutePuppyItems.ITEMS.register("ender_core_block", () -> new BlockItem(ENDER_CORE_BLOCK.get(), new Item.Properties()));
    public static final DeferredItem<Item> THE_CORE_BLOCK_ITEM = CutePuppyItems.ITEMS.register("the_core_block", () -> new BlockItem(THE_CORE_BLOCK.get(), new Item.Properties()));

}
