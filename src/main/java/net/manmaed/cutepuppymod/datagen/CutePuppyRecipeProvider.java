package net.manmaed.cutepuppymod.datagen;

import net.manmaed.cutepuppymod.libs.RLHelper;
import net.manmaed.cutepuppymod.tag.CutePuppyTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.manmaed.cutepuppymod.block.CutePuppyBlocks.*;
import static net.manmaed.cutepuppymod.item.CutePuppyItems.*;

public class CutePuppyRecipeProvider extends RecipeProvider {
    public CutePuppyRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        //Block To Cores
        blockToCore(RED_CORE_BLOCK.get(), RED_CORE.get(), recipeOutput);
        blockToCore(GREEN_CORE_BLOCK.get(), GREEN_CORE.get(), recipeOutput);
        blockToCore(BLUE_CORE_BLOCK.get(), BLUE_CORE.get(), recipeOutput);
        blockToCore(YELLOW_CORE_BLOCK.get(), YELLOW_CORE.get(), recipeOutput);
        blockToCore(PURPLE_CORE_BLOCK.get(), PURPLE_CORE.get(), recipeOutput);
        blockToCore(STEVE_CORE_BLOCK.get(), STEVE_CORE.get(), recipeOutput);
        blockToCore(HEROBRINE_CORE_BLOCK.get(), HEROBRINE_CORE.get(), recipeOutput);

        //Cores To Blocks
        coreToBlock(RED_CORE_BLOCK.get(), RED_CORE.get(), recipeOutput);
        coreToBlock(GREEN_CORE_BLOCK.get(), GREEN_CORE.get(), recipeOutput);
        coreToBlock(BLUE_CORE_BLOCK.get(), BLUE_CORE.get(), recipeOutput);
        coreToBlock(YELLOW_CORE_BLOCK.get(), YELLOW_CORE.get(), recipeOutput);
        coreToBlock(PURPLE_CORE_BLOCK.get(), PURPLE_CORE.get(), recipeOutput);
        coreToBlock(STEVE_CORE_BLOCK.get(), STEVE_CORE.get(), recipeOutput);
        coreToBlock(HEROBRINE_CORE_BLOCK.get(), HEROBRINE_CORE.get(), recipeOutput);

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
