package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.manmaed.cutepuppymod.client.model.CutePuppyModels;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entity.HumanPuppyEntity;
import net.manmaed.cutepuppymod.libs.RLHelper;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderHumanPuppy extends MobRenderer<HumanPuppyEntity, ModelPuppy<HumanPuppyEntity>> {

    public RenderHumanPuppy(EntityRendererProvider.Context context) {
        super(context, new ModelPuppy(context.bakeLayer(CutePuppyModels.HUMAN)), 0.25F);
    }

    @Override
    public ResourceLocation getTextureLocation(HumanPuppyEntity puppyEntity) {
        return RLHelper.location("textures/entity/puppy/" + puppyEntity.getVariant().getName() + ".png");
    }

    @Override
    public void render(HumanPuppyEntity entity, float flt1, float flt2, PoseStack poseStack, MultiBufferSource multiBufferSource, int int1) {
        super.render(entity, flt1, flt2, poseStack, multiBufferSource, int1);
    }
}
