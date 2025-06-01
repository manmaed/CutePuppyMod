package net.manmaed.cutepuppymod.worldgen;

import net.manmaed.cutepuppymod.entity.CutePuppyEntityTypes;
import net.manmaed.cutepuppymod.libs.RLHelper;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;

public class CutePuppyBiomesModifers {

    private static ResourceKey<BiomeModifier> SPAWN_PUPPY = createKey("spawn_puppy");
    private static ResourceKey<BiomeModifier> SPAWN_HUMAN_PUPPY = createKey("spawn_human_puppy");
    private static ResourceKey<BiomeModifier> SPAWN_HEROBRINE_PUPPY = createKey("spawn_herobrine_puppy");
    private static ResourceKey<BiomeModifier> SPAWN_SIX_PUPPY = createKey("spawn_six_puppy");
    private static ResourceKey<BiomeModifier> SPAWN_ENDER_PUPPY_OVERWORLD = createKey("spawn_ender_puppy_overworld");
    private static ResourceKey<BiomeModifier> SPAWN_ENDER_PUPPY_NETHER = createKey("spawn_ender_puppy_nether");
    private static ResourceKey<BiomeModifier> SPAWN_ENDER_PUPPY_END = createKey("spawn_ender_puppy_end");



    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        HolderGetter<PlacedFeature> placedFeaturs = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);

        context.register(SPAWN_PUPPY, new BiomeModifiers.AddSpawnsBiomeModifier(
                PuppySpawnBiomeGroups.overworldBiomes(biomes, false),
                List.of(new MobSpawnSettings.SpawnerData(CutePuppyEntityTypes.PUPPY.get(), 25, 1, 3))));

        context.register(SPAWN_HUMAN_PUPPY, new BiomeModifiers.AddSpawnsBiomeModifier(
                PuppySpawnBiomeGroups.overworldBiomes(biomes,false),
                List.of(new MobSpawnSettings.SpawnerData(CutePuppyEntityTypes.HUMAN_PUPPY.get(), 25, 1, 3))));

        context.register(SPAWN_HEROBRINE_PUPPY, new BiomeModifiers.AddSpawnsBiomeModifier(
                PuppySpawnBiomeGroups.overworldBiomes(biomes, false),
                List.of(new MobSpawnSettings.SpawnerData(CutePuppyEntityTypes.HEROBRINE.get(), 10, 1, 1))));

        context.register(SPAWN_SIX_PUPPY, new BiomeModifiers.AddSpawnsBiomeModifier(
                PuppySpawnBiomeGroups.overworldBiomes(biomes, false),
                List.of(new MobSpawnSettings.SpawnerData(CutePuppyEntityTypes.SIX.get(), 2, 1, 1))));

        //Ender Puppys
        context.register(SPAWN_ENDER_PUPPY_OVERWORLD, new BiomeModifiers.AddSpawnsBiomeModifier(
                PuppySpawnBiomeGroups.overworldBiomes(biomes, true),
                List.of(new MobSpawnSettings.SpawnerData(CutePuppyEntityTypes.ENDER.get(), 10, 1, 2))));
        context.register(SPAWN_ENDER_PUPPY_NETHER, new BiomeModifiers.AddSpawnsBiomeModifier(
                PuppySpawnBiomeGroups.netherBiomes(biomes),
                List.of(new MobSpawnSettings.SpawnerData(CutePuppyEntityTypes.ENDER.get(), 2, 1, 2))));
        context.register(SPAWN_ENDER_PUPPY_END, new BiomeModifiers.AddSpawnsBiomeModifier(
                PuppySpawnBiomeGroups.endBiomes(biomes),
                List.of(new MobSpawnSettings.SpawnerData(CutePuppyEntityTypes.ENDER.get(), 30, 2, 6))));
    }


    private static ResourceKey<BiomeModifier> createKey(String name){
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, RLHelper.location(name));
    }
}
