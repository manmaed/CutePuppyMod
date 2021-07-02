package net.manmaed.cutepuppymod.world;

import net.manmaed.cutepuppymod.config.CPConfig;
import net.manmaed.cutepuppymod.entitys.CPEntityTypes;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Created by manmaed on 28/04/2021.
 */
@Mod.EventBusSubscriber(modid = Refs.id, bus = Mod.EventBusSubscriber.Bus.MOD)
public class WorldGenMobs {
    public static void onBiomeLoadingEvent(BiomeLoadingEvent event) {
        MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();
        if (!CPConfig.DISABLE_NATUARL_SPAWNS.get()) {
            if (event.getCategory() == Biome.Category.THEEND) {
                withEndMobs(mobspawninfo$builder);
            } else if (event.getCategory() == Biome.Category.NETHER) {
                withNetherMobs(mobspawninfo$builder);
            } else {
                if (event.getCategory() != Biome.Category.OCEAN || event.getCategory() != Biome.Category.RIVER || event.getCategory() != Biome.Category.MUSHROOM) {
                    withPassiveMobs(mobspawninfo$builder);
                    withHostileMobs(mobspawninfo$builder);
                }
            }
        }
    }

    public static void withPassiveMobs(MobSpawnInfo.Builder builder) {
        if (!CPConfig.DISABLE_RED_SPAWN.get()) {
            builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(CPEntityTypes.RED.get(), CPConfig.RED_CHANCE.get(), 2, 4));
        }
        if (!CPConfig.DISABLE_BLUE_SPAWN.get()) {
            builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(CPEntityTypes.BLUE.get(), CPConfig.BLUE_CHANCE.get(), 2, 4));
        }
        if (!CPConfig.DISABLE_GREEN_SPAWN.get()) {
            builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(CPEntityTypes.GREEN.get(), CPConfig.GREEN_CHANCE.get(), 2, 4));
        }
        if (!CPConfig.DISABLE_YELLOW_SPAWN.get()) {
            builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(CPEntityTypes.YELLOW.get(), CPConfig.YELLOW_CHANCE.get(), 2, 4));
        }
        if (!CPConfig.DISABLE_PURPLE_SPAWN.get()) {
            builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(CPEntityTypes.PURPLE.get(), CPConfig.PURPLE_CHANCE.get(), 2, 4));
        }
        if (!CPConfig.DISABLE_STEVE_SPAWN.get()) {
            builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(CPEntityTypes.STEVE.get(), CPConfig.STEVE_CHANCE.get(), 2, 4));
        }
        if (!CPConfig.DISABLE_HEROBRINE_SPAWN.get()) {
            builder.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(CPEntityTypes.HEROBRINE.get(), CPConfig.HEROBRINE_CHANCE.get(), 0, 1));
        }
    }

    public static void withHostileMobs(MobSpawnInfo.Builder builder) {
        if (!CPConfig.DISABLE_ENDER_SPAWN.get()) {
            builder.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(CPEntityTypes.ENDER.get(), CPConfig.ENDER_CHANCE.get(), 2, 3));
        }
    }

    public static void withEndMobs(MobSpawnInfo.Builder builder) {
        if (!CPConfig.DISABLE_ENDER_SPAWN.get()) {
            builder.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(CPEntityTypes.ENDER.get(), (CPConfig.ENDER_CHANCE.get() + 5), 5, 10));
        }
    }

    public static void withNetherMobs(MobSpawnInfo.Builder builder) {
        if (!CPConfig.DISABLE_ENDER_SPAWN.get()) {
            builder.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(CPEntityTypes.ENDER.get(), (CPConfig.ENDER_CHANCE.get() - 5), 1, 1));
        }
        if (!CPConfig.DISABLE_HEROBRINE_SPAWN.get()) {
            builder.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(CPEntityTypes.HEROBRINE.get(), CPConfig.HEROBRINE_CHANCE.get(), 0, 1));
        }
    }
}
