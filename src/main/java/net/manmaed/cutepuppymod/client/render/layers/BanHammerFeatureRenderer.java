package net.manmaed.cutepuppymod.client.render.layers;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.client.render.model.ModelSixBanHammer;
import net.manmaed.cutepuppymod.entitys.EntitySix;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;

/**
 * Created by manmaed on 11/04/2021.
 */
public class BanHammerFeatureRenderer extends LayerRenderer<EntitySix, ModelPuppy<EntitySix>> {
    private final ModelSixBanHammer hammer = new ModelSixBanHammer();
    private static final ResourceLocation skin = new ResourceLocation(Refs.id, "textures/entity/sixbanhammer.png");

    public BanHammerFeatureRenderer(IEntityRenderer<EntitySix, ModelPuppy<EntitySix>> entityRendererIn) {
        super(entityRendererIn);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, EntitySix entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        matrixStackIn.push();
        matrixStackIn.translate(0F, -0.5626F, 0F);
        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEntitySolid(skin));
        hammer.renderBanHammer(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY);
        matrixStackIn.pop();
    }
}
