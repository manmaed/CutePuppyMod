package net.manmaed.cutepuppymod.datagen;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.tag.CutePuppyTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static net.manmaed.cutepuppymod.item.CutePuppyItems.*;
import static net.manmaed.cutepuppymod.block.CutePuppyBlocks.*;

public class CutePuppyTagsProvider {
    public static void addTags(DataGenerator generator, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper fileHelper) {
        PackOutput packOutput = generator.getPackOutput();
        BlockTags blockTag = new BlockTags(packOutput, lookupProvider, fileHelper);
        generator.addProvider(true, blockTag);
        generator.addProvider(true, new ItemTags(packOutput, lookupProvider, blockTag.contentsGetter(), fileHelper));
    }

    static class ItemTags extends ItemTagsProvider {

        public ItemTags(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture, CompletableFuture<TagLookup<Block>> blockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(packOutput, completableFuture, blockTagsProvider, CutePuppyMod.MOD_ID, existingFileHelper);

        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            tag(CutePuppyTags.ItemTag.CORES)
                    .add(RED_CORE.get(),
                            BLUE_CORE.get(),
                            GREEN_CORE.get(),
                            PURPLE_CORE.get(),
                            YELLOW_CORE.get(),
                            ENDER_CORE.get(),
                            STEVE_CORE.get(),
                            ALEX_CORE.get(),
                            HEROBRINE_CORE.get());

            tag(CutePuppyTags.ItemTag.COLOR_CORES)
                    .add(RED_CORE.get(),
                            BLUE_CORE.get(),
                            GREEN_CORE.get(),
                            PURPLE_CORE.get(),
                            YELLOW_CORE.get());

            tag(CutePuppyTags.ItemTag.HUMAN_CORES)
                    .add(STEVE_CORE.get(),
                            ALEX_CORE.get());

            tag(CutePuppyTags.ItemTag.COLOR_CORE_BLOCK_IETM)
                    .add(RED_CORE_BLOCK_ITEM.get(),
                            BLUE_CORE_BLOCK_ITEM.get(),
                            GREEN_CORE_BLOCK_ITEM.get(),
                            PURPLE_CORE_BLOCK_ITEM.get(),
                            YELLOW_CORE_BLOCK_ITEM.get());

            tag(CutePuppyTags.ItemTag.HUMAN_CORE_BLOCK_ITEM)
                    .add(STEVE_CORE_BLOCK_ITEM.get(),
                            ALEX_CORE_BLOCK_ITEM.get());
        }
    }

    static class BlockTags extends BlockTagsProvider {

        public BlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, lookupProvider, CutePuppyMod.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            tag(CutePuppyTags.BlockTag.COLOR_CORE_BLOCKS)
                    .add(RED_CORE_BLOCK.get(),
                            BLUE_CORE_BLOCK.get(),
                            GREEN_CORE_BLOCK.get(),
                            PURPLE_CORE_BLOCK.get(),
                            YELLOW_CORE_BLOCK.get());

            tag(CutePuppyTags.BlockTag.HUMAN_CORE_BLOCKS)
                    .add(STEVE_CORE_BLOCK.get(),
                            ALEX_CORE_BLOCK.get());
        }
    }
}
