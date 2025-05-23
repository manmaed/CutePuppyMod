package net.manmaed.cutepuppymod.datagen;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = CutePuppyMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class CutePuppyDataGeneration {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        CutePuppyTagsProvider.addTags(generator, lookupProvider, fileHelper);
        CutePuppyLangProvider.addTranslations(generator);
        generator.addProvider(true, new CutePuppyRecipeProvider(packOutput, lookupProvider));

    }
}
