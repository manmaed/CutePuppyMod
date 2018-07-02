package manmaed.cutepuppymod.client.render.model;

import manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelRedPuppyBig extends ModelBase
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

  //Hat
  ModelRenderer Hatp1;
  ModelRenderer Hatp2;
  ModelRenderer Hatp3;
  ModelRenderer HatBottem;
  ModelRenderer Hatp4;
  ModelRenderer Hatp5;
  ModelRenderer ballball;

  //Mask
  ModelRenderer Face;
  ModelRenderer Band1;
  ModelRenderer Band2;

  //Cake
  ModelRenderer Cake;

  public ModelRedPuppyBig()
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
      ThePinkThing = new ModelRenderer(this, 16, 10);
      ThePinkThing.addBox(-0.5F, -3.3F, -1.5F, 1, 1, 2);
      ThePinkThing.setRotationPoint(0F, -0.0F, 0F);
      ThePinkThing.setTextureSize(64, 32);
      ThePinkThing.mirror = true;
      setRotation(ThePinkThing, 1.155001F, 0F, 0F);

    //xmas hat
    HatBottem = new ModelRenderer(this, 26, 25);
    HatBottem.addBox(-3F, -7F, -3.5F, 6, 1, 6);
    HatBottem.setRotationPoint(0F, 1F, 0F);
    HatBottem.setTextureSize(64, 32);
    HatBottem.mirror = true;
    setRotation(HatBottem, 0F, 0F, 0F);
    Hatp1 = new ModelRenderer(this, 26, 26);
    Hatp1.addBox(-2.5F, -7F, -3F, 5, 1, 5);
    Hatp1.setRotationPoint(0F, 0F, 0F);
    Hatp1.setTextureSize(64, 32);
    Hatp1.mirror = true;
    setRotation(Hatp1, 0F, 0F, 0F);
    Hatp2 = new ModelRenderer(this, 26, 27);
    Hatp2.addBox(-2F, -7F, -2.5F, 4, 1, 4);
    Hatp2.setRotationPoint(0F, -1F, 0F);
    Hatp2.setTextureSize(64, 32);
    Hatp2.mirror = true;
    setRotation(Hatp2, 0F, 0F, 0F);
    Hatp3 = new ModelRenderer(this, 26, 28);
    Hatp3.addBox(-1.5F, -7F, -2F, 3, 1, 3);
    Hatp3.setRotationPoint(0F, -2F, 0F);
    Hatp3.setTextureSize(64, 32);
    Hatp3.mirror = true;
    setRotation(Hatp3, 0F, 0F, 0F);
    Hatp4 = new ModelRenderer(this, 26, 29);
    Hatp4.addBox(-1F, -7F, -1.5F, 2, 1, 2);
    Hatp4.setRotationPoint(0F, -3F, 0F);
    Hatp4.setTextureSize(64, 32);
    Hatp4.mirror = true;
    setRotation(Hatp4, 0F, 0F, 0F);
    Hatp5 = new ModelRenderer(this, 26, 29);
    Hatp5.addBox(-1F, -3F,5.5F, 2, 2, 1);
    Hatp5.setRotationPoint(0F, -3.5F, 0F);
    Hatp5.setTextureSize(64, 32);
    Hatp5.mirror = true;
    setRotation(Hatp5, 1.169371F, 0F, 0F);
    ballball = new ModelRenderer(this, 26, 20);
    ballball.addBox(-1F, -3F, 5F, 2, 2, 2);
    ballball.setRotationPoint(0F, -2.5F, 1.8F);
    ballball.setTextureSize(64, 32);
    ballball.mirror = true;
    setRotation(ballball, 1.169371F, 0F, 0F);

    //Mask
    Face = new ModelRenderer(this, 25, 12);
    Face.addBox(-3.5F, -22F, 3.5F, 6, 6, 1);
    Face.setRotationPoint(0.5F, 16.5F, -7.5F);
    Face.setTextureSize(64, 32);
    Face.mirror = true;
    setRotation(Face, 0, 0F, 0F);
    Band1 = new ModelRenderer(this, 26, 7);
    Band1.addBox(-0.5F, -19.5F, 4.2F, 0, 1, 3);
    Band1.setRotationPoint(3.5F, 16F, -7.7F);
    Band1.setTextureSize(64, 32);
    Band1.mirror = true;
    setRotation(Band1, 0, 0F, 0F);
    Band2 = new ModelRenderer(this, 26, 7);
    Band2.addBox(-0.5F, -19.5F, 4.2F, 0, 1, 3);
    Band2.setRotationPoint(-2.5F, 16F, -7.7F);
    Band2.setTextureSize(64, 32);
    Band2.mirror = true;
    setRotation(Band2, 0, 0F, 0F);

    //Cake
    Cake = new ModelRenderer(this, 40, 12);
    Cake.addBox(-3F, -21, 1.7F, 5, 2, 5);
    Cake.setRotationPoint(0.5F, 14F, -4.8F);
    Cake.setTextureSize(64, 32);
    Cake.mirror = true;
    setRotation(Cake, 0, 0F, 0F);

      //tings
      head.addChild(EarL);
      head.addChild(EarR);
      head.addChild(Nose);
      head.addChild(ThePinkThing);
    if(CutePuppyMod.christmas) {
      head.addChild(HatBottem);
      head.addChild(Hatp1);
      head.addChild(Hatp2);
      head.addChild(Hatp3);
      head.addChild(Hatp4);
      head.addChild(Hatp5);
      head.addChild(ballball);
    }
    if(CutePuppyMod.halloween) {
      head.addChild(Face);
      head.addChild(Band1);
      head.addChild(Band2);
    }
    if(CutePuppyMod.bday){
      head.addChild(Cake);
    }
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    // scale the whole thing for big or small entities
    float scaleFactor = 2.0F;
    GL11.glPushMatrix();
    GL11.glTranslatef(0F, 1.5F-1.5F*scaleFactor, 0F);
    GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    Body.render(f5);
    LegFL.render(f5);
    LegFR.render(f5);
    LegBL.render(f5);
    LegBR.render(f5);
    Tail.render(f5);
    GL11.glPopMatrix();
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