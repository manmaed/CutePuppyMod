package net.manmaed.cutepuppymod.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

/**
 * Created by manmaed on 28/04/2021.
 */

@Mod.EventBusSubscriber
public class CPConfig {
    private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
    private static final ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();
    private static final ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();

    public static ForgeConfigSpec COMMON_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;
    public static ForgeConfigSpec SERVER_CONFIG;

    public static final String CAT_ENITYSPWNING = "entity_spawning";
    public static ForgeConfigSpec.BooleanValue DISABLE_NATUARL_SPAWNS;
    public static ForgeConfigSpec.BooleanValue DISABLE_RED_SPAWN;
    public static ForgeConfigSpec.BooleanValue DISABLE_BLUE_SPAWN;
    public static ForgeConfigSpec.BooleanValue DISABLE_GREEN_SPAWN;
    public static ForgeConfigSpec.BooleanValue DISABLE_YELLOW_SPAWN;
    public static ForgeConfigSpec.BooleanValue DISABLE_PURPLE_SPAWN;
    public static ForgeConfigSpec.BooleanValue DISABLE_STEVE_SPAWN;
    public static ForgeConfigSpec.BooleanValue DISABLE_HEROBRINE_SPAWN;
    public static ForgeConfigSpec.BooleanValue DISABLE_SIX_SPAWN;
    public static ForgeConfigSpec.BooleanValue DISABLE_ENDER_SPAWN;
    public static ForgeConfigSpec.BooleanValue DISABLE_CLAY_SPAWN;

    public static final String CAT_ENTITY_WEIGHTS = "entity_weight";
    public static ForgeConfigSpec.IntValue RED_CHANCE;
    public static ForgeConfigSpec.IntValue BLUE_CHANCE;
    public static ForgeConfigSpec.IntValue GREEN_CHANCE;
    public static ForgeConfigSpec.IntValue YELLOW_CHANCE;
    public static ForgeConfigSpec.IntValue PURPLE_CHANCE;
    public static ForgeConfigSpec.IntValue STEVE_CHANCE;
    public static ForgeConfigSpec.IntValue HEROBRINE_CHANCE;
    public static ForgeConfigSpec.IntValue SIX_CHANCE;
    public static ForgeConfigSpec.IntValue ENDER_CHANCE;
    public static ForgeConfigSpec.IntValue CLAY_CHANCE;

    public static final String CAT_RSS = "Random Server Stuff";
    public static ForgeConfigSpec.BooleanValue RANDOM_SERVER_BOL;


    //Other Shit Here

    static {
        COMMON_BUILDER.comment("Entity Spawning Settings").push(CAT_ENITYSPWNING);
        doMobSpawningConfigs();
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Entity Spawning Weights").push(CAT_ENTITY_WEIGHTS);
        mobSpawningWeights();
        COMMON_BUILDER.pop();

        COMMON_CONFIG = COMMON_BUILDER.build();

        /*SERVER_BUILDER.comment("").push(CAT_RSS);
        justaddedtomakesunerage();
        SERVER_BUILDER.pop();

        SERVER_CONFIG = SERVER_BUILDER.build();

        CLIENT_CONFIG = CLIENT_BUILDER.build();*/
    }

    //Make Configs

