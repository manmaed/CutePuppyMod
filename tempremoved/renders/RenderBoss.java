package net.manmaed.cutepuppymod.client.render.entity;


import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.client.model.CPModels;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityBoss;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class RenderBoss extends MobRenderer<EntityBoss, ModelPuppy<EntityBoss>> {
    private static final ResourceLocation SKIN = new ResourceLocation(CutePuppyMod.MOD_ID, "textures/entity/boss.png");
    private static float size = 10F;

    public RenderBoss(EntityRendererProvider.Context context) {
        super(context, new ModelPuppy(context.bakeLayer(CPModels.BOSS)), 2.25F);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityBoss p_114482_) {
        return SKIN;
    }

    /*@Override
    protected void preRenderCallback(EntityBoss entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(size, size, size);
        matrixStackIn.translate(-0.05, 0 ,0.2);
    }*/

}
