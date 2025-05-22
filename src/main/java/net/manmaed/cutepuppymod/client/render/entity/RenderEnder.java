package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.client.model.CPModels;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityEnder;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderEnder extends MobRenderer<EntityEnder, ModelPuppy<EntityEnder>> {
    private static final ResourceLocation SKIN = new ResourceLocation(CutePuppyMod.MOD_ID, "textures/entity/ender.png");

    public RenderEnder(EntityRendererProvider.Context context) {
        super(context, new ModelPuppy(context.bakeLayer(CPModels.ENDER)), 0.25F);
    }

    @Override
    public void render(EntityEnder entity, float flt1, float flt2, PoseStack poseStack, MultiBufferSource multiBufferSource, int int1) {
        super.render(entity, flt1, flt2, poseStack, multiBufferSource, int1);
    }


    @Override
    public ResourceLocation getTextureLocation(EntityEnder p_114482_) {
        return SKIN;
    }
}
