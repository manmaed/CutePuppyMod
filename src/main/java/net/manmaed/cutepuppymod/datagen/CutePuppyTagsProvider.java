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
            tag(CutePuppyTags.ItemTag.CORES).add(RED_CORE.get(), BLUE_CORE.get(), GREEN_CORE.get(), PURPLE_CORE.get(), YELLOW_CORE.get(), ENDER_CORE.get(), STEVE_CORE.get(), HEROBRINE_CORE.get());
        }
    }

    static class BlockTags extends BlockTagsProvider {

        public BlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, lookupProvider, CutePuppyMod.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {

        }
    }
}
