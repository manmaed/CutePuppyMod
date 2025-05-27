package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.manmaed.cutepuppymod.client.model.CutePuppyModels;
import net.manmaed.cutepuppymod.client.render.layers.BanHammerLayer;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entity.SixEntity;
import net.manmaed.cutepuppymod.libs.RLHelper;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderSix extends MobRenderer<SixEntity, ModelPuppy<SixEntity>> {

    public RenderSix(EntityRendererProvider.Context context) {
        super(context, new ModelPuppy(context.bakeLayer(CutePuppyModels.SIX)), 0.25F);
        this.addLayer(new BanHammerLayer(this, context.getModelSet()));
    }

    @Override
    public void render(SixEntity entity, float flt1, float flt2, PoseStack poseStack, MultiBufferSource multiBufferSource, int int1) {
        super.render(entity, flt1, flt2, poseStack, multiBufferSource, int1);
    }


    @Override
    public ResourceLocation getTextureLocation(SixEntity loc) {
        return RLHelper.location("textures/entity/puppy/six/six.png");
    }
}
