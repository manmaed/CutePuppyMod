package net.manmaed.cutepuppymod.client.model;

import net.manmaed.cutepuppymod.libs.RLHelper;
import net.minecraft.client.model.geom.ModelLayerLocation;

/**
 * Created by manmaed on 12/04/2022.
 */
public class CutePuppyModels {

    public static final ModelLayerLocation PUPPY = makeModelLayerLocation("puppy");
    public static final ModelLayerLocation HUMAN = makeModelLayerLocation("human_puppy");
    public static final ModelLayerLocation HEROBRINE = makeModelLayerLocation("herobrine_puppy");
    public static final ModelLayerLocation ENDER = makeModelLayerLocation("ender_puppy");
   /* public static final ModelLayerLocation ENDERBOSS = makeModelLayerLocation("ender_boss");
    public static final ModelLayerLocation BOSS = makeModelLayerLocation("boss");
    public static final ModelLayerLocation SIX = makeModelLayerLocation("six");
    public static final ModelLayerLocation BANHAMMER = new ModelLayerLocation(new ResourceLocation(CutePuppyMod.MOD_ID, "ban_hammer"), "ban_hammer");
*/
    public static ModelLayerLocation makeModelLayerLocation(String name) {
        return new ModelLayerLocation(RLHelper.location(name), name);
    }
}
