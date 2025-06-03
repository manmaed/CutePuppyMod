package net.manmaed.cutepuppymod.datagen.lang;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class CutePuppyLOLUS extends LanguageProvider {
    public CutePuppyLOLUS(PackOutput output) {
        super(output, CutePuppyMod.MOD_ID, "lol_us");
    }

    @Override
    protected void addTranslations() {
        add("a.lang.file.name", "LOLCAT (Kingdom of Cats)");
        add("a.lang.author.name", "ChatGPT");

        // Blocks
        add("block.cutepuppymod.ender_core_block", "Ender Core Blokkz");
        add("block.cutepuppymod.the_core_block", "Teh Core ov Cores Blokkz");
        add("block.cutepuppymod.core_block.tooltip", "Wut u gonna do wif dis shiny ting?");

// Compressed Cores
        add("block.cutepuppymod.blue_core_block", "Blu Core Blokkz");
        add("block.cutepuppymod.red_core_block", "Red Core Blokkz");
        add("block.cutepuppymod.green_core_block", "Gr33n Core Blokkz");
        add("block.cutepuppymod.purple_core_block", "Purpl Core Blokkz");
        add("block.cutepuppymod.yellow_core_block", "Yello Core Blokkz");
        add("block.cutepuppymod.steve_core_block", "Steve Core Blokkz");
        add("block.cutepuppymod.alex_core_block", "Alex Core Blokkz");
        add("block.cutepuppymod.herobrine_core_block", "Herobrine Core Blokkz");

// Items - Colored Puppys
        add("item.cutepuppymod.puppy_spawn_egg", "Spawnz a Puppy! *nyeow*");
        add("item.cutepuppymod.red_spawn_egg", "Spawnz a Red Puppy! *rawr*");
        add("item.cutepuppymod.blue_spawn_egg", "Spawnz a Blu Puppy! *purr*");
        add("item.cutepuppymod.green_spawn_egg", "Spawnz a Gr33n Puppy! *meow*");
        add("item.cutepuppymod.purple_spawn_egg", "Spawnz a Purpl Puppy! *hiss*");
        add("item.cutepuppymod.yellow_spawn_egg", "Spawnz a Yello Puppy! *zomg*");

// Custom Puppys
        add("item.cutepuppymod.steve_spawn_egg", "Spawnz Steve Puppy! *kitteh powah*");
        add("item.cutepuppymod.alex_spawn_egg", "Spawnz Alex Puppy! *kitteh swag*");
        add("item.cutepuppymod.human_puppy_spawn_egg", "Spawnz Human Puppy! *hooman wowz*");
        add("item.cutepuppymod.six_spawn_egg", "Spawnz Sixkiller Puppy! *uh oh!*");
        add("item.cutepuppymod.herobrine_spawn_egg", "Spawnz Herobrine Puppy! *sp00ky*");
        add("item.cutepuppymod.ender_spawn_egg", "Spawnz Ender Puppy! *invisi-pup*");
        add("item.cutepuppymod.ender_boss_spawn_egg", "Spawnz Ender Boss Puppy! *big boss kitteh*");
        add("item.cutepuppymod.boss_spawn_egg", "Spawnz Boss Puppy! *omg teh boss*");
        add("item.cutepuppymod.tab_icon", "Teh icon fur CutePuppyMod tab");

// PuppyCores
        add("item.cutepuppymod.blue_core", "Blu Puppy Core");
        add("item.cutepuppymod.red_core", "Red Puppy Core");
        add("item.cutepuppymod.green_core", "Gr33n Puppy Core");
        add("item.cutepuppymod.purple_core", "Purpl Puppy Core");
        add("item.cutepuppymod.yellow_core", "Yello Puppy Core");
        add("item.cutepuppymod.ender_core", "Ender Core");
        add("item.cutepuppymod.steve_core", "Steve Puppy Core");
        add("item.cutepuppymod.alex_core", "Alex Puppy Core");
        add("item.cutepuppymod.herobrine_core", "Herobrine Puppy Core");

// Swords
        add("item.cutepuppymod.blue_sword", "Blu Puppy Swordz");
        add("item.cutepuppymod.red_sword", "Red Puppy Swordz");
        add("item.cutepuppymod.green_sword", "Gr33n Puppy Swordz");
        add("item.cutepuppymod.yellow_sword", "Yello Puppy Swordz");
        add("item.cutepuppymod.purple_sword", "Purpl Puppy Swordz");
        add("item.cutepuppymod.ban_hammer", "Sixkillerz Ban Hammr *smash*");

// Other Items
        add("item.cutepuppymod.syringe_empty", "Empty Syrinj");
        add("item.cutepuppymod.syringe_full", "Full Syrinj");
        add("item.cutepuppymod.doggo_kibble", "Doggo Noms");

        // Entities
        add("entity.cutepuppymod.puppy", "Puppy! *wuff wuff*");
        add("entity.cutepuppymod.six_puppy", "Sixkiller Puppy! *uh ohz*");
        add("entity.cutepuppymod.human_puppy", "Hooman Puppy! *weirdz*");
        add("entity.cutepuppymod.herobrine_puppy", "Sp00ky Herobrine Puppy!");
        add("entity.cutepuppymod.ender_puppy", "Invisi-Ender Puppy");
        add("entity.cutepuppymod.ender_boss_puppy", "Big Boss Ender Puppy");
        add("entity.cutepuppymod.boss_puppy", "Da Boss Puppy! *fear teh floof*");

// Creative Tabs
        add("itemGroup.cutepuppymod", "Puppiez Tab");
        add("itemGroup.cutepuppymod.spawn_eggs", "Cute Puppy Spawn Eggz");

// Advancements
        add("advancements.cutepuppymod.root.title", "CutePuppyMod - Kitteh Kingdom");
        add("advancements.cutepuppymod.root.description", "Go findz all da Cute Puppiez!");
        add("advancements.cutepuppymod.kill_puppy.title", "How could u??");
        add("advancements.cutepuppymod.kill_puppy.description", "U killz a Puppy! *noooo*");
        add("advancements.cutepuppymod.kill_six_puppy.title", "I killz an Op!");
        add("advancements.cutepuppymod.kill_six_puppy.description", "U slayz da Sixkiller Puppy!");
        add("advancements.cutepuppymod.kill_ender_puppy.title", "Ender Puppiez!");
        add("advancements.cutepuppymod.kill_ender_puppy.description", "Findz and killz Ender Puppiez!");
        add("advancements.cutepuppymod.kill_herobrine.title", "Herobrine Removed!");
        add("advancements.cutepuppymod.kill_herobrine.description", "Bye bye Herobrine Puppy!");
        add("advancements.cutepuppymod.kill_ender_boss_puppy.title", "I killz da Ender Boss!");
        add("advancements.cutepuppymod.kill_ender_boss_puppy.description", "Slay da Big Boss Ender Puppy!");
        add("advancements.cutepuppymod.craft_core_of_cores.title", "Umm wut u doin wif dat?");
        add("advancements.cutepuppymod.craft_core_of_cores.description", "Craftz a Core ov Cores Blokk!");
        add("advancements.cutepuppymod.summon_boss_puppy.title", "WUT U DOIN!?");
        add("advancements.cutepuppymod.summon_boss_puppy.description", "Summonz da Boss Puppy! *uh oh*");
        add("advancements.cutepuppymod.kill_boss_puppy.title", "I fixed it!");
        add("advancements.cutepuppymod.kill_boss_puppy.description", "Killz da Boss Puppy!");

// Death Messages
        add("death.attack.cutepuppymod.banned", "%1$s wuz banned from lyfe. :(");
        add("death.attack.cutepuppymod.no_blood", "%1$s pokez itself sooo much, ran outta bloodz! *ouch*");

    }
}
