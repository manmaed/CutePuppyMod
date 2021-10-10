package net.manmaed.cutepuppymod.data;

import net.manmaed.cutepuppymod.blocks.CPBlocks;
import net.manmaed.cutepuppymod.items.CPItems;
import net.manmaed.cutepuppymod.items.CPPuppyDrops;
import net.manmaed.cutepuppymod.items.CPWeapons;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;


import java.util.function.Consumer;

/**
 * Created by manmaed on 10/10/2021.
 */
public class CPMCrafting extends RecipeProvider {
    public CPMCrafting(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        /* TODO: REMOVE ME BEFORE RELEASE
        ShapedRecipeBuilder.shaped(CPBlocks.RED_CORE_BLOCK.get(), 5)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', CPPuppyDrops.RED_CORE.get())
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "red_core_block"));
         */

        //region Cores -> Core Blocks
        //Red Core Block
        ShapedRecipeBuilder.shaped(CPBlocks.RED_CORE_BLOCK.get())
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', CPPuppyDrops.RED_CORE.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "red_core_block"));

        //Blue Core Block
        ShapedRecipeBuilder.shaped(CPBlocks.BLUE_CORE_BLOCK.get())
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', CPPuppyDrops.BLUE_CORE.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "blue_core_block"));

        //Green Core Block
        ShapedRecipeBuilder.shaped(CPBlocks.GREEN_CORE_BLOCK.get())
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', CPPuppyDrops.GREEN_CORE.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "green_core_block"));

        //Purple Core Block
        ShapedRecipeBuilder.shaped(CPBlocks.PURPLE_CORE_BLOCK.get())
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', CPPuppyDrops.PURPLE_CORE.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "purple_core_block"));

        //Yellow Core Block
        ShapedRecipeBuilder.shaped(CPBlocks.YELLOW_CORE_BLOCK.get())
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', CPPuppyDrops.YELLOW_CORE.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "yellow_core_block"));

        //Steve Core Block
        ShapedRecipeBuilder.shaped(CPBlocks.STEVE_CORE_BLOCK.get())
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', CPPuppyDrops.STEVE_CORE.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "steve_core_block"));

        //Herobrine Core Block
        ShapedRecipeBuilder.shaped(CPBlocks.HEROBRINE_CORE_BLOCK.get())
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', CPPuppyDrops.HEROBRINE_CORE.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "herobrine_core_block"));

        //Purple Core Block
        ShapedRecipeBuilder.shaped(CPBlocks.ENDER_CORE_BLOCK.get())
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', CPPuppyDrops.ENDER_CORE.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "ender_core_block"));
        //endregion

        //region Core Blocks -> Cores
        //Red Core Block
        ShapelessRecipeBuilder.shapeless(CPPuppyDrops.RED_CORE.get(), 9)
                .requires(CPBlocks.RED_CORE_BLOCK.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "red_core"));

