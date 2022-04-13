package net.manmaed.cutepuppymod.client.model;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

/**
 * Created by manmaed on 12/04/2022.
 */
public class CPModels {

    public static final ModelLayerLocation RED = makeModelLayerLocation("red");
    public static final ModelLayerLocation GREEN = makeModelLayerLocation("green");
    public static final ModelLayerLocation BLUE = makeModelLayerLocation("blue");
    public static final ModelLayerLocation YELLOW = makeModelLayerLocation("yellow");
    public static final ModelLayerLocation PURPLE = makeModelLayerLocation("purple");
    public static final ModelLayerLocation ENDER = makeModelLayerLocation("ender");
    public static final ModelLayerLocation STEVE = makeModelLayerLocation("steve");
    public static final ModelLayerLocation HEROBRINE = makeModelLayerLocation("herobrine");
    public static final ModelLayerLocation ENDERBOSS = makeModelLayerLocation("ender_boss");
    public static final ModelLayerLocation BOSS = makeModelLayerLocation("boss");
    public static final ModelLayerLocation SIX = makeModelLayerLocation("six");

    public static ModelLayerLocation makeModelLayerLocation(String name) {
        String namewithpuppy = name + "_puppy";
        return new ModelLayerLocation(new ResourceLocation(CutePuppyMod.MOD_ID, namewithpuppy), namewithpuppy);
    }
}
