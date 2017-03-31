package manmaed.cutepuppymod.client.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHolderWithSix extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer Nose;
    ModelRenderer Ban;
    ModelRenderer LegFR;
    ModelRenderer LegBL;
    ModelRenderer LegBR;
    ModelRenderer Tail;
    ModelRenderer EarR;
    ModelRenderer EarL;
    ModelRenderer ThePinkThing;
    ModelRenderer Body;
    ModelRenderer Stick;
    ModelRenderer Hold1;
    ModelRenderer Hold2;
    ModelRenderer h11;
    ModelRenderer h21;
    ModelRenderer Pan1;
    ModelRenderer Pan2;
    ModelRenderer Pan3;
    ModelRenderer Pan4;
    ModelRenderer Pan5;
    ModelRenderer LegFL;
  
  public ModelHolderWithSix()
  {
    textureWidth = 128;
    textureHeight = 32;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-2.5F, -5F, -3F, 5, 5, 5);
      head.setRotationPoint(-2.5F, 2F, 8F);
      head.setTextureSize(128, 32);
      head.mirror = true;
      setRotation(head, 0.0523599F, 1.570796F, 0F);
      Nose = new ModelRenderer(this, 0, 26);
      Nose.addBox(-1.5F, 0F, -1F, 3, 1, 1);
      Nose.setRotationPoint(-5.5F, -0.5F, 8F);
      Nose.setTextureSize(128, 32);
      Nose.mirror = true;
      setRotation(Nose, 0.0349066F, 1.570796F, 0F);
      Ban = new ModelRenderer(this, 26, 17);
      Ban.addBox(-2.5F, -0.4F, -4F, 2, 4, 3);
      Ban.setRotationPoint(-1.5F, 1.5F, 10F);
      Ban.setTextureSize(128, 32);
      Ban.mirror = true;
      setRotation(Ban, -0.0698132F, 1.710423F, 0F);
      LegFR = new ModelRenderer(this, 0, 20);
      LegFR.addBox(-1F, 0F, -1F, 2, 4, 2);
      LegFR.setRotationPoint(1.8F, 3F, 6.9F);
      LegFR.setTextureSize(128, 32);
      LegFR.mirror = true;
      setRotation(LegFR, 0F, 0F, 0F);
      LegBL.mirror = true;
      LegBL = new ModelRenderer(this, 18, 20);
      LegBL.addBox(-1F, 0F, -1F, 2, 4, 2);
      LegBL.setRotationPoint(-0.8F, 3F, 9.1F);
      LegBL.setTextureSize(128, 32);
      LegBL.mirror = true;
      setRotation(LegBL, 0F, 0F, 0F);
      LegBL.mirror = false;
      LegBR = new ModelRenderer(this, 18, 20);
      LegBR.addBox(-1F, 0F, -1F, 2, 4, 2);
      LegBR.setRotationPoint(1.8F, 3F, 9.1F);
      LegBR.setTextureSize(128, 32);
      LegBR.mirror = true;
      setRotation(LegBR, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 8, 20);
      Tail.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tail.setRotationPoint(2.5F, 1.5F, 8F);
      Tail.setTextureSize(128, 32);
      Tail.mirror = true;
      setRotation(Tail, -0.6806784F, 1.570796F, 0F);
      EarR = new ModelRenderer(this, 21, 0);
      EarR.addBox(0F, -1F, -1F, 1, 3, 2);
      EarR.setRotationPoint(-2.3F, -1F, 6F);
      EarR.setTextureSize(128, 32);
      EarR.mirror = true;
      setRotation(EarR, 0F, 1.570796F, -0.1745329F);
      EarL = new ModelRenderer(this, 15, 0);
      EarL.addBox(-1F, -1F, 0F, 1, 3, 2);
      EarL.setRotationPoint(-3.2F, -1F, 10F);
      EarL.setTextureSize(128, 32);
      EarL.mirror = true;
      setRotation(EarL, 0F, 1.570796F, 0.1745329F);
      ThePinkThing = new ModelRenderer(this, 16, 10);
      ThePinkThing.addBox(-0.5F, -1F, -2F, 1, 1, 2);
      ThePinkThing.setRotationPoint(-4.5F, 1F, 8F);
      ThePinkThing.setTextureSize(128, 32);
      ThePinkThing.mirror = true;
      setRotation(ThePinkThing, 1.291544F, 1.570796F, 0F);
      Body = new ModelRenderer(this, 0, 10);
      Body.addBox(-2.5F, 0F, 0F, 5, 4, 6);
      Body.setRotationPoint(-2.5F, 0F, 8F);
      Body.setTextureSize(128, 32);
      Body.mirror = true;
      setRotation(Body, -0.0872665F, 1.570796F, 0F);
      Stick = new ModelRenderer(this, 22, 10);
      Stick.addBox(-3F, 0F, 1F, 1, 1, 6);
      Stick.setRotationPoint(-4.5F, 2.5F, 9F);
      Stick.setTextureSize(128, 32);
      Stick.mirror = true;
      setRotation(Stick, -0.0698132F, 1.710423F, 0F);
      Hold1 = new ModelRenderer(this, 77, 0);
      Hold1.addBox(1F, -0.5F, 0F, 2, 8, 3);
      Hold1.setRotationPoint(0F, 0F, 0F);
      Hold1.setTextureSize(128, 32);
      Hold1.mirror = true;
      setRotation(Hold1, 0F, 0F, 0F);
      Hold2 = new ModelRenderer(this, 77, 0);
      Hold2.addBox(-3.24F, -0.5F, 0F, 2, 8, 3);
      Hold2.setRotationPoint(0F, 0F, 0F);
      Hold2.setTextureSize(128, 32);
      Hold2.mirror = true;
      setRotation(Hold2, 0F, 0F, 0F);
      h11 = new ModelRenderer(this, 69, 0);
      h11.addBox(3F, 5.5F, 0F, 1, 2, 3);
      h11.setRotationPoint(0F, 0F, 0F);
      h11.setTextureSize(128, 32);
      h11.mirror = true;
      setRotation(h11, 0F, 0F, 0F);
      h21 = new ModelRenderer(this, 69, 0);
      h21.addBox(-4.24F, 5.5F, 0F, 1, 2, 3);
      h21.setRotationPoint(0F, 0F, 0F);
      h21.setTextureSize(128, 32);
      h21.mirror = true;
      setRotation(h21, 0F, 0F, 0F);
      Pan1 = new ModelRenderer(this, 45, 10);
      Pan1.addBox(5F, 3F, 3F, 1, 4, 11);
      Pan1.setRotationPoint(0F, 0F, 0F);
      Pan1.setTextureSize(128, 32);
      Pan1.mirror = true;
      setRotation(Pan1, 0F, 0F, 0F);
      Pan2 = new ModelRenderer(this, 45, 10);
      Pan2.addBox(-6F, 3F, 3F, 1, 4, 11);
      Pan2.setRotationPoint(0F, 0F, 0F);
      Pan2.setTextureSize(128, 32);
      Pan2.mirror = true;
      setRotation(Pan2, 0F, 0F, 0F);
      Pan3 = new ModelRenderer(this, 42, 26);
      Pan3.addBox(-5F, 2F, 3F, 10, 5, 1);
      Pan3.setRotationPoint(0F, 0F, 0F);
      Pan3.setTextureSize(128, 32);
      Pan3.mirror = true;
      setRotation(Pan3, 0F, 0F, 0F);
      Pan4 = new ModelRenderer(this, 42, 26);
      Pan4.addBox(-6F, 3F, 14F, 12, 4, 1);
      Pan4.setRotationPoint(0F, 0F, 0F);
      Pan4.setTextureSize(128, 32);
      Pan4.mirror = true;
      setRotation(Pan4, 0F, 0F, 0F);
      Pan5 = new ModelRenderer(this, 26, 14);
      Pan5.addBox(-6F, 7F, 3F, 12, 1, 12);
      Pan5.setRotationPoint(0F, 0F, 0F);
      Pan5.setTextureSize(128, 32);
      Pan5.mirror = true;
      setRotation(Pan5, 0F, 0F, 0F);
      LegFL = new ModelRenderer(this, 18, 20);
      LegFL.addBox(-1F, 0F, -1F, 2, 4, 2);
      LegFL.setRotationPoint(-0.8F, 3F, 6.9F);
      LegFL.setTextureSize(128, 32);
      LegFL.mirror = true;
      setRotation(LegFL, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    Nose.render(f5);
    Ban.render(f5);
    LegFR.render(f5);
    LegBL.render(f5);
    LegBR.render(f5);
    Tail.render(f5);
    EarR.render(f5);
    EarL.render(f5);
    ThePinkThing.render(f5);
    Body.render(f5);
    Stick.render(f5);
    Hold1.render(f5);
    Hold2.render(f5);
    h11.render(f5);
    h21.render(f5);
    Pan1.render(f5);
    Pan2.render(f5);
    Pan3.render(f5);
    Pan4.render(f5);
    Pan5.render(f5);
    LegFL.render(f5);
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
  }

}
