package net.manmaed.cutepuppymod.datagen;

import com.google.common.collect.ImmutableList;
import net.manmaed.cutepuppymod.block.CutePuppyBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class CutePuppyLootTables extends LootTableProvider {
    public CutePuppyLootTables(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookup) {
        super(packOutput, Set.of(), ImmutableList.of(new LootTableProvider.SubProviderEntry(CutePuppyBlockLoot::new, LootContextParamSets.BLOCK)), lookup);

    }

    public static class CutePuppyBlockLoot extends BlockLootSubProvider {

        protected CutePuppyBlockLoot(HolderLookup.Provider lookup) {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags(), lookup);
        }

        @Override
        protected void generate() {
            dropSelf(CutePuppyBlocks.RED_CORE_BLOCK.get());
            dropSelf(CutePuppyBlocks.GREEN_CORE_BLOCK.get());
            dropSelf(CutePuppyBlocks.BLUE_CORE_BLOCK.get());
            dropSelf(CutePuppyBlocks.YELLOW_CORE_BLOCK.get());
            dropSelf(CutePuppyBlocks.PURPLE_CORE_BLOCK.get());
            dropSelf(CutePuppyBlocks.STEVE_CORE_BLOCK.get());
            dropSelf(CutePuppyBlocks.ALEX_CORE_BLOCK.get());
            dropSelf(CutePuppyBlocks.HEROBRINE_CORE_BLOCK.get());
            dropSelf(CutePuppyBlocks.ENDER_CORE_BLOCK.get());
            dropSelf(CutePuppyBlocks.THE_CORE_BLOCK.get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            List<Block> blocks = new ArrayList<>();
            CutePuppyBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get).forEach((b) -> blocks.add(b.defaultBlockState().getBlock()));
            return blocks;
        }
    }

    /*public static class CutePuppyEntityLoot extends EntityLootSubProvider {

        protected CutePuppyEntityLoot(HolderLookup.Provider lookup) {
            super(FeatureFlags.REGISTRY.allFlags(), lookup);
        }

        @Override
        public void generate() {
        }
    }*/
}
