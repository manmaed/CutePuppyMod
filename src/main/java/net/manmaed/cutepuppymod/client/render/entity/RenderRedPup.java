package net.manmaed.cutepuppymod.client.render.entity;

import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityRedPup;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderRedPup extends MobRenderer<EntityRedPup, ModelPuppy> {
    private static final ResourceLocation skin = new ResourceLocation(Reference.id + "textures/entity/red.png");

    public RenderRedPup(EntityRendererManager manager) {
        super(manager, new ModelPuppy(), 0.25F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityRedPup entity) {
        return skin;
    }
}
