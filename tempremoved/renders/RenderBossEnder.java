package net.manmaed.cutepuppymod.client.render.entity;


import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.client.model.CPModels;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityBossEnder;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class RenderBossEnder extends MobRenderer<EntityBossEnder, ModelPuppy<EntityBossEnder>> {
    private static final ResourceLocation SKIN = new ResourceLocation(CutePuppyMod.MOD_ID, "textures/entity/ender.png");

    public RenderBossEnder(EntityRendererProvider.Context context) {
        super(context, new ModelPuppy(context.bakeLayer(CPModels.ENDERBOSS)), 1.25F);
    }

    /*@Override
    protected void preRenderCallback(EntityBossEnder entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(2.6F, 2.6F, 2.6F);
        matrixStackIn.translate(-0.05, 0 ,0.2);
    }*/
}
