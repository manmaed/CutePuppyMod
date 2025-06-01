package net.manmaed.cutepuppymod.worldgen;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;

public class PuppySpawnBiomeGroups {
    public static HolderSet<Biome> overworldBiomes(HolderGetter<Biome> biomes, boolean withCaves) {
        if (withCaves) {
            return HolderSet.direct(
                    biomes.getOrThrow(Biomes.PLAINS),
                    biomes.getOrThrow(Biomes.SUNFLOWER_PLAINS),
                    biomes.getOrThrow(Biomes.SNOWY_PLAINS),
                    biomes.getOrThrow(Biomes.DESERT),
                    biomes.getOrThrow(Biomes.SWAMP),
                    biomes.getOrThrow(Biomes.MANGROVE_SWAMP),
                    biomes.getOrThrow(Biomes.FOREST),
                    biomes.getOrThrow(Biomes.FLOWER_FOREST),
                    biomes.getOrThrow(Biomes.BIRCH_FOREST),
                    biomes.getOrThrow(Biomes.DARK_FOREST),
                    biomes.getOrThrow(Biomes.OLD_GROWTH_BIRCH_FOREST),
                    biomes.getOrThrow(Biomes.OLD_GROWTH_PINE_TAIGA),
                    biomes.getOrThrow(Biomes.OLD_GROWTH_SPRUCE_TAIGA),
                    biomes.getOrThrow(Biomes.TAIGA),
                    biomes.getOrThrow(Biomes.SNOWY_TAIGA),
                    biomes.getOrThrow(Biomes.SAVANNA),
                    biomes.getOrThrow(Biomes.SAVANNA_PLATEAU),
                    biomes.getOrThrow(Biomes.WINDSWEPT_HILLS),
                    biomes.getOrThrow(Biomes.WINDSWEPT_GRAVELLY_HILLS),
                    biomes.getOrThrow(Biomes.WINDSWEPT_FOREST),
                    biomes.getOrThrow(Biomes.WINDSWEPT_SAVANNA),
                    biomes.getOrThrow(Biomes.JUNGLE),
                    biomes.getOrThrow(Biomes.SPARSE_JUNGLE),
                    biomes.getOrThrow(Biomes.BAMBOO_JUNGLE),
                    biomes.getOrThrow(Biomes.BADLANDS),
                    biomes.getOrThrow(Biomes.ERODED_BADLANDS),
                    biomes.getOrThrow(Biomes.WOODED_BADLANDS),
                    biomes.getOrThrow(Biomes.MEADOW),
                    biomes.getOrThrow(Biomes.CHERRY_GROVE),
                    biomes.getOrThrow(Biomes.GROVE),
                    biomes.getOrThrow(Biomes.SNOWY_SLOPES),
                    biomes.getOrThrow(Biomes.BEACH),
                    biomes.getOrThrow(Biomes.SNOWY_BEACH),
                    biomes.getOrThrow(Biomes.STONY_SHORE),
                    biomes.getOrThrow(Biomes.MUSHROOM_FIELDS),
                    biomes.getOrThrow(Biomes.DRIPSTONE_CAVES),
                    biomes.getOrThrow(Biomes.LUSH_CAVES)
            );
        } else {
            return HolderSet.direct(
                    biomes.getOrThrow(Biomes.PLAINS),
                    biomes.getOrThrow(Biomes.SUNFLOWER_PLAINS),
                    biomes.getOrThrow(Biomes.SNOWY_PLAINS),
                    biomes.getOrThrow(Biomes.DESERT),
                    biomes.getOrThrow(Biomes.SWAMP),
                    biomes.getOrThrow(Biomes.MANGROVE_SWAMP),
                    biomes.getOrThrow(Biomes.FOREST),
                    biomes.getOrThrow(Biomes.FLOWER_FOREST),
                    biomes.getOrThrow(Biomes.BIRCH_FOREST),
                    biomes.getOrThrow(Biomes.DARK_FOREST),
                    biomes.getOrThrow(Biomes.OLD_GROWTH_BIRCH_FOREST),
                    biomes.getOrThrow(Biomes.OLD_GROWTH_PINE_TAIGA),
                    biomes.getOrThrow(Biomes.OLD_GROWTH_SPRUCE_TAIGA),
                    biomes.getOrThrow(Biomes.TAIGA),
                    biomes.getOrThrow(Biomes.SNOWY_TAIGA),
                    biomes.getOrThrow(Biomes.SAVANNA),
                    biomes.getOrThrow(Biomes.SAVANNA_PLATEAU),
                    biomes.getOrThrow(Biomes.WINDSWEPT_HILLS),
                    biomes.getOrThrow(Biomes.WINDSWEPT_GRAVELLY_HILLS),
                    biomes.getOrThrow(Biomes.WINDSWEPT_FOREST),
                    biomes.getOrThrow(Biomes.WINDSWEPT_SAVANNA),
                    biomes.getOrThrow(Biomes.JUNGLE),
                    biomes.getOrThrow(Biomes.SPARSE_JUNGLE),
                    biomes.getOrThrow(Biomes.BAMBOO_JUNGLE),
                    biomes.getOrThrow(Biomes.BADLANDS),
                    biomes.getOrThrow(Biomes.ERODED_BADLANDS),
                    biomes.getOrThrow(Biomes.WOODED_BADLANDS),
                    biomes.getOrThrow(Biomes.MEADOW),
                    biomes.getOrThrow(Biomes.CHERRY_GROVE),
                    biomes.getOrThrow(Biomes.GROVE),
                    biomes.getOrThrow(Biomes.SNOWY_SLOPES),
                    biomes.getOrThrow(Biomes.BEACH),
                    biomes.getOrThrow(Biomes.SNOWY_BEACH),
                    biomes.getOrThrow(Biomes.STONY_SHORE),
                    biomes.getOrThrow(Biomes.MUSHROOM_FIELDS));
        }
    }

    public static HolderSet<Biome> netherBiomes(HolderGetter<Biome> biomes) {
        return HolderSet.direct(
                biomes.getOrThrow(Biomes.NETHER_WASTES),
                biomes.getOrThrow(Biomes.CRIMSON_FOREST),
                biomes.getOrThrow(Biomes.WARPED_FOREST),
                biomes.getOrThrow(Biomes.SOUL_SAND_VALLEY),
                biomes.getOrThrow(Biomes.BASALT_DELTAS)
        );
    }

    public static HolderSet<Biome> endBiomes(HolderGetter<Biome> biomes) {
        return HolderSet.direct(
                biomes.getOrThrow(Biomes.THE_END),
                biomes.getOrThrow(Biomes.END_HIGHLANDS),
                biomes.getOrThrow(Biomes.END_MIDLANDS),
                biomes.getOrThrow(Biomes.SMALL_END_ISLANDS),
                biomes.getOrThrow(Biomes.END_BARRENS)
        );
    }
}
