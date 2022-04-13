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
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;

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
        matrixStackIn.scale(0.2f, 0.2f, 0.2f);
        //Tanselate X +Left -Right
        //Tanselate Y +Down -up
        //Tanselate z +back -Forward
        matrixStackIn.translate(1.26F, 5.65F, -2.0F);
        matrixStackIn.rotate(new Quaternion(new Vector3f(0,1,0), 90, true));
        matrixStackIn.rotate(new Quaternion(new Vector3f(0,0,1), 49, true));
        matrixStackIn.rotate(new Quaternion(new Vector3f(1,0,0), -10, true));
        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEntitySolid(skin));
        hammer.renderBanHammer(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY);
        matrixStackIn.pop();
    }
}
