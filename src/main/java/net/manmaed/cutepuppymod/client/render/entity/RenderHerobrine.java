package net.manmaed.cutepuppymod.client.render.entity;

import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityBlue;
import net.manmaed.cutepuppymod.entitys.EntityHerobrine;
import net.manmaed.cutepuppymod.libs.LogHelper;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderHerobrine extends MobRenderer<EntityHerobrine, ModelPuppy<EntityHerobrine>> {
    private static final ResourceLocation normal = new ResourceLocation(Refs.id, "textures/entity/herobrine_normal.png");
    private static final ResourceLocation mad = new ResourceLocation(Refs.id, "textures/entity/herobrine_mad.png");

    public RenderHerobrine(EntityRendererManager manager) {
        super(manager, new ModelPuppy(), 0.25F);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityHerobrine entity) {
        if (entity.getAngerTime() != 0) {
            return mad;
        } else {
            return normal;
        }
    }
}
