package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityBlue;
import net.manmaed.cutepuppymod.entitys.EntityPurple;
import net.manmaed.cutepuppymod.entitys.EntityRed;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderBlue extends MobRenderer<EntityBlue, ModelPuppy<EntityBlue>> {
    private static final ResourceLocation skin = new ResourceLocation(Refs.id, "textures/entity/blue.png");

    public RenderBlue(EntityRendererManager manager) {
        super(manager, new ModelPuppy(), 0.25F);
    }

    @Override
    protected void preRenderCallback(EntityBlue entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        matrixStackIn.translate(-0.05, 0 ,0.2);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityBlue entity) {
        return skin;
    }
}
