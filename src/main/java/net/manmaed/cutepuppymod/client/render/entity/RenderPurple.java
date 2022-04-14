package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.client.model.CPModels;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityGreen;
import net.manmaed.cutepuppymod.entitys.EntityPurple;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderPurple extends MobRenderer<EntityPurple, ModelPuppy<EntityPurple>> {
    private static final ResourceLocation SKIN = new ResourceLocation(CutePuppyMod.MOD_ID, "textures/entity/purple.png");

    public RenderPurple(EntityRendererProvider.Context context) {
        super(context, new ModelPuppy(context.bakeLayer(CPModels.PURPLE)), 0.25F);
    }

    @Override
    public void render(EntityPurple entity, float flt1, float flt2, PoseStack poseStack, MultiBufferSource multiBufferSource, int int1) {
        super.render(entity, flt1, flt2, poseStack, multiBufferSource, int1);
    }


    @Override
    public ResourceLocation getTextureLocation(EntityPurple p_114482_) {
        return SKIN;
    }
}
