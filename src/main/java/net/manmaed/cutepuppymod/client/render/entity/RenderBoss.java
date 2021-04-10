package net.manmaed.cutepuppymod.client.render.entity;

import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntityBoss;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderBoss extends MobRenderer<EntityBoss, ModelPuppy<EntityBoss>> {
    private static final ResourceLocation skin = new ResourceLocation(Refs.id, "textures/entity/boss.png");

    public RenderBoss(EntityRendererManager manager) {
        super(manager, new ModelPuppy(), 0.25F);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityBoss entity) {
        return skin;
    }
}
