package net.manmaed.cutepuppymod.datagen;

import net.manmaed.cutepuppymod.block.CutePuppyBlocks;
import net.manmaed.cutepuppymod.item.CutePuppyItems;
import net.manmaed.cutepuppymod.libs.RLHelper;
import net.manmaed.cutepuppymod.tag.CutePuppyTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import vazkii.patchouli.api.PatchouliAPI;

import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CutePuppyRecipeProvider extends RecipeProvider {
    public CutePuppyRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        //Block To Cores and back
        cores(CutePuppyBlocks.RED_CORE_BLOCK.get(), CutePuppyItems.RED_CORE.get(), recipeOutput);
        cores(CutePuppyBlocks.GREEN_CORE_BLOCK.get(), CutePuppyItems.GREEN_CORE.get(), recipeOutput);
        cores(CutePuppyBlocks.BLUE_CORE_BLOCK.get(), CutePuppyItems.BLUE_CORE.get(), recipeOutput);
        cores(CutePuppyBlocks.YELLOW_CORE_BLOCK.get(), CutePuppyItems.YELLOW_CORE.get(), recipeOutput);
        cores(CutePuppyBlocks.PURPLE_CORE_BLOCK.get(), CutePuppyItems.PURPLE_CORE.get(), recipeOutput);
        cores(CutePuppyBlocks.STEVE_CORE_BLOCK.get(), CutePuppyItems.STEVE_CORE.get(), recipeOutput);
        cores(CutePuppyBlocks.ALEX_CORE_BLOCK.get(), CutePuppyItems.ALEX_CORE.get(), recipeOutput);
        cores(CutePuppyBlocks.HEROBRINE_CORE_BLOCK.get(), CutePuppyItems.HEROBRINE_CORE.get(), recipeOutput);
        cores(CutePuppyBlocks.ENDER_CORE_BLOCK.get(), CutePuppyItems.ENDER_CORE.get(), recipeOutput);

        //Swords
        sword(CutePuppyItems.RED_CORE.get(), CutePuppyItems.RED_SWORD.get(), recipeOutput);
        sword(CutePuppyItems.GREEN_CORE.get(), CutePuppyItems.GREEN_SWORD.get(), recipeOutput);
        sword(CutePuppyItems.BLUE_CORE.get(), CutePuppyItems.BLUE_SWORD.get(), recipeOutput);
        sword(CutePuppyItems.YELLOW_CORE.get(), CutePuppyItems.YELLOW_SWORD.get(), recipeOutput);
        sword(CutePuppyItems.PURPLE_CORE.get(), CutePuppyItems.PURPLE_SWORD.get(), recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CutePuppyBlocks.THE_CORE_BLOCK.get(), 1)
                .define('p', Ingredient.of(CutePuppyBlocks.PURPLE_CORE_BLOCK.get()))
                .define('r', Ingredient.of(CutePuppyBlocks.RED_CORE_BLOCK.get()))
                .define('s', Ingredient.of(CutePuppyBlocks.STEVE_CORE_BLOCK.get()))
                .define('g', Ingredient.of(CutePuppyBlocks.GREEN_CORE_BLOCK.get()))
                .define('b', Ingredient.of(CutePuppyBlocks.BLUE_CORE_BLOCK.get()))
                .define('h', Ingredient.of(CutePuppyBlocks.HEROBRINE_CORE_BLOCK.get()))
                .define('y', Ingredient.of(CutePuppyBlocks.YELLOW_CORE_BLOCK.get()))
                .define('a', Ingredient.of(CutePuppyBlocks.ALEX_CORE_BLOCK.get()))
                .pattern("prs")
                .pattern("g b")
                .pattern("hya")
                .unlockedBy("has_core", has(CutePuppyTags.ItemTag.CORES)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, CutePuppyItems.SYRINGE_EMPTY.get(), 1)
                .define('i', Ingredient.of(Tags.Items.INGOTS_IRON))
                .define('w', Ingredient.of(Blocks.BLACK_WOOL))
                .define('g', Ingredient.of(Tags.Items.GLASS_BLOCKS_COLORLESS))
                .pattern("iw ")
                .pattern("wgw")
                .pattern(" ww")
                .unlockedBy("has_iron", has(Items.IRON_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CutePuppyItems.DOGGO_KIBBLE, 4)
                .requires(Items.COOKED_BEEF)
                .requires(Tags.Items.CROPS_WHEAT)
                .requires(Items.BOWL)
                .unlockedBy("has_beef", has(Items.COOKED_BEEF)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PatchouliAPI.get().getBookStack(RLHelper.location("cute_puppy_guide")))
                .requires(Items.BOOK)
                .requires(CutePuppyTags.ItemTag.CORES)
                .unlockedBy("has_core", has(CutePuppyTags.ItemTag.CORES)).save(recipeOutput, "patchouli:cute_puppy_guide");
    }

    private static void cores(Block coreBlock,Item core, RecipeOutput recipeOutput) {
        coreToBlock(coreBlock, core, recipeOutput);
        blockToCore(coreBlock,core,recipeOutput);
    }

    private static void blockToCore(Block coreBlock,Item core, RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, core, 9)
                .requires(coreBlock).unlockedBy("has_core", has(CutePuppyTags.ItemTag.CORES)).save(recipeOutput, RLHelper.location(retunName(coreBlock.asItem()) + "_to_" + retunName(core)));
    }

    private static void coreToBlock(Block coreBlock,Item core, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, coreBlock, 1)
                .define('c', Ingredient.of(core))
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .unlockedBy("has_core", has(CutePuppyTags.ItemTag.CORES)).save(recipeOutput, RLHelper.location(retunName(core) + "_to_" + retunName(coreBlock.asItem())));
    }
    private static void sword(Item core, Item sword, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, sword, 1)
                .define('c', Ingredient.of(core))
                .define('s', Ingredient.of(Tags.Items.RODS_WOODEN))
                .pattern("c")
                .pattern("c")
                .pattern("s")
                .unlockedBy("has_core", has(CutePuppyTags.ItemTag.CORES)).save(recipeOutput, RLHelper.location(retunName(sword)));
    }

    private static String retunName(Item item) {
        String item_with_idet = item.toString();
        String regex = "(?<=:)[^:]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(item_with_idet);
        // Extract the part after the colon
        String name = ""; //Should always be replaced
        if (matcher.find()) {
            name = matcher.group();
        }
        return name;
    }
}
