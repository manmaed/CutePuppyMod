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
    field_78090_t = 64;
    field_78089_u = 32;
    
      head = new ModelRenderer(this, 0, 0);
      head.func_78789_a(-2.5F, -5F, -3F, 5, 5, 5);
      head.func_78793_a(0.5F, 19F, -4F);
      head.func_78787_b(64, 32);
      head.field_78809_i = true;
      setRotation(head, 0.0523599F, 0F, 0F);
      Nose = new ModelRenderer(this, 0, 26);
      Nose.func_78789_a(-1.5F, 0F, -1F, 3, 1, 1);
      //Nose.setRotationPoint(0.5F, 16.5F, -6.7F);
      Nose.func_78793_a(0.0F, -2.8F, -2.7F);
      Nose.func_78787_b(64, 32);
      Nose.field_78809_i = true;
      setRotation(Nose, 0.0349066F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 10);
      Body.func_78789_a(-2.5F, 0F, 0F, 5, 4, 6);
      Body.func_78793_a(0.5F, 17F, -5F);
      Body.func_78787_b(64, 32);
      Body.field_78809_i = true;
      setRotation(Body, -0.0872665F, 0F, 0F);
      LegFL = new ModelRenderer(this, 0, 20);
      LegFL.func_78789_a(-1F, 0F, -1F, 2, 4, 2);
      LegFL.func_78793_a(-0.8F, 20F, -3.5F);
      LegFL.func_78787_b(64, 32);
      LegFL.field_78809_i = true;
      setRotation(LegFL, 0F, 0F, 0F);
      LegFR = new ModelRenderer(this, 0, 20);
      LegFR.func_78789_a(-1F, 0F, -1F, 2, 4, 2);
      LegFR.func_78793_a(1.8F, 20F, -3.5F);
      LegFR.func_78787_b(64, 32);
      LegFR.field_78809_i = true;
      setRotation(LegFR, 0F, 0F, 0F);
      LegBL = new ModelRenderer(this, 18, 20);
      LegBL.func_78789_a(-1F, 0F, -1F, 2, 4, 2);
      LegBL.func_78793_a(-0.8F, 20F, -1F);
      LegBL.func_78787_b(64, 32);
      LegBL.field_78809_i = true;
      setRotation(LegBL, 0F, 0F, 0F);
      LegBR = new ModelRenderer(this, 18, 20);
      LegBR.func_78789_a(-1F, 0F, -1F, 2, 4, 2);
      LegBR.func_78793_a(1.8F, 20F, -1F);
      LegBR.func_78787_b(64, 32);
      LegBR.field_78809_i = true;
      setRotation(LegBR, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 8, 20);
      Tail.func_78789_a(-1F, -1F, 0F, 2, 2, 3);
      Tail.func_78793_a(0.5F, 18.5F, 0F);
      Tail.func_78787_b(64, 32);
      Tail.field_78809_i = true;
      setRotation(Tail, -1.029744F, 0F, 0F);
      EarR = new ModelRenderer(this, 21, 0);
      EarR.func_78789_a(0F, -1F, -1F, 1, 3, 2);
     EarR.func_78793_a(2.2F, -3F, 0F);
      EarR.func_78787_b(64, 32);
      EarR.field_78809_i = true;
      setRotation(EarR, 0F, 0F, -0.1745329F);
      EarL = new ModelRenderer(this, 15, 0);
      EarL.func_78789_a(-1F, -1F, -1F, 1, 3, 2);
     EarL.func_78793_a(-2.2F, -3F, 0F);
      EarL.func_78787_b(64, 32);
      EarL.field_78809_i = true;
      setRotation(EarL, 0F, 0F, 0.1745329F);
      /*ThePinkThing = new ModelRenderer(this, 16, 10);
      ThePinkThing.addBox(-1F, -0.5F, -2F, 2, 1, 2);
     ThePinkThing.setRotationPoint(0F, -1.5F, -1.5F);
      ThePinkThing.setTextureSize(64, 32);
      ThePinkThing.mirror = true;
      */
      ThePinkThing = new ModelRenderer(this, 16, 10);
      ThePinkThing.func_78789_a(-0.5F, -3.3F, -1.5F, 1, 1, 2);
      //ThePinkThing.setRotationPoint(0.5F, 19F, -4F);
      ThePinkThing.func_78793_a(0F, -0.0F, 0F);
      ThePinkThing.func_78787_b(64, 32);
      ThePinkThing.field_78809_i = true;
      //setRotation(ThePinkThing, 0.2617994F, 0F, 0F);
      setRotation(ThePinkThing, 1.155001F, 0F, 0F);
      //tings
      head.func_78792_a(EarL);
      head.func_78792_a(EarR);
      head.func_78792_a(Nose);
      head.func_78792_a(ThePinkThing);
  }
  
  public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
    func_78087_a(f, f1, f2, f3, f4, f5, entity);
    head.func_78785_a(f5);
    Body.func_78785_a(f5);
    LegFL.func_78785_a(f5);
    LegFR.func_78785_a(f5);
    LegBL.func_78785_a(f5);
    LegBR.func_78785_a(f5);
    Tail.func_78785_a(f5);
/*        EarR.render(f5);
    EarL.render(f5);
    ThePinkThing.render(f5);
    Nose.render(f5);*/
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.field_78795_f = x;
    model.field_78796_g = y;
    model.field_78808_h = z;
  }
  public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.func_78087_a(f, f1, f2, f3, f4, f5, entity);
    this.head.field_78795_f = f4 / (180F / (float)Math.PI);
      this.head.field_78796_g = f3 / (180F / (float)Math.PI);
      this.LegFL.field_78795_f = MathHelper.func_76134_b(f * 0.6662F) * 1.4F * f1;
      this.LegFR.field_78795_f = MathHelper.func_76134_b(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
      this.LegBL.field_78795_f = MathHelper.func_76134_b(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
      this.LegBR.field_78795_f = MathHelper.func_76134_b(f * 0.6662F) * 1.4F * f1;
  }
}
