package net.manmaed.cutepuppymod.blocks;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.items.CPItems;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

/**
 * Created by manmaed on 09/04/2021.
 */
public class CPBlocks {

    private static final float hard = 3.0F;
    private static final float ress = 5.0F;

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    private static RegistryObject<Item> blockItem(String id, Supplier<Block> b) {
        return CPItems.ITEMS.register(id, () -> new BlockItem(b.get(), new Item.Properties().tab(CutePuppyMod.itemGroup)));
    }

    public static final RegistryObject<Block> RED_CORE_BLOCK = BLOCKS.register("red_core_block", () -> new Block(Block.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_CORE_BLOCK = BLOCKS.register("green_core_block", () -> new Block(Block.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CORE_BLOCK = BLOCKS.register("blue_core_block", () -> new Block(Block.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_CORE_BLOCK = BLOCKS.register("yellow_core_block", () -> new Block(Block.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_CORE_BLOCK = BLOCKS.register("purple_core_block", () -> new Block(Block.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STEVE_CORE_BLOCK = BLOCKS.register("steve_core_block", () -> new Block(Block.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> HEROBRINE_CORE_BLOCK = BLOCKS.register("herobrine_core_block", () -> new Block(Block.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ENDER_CORE_BLOCK = BLOCKS.register("ender_core_block", () -> new EnderCoreBlock(Block.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> THE_CORE_BLOCK = BLOCKS.register("the_core_block", () -> new TheCoreBlock(Block.Properties.of(Material.STONE).strength(hard, ress).requiresCorrectToolForDrops()));

    public static final RegistryObject<Item> RED_CORE_BLOCK_ITEM = blockItem("red_core_block", RED_CORE_BLOCK);
    public static final RegistryObject<Item> GREEN_CORE_BLOCK_ITEM = blockItem("green_core_block", GREEN_CORE_BLOCK);
    public static final RegistryObject<Item> BLUE_CORE_BLOCK_ITEM = blockItem("blue_core_block", BLUE_CORE_BLOCK);
    public static final RegistryObject<Item> YELLOW_CORE_BLOCK_ITEM = blockItem("yellow_core_block", YELLOW_CORE_BLOCK);
    public static final RegistryObject<Item> PURPLE_CORE_BLOCK_ITEM = blockItem("purple_core_block", PURPLE_CORE_BLOCK);
    public static final RegistryObject<Item> STEVE_CORE_BLOCK_ITEM = blockItem("steve_core_block", STEVE_CORE_BLOCK);
    public static final RegistryObject<Item> HEROBRINE_CORE_BLOCK_ITEM = blockItem("herobrine_core_block", HEROBRINE_CORE_BLOCK);
    public static final RegistryObject<Item> ENDER_CORE_BLOCK_ITEM = blockItem("ender_core_block", ENDER_CORE_BLOCK);
    public static final RegistryObject<Item> THE_CORE_BLOCK_ITEM = blockItem("the_core_block", THE_CORE_BLOCK);

}
