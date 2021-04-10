package net.manmaed.cutepuppymod.client.render.entity;

import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityBlue;
import net.manmaed.cutepuppymod.entitys.EntityGreen;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderGreen extends MobRenderer<EntityGreen, ModelPuppy<EntityGreen>> {
    private static final ResourceLocation skin = new ResourceLocation(Refs.id, "textures/entity/green.png");

    public RenderGreen(EntityRendererManager manager) {
        super(manager, new ModelPuppy(), 0.25F);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityGreen entity) {
        return skin;
    }
}
