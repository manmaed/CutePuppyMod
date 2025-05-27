package net.manmaed.cutepuppymod.datagen.lang;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class CutePuppyENUS extends LanguageProvider {
    public CutePuppyENUS(PackOutput output) {
        super(output, CutePuppyMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("a.lang.file.name", "Pirate Speak");
        add("a.lang.author.name", "manmaed");

        //Blocks
        add("block.cutepuppymod.ender_core_block", "Ender Core Bloc");;
        add("block.cutepuppymod.the_core_block", "The Core of Cores Bloc");
        add("block.cutepuppymod.core_block.tooltip", "What are you going to do with this?");

        //Commpressed Cores
        add("block.cutepuppymod.blue_core_block", "Blue Core Block");
        add("block.cutepuppymod.red_core_block", "Red Core Block");
        add("block.cutepuppymod.green_core_block", "Green Core Block");
        add("block.cutepuppymod.purple_core_block", "Purple Core Block");
        add("block.cutepuppymod.yellow_core_block", "Yellow Core Block");
        add("block.cutepuppymod.steve_core_block", "Steve Core Block");
        add("block.cutepuppymod.alex_core_block", "Alex Core Block");
        add("block.cutepuppymod.herobrine_core_block", "Herobrine Core Block");

        //Items
        // Colored Puppys
        add("item.cutepuppymod.puppy_spawn_egg", "Spawn A Puppy");
        add("item.cutepuppymod.red_spawn_egg", "Spawn A Red Puppy");
        add("item.cutepuppymod.blue_spawn_egg", "Spawn A Blue Puppy");
        add("item.cutepuppymod.green_spawn_egg", "Spawn A Green Puppy");
        add("item.cutepuppymod.purple_spawn_egg", "Spawn A Purple Puppy");
        add("item.cutepuppymod.yellow_spawn_egg", "Spawn A Yellow Puppy");

        //# Custom Puppys
        add("item.cutepuppymod.steve_spawn_egg", "Spawn A Steve Puppy");
        add("item.cutepuppymod.alex_spawn_egg", "Spawn A Alex Puppy");
        add("item.cutepuppymod.human_puppy_spawn_egg", "Spawn A Human Puppy");

        add("item.cutepuppymod.six_spawn_egg", "Spawn Sixkiller Puppy");
        add("item.cutepuppymod.herobrine_spawn_egg", "Spawn A Herobrine Puppy");
        add("item.cutepuppymod.ender_spawn_egg", "Spawn A Ender Puppy");
        add("item.cutepuppymod.ender_boss_spawn_egg", "Spawn A Ender Boss Puppy");
        add("item.cutepuppymod.boss_spawn_egg", "Spawn A Boss Puppy");
        add("item.cutepuppymod.tab_icon", "The Icon for CutePuppyMod Creative Tab");

        //PuppyCores
        add("item.cutepuppymod.blue_core", "Blue Puppy Core");
        add("item.cutepuppymod.red_core", "Red Puppy Core");
        add("item.cutepuppymod.green_core", "Green Puppy Core");
        add("item.cutepuppymod.purple_core", "Purple Puppy Core");
        add("item.cutepuppymod.yellow_core", "Yellow Puppy Core");
        add("item.cutepuppymod.ender_core", "Ender Core");
        add("item.cutepuppymod.steve_core", "Steve Puppy Core");
        add("item.cutepuppymod.alex_core", "Alex Puppy Core");
        add("item.cutepuppymod.herobrine_core", "Herobrine Puppy Core");

        //Swords
        add("item.cutepuppymod.blue_sword", "Blue Puppy Sword");
        add("item.cutepuppymod.red_sword", "Red Puppy Sword");
        add("item.cutepuppymod.green_sword", "Green Puppy Sword");
        add("item.cutepuppymod.yellow_sword", "Yellow Puppy Sword");
        add("item.cutepuppymod.purple_sword", "Purple Puppy Sword");
        add("item.cutepuppymod.ban_hammer", "SixKillers Ban Hammer");

        //#Other Items
        add("item.cutepuppymod.syringe_empty", "Empty Syringe");
        add("item.cutepuppymod.syringe_full", "Full Syringe");
        add("item.cutepuppymod.doggo_kibble", "Doggo Kibble");

        //Entitys
        add("entity.cutepuppymod.puppy", "Puppy");
        add("entity.cutepuppymod.six_puppy", "Sixkiller Puppy");
        add("entity.cutepuppymod.human_puppy", "Human Puppy");
        add("entity.cutepuppymod.herobrine_puppy", "Herobrine Puppy");
        add("entity.cutepuppymod.ender_puppy", "Ender Puppy");
        add("entity.cutepuppymod.ender_boss_puppy", "Ender Boss Puppy");
        add("entity.cutepuppymod.boss_puppy", "The Boss Puppy");

        //CreativeTabs
        add("itemGroup.cutepuppymod", "Puppy's Tab");
        add("itemGroup.cutepuppymod.spawn_eggs", "Cute Puppy Spawn Eggs");

        //Advancements
        /*add("advancements.cutepuppymod.root.title", "CutePuppyMod");
        add("advancements.cutepuppymod.root.description", "Go Find CutePuppys");
        add("advancements.cutepuppymod.killpuppy.title", "How could you?");
        add("advancements.cutepuppymod.killpuppy.description", "Kill a Puppy");
        add("advancements.cutepuppymod.killedbosspuppy.title", "I Killed an Op!");
        add("advancements.cutepuppymod.killedbosspuppy.description", "Kill The Boss Puppy");
        add("advancements.cutepuppymod.enderpuppy.title", "Ender Puppys");
        add("advancements.cutepuppymod.enderpuppy.description", "Find the Endermans Puppys!");
        add("advancements.cutepuppymod.herobrine.title", "Herobrine Removed");
        add("advancements.cutepuppymod.herobrine.description", "Herobrine Removed");
        add("advancements.cutepuppymod.killedednderbosspuppy.title", "I Killed the Ender Boss Puppy");
        add("advancements.cutepuppymod.killedednderbosspuppy.description", "Kill The Ender Boss Puppy");
        add("advancements.cutepuppymod.thecoreofcors.title", "Ummm what are you doing with that?");
        add("advancements.cutepuppymod.thecoreofcors.description", "Craft a Core of Cores Block");
        add("advancements.cutepuppymod.thebosspuppy.title", "WHAT HAVE YOU DONE!?");
        add("advancements.cutepuppymod.thebosspuppy.description", "Summon The Boss Puppy");
        add("advancements.cutepuppymod.thebosspuppydeath.title", "I Fixed It");
        add("advancements.cutepuppymod.thebosspuppydeath.description", "Kill The Boss Puppy");*/

        /*add("cutepuppymod.comment.12", "Attack");
        add("death.attack.banned.player", "%1$s was banned from living");
        add("death.attack.noblood", "%1$s poked them self so much they ran out of blood");*/

    }
}
