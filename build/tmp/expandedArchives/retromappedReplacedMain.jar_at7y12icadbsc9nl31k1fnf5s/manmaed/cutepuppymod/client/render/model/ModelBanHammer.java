package manmaed.cutepuppymod.client.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBanHammer extends ModelBase
{
  //fields
    public ModelRenderer Head;
    public ModelRenderer Body;
  
  public ModelBanHammer()
  {
    field_78090_t = 64;
    field_78089_u = 32;
    
      Head = new ModelRenderer(this, 26, 17);
      Head.func_78789_a(-1F, -2F, -3F, 2, 4, 3);
      Head.func_78793_a(0F, 12F, -1F);
      Head.func_78787_b(64, 32);
      Head.field_78809_i = true;
      setRotation(Body, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 22, 10);
      Body.func_78789_a(-0.5F, -0.5F, -1F, 1, 1, 6);
      Body.func_78793_a(0F, 12F, 0F);
      Body.func_78787_b(64, 32);
      Body.field_78809_i = true;
      setRotation(Body, 0F, 0F, 0F);
  }
  
  public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
    func_78087_a(f, f1, f2, f3, f4, f5, entity);
      Head.func_78785_a(f5);
      Body.func_78785_a(f5);
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
  }

}
