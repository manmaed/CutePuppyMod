package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.client.model.CPModels;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityGreen;
import net.manmaed.cutepuppymod.entitys.EntitySteve;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderSteve extends MobRenderer<EntitySteve, ModelPuppy<EntitySteve>> {
    private static final ResourceLocation SKIN = new ResourceLocation(CutePuppyMod.MOD_ID, "textures/entity/steve.png");

    public RenderSteve(EntityRendererProvider.Context context) {
        super(context, new ModelPuppy(context.bakeLayer(CPModels.STEVE)), 0.25F);
    }

    @Override
    public void render(EntitySteve entity, float flt1, float flt2, PoseStack poseStack, MultiBufferSource multiBufferSource, int int1) {
        super.render(entity, flt1, flt2, poseStack, multiBufferSource, int1);
    }


    @Override
    public ResourceLocation getTextureLocation(EntitySteve p_114482_) {
        return SKIN;
    }
}
