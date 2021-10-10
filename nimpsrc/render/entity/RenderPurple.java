package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityPurple;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderPurple extends MobRenderer<EntityPurple, ModelPuppy<EntityPurple>> {
    private static final ResourceLocation skin = new ResourceLocation(Reference.id, "textures/entity/purple.png");

    public RenderPurple(EntityRendererManager manager) {
        super(manager, new ModelPuppy(), 0.25F);
    }

    @Override
    protected void preRenderCallback(EntityPurple entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        matrixStackIn.translate(-0.05, 0 ,0.2);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPurple entity) {
        return skin;
    }
}
