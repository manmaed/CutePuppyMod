package net.manmaed.cutepuppymod.client.render.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class ModelBanHammerSix<T extends Entity> extends Model {
	private final ModelPart group;

	public ModelBanHammerSix(ModelPart root) {
		super(RenderType::entitySolid);
		this.group = root.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition group = partdefinition.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offset(0.0F, -3.5F, 0.0F));

		PartDefinition handle = group.addOrReplaceChild("handle", CubeListBuilder.create(), PartPose.offset(0.0F, 3.5F, 0.0F));

		PartDefinition handle_r1 = handle.addOrReplaceChild("handle_r1", CubeListBuilder.create().texOffs(0, 14).addBox(-21.0F, -7.0F, -9.5F, 24.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 3.0F, 7.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition head = group.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-7.5F, -7.0F, -3.5F, 15.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.5F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		group.render(poseStack, buffer, packedLight, packedOverlay);
	}
}