package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.client.model.CPModels;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityEnderBoss;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderEnderBoss extends MobRenderer<EntityEnderBoss, ModelPuppy<EntityEnderBoss>> {
    private static final ResourceLocation SKIN = new ResourceLocation(CutePuppyMod.MOD_ID, "textures/entity/ender.png");

    public RenderEnderBoss(EntityRendererProvider.Context context) {
        super(context, new ModelPuppy(context.bakeLayer(CPModels.ENDERBOSS)), 1.25F);
    }

    @Override
    public void render(EntityEnderBoss entity, float flt1, float flt2, PoseStack poseStack, MultiBufferSource multiBufferSource, int int1) {
        float size = 2.6F;
        poseStack.pushPose();
        poseStack.scale(size, size, size);
        super.render(entity, flt1, flt2, poseStack, multiBufferSource, int1);
        poseStack.popPose();
    }


    @Override
    public ResourceLocation getTextureLocation(EntityEnderBoss p_114482_) {
        return SKIN;
    }
}
