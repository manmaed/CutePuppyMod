package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityHerobrine;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderHerobrine extends MobRenderer<EntityHerobrine, ModelPuppy<EntityHerobrine>> {
    private static final ResourceLocation normal = new ResourceLocation(Refs.id, "textures/entity/herobrine_normal.png");
    private static final ResourceLocation mad = new ResourceLocation(Refs.id, "textures/entity/herobrine_mad.png");

    public RenderHerobrine(EntityRendererManager manager) {
        super(manager, new ModelPuppy(), 0.25F);
    }

    @Override
    protected void preRenderCallback(EntityHerobrine entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        matrixStackIn.translate(-0.05, 0 ,0.2);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityHerobrine entity) {
        if (entity.getAngerTime() != 0 || entity.isAggressive()) {
            return mad;
        } else {
            return normal;
        }
    }
}
