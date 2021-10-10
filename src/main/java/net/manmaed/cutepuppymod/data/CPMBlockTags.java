package net.manmaed.cutepuppymod.data;

import net.manmaed.cutepuppymod.blocks.CPBlocks;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class CPMBlockTags extends BlockTagsProvider {
    public CPMBlockTags(DataGenerator generatorIn, @Nullable ExistingFileHelper existingFileHelper) {
        super(generatorIn, Reference.MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags() {
        CPBlocks.BLOCKS.getEntries().forEach(blockRegistryObject -> needsIronTool(blockRegistryObject.get()));
        CPBlocks.BLOCKS.getEntries().forEach((blockRegistryObject -> UsePickaxe(blockRegistryObject.get())));
    }

    private void UsePickaxe(Block block) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block);
    }

    private void needsIronTool(Block block) {
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(block);
    }
}
