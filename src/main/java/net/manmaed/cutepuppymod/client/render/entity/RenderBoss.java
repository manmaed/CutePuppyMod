package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityBoss;
import net.manmaed.cutepuppymod.entitys.EntityPurple;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderBoss extends MobRenderer<EntityBoss, ModelPuppy<EntityBoss>> {
    private static final ResourceLocation skin = new ResourceLocation(Refs.id, "textures/entity/boss.png");

    public RenderBoss(EntityRendererManager manager) {
        super(manager, new ModelPuppy(), 0.25F);
    }

    @Override
    protected void preRenderCallback(EntityBoss entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        matrixStackIn.translate(-0.05, 0 ,0.2);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityBoss entity) {
        return skin;
    }
}
