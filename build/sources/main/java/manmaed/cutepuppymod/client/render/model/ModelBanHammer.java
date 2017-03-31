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
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 26, 17);
      Head.addBox(-1F, -2F, -3F, 2, 4, 3);
      Head.setRotationPoint(0F, 12F, -1F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 22, 10);
      Body.addBox(-0.5F, -0.5F, -1F, 1, 1, 6);
      Body.setRotationPoint(0F, 12F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      Head.render(f5);
      Body.render(f5);
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
