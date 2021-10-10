package net.manmaed.cutepuppymod.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

public class GenerateDataFiles {

    public static void makeDataFiles(GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();

        dataGenerator.addProvider(new CPMBlockTags(dataGenerator, event.getExistingFileHelper()));
        dataGenerator.addProvider(new CPMCrafting(dataGenerator));
    }
}
