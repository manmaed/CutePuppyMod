package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.manmaed.cutepuppymod.client.model.CutePuppyModels;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entity.EnderBossEntity;
import net.manmaed.cutepuppymod.libs.RLHelper;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderEnderBoss extends MobRenderer<EnderBossEntity, ModelPuppy<EnderBossEntity>> {

    public RenderEnderBoss(EntityRendererProvider.Context context) {
        super(context, new ModelPuppy(context.bakeLayer(CutePuppyModels.ENDER_BOSS)), 1.25F);
    }

    @Override
    public void render(EnderBossEntity entity, float flt1, float flt2, PoseStack poseStack, MultiBufferSource multiBufferSource, int int1) {
        float size = 2.6F;
        poseStack.pushPose();
        poseStack.scale(size, size, size);
        super.render(entity, flt1, flt2, poseStack, multiBufferSource, int1);
        poseStack.popPose();
    }


    @Override
    public ResourceLocation getTextureLocation(EnderBossEntity loc) {
        return RLHelper.location("textures/entity/puppy/ender.png");
    }
}
