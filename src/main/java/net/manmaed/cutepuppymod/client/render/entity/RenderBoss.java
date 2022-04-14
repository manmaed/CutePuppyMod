package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.client.model.CPModels;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityBoss;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderBoss extends MobRenderer<EntityBoss, ModelPuppy<EntityBoss>> {
    private static final ResourceLocation SKIN = new ResourceLocation(CutePuppyMod.MOD_ID, "textures/entity/boss.png");

    public RenderBoss(EntityRendererProvider.Context context) {
        super(context, new ModelPuppy(context.bakeLayer(CPModels.BOSS)), 2.25F);
    }

    @Override
    public void render(EntityBoss entity, float flt1, float flt2, PoseStack poseStack, MultiBufferSource multiBufferSource, int int1) {
        float size = 10.0F;
        poseStack.pushPose();
        poseStack.scale(size, size, size);
        super.render(entity, flt1, flt2, poseStack, multiBufferSource, int1);
        poseStack.popPose();
    }


    @Override
    public ResourceLocation getTextureLocation(EntityBoss p_114482_) {
        return SKIN;
    }
}
