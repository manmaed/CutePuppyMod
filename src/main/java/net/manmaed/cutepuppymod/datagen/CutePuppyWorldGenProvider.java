package net.manmaed.cutepuppymod.datagen;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.worldgen.CutePuppyBiomesModifers;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class CutePuppyWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public CutePuppyWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture, new RegistrySetBuilder()
                .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, CutePuppyBiomesModifers::bootstrap),
                Set.of(CutePuppyMod.MOD_ID));
    }
}
