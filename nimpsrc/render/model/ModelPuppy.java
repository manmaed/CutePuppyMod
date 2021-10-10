package net.manmaed.cutepuppymod.client.render.model;


import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelPuppy<E extends Entity> extends SegmentedModel<E> {
  public ModelRenderer head;
  public ModelRenderer Nose;
  public ModelRenderer Body;
  public ModelRenderer LegFL;
  public ModelRenderer LegFR;
  public ModelRenderer LegBL;
  public ModelRenderer LegBR;
  public ModelRenderer Tail;
  public ModelRenderer EarR;
  public ModelRenderer EarL;
  public ModelRenderer ThePinkThing;

  public ModelPuppy() {
    textureWidth = 64;
    textureHeight = 32;
    
    head = new ModelRenderer(this, 0, 0);
    head.addBox(-2.5F, -5F, -3F, 5, 5, 5);
    head.setRotationPoint(0.5F, 19F, -4F);
    head.setTextureSize(64, 32);
    head.mirror = true;
    setRotateAngle(head, 0.0523599F, 0F, 0F);

    Nose = new ModelRenderer(this, 0, 26);
    Nose.addBox(-1.5F, 0F, -1F, 3, 1, 1);
    //Nose.setRotationPoint(0.5F, 16.5F, -6.7F);
    Nose.setRotationPoint(0.0F, -2.8F, -2.7F);
    Nose.setTextureSize(64, 32);
    Nose.mirror = true;
    setRotateAngle(Nose, 0.0349066F, 0F, 0F);

    Body = new ModelRenderer(this, 0, 10);
    Body.addBox(-2.5F, 0F, 0F, 5, 4, 6);
    Body.setRotationPoint(0.5F, 17F, -5F);
    Body.setTextureSize(64, 32);
    Body.mirror = true;
    setRotateAngle(Body, -0.0872665F, 0F, 0F);

    LegFL = new ModelRenderer(this, 0, 20);
    LegFL.addBox(-1F, 0F, -1F, 2, 4, 2);
    LegFL.setRotationPoint(-0.8F, 20F, -3.5F);
    LegFL.setTextureSize(64, 32);
    LegFL.mirror = true;
    setRotateAngle(LegFL, 0F, 0F, 0F);

    LegFR = new ModelRenderer(this, 0, 20);
    LegFR.addBox(-1F, 0F, -1F, 2, 4, 2);
    LegFR.setRotationPoint(1.8F, 20F, -3.5F);
    LegFR.setTextureSize(64, 32);
    LegFR.mirror = true;
    setRotateAngle(LegFR, 0F, 0F, 0F);

    LegBL = new ModelRenderer(this, 18, 20);
    LegBL.addBox(-1F, 0F, -1F, 2, 4, 2);
    LegBL.setRotationPoint(-0.8F, 20F, -1F);
    LegBL.setTextureSize(64, 32);
    LegBL.mirror = true;
    setRotateAngle(LegBL, 0F, 0F, 0F);

    LegBR = new ModelRenderer(this, 18, 20);
    LegBR.addBox(-1F, 0F, -1F, 2, 4, 2);
    LegBR.setRotationPoint(1.8F, 20F, -1F);
    LegBR.setTextureSize(64, 32);
    LegBR.mirror = true;
    setRotateAngle(LegBR, 0F, 0F, 0F);

    Tail = new ModelRenderer(this, 8, 20);
    Tail.addBox(-1F, -1F, 0F, 2, 2, 3);
    Tail.setRotationPoint(0.5F, 18.5F, 0F);
    Tail.setTextureSize(64, 32);
    Tail.mirror = true;
    setRotateAngle(Tail, -1.029744F, 0F, 0F);

    EarR = new ModelRenderer(this, 21, 0);
    EarR.addBox(0F, -1F, -1F, 1, 3, 2);
    EarR.setRotationPoint(2.2F, -3F, 0F);
    EarR.setTextureSize(64, 32);
    EarR.mirror = true;
    setRotateAngle(EarR, 0F, 0F, -0.1745329F);

    EarL = new ModelRenderer(this, 15, 0);
    EarL.addBox(-1F, -1F, -1F, 1, 3, 2);
    EarL.setRotationPoint(-2.2F, -3F, 0F);
    EarL.setTextureSize(64, 32);
    EarL.mirror = true;
    setRotateAngle(EarL, 0F, 0F, 0.1745329F);

    ThePinkThing = new ModelRenderer(this, 16, 10);
    ThePinkThing.addBox(-0.5F, -3.3F, -1.5F, 1, 1, 2);
    ThePinkThing.setRotationPoint(0F, -0.0F, 0F);
    ThePinkThing.setTextureSize(64, 32);
    ThePinkThing.mirror = true;
    setRotateAngle(ThePinkThing, 1.155001F, 0F, 0F);

    head.addChild(EarL);
    head.addChild(EarR);
    head.addChild(Nose);
    head.addChild(ThePinkThing);
  }

  /**
   * This is a helper function from Tabula to set the rotation of model parts
   */
  public void setRotateAngle(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX  = x;
    model.rotateAngleY  = y;
    model.rotateAngleZ  = z;
  }

  @Override
  public void setRotationAngles(E entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.head.rotateAngleX = headPitch / (180F / (float)Math.PI);
    this.head.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
    this.LegFL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    this.LegFR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    this.LegBL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    this.LegBR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
  }

  @Override
  public Iterable<ModelRenderer> getParts() {
    return ImmutableList.of(
            head,
            Body,
            LegFL,
            LegFR,
            LegBL,
            LegBR,
            Tail
    );
  }
}