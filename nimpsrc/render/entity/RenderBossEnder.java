package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityBossEnder;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderBossEnder extends MobRenderer<EntityBossEnder, ModelPuppy<EntityBossEnder>> {
    private static final ResourceLocation skin = new ResourceLocation(Reference.id, "textures/entity/ender.png");

    public RenderBossEnder(EntityRendererManager manager) {
        super(manager, new ModelPuppy(), 1.25F);
    }

    @Override
    protected void preRenderCallback(EntityBossEnder entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(2.6F, 2.6F, 2.6F);
        matrixStackIn.translate(-0.05, 0 ,0.2);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityBossEnder entity) {
        return skin;
    }
}
