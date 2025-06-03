package net.manmaed.cutepuppymod.datagen.lang;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class CutePuppyENPT extends LanguageProvider {
    public CutePuppyENPT(PackOutput output) {
        super(output, CutePuppyMod.MOD_ID, "en_pt");
    }

    @Override
    protected void addTranslations() {
        add("a.lang.file.name", "Pirate Speak (The Seven Seas)");
        add("a.lang.author.name", "ChatGPT");

        //Blocks
        add("block.cutepuppymod.ender_core_block", "Ender Heart o’ the Seas");
        add("block.cutepuppymod.the_core_block", "The Core o’ All Cores");
        add("block.cutepuppymod.core_block.tooltip", "What devilry be ye plannin’ with this, ye scallywag?");

        //Commpressed Cores
        add("block.cutepuppymod.blue_core_block", "Blue Heart Block");
        add("block.cutepuppymod.red_core_block", "Red Heart Block");
        add("block.cutepuppymod.green_core_block", "Green Heart Block");
        add("block.cutepuppymod.purple_core_block", "Purple Heart Block");
        add("block.cutepuppymod.yellow_core_block", "Yellow Heart Block");
        add("block.cutepuppymod.steve_core_block", "Steve’s Heart Block");
        add("block.cutepuppymod.alex_core_block", "Alex’s Heart Block");
        add("block.cutepuppymod.herobrine_core_block", "Herobrine’s Cursed Heart");

        // Items
        // Colored Puppys
        add("item.cutepuppymod.puppy_spawn_egg", "Summon a Scruffy Sea Pup");
        add("item.cutepuppymod.red_spawn_egg", "Summon a Crimson Pup");
        add("item.cutepuppymod.blue_spawn_egg", "Summon a Deep Blue Pup");
        add("item.cutepuppymod.green_spawn_egg", "Summon a Mossy Pup");
        add("item.cutepuppymod.purple_spawn_egg", "Summon a Royal Pup");
        add("item.cutepuppymod.yellow_spawn_egg", "Summon a Sunbright Pup");

        // Custom Puppys
        add("item.cutepuppymod.steve_spawn_egg", "Summon a Steve-Lookin’ Pup");
        add("item.cutepuppymod.alex_spawn_egg", "Summon an Alex-Lookin’ Pup");
        add("item.cutepuppymod.human_puppy_spawn_egg", "Summon a Landlubber Pup");

        add("item.cutepuppymod.six_spawn_egg", "Summon the Dreaded Sixkiller Pup");
        add("item.cutepuppymod.herobrine_spawn_egg", "Summon the Ghostly Herobrine Pup");
        add("item.cutepuppymod.ender_spawn_egg", "Summon an Ender Pup o’ Shadows");
        add("item.cutepuppymod.ender_boss_spawn_egg", "Summon the Kraken-Ender Pup");
        add("item.cutepuppymod.boss_spawn_egg", "Summon the Cap’n Pup of Doom");
        add("item.cutepuppymod.tab_icon", "The Jolly Mark o’ the CutePuppyMod");

        //PuppyCores
        add("item.cutepuppymod.blue_core", "Blue Pup Heart");
        add("item.cutepuppymod.red_core", "Red Pup Heart");
        add("item.cutepuppymod.green_core", "Green Pup Heart");
        add("item.cutepuppymod.purple_core", "Purple Pup Heart");
        add("item.cutepuppymod.yellow_core", "Yellow Pup Heart");
        add("item.cutepuppymod.ender_core", "Ender Heart");
        add("item.cutepuppymod.steve_core", "Steve’s Pup Heart");
        add("item.cutepuppymod.alex_core", "Alex’s Pup Heart");
        add("item.cutepuppymod.herobrine_core", "Herobrine’s Cursed Heart");

        //Swords
        add("item.cutepuppymod.blue_sword", "Cutlass o’ the Blue Pup");
        add("item.cutepuppymod.red_sword", "Cutlass o’ the Crimson Pup");
        add("item.cutepuppymod.green_sword", "Cutlass o’ the Moss Pup");
        add("item.cutepuppymod.yellow_sword", "Cutlass o’ the Golden Pup");
        add("item.cutepuppymod.purple_sword", "Cutlass o’ the Regal Pup");
        add("item.cutepuppymod.ban_hammer", "Sixkiller’s Mighty Booty Basher");

        //Other Items
        add("item.cutepuppymod.syringe_empty", "Hollow Vessel o’ Jabbin’");
        add("item.cutepuppymod.syringe_full", "Brimmin’ Vessel o’ Mystery");
        add("item.cutepuppymod.doggo_kibble", "Rations fer the Canine Crew");

        //Entitys
        add("entity.cutepuppymod.puppy", "Little Deckhand Pup");
        add("entity.cutepuppymod.six_puppy", "The Sixkiller Pup");
        add("entity.cutepuppymod.human_puppy", "Swabbie Pup");
        add("entity.cutepuppymod.herobrine_puppy", "Ghost Pup o’ Herobrine");
        add("entity.cutepuppymod.ender_puppy", "Nether Pup o’ the Abyss");
        add("entity.cutepuppymod.ender_boss_puppy", "Cap’n Ender Pup");
        add("entity.cutepuppymod.boss_puppy", "The Admiral Pup");

        //CreativeTabs
        add("itemGroup.cutepuppymod", "Tab o’ Seafarin’ Pups");
        add("itemGroup.cutepuppymod.spawn_eggs", "Mystic Pup Summon’ Eggs");

        //Advancements
        add("advancements.cutepuppymod.root.title", "CutePuppyMod: Tales o’ the Woofin’ Sea");
        add("advancements.cutepuppymod.root.description", "Set sail ‘n find the cuddly beasts!");
        add("advancements.cutepuppymod.kill_puppy.title", "Ye monster!");
        add("advancements.cutepuppymod.kill_puppy.description", "Slay a Sea Pup, ye scurvy dog");
        add("advancements.cutepuppymod.kill_six_puppy.title", "I bested an Overpowered Buccaneer!");
        add("advancements.cutepuppymod.kill_six_puppy.description", "Send Sixkiller Pup to Davy Jones");
        add("advancements.cutepuppymod.kill_ender_puppy.title", "Ender Sea Beasts");
        add("advancements.cutepuppymod.kill_ender_puppy.description", "Find th’ Enderbeast Pups!");
        add("advancements.cutepuppymod.kill_herobrine.title", "Herobrine Walks the Plank");
        add("advancements.cutepuppymod.kill_herobrine.description", "Banish Herobrine to the briny deep");
        add("advancements.cutepuppymod.kill_ender_boss_puppy.title", "Thar goes the Ender Pup Cap’n");
        add("advancements.cutepuppymod.kill_ender_boss_puppy.description", "Sink the Ender Boss Pup");
        add("advancements.cutepuppymod.craft_core_of_cores.title", "Arrr, what madness be this?");
        add("advancements.cutepuppymod.craft_core_of_cores.description", "Forge the Heart o’ Hearts");
        add("advancements.cutepuppymod.summon_boss_puppy.title", "Ye’ve doomed us all!");
        add("advancements.cutepuppymod.summon_boss_puppy.description", "Summon the Big Bad Sea Pup");
        add("advancements.cutepuppymod.kill_boss_puppy.title", "I set things right, by thunder!");
        add("advancements.cutepuppymod.kill_boss_puppy.description", "Defeat the Beastly Boss Pup");

        //Death Messages
        add("death.attack.cutepuppymod.banned", "%1$s was keelhauled from existence");
        add("death.attack.cutepuppymod.no_blood", "%1$s jabbed ‘emself silly and ran dry o’ lifeblood");

    }
}
