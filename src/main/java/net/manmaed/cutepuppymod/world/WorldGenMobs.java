package net.manmaed.cutepuppymod.world;

import net.manmaed.cutepuppymod.config.CPConfig;
import net.manmaed.cutepuppymod.entitys.CPEntityTypes;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.event.world.BiomeLoadingEvent;

/**
 * Created by manmaed on 28/04/2021.
 */
public class WorldGenMobs {

    public static void withPassiveMobs(BiomeLoadingEvent builder) {
        if (!CPConfig.DISABLE_RED_SPAWN.get()) {
            builder.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(CPEntityTypes.RED.get(), CPConfig.RED_CHANCE.get(), 1, 2));
        }
        else if (!CPConfig.DISABLE_BLUE_SPAWN.get()) {
            builder.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(CPEntityTypes.BLUE.get(), CPConfig.BLUE_CHANCE.get(), 1, 2));
        }
        else if (!CPConfig.DISABLE_GREEN_SPAWN.get()) {
            builder.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(CPEntityTypes.GREEN.get(), CPConfig.GREEN_CHANCE.get(), 2, 2));
        }
        else if (!CPConfig.DISABLE_YELLOW_SPAWN.get()) {
            builder.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(CPEntityTypes.YELLOW.get(), CPConfig.YELLOW_CHANCE.get(), 1, 2));
        }
        else if (!CPConfig.DISABLE_PURPLE_SPAWN.get()) {
            builder.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(CPEntityTypes.PURPLE.get(), CPConfig.PURPLE_CHANCE.get(), 1, 2));
        }
        else if (!CPConfig.DISABLE_STEVE_SPAWN.get()) {
            builder.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(CPEntityTypes.STEVE.get(), CPConfig.STEVE_CHANCE.get(), 1, 2));
        }
        else if (!CPConfig.DISABLE_HEROBRINE_SPAWN.get()) {
            builder.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(CPEntityTypes.HEROBRINE.get(), CPConfig.HEROBRINE_CHANCE.get(), 0, 1));
        }
    }

    public static void withHostileMobs(BiomeLoadingEvent builder) {
        if (!CPConfig.DISABLE_ENDER_SPAWN.get()) {
            builder.getSpawns().getSpawner(MobCategory.MONSTER).add(new MobSpawnSettings.SpawnerData(CPEntityTypes.ENDER.get(), CPConfig.ENDER_CHANCE.get(), 1, 2));
        }
    }

    public static void withEndMobs(BiomeLoadingEvent builder) {
        if (!CPConfig.DISABLE_ENDER_SPAWN.get()) {
            builder.getSpawns().getSpawner(MobCategory.MONSTER).add(new MobSpawnSettings.SpawnerData(CPEntityTypes.ENDER.get(), (CPConfig.ENDER_CHANCE.get()), 2, 5));
        }
    }

    public static void withNetherMobs(BiomeLoadingEvent builder) {
        if (!CPConfig.DISABLE_ENDER_SPAWN.get()) {
            builder.getSpawns().getSpawner(MobCategory.MONSTER).add(new MobSpawnSettings.SpawnerData(CPEntityTypes.ENDER.get(), (CPConfig.ENDER_CHANCE.get()), 1, 1));
        }
        else if (!CPConfig.DISABLE_HEROBRINE_SPAWN.get()) {
            builder.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(CPEntityTypes.HEROBRINE.get(), CPConfig.HEROBRINE_CHANCE.get(), 0, 1));
        }
    }
}
