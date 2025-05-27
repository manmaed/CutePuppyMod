package net.manmaed.cutepuppymod.datagen;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.block.CutePuppyBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class CutePuppyBlockStateProvider extends BlockStateProvider {
    public CutePuppyBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CutePuppyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(CutePuppyBlocks.RED_CORE_BLOCK.get(), getFile("red_core_block"));
        simpleBlock(CutePuppyBlocks.GREEN_CORE_BLOCK.get(), getFile("green_core_block"));
        simpleBlock(CutePuppyBlocks.BLUE_CORE_BLOCK.get(), getFile("blue_core_block"));
        simpleBlock(CutePuppyBlocks.YELLOW_CORE_BLOCK.get(), getFile("yellow_core_block"));
        simpleBlock(CutePuppyBlocks.PURPLE_CORE_BLOCK.get(), getFile("purple_core_block"));
        simpleBlock(CutePuppyBlocks.STEVE_CORE_BLOCK.get(), getFile("steve_core_block"));
        simpleBlock(CutePuppyBlocks.ALEX_CORE_BLOCK.get(), getFile("alex_core_block"));
        simpleBlock(CutePuppyBlocks.HEROBRINE_CORE_BLOCK.get(), getFile("herobrine_core_block"));
        simpleBlock(CutePuppyBlocks.ENDER_CORE_BLOCK.get(), getFile("ender_core_block"));
        simpleBlock(CutePuppyBlocks.THE_CORE_BLOCK.get(), getFile("the_core_block"));
    }

    private ModelFile getFile(String name) {
        return models().getBuilder(CutePuppyMod.MOD_ID + ":block/" + name);
    }
}
