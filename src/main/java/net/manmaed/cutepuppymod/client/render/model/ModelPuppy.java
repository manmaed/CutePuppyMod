package net.manmaed.cutepuppymod.client.render.model;// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class ModelPuppy<T extends Entity> extends EntityModel<T> {

	private final ModelPart head;
	private final ModelPart LegBR;
	private final ModelPart LegFR;
	private final ModelPart LegBL;
	private final ModelPart Tail;
	private final ModelPart LegFL;
	private final ModelPart Body;

	public ModelPuppy(ModelPart root) {
		this.head = root.getChild("head");
		this.LegBR = root.getChild("LegBR");
		this.LegFR = root.getChild("LegFR");
		this.LegBL = root.getChild("LegBL");
		this.Tail = root.getChild("Tail");
		this.LegFL = root.getChild("LegFL");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.5F, -5.0F, -3.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 19.0F, -4.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition EarL = head.addOrReplaceChild("EarL",
				CubeListBuilder.create().texOffs(15, 0).mirror()
						.addBox(0.0F, -1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.2F, -3.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition EarR = head.addOrReplaceChild("EarR",
				CubeListBuilder.create().texOffs(21, 0).mirror()
						.addBox(-1.0F, -1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.2F, -3.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Nose = head.addOrReplaceChild("Nose",
				CubeListBuilder.create().texOffs(0, 26)
						.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.8F, -2.7F, 0.0349F, 0.0F, 0.0F));

		PartDefinition ThePinkThing = head.addOrReplaceChild("ThePinkThing",
				CubeListBuilder.create().texOffs(16, 10)
						.addBox(-0.5F, -3.3F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.155F, 0.0F, 0.0F));

		PartDefinition LegBR = partdefinition.addOrReplaceChild("LegBR",
				CubeListBuilder.create().texOffs(18, 20)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.8F, 20.0F, -1.0F));

		PartDefinition LegFR = partdefinition.addOrReplaceChild("LegFR",
				CubeListBuilder.create().texOffs(0, 20)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.8F, 20.0F, -3.5F));

		PartDefinition LegBL = partdefinition.addOrReplaceChild("LegBL",
				CubeListBuilder.create().texOffs(18, 20)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.8F, 20.0F, -1.0F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail",
				CubeListBuilder.create().texOffs(8, 20)
						.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 18.5F, 0.0F, -1.0297F, 0.0F, 0.0F));

		PartDefinition LegFL = partdefinition.addOrReplaceChild("LegFL",
				CubeListBuilder.create().texOffs(0, 20)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.8F, 20.0F, -3.5F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 10)
						.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 17.0F, -5.0F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw * ((float) Math.PI / 180F);
		this.head.xRot = headPitch * ((float) Math.PI / 180F);
		this.LegBR.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.LegBL.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.LegFR.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.LegFL.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		LegBR.render(poseStack, buffer, packedLight, packedOverlay);
		LegFR.render(poseStack, buffer, packedLight, packedOverlay);
		LegBL.render(poseStack, buffer, packedLight, packedOverlay);
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		LegFL.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
	}
}