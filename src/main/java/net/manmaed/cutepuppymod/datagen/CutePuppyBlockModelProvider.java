package net.manmaed.cutepuppymod.datagen;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.libs.RLHelper;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class CutePuppyBlockModelProvider extends BlockModelProvider {

    public CutePuppyBlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CutePuppyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        makeBlock("red_core_block");
        makeBlock("green_core_block");
        makeBlock("blue_core_block");
        makeBlock("yellow_core_block");
        makeBlock("purple_core_block");
        makeBlock("steve_core_block");
        makeBlock("alex_core_block");
        makeBlock("herobrine_core_block");
        makeBlock("ender_core_block");
        makeBlock("the_core_block");
    }

    public void makeBlock(String name) {
        singleTexture(name, ResourceLocation.withDefaultNamespace("block/cube_all"), "all", RLHelper.location("block/" + name));
    }
}
