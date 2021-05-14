package net.manmaed.cutepuppymod.world;

import net.manmaed.cutepuppymod.config.CPConfig;
import net.manmaed.cutepuppymod.entitys.CPEntityTypes;
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
@Mod.EventBusSubscriber
public class WorldGenMobs {

    @SubscribeEvent(priority = EventPriority.HIGH)
    public void onBiomeLoadingEvent(BiomeLoadingEvent event) {
        if (!CPConfig.DISABLE_NATUARL_SPAWNS.get()) {
            if (event.getCategory() == Biome.Category.THEEND) {
                //Must be the End?
                if (!CPConfig.DISABLE_ENDER_SPAWN.get()) {
                    event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(CPEntityTypes.ENDER.get(), (CPConfig.ENDER_CHANCE.get() + 5), 5, 10));
                }
            }
            if (event.getCategory() == Biome.Category.NETHER) {
                //Must be The Nether
                if (!CPConfig.DISABLE_ENDER_SPAWN.get()) {
                    event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(CPEntityTypes.ENDER.get(), (CPConfig.ENDER_CHANCE.get() - 5), 1, 1));
                }
                if (!CPConfig.DISABLE_HEROBRINE_SPAWN.get()) {
                    event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(CPEntityTypes.HEROBRINE.get(), CPConfig.HEROBRINE_CHANCE.get(), 0, 1));
                }
            }
            if (event.getCategory() != Biome.Category.THEEND || event.getCategory() != Biome.Category.NETHER ) {
                //If Not the End or Nether (So Overworld Right?)
                if (event.getCategory() != Biome.Category.OCEAN || event.getCategory() != Biome.Category.RIVER || event.getCategory() !=  Biome.Category.MUSHROOM ) {
                    //If Not An Ocean, River or A mushroom Biome
                    if (!CPConfig.DISABLE_ENDER_SPAWN.get()) {
                        event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(CPEntityTypes.ENDER.get(), CPConfig.ENDER_CHANCE.get(), 2, 3));
                    }
                    if (!CPConfig.DISABLE_RED_SPAWN.get()) {
                        event.getSpawns().getSpawner(EntityClassification.AMBIENT).add(new MobSpawnInfo.Spawners(CPEntityTypes.RED.get(), CPConfig.RED_CHANCE.get(), 2, 4));
                    }
                    if (!CPConfig.DISABLE_BLUE_SPAWN.get()) {
                        event.getSpawns().getSpawner(EntityClassification.AMBIENT).add(new MobSpawnInfo.Spawners(CPEntityTypes.BLUE.get(), CPConfig.BLUE_CHANCE.get(), 2, 4));
                    }
                    if (!CPConfig.DISABLE_GREEN_SPAWN.get()) {
                        event.getSpawns().getSpawner(EntityClassification.AMBIENT).add(new MobSpawnInfo.Spawners(CPEntityTypes.GREEN.get(), CPConfig.GREEN_CHANCE.get(), 2, 4));
                    }
                    if (!CPConfig.DISABLE_YELLOW_SPAWN.get()) {
                        event.getSpawns().getSpawner(EntityClassification.AMBIENT).add(new MobSpawnInfo.Spawners(CPEntityTypes.YELLOW.get(), CPConfig.YELLOW_CHANCE.get(), 2, 4));
                    }
                    if (!CPConfig.DISABLE_PURPLE_SPAWN.get()) {
                        event.getSpawns().getSpawner(EntityClassification.AMBIENT).add(new MobSpawnInfo.Spawners(CPEntityTypes.PURPLE.get(), CPConfig.PURPLE_CHANCE.get(), 2, 4));
                    }
                    if (!CPConfig.DISABLE_STEVE_SPAWN.get()) {
                        event.getSpawns().getSpawner(EntityClassification.AMBIENT).add(new MobSpawnInfo.Spawners(CPEntityTypes.STEVE.get(), CPConfig.STEVE_CHANCE.get(), 2, 4));
                    }
                    if (!CPConfig.DISABLE_HEROBRINE_SPAWN.get()) {
                        event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(CPEntityTypes.HEROBRINE.get(), CPConfig.HEROBRINE_CHANCE.get(), 0, 1));
                    }
                    if (!CPConfig.DISABLE_SIX_SPAWN.get()) {
                        event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(CPEntityTypes.SIX.get(), CPConfig.SIX_CHANCE.get(), 0, 1));
                    }
                }
            }
        }
    }


}
