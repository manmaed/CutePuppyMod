package net.manmaed.cutepuppymod.client.render.entity;

import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityBlue;
import net.manmaed.cutepuppymod.entitys.EntityEnder;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderEnder extends MobRenderer<EntityEnder, ModelPuppy<EntityEnder>> {
    private static final ResourceLocation skin = new ResourceLocation(Refs.id, "textures/entity/ender.png");

    public RenderEnder(EntityRendererManager manager) {
        super(manager, new ModelPuppy(), 0.25F);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityEnder entity) {
        return skin;
    }
}
