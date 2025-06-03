package net.manmaed.cutepuppymod.datagen;

import net.manmaed.cutepuppymod.datagen.lang.CutePuppyENPT;
import net.manmaed.cutepuppymod.datagen.lang.CutePuppyENUD;
import net.manmaed.cutepuppymod.datagen.lang.CutePuppyENUS;
import net.manmaed.cutepuppymod.datagen.lang.CutePuppyLOLUS;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;

public class CutePuppyLangProvider {
    public static void addTranslations(DataGenerator generator) {
        PackOutput output = generator.getPackOutput();
        /**
         * To Add a new LanguageProvider make a new file in the net.manmaed.cutepuppymod.datagen.lang called CutePuppylocale (eg CutePuppyENPT for Pirate Speak)
         * then make that extend LanguageProvider make it only need a PackOutput and define the modID as CutePuppyMod.MOD_ID and the locale in the super
         * Example:
         * public CutePuppyENPT(PackOutput output) { super(output, CutePuppyMod.MOD_ID, "en_pt") }
         * --
         * please add the fist 2 lines to the new Language for Language Name, Translator Name
         * Example:
         * add("a.lang.file.name", "Pirate Speak");
         * add("a.lang.author.name", "manmaed");
         */
        generator.addProvider(true, new CutePuppyENUS(output));
        generator.addProvider(true, new CutePuppyENPT(output));
        generator.addProvider(true, new CutePuppyENUD(output));
        generator.addProvider(true, new CutePuppyLOLUS(output));
    }
}
