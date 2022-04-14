package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.client.model.CPModels;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityGreen;
import net.manmaed.cutepuppymod.entitys.EntityHerobrine;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderHerobrine extends MobRenderer<EntityHerobrine, ModelPuppy<EntityHerobrine>> {
    private static final String texloc = "textures/entity/herobrine";
    private static final ResourceLocation NORMAL = new ResourceLocation(CutePuppyMod.MOD_ID,  texloc + "/normal.png");
    private static final ResourceLocation MAD = new ResourceLocation(CutePuppyMod.MOD_ID, texloc + "/mad.png");


    public RenderHerobrine(EntityRendererProvider.Context context) {
        super(context, new ModelPuppy(context.bakeLayer(CPModels.HEROBRINE)), 0.25F);
    }

    @Override
    public void render(EntityHerobrine entity, float flt1, float flt2, PoseStack poseStack, MultiBufferSource multiBufferSource, int int1) {
        super.render(entity, flt1, flt2, poseStack, multiBufferSource, int1);
    }


    @Override
    public ResourceLocation getTextureLocation(EntityHerobrine herobrine) {
        if (herobrine.isAngry()) {
            return MAD;
        } else {
            return NORMAL;
        }
    }
}
