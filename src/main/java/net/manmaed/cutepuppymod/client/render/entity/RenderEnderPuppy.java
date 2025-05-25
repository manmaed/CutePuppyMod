package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.manmaed.cutepuppymod.client.model.CutePuppyModels;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entity.EnderPuppyEntity;
import net.manmaed.cutepuppymod.libs.RLHelper;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderEnderPuppy extends MobRenderer<EnderPuppyEntity, ModelPuppy<EnderPuppyEntity>> {

    public RenderEnderPuppy(EntityRendererProvider.Context context) {
        super(context, new ModelPuppy(context.bakeLayer(CutePuppyModels.ENDER)), 0.25F);
    }

    @Override
    public ResourceLocation getTextureLocation(EnderPuppyEntity entity) {
        return RLHelper.location("textures/entity/puppy/ender.png");
    }

    @Override
    public void render(EnderPuppyEntity entity, float flt1, float flt2, PoseStack poseStack, MultiBufferSource multiBufferSource, int int1) {
        super.render(entity, flt1, flt2, poseStack, multiBufferSource, int1);
    }
}
