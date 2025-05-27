package net.manmaed.cutepuppymod.datagen;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.libs.RLHelper;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class CutePuppyItemModelProvider extends ItemModelProvider {
    public CutePuppyItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CutePuppyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        makeGenerated("tab_icon");
        makeGenerated("doggo_kibble");
        makeGenerated("syringe_full");
        makeGenerated("syringe_empty");
        makeGenerated("red_core");
        makeGenerated("blue_core");
        makeGenerated("green_core");
        makeGenerated("purple_core");
        makeGenerated("yellow_core");
        makeGenerated("ender_core");
        makeGenerated("steve_core");
        makeGenerated("alex_core");
        makeGenerated("herobrine_core");
        makeHandheld("red_sword");
        makeHandheld("green_sword");
        makeHandheld("blue_sword");
        makeHandheld("purple_sword");
        makeHandheld("yellow_sword");
        makeGenerated("herobrine_spawn_egg");
        makeGenerated("ender_spawn_egg");
        makeGenerated("puppy_spawn_egg");
        makeGenerated("human_puppy_spawn_egg");
        makeGenerated("boss_spawn_egg");
        makeGenerated("six_spawn_egg");
        makeGenerated("ender_boss_spawn_egg");
        makeGenerated("red_spawn_egg");
        makeGenerated("blue_spawn_egg");
        makeGenerated("green_spawn_egg");
        makeGenerated("yellow_spawn_egg");
        makeGenerated("purple_spawn_egg");
        makeGenerated("steve_spawn_egg");
        makeGenerated("alex_spawn_egg");
        makeHandheld("cute_puppy_guide");

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

    public void makeGenerated(String name) {
        singleTexture(name, ResourceLocation.withDefaultNamespace("item/generated"), "layer0", RLHelper.location("item/" + name));
    }

    public void makeHandheld(String name) {
        singleTexture(name, ResourceLocation.withDefaultNamespace("item/handheld"), "layer0", RLHelper.location("item/" + name));
    }

    public void makeBlock(String name) {
        withExistingParent(name, RLHelper.location("block/" + name));
    }
}
