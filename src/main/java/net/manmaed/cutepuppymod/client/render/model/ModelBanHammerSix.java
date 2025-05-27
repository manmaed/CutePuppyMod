package net.manmaed.cutepuppymod.client.render.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.entity.Entity;

public class ModelBanHammerSix<T extends Entity> extends Model {
    private final ModelPart bb_main;

    public ModelBanHammerSix(ModelPart root) {
        super(RenderType::entitySolid);
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition head_r1 = bb_main.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-7.5F, -7.0F, -3.5F, 15.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -13.0F, -19.5F, 1.5708F, -0.4363F, -1.5708F));

        PartDefinition handle_r1 = bb_main.addOrReplaceChild("handle_r1", CubeListBuilder.create().texOffs(0, 14).addBox(-23.0F, -3.0F, -2.5F, 24.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 1.5F, -1.5708F, -1.1345F, 1.5708F));

/*

        PartDefinition group = partdefinition.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offset(0.0F, -3.5F, 0.0F));

        PartDefinition handle = group.addOrReplaceChild("handle", CubeListBuilder.create(), PartPose.offset(0.0F, 3.5F, 0.0F));

        PartDefinition handle_r1 = handle.addOrReplaceChild("handle_r1", CubeListBuilder.create().texOffs(0, 14).addBox(-21.0F, -7.0F, -9.5F, 24.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 3.0F, 7.0F, 0.0F, 0.0F, -1.5708F));

        PartDefinition head = group.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-7.5F, -7.0F, -3.5F, 15.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.5F, 0.0F));
*/

        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, int noclues) {
        bb_main.render(poseStack, buffer, packedLight, packedOverlay);
    }
}