        //Blue Core Block
        ShapelessRecipeBuilder.shapeless(CPPuppyDrops.BLUE_CORE.get(), 9)
                .requires(CPBlocks.BLUE_CORE_BLOCK.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "blue_core"));

        //Green Core Block
        ShapelessRecipeBuilder.shapeless(CPPuppyDrops.GREEN_CORE.get(), 9)
                .requires(CPBlocks.GREEN_CORE_BLOCK.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "green_core"));

        //Purple Core Block
        ShapelessRecipeBuilder.shapeless(CPPuppyDrops.PURPLE_CORE.get(), 9)
                .requires(CPBlocks.PURPLE_CORE_BLOCK.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "purple_core"));

        //Yellow Core Block
        ShapelessRecipeBuilder.shapeless(CPPuppyDrops.YELLOW_CORE.get(), 9)
                .requires(CPBlocks.YELLOW_CORE_BLOCK.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "yellow_core"));

        //Steve Core Block
        ShapelessRecipeBuilder.shapeless(CPPuppyDrops.STEVE_CORE.get(), 9)
                .requires(CPBlocks.STEVE_CORE_BLOCK.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "steve_core"));

        //Herobrine Core Block
        ShapelessRecipeBuilder.shapeless(CPPuppyDrops.HEROBRINE_CORE.get(), 9)
                .requires(CPBlocks.HEROBRINE_CORE_BLOCK.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "herobrine_core"));

        //Purple Core Block
        ShapelessRecipeBuilder.shapeless(CPPuppyDrops.ENDER_CORE.get(), 9)
                .requires(CPBlocks.ENDER_CORE_BLOCK.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "ender_core"));
        //endregion

        //region Weapons
        //Red Sword
        ShapedRecipeBuilder.shaped(CPWeapons.RED_SWORD.get())
                .pattern("c")
                .pattern("c")
                .pattern("s")
                .define('c', CPPuppyDrops.RED_CORE.get())
                .define('s', Items.STICK)
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "red_sword"));

        //Green
        ShapedRecipeBuilder.shaped(CPWeapons.GREEN_SWORD.get())
                .pattern("c")
                .pattern("c")
                .pattern("s")
                .define('c', CPPuppyDrops.GREEN_CORE.get())
                .define('s', Items.STICK)
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "green_sword"));

        //Blue
        ShapedRecipeBuilder.shaped(CPWeapons.BLUE_SWORD.get())
                .pattern("c")
                .pattern("c")
                .pattern("s")
                .define('c', CPPuppyDrops.BLUE_CORE.get())
                .define('s', Items.STICK)
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "blue_sword"));

        //Purple
        ShapedRecipeBuilder.shaped(CPWeapons.PURPLE_SWORD.get())
                .pattern("c")
                .pattern("c")
                .pattern("s")
                .define('c', CPPuppyDrops.PURPLE_CORE.get())
                .define('s', Items.STICK)
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "purple_sword"));

        //Yellow
        ShapedRecipeBuilder.shaped(CPWeapons.YELLOW_SWORD.get())
                .pattern("c")
                .pattern("c")
                .pattern("s")
                .define('c', CPPuppyDrops.YELLOW_CORE.get())
                .define('s', Items.STICK)
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "yellow_sword"));

        //endregion

        //region Other Blocks
        ShapedRecipeBuilder.shaped(CPBlocks.THE_CORE_BLOCK.get())
                .pattern("prs")
                .pattern("g b")
                .pattern("hye")
                .define('p', CPBlocks.PURPLE_CORE_BLOCK.get())
                .define('r', CPBlocks.RED_CORE_BLOCK.get())
                .define('s', CPBlocks.STEVE_CORE_BLOCK.get())
                .define('g', CPBlocks.GREEN_CORE_BLOCK.get())
                .define('b', CPBlocks.BLUE_CORE_BLOCK.get())
                .define('h', CPBlocks.HEROBRINE_CORE_BLOCK.get())
                .define('y', CPBlocks.YELLOW_CORE_BLOCK.get())
                .define('e', CPBlocks.ENDER_CORE_BLOCK.get())
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "core_of_cores"));
        //endregion

        //region Other Items
        ShapedRecipeBuilder.shaped(CPItems.DOGGO_KIBBLE.get(), 4)
                .pattern("m")
                .pattern("w")
                .pattern("b")
                .define('m', Items.COOKED_BEEF)
                .define('w', Tags.Items.CROPS_WHEAT)
                .define('b', Items.BOWL)
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "doggo_kibble"));
        ShapedRecipeBuilder.shaped(CPItems.EMPTY_SYRINGE.get())
                .pattern("iw ")
                .pattern("wgw")
                .pattern(" ww")
                .define('i', Tags.Items.INGOTS_IRON)
                .define('w', Items.BLACK_WOOL)
                .define('g', Blocks.GLASS)
                .unlockedBy("", has(Items.AIR))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "empty_syringe"));
        //endregion
    }
}
