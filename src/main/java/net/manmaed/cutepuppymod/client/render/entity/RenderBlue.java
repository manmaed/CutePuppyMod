package net.manmaed.cutepuppymod.client.render.entity;


import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.client.model.CPModels;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityBlue;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderBlue extends MobRenderer<EntityBlue, ModelPuppy<EntityBlue>> {
    private static final ResourceLocation SKIN = new ResourceLocation(CutePuppyMod.MOD_ID, "textures/entity/blue.png");

    public RenderBlue(EntityRendererProvider.Context context) {
        super(context, new ModelPuppy(context.bakeLayer(CPModels.BLUE)), 0.25F);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityBlue p_114482_) {
        return SKIN;
    }

}
