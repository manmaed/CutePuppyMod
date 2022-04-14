package net.manmaed.cutepuppymod.client.render.layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.client.model.CPModels;
import net.manmaed.cutepuppymod.client.render.model.ModelBanHammerSix;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.EntitySix;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

/**
 * Created by manmaed on 14/04/2022.
 */
public class BanHammerLayer extends RenderLayer<EntitySix, ModelPuppy<EntitySix>> {

    private static final ResourceLocation BAN = new ResourceLocation(CutePuppyMod.MOD_ID, "textures/entity/six_ban_hammer.png");
    private final ModelBanHammerSix hammer;

    public BanHammerLayer(RenderLayerParent layerParent, EntityModelSet entityModelSet) {
        super(layerParent);
        this.hammer = new ModelBanHammerSix(entityModelSet.bakeLayer(CPModels.BANHAMMER));
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource multiBufferSource, int packedLight, EntitySix entity, float p_117353_, float p_117354_, float p_117355_, float p_117356_, float p_117357_, float p_117358_) {
        VertexConsumer vertexConsumer = multiBufferSource.getBuffer(RenderType.entityCutoutNoCull(BAN));
        poseStack.pushPose();
        poseStack.scale(0.25F, 0.25F, 0.25F);
        poseStack.translate(0.8F, 4.5F, -1.2F);
        poseStack.mulPose(Quaternion.fromXYZDegrees(new Vector3f(0, 90, 70)));
        poseStack.mulPose(Quaternion.fromXYZDegrees(new Vector3f(-8, 0, 0)));
        hammer.renderToBuffer(poseStack, vertexConsumer, packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        poseStack.popPose();
    }
}
