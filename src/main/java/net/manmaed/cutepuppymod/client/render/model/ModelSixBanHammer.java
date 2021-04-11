package net.manmaed.cutepuppymod.client.render.model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Created by manmaed on 11/04/2021.
 */
public class ModelSixBanHammer<T extends Entity> extends SegmentedModel<T> {

    public ModelRenderer head;
    public ModelRenderer handle;

    public ModelSixBanHammer() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-7.5F, -7.0F, -3.5F, 15.0F, 7.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.handle = new ModelRenderer(this, 0, 14);
        this.handle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.handle.addBox(0.0F, -3.0F, -2.5F, 24.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(handle, 0.0F, 0.0F, 1.5707963267948966F);
    }

    @Override
    public Iterable<ModelRenderer> getParts() {
        return ImmutableList.of(handle, head);
    }

    public void renderBanHammer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn) {
        handle.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
        head.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
