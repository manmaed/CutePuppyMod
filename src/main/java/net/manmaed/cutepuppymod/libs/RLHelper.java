package net.manmaed.cutepuppymod.libs;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.resources.ResourceLocation;

public class RLHelper {
    public static ResourceLocation location(String location) {
        return ResourceLocation.fromNamespaceAndPath(CutePuppyMod.MOD_ID, location);
    }
}