    private static void doMobSpawningConfigs() {
        DISABLE_NATUARL_SPAWNS = COMMON_BUILDER.comment("Disable Spawning of Puppys? (All Colors/Ender/Six Puppys [DEFAULT: false]").define("disable_spawining_puppys", false);
        //Gaz Wanted This #BlameGaz
        DISABLE_RED_SPAWN = COMMON_BUILDER.comment("Disable Spawning of Red Puppys? [DEFAULT: false]").define("disable_red_puppy_spawining", false);
        DISABLE_BLUE_SPAWN = COMMON_BUILDER.comment("Disable Spawning of Blue Puppys? [DEFAULT: false]").define("disable_blue_puppy_spawining", false);
        DISABLE_GREEN_SPAWN = COMMON_BUILDER.comment("Disable Spawning of Green Puppys? [DEFAULT: false]").define("disable_green_puppy_spawining", false);
        DISABLE_YELLOW_SPAWN = COMMON_BUILDER.comment("Disable Spawning of Yellow Puppys? [DEFAULT: false]").define("disable_yellow_puppy_spawining", false);
        DISABLE_PURPLE_SPAWN = COMMON_BUILDER.comment("Disable Spawning of Purple Puppys? [DEFAULT: false]").define("disable_purple_puppy_spawining", false);
        DISABLE_STEVE_SPAWN = COMMON_BUILDER.comment("Disable Spawning of Steve Puppys? [DEFAULT: false]").define("disable_steve_puppy_spawining", false);
        DISABLE_HEROBRINE_SPAWN = COMMON_BUILDER.comment("Disable Spawning of Herobrine Puppys? [DEFAULT: false]").define("disable_herobrine_puppy_spawining", false);
        DISABLE_SIX_SPAWN = COMMON_BUILDER.comment("Disable Spawning of Six Puppys? [DEFAULT: false]").define("disable_six_puppy_spawining", false);
        DISABLE_ENDER_SPAWN = COMMON_BUILDER.comment("Disable Spawning of Ender Puppys? [DEFAULT: false]").define("disable_ender_puppy_spawining", false);
        DISABLE_CLAY_SPAWN = COMMON_BUILDER.comment("Disable Spawning of Clay Puppys? [DEFAULT: false]").define("disable_clay_puppy_spawining", false);
    }

    private static void mobSpawningWeights() {
        RED_CHANCE = COMMON_BUILDER.comment("weight of red puppy spawning (higher is more offen)[DEFAULT: 10]").defineInRange("red_puppy_spawn_weight", 10, 0, 50);
        BLUE_CHANCE = COMMON_BUILDER.comment("weight of blue puppy spawning (higher is more offen)[DEFAULT: 10]").defineInRange("blue_puppy_spawn_weight", 10, 0, 50);
        GREEN_CHANCE = COMMON_BUILDER.comment("weight of green puppy spawning (higher is more offen)[DEFAULT: 10]").defineInRange("green_puppy_spawn_weight", 10, 0, 50);
        YELLOW_CHANCE = COMMON_BUILDER.comment("weight of yellow puppy spawning (higher is more offen)[DEFAULT: 10]").defineInRange("yellow_puppy_spawn_weight", 10, 0, 50);
        PURPLE_CHANCE = COMMON_BUILDER.comment("weight of purple puppy spawning (higher is more offen)[DEFAULT: 10?]").defineInRange("purple_puppy_spawn_weight", 10, 0, 50);
        STEVE_CHANCE = COMMON_BUILDER.comment("weight of steve puppy spawning (higher is more offen)[DEFAULT: 10]").defineInRange("steve__puppy_spawn_weight", 10, 0, 50);
        HEROBRINE_CHANCE = COMMON_BUILDER.comment("weight of Herobrine puppy spawning (higher is more offen)[DEFAULT: 3]").defineInRange("herobrine_puppy_spawn_weight", 3, 0, 50);
        SIX_CHANCE = COMMON_BUILDER.comment("weight of Six puppy spawning (higher is more offen)[DEFAULT: 1]").defineInRange("six_puppy_spawn_weight", 1, 0, 50);
        ENDER_CHANCE = COMMON_BUILDER.comment("weight of Ender puppy spawning (higher is more offen)[DEFAULT: 10]").defineInRange("ender_puppy_spawn_weight", 10, 0, 50);
        CLAY_CHANCE = COMMON_BUILDER.comment("weight of Clay puppy spawning (higher is more offen)[DEFAULT: 10]").defineInRange("clay_puppy_spawn_weight", 10, 0, 50);
    }

    private static void justAddedTomakesunerage() {
        RANDOM_SERVER_BOL = SERVER_BUILDER.comment("Is this a Server Config? [DEFAULT: TRUE]").define("is_server_config", true);
    }
}
