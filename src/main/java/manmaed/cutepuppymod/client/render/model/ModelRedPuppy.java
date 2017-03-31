package manmaed.cutepuppymod.client.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelRedPuppy extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer Nose;
    ModelRenderer Body;
    ModelRenderer LegFL;
    ModelRenderer LegFR;
    ModelRenderer LegBL;
    ModelRenderer LegBR;
    ModelRenderer Tail;
    ModelRenderer EarR;
    ModelRenderer EarL;
    ModelRenderer ThePinkThing;
  
  public ModelRedPuppy()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-2.5F, -5F, -3F, 5, 5, 5);
      head.setRotationPoint(0.5F, 19F, -4F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0.0523599F, 0F, 0F);
      Nose = new ModelRenderer(this, 0, 26);
      Nose.addBox(-1.5F, 0F, -1F, 3, 1, 1);
      //Nose.setRotationPoint(0.5F, 16.5F, -6.7F);
      Nose.setRotationPoint(0.0F, -2.8F, -2.7F);
      Nose.setTextureSize(64, 32);
      Nose.mirror = true;
      setRotation(Nose, 0.0349066F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 10);
      Body.addBox(-2.5F, 0F, 0F, 5, 4, 6);
      Body.setRotationPoint(0.5F, 17F, -5F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, -0.0872665F, 0F, 0F);
      LegFL = new ModelRenderer(this, 0, 20);
      LegFL.addBox(-1F, 0F, -1F, 2, 4, 2);
      LegFL.setRotationPoint(-0.8F, 20F, -3.5F);
      LegFL.setTextureSize(64, 32);
      LegFL.mirror = true;
      setRotation(LegFL, 0F, 0F, 0F);
      LegFR = new ModelRenderer(this, 0, 20);
      LegFR.addBox(-1F, 0F, -1F, 2, 4, 2);
      LegFR.setRotationPoint(1.8F, 20F, -3.5F);
      LegFR.setTextureSize(64, 32);
      LegFR.mirror = true;
      setRotation(LegFR, 0F, 0F, 0F);
      LegBL = new ModelRenderer(this, 18, 20);
      LegBL.addBox(-1F, 0F, -1F, 2, 4, 2);
      LegBL.setRotationPoint(-0.8F, 20F, -1F);
      LegBL.setTextureSize(64, 32);
      LegBL.mirror = true;
      setRotation(LegBL, 0F, 0F, 0F);
      LegBR = new ModelRenderer(this, 18, 20);
      LegBR.addBox(-1F, 0F, -1F, 2, 4, 2);
      LegBR.setRotationPoint(1.8F, 20F, -1F);
      LegBR.setTextureSize(64, 32);
      LegBR.mirror = true;
      setRotation(LegBR, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 8, 20);
      Tail.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tail.setRotationPoint(0.5F, 18.5F, 0F);
      Tail.setTextureSize(64, 32);
      Tail.mirror = true;
      setRotation(Tail, -1.029744F, 0F, 0F);
      EarR = new ModelRenderer(this, 21, 0);
      EarR.addBox(0F, -1F, -1F, 1, 3, 2);
     EarR.setRotationPoint(2.2F, -3F, 0F);
      EarR.setTextureSize(64, 32);
      EarR.mirror = true;
      setRotation(EarR, 0F, 0F, -0.1745329F);
      EarL = new ModelRenderer(this, 15, 0);
      EarL.addBox(-1F, -1F, -1F, 1, 3, 2);
     EarL.setRotationPoint(-2.2F, -3F, 0F);
      EarL.setTextureSize(64, 32);
      EarL.mirror = true;
      setRotation(EarL, 0F, 0F, 0.1745329F);
      /*ThePinkThing = new ModelRenderer(this, 16, 10);
      ThePinkThing.addBox(-1F, -0.5F, -2F, 2, 1, 2);
     ThePinkThing.setRotationPoint(0F, -1.5F, -1.5F);
      ThePinkThing.setTextureSize(64, 32);
      ThePinkThing.mirror = true;
      */
      ThePinkThing = new ModelRenderer(this, 16, 10);
      ThePinkThing.addBox(-0.5F, -3.3F, -1.5F, 1, 1, 2);
      //ThePinkThing.setRotationPoint(0.5F, 19F, -4F);
      ThePinkThing.setRotationPoint(0F, -0.0F, 0F);
      ThePinkThing.setTextureSize(64, 32);
      ThePinkThing.mirror = true;
      //setRotation(ThePinkThing, 0.2617994F, 0F, 0F);
      setRotation(ThePinkThing, 1.155001F, 0F, 0F);
      //tings
      head.addChild(EarL);
      head.addChild(EarR);
      head.addChild(Nose);
      head.addChild(ThePinkThing);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    Body.render(f5);
    LegFL.render(f5);
    LegFR.render(f5);
    LegBL.render(f5);
    LegBR.render(f5);
    Tail.render(f5);
/*        EarR.render(f5);
    EarL.render(f5);
    ThePinkThing.render(f5);
    Nose.render(f5);*/
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
      this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
      this.LegFL.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
      this.LegFR.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
      this.LegBL.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
      this.LegBR.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
  }
}