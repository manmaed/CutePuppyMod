package net.manmaed.cutepuppymod.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.manmaed.cutepuppymod.client.render.layers.BanHammerFeatureRenderer;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntitySix;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderSix extends MobRenderer<EntitySix, ModelPuppy<EntitySix>> {
    private static final ResourceLocation skin = new ResourceLocation(Refs.id, "textures/entity/six.png");

    public RenderSix(EntityRendererManager manager) {
        super(manager, new ModelPuppy(), 0.25F);
        this.addLayer(new BanHammerFeatureRenderer(this));
    }

    @Override
    protected void preRenderCallback(EntitySix entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        matrixStackIn.translate(-0.05, 0 ,0.2);
    }

    @Override
    public ResourceLocation getEntityTexture(EntitySix entity) {
        return skin;
    }
}
