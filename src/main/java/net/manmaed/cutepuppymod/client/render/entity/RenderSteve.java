package net.manmaed.cutepuppymod.client.render.entity;

import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityGreen;
import net.manmaed.cutepuppymod.entitys.EntitySteve;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderSteve extends MobRenderer<EntitySteve, ModelPuppy<EntitySteve>> {
    private static final ResourceLocation skin = new ResourceLocation(Refs.id, "textures/entity/steve.png");

    public RenderSteve(EntityRendererManager manager) {
        super(manager, new ModelPuppy(), 0.25F);
    }

    @Override
    public ResourceLocation getEntityTexture(EntitySteve entity) {
        return skin;
    }
}
