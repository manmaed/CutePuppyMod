package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.manmaed.cutepuppymod.client.model.CutePuppyModels;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entity.HerobrinePuppyEntity;
import net.manmaed.cutepuppymod.libs.RLHelper;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderHerobrine extends MobRenderer<HerobrinePuppyEntity, ModelPuppy<HerobrinePuppyEntity>> {


    public RenderHerobrine(EntityRendererProvider.Context context) {
        super(context, new ModelPuppy(context.bakeLayer(CutePuppyModels.HEROBRINE)), 0.25F);
    }

    @Override
    public ResourceLocation getTextureLocation(HerobrinePuppyEntity herobrinePuppy) {
        if (herobrinePuppy.isAngry() || herobrinePuppy.isAggressive()) {
            return RLHelper.location("textures/entity/puppy/" + "herobrine" + "/mad.png");
        } else {
            return RLHelper.location("textures/entity/puppy/" + "herobrine" + "/normal.png");
        }
    }

    @Override
    public void render(HerobrinePuppyEntity entity, float flt1, float flt2, PoseStack poseStack, MultiBufferSource multiBufferSource, int int1) {
        super.render(entity, flt1, flt2, poseStack, multiBufferSource, int1);
    }
}
