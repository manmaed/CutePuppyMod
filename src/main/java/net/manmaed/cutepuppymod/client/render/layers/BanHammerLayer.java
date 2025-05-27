package net.manmaed.cutepuppymod.client.render.layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.manmaed.cutepuppymod.client.model.CutePuppyModels;
import net.manmaed.cutepuppymod.client.render.model.ModelBanHammerSix;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entity.SixEntity;
import net.manmaed.cutepuppymod.libs.RLHelper;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import org.joml.Quaternionf;

/**
 * Created by manmaed on 14/04/2022.
 */
public class BanHammerLayer extends RenderLayer<SixEntity, ModelPuppy<SixEntity>> {

    private static final ResourceLocation BAN = RLHelper.location("textures/entity/puppy/six/ban_hammer.png");
    private final ModelBanHammerSix hammer;

    public BanHammerLayer(RenderLayerParent layerParent, EntityModelSet entityModelSet) {
        super(layerParent);
        this.hammer = new ModelBanHammerSix(entityModelSet.bakeLayer(CutePuppyModels.BANHAMMER));
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource multiBufferSource, int packedLight, SixEntity entity, float p_117353_, float p_117354_, float p_117355_, float p_117356_, float p_117357_, float p_117358_) {
        VertexConsumer vertexConsumer = multiBufferSource.getBuffer(RenderType.entityCutoutNoCull(BAN));
        poseStack.pushPose();
        poseStack.mulPose(new Quaternionf().add(0F, -0.15F, -0.1F, 0F));
        poseStack.scale(0.2F, 0.2F, 0.2F);
        poseStack.translate(-0.75F, 4.9F, -0.65F);
        hammer.renderToBuffer(poseStack, vertexConsumer, packedLight, OverlayTexture.NO_OVERLAY);
        poseStack.popPose();
    }
}
