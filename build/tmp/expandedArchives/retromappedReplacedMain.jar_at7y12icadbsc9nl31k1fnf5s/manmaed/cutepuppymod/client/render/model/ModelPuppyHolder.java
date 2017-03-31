package manmaed.cutepuppymod.client.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPuppyHolder extends ModelBase
{

    public static ModelPuppyHolder instance = new ModelPuppyHolder();
    //fields
    public ModelRenderer head;
    public ModelRenderer Nose;
    public ModelRenderer Ban;
    public ModelRenderer LegFR;
    public ModelRenderer LegBL;
    public ModelRenderer LegBR;
    public ModelRenderer Tail;
    public ModelRenderer EarR;
    public ModelRenderer EarL;
    public ModelRenderer ThePinkThing;
    public ModelRenderer Body;
    public ModelRenderer Stick;
    public ModelRenderer Hold1;
    public ModelRenderer Hold2;
    public  ModelRenderer h11;
    public ModelRenderer h21;
    public ModelRenderer Pan1;
    public  ModelRenderer Pan2;
    public  ModelRenderer Pan3;
    public  ModelRenderer Pan4;
    public  ModelRenderer Pan5;
    public  ModelRenderer LegFL;

    public ModelPuppyHolder()
    {
        field_78090_t = 128;
        field_78089_u = 32;

        head = new ModelRenderer(this, 0, 0);
        head.func_78789_a(-2.5F, -5F, -3F, 5, 5, 5);
        head.func_78793_a(-2.5F, 2F, 7F);
        head.func_78787_b(128, 32);
        head.field_78809_i = true;
        setRotation(head, 0.0523599F, 1.570796F, 0F);
        Nose = new ModelRenderer(this, 0, 26);
        Nose.func_78789_a(-1.5F, 0F, -1F, 3, 1, 1);
        Nose.func_78793_a(-5.5F, -0.5F, 7F);
        Nose.func_78787_b(128, 32);
        Nose.field_78809_i = true;
        setRotation(Nose, 0.0349066F, 1.570796F, 0F);
        Ban = new ModelRenderer(this, 26, 17);
        Ban.func_78789_a(-2.5F, -0.4F, -4F, 2, 4, 3);
        Ban.func_78793_a(-1.5F, 1.5F, 9F);
        Ban.func_78787_b(128, 32);
        Ban.field_78809_i = true;
        setRotation(Ban, -0.0698132F, 1.710423F, 0F);
        LegFR = new ModelRenderer(this, 0, 20);
        LegFR.func_78789_a(-1F, 0F, -1F, 2, 4, 2);
        LegFR.func_78793_a(1.8F, 3F, 5.9F);
        LegFR.func_78787_b(128, 32);
        LegFR.field_78809_i = true;
        setRotation(LegFR, 0F, 0F, 0F);
        LegBL.field_78809_i = true;
        LegBL = new ModelRenderer(this, 18, 20);
        LegBL.func_78789_a(-1F, 0F, -1F, 2, 4, 2);
        LegBL.func_78793_a(-0.8F, 3F, 8.1F);
        LegBL.func_78787_b(128, 32);
        LegBL.field_78809_i = true;
        setRotation(LegBL, 0F, 0F, 0F);
        LegBL.field_78809_i = false;
        LegBR = new ModelRenderer(this, 18, 20);
        LegBR.func_78789_a(-1F, 0F, -1F, 2, 4, 2);
        LegBR.func_78793_a(1.8F, 3F, 8.1F);
        LegBR.func_78787_b(128, 32);
        LegBR.field_78809_i = true;
        setRotation(LegBR, 0F, 0F, 0F);
        Tail = new ModelRenderer(this, 8, 20);
        Tail.func_78789_a(-1F, -1F, 0F, 2, 2, 3);
        Tail.func_78793_a(2.5F, 1.5F, 7F);
        Tail.func_78787_b(128, 32);
        Tail.field_78809_i = true;
        setRotation(Tail, -0.6806784F, 1.570796F, 0F);
        EarR = new ModelRenderer(this, 21, 0);
        EarR.func_78789_a(0F, -1F, -1F, 1, 3, 2);
        EarR.func_78793_a(-2.3F, -1F, 5F);
        EarR.func_78787_b(128, 32);
        EarR.field_78809_i = true;
        setRotation(EarR, 0F, 1.570796F, -0.1745329F);
        EarL = new ModelRenderer(this, 15, 0);
        EarL.func_78789_a(-1F, -1F, 0F, 1, 3, 2);
        EarL.func_78793_a(-3.2F, -1F, 9F);
        EarL.func_78787_b(128, 32);
        EarL.field_78809_i = true;
        setRotation(EarL, 0F, 1.570796F, 0.1745329F);
        ThePinkThing = new ModelRenderer(this, 16, 10);
        ThePinkThing.func_78789_a(-0.5F, -1F, -2F, 1, 1, 2);
        ThePinkThing.func_78793_a(-4.5F, 1F, 7F);
        ThePinkThing.func_78787_b(128, 32);
        ThePinkThing.field_78809_i = true;
        setRotation(ThePinkThing, 1.291544F, 1.570796F, 0F);
        Body = new ModelRenderer(this, 0, 10);
        Body.func_78789_a(-2.5F, 0F, 0F, 5, 4, 6);
        Body.func_78793_a(-2.5F, 0F, 7F);
        Body.func_78787_b(128, 32);
        Body.field_78809_i = true;
        setRotation(Body, -0.0872665F, 1.570796F, 0F);
        Stick = new ModelRenderer(this, 22, 10);
        Stick.func_78789_a(-3F, 0F, 1F, 1, 1, 6);
        Stick.func_78793_a(-4.5F, 2.5F, 8F);
        Stick.func_78787_b(128, 32);
        Stick.field_78809_i = true;
        setRotation(Stick, -0.0698132F, 1.710423F, 0F);
        Hold1 = new ModelRenderer(this, 77, 0);
        Hold1.func_78789_a(1F, -0.5F, 0F, 2, 8, 3);
        Hold1.func_78793_a(0F, 0F, 0F);
        Hold1.func_78787_b(128, 32);
        Hold1.field_78809_i = true;
        setRotation(Hold1, 0F, 0F, 0F);
        Hold2 = new ModelRenderer(this, 77, 0);
        Hold2.func_78789_a(-3.24F, -0.5F, 0F, 2, 8, 3);
        Hold2.func_78793_a(0F, 0F, 0F);
        Hold2.func_78787_b(128, 32);
        Hold2.field_78809_i = true;
        setRotation(Hold2, 0F, 0F, 0F);
        h11 = new ModelRenderer(this, 69, 0);
        h11.func_78789_a(3F, 5.5F, 0F, 1, 2, 3);
        h11.func_78793_a(0F, 0F, 0F);
        h11.func_78787_b(128, 32);
        h11.field_78809_i = true;
        setRotation(h11, 0F, 0F, 0F);
        h21 = new ModelRenderer(this, 69, 0);
        h21.func_78789_a(-4.24F, 5.5F, 0F, 1, 2, 3);
        h21.func_78793_a(0F, 0F, 0F);
        h21.func_78787_b(128, 32);
        h21.field_78809_i = true;
        setRotation(h21, 0F, 0F, 0F);
        Pan1 = new ModelRenderer(this, 45, 10);
        Pan1.func_78789_a(5F, 3F, 3F, 1, 4, 9);
        Pan1.func_78793_a(0F, 0F, 0F);
        Pan1.func_78787_b(128, 32);
        Pan1.field_78809_i = true;
        setRotation(Pan1, 0F, 0F, 0F);
        Pan2 = new ModelRenderer(this, 45, 10);
        Pan2.func_78789_a(-6F, 3F, 3F, 1, 4, 9);
        Pan2.func_78793_a(0F, 0F, 0F);
        Pan2.func_78787_b(128, 32);
        Pan2.field_78809_i = true;
        setRotation(Pan2, 0F, 0F, 0F);
        Pan3 = new ModelRenderer(this, 42, 26);
        Pan3.func_78789_a(-5F, 2F, 3F, 10, 5, 1);
        Pan3.func_78793_a(0F, 0F, 0F);
        Pan3.func_78787_b(128, 32);
        Pan3.field_78809_i = true;
        setRotation(Pan3, 0F, 0F, 0F);
        Pan4 = new ModelRenderer(this, 42, 26);
        Pan4.func_78789_a(-6F, 3F, 12F, 12, 4, 1);
        Pan4.func_78793_a(0F, 0F, 0F);
        Pan4.func_78787_b(128, 32);
        Pan4.field_78809_i = true;
        setRotation(Pan4, 0F, 0F, 0F);
        Pan5 = new ModelRenderer(this, 35, 21);
        Pan5.func_78789_a(-6F, 7F, 3F, 12, 1, 10);
        Pan5.func_78793_a(0F, 0F, 0F);
        Pan5.func_78787_b(128, 32);
        Pan5.field_78809_i = true;
        setRotation(Pan5, 0F, 0F, 0F);
        LegFL = new ModelRenderer(this, 18, 20);
        LegFL.func_78789_a(-1F, 0F, -1F, 2, 4, 2);
        LegFL.func_78793_a(-0.8F, 3F, 5.9F);
        LegFL.func_78787_b(128, 32);
        LegFL.field_78809_i = true;
        setRotation(LegFL, 0F, 0F, 0F);
    }

    @Override
    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        func_78087_a(f, f1, f2, f3, f4, f5, entity);
        head.func_78785_a(f5);
        Nose.func_78785_a(f5);
        Ban.func_78785_a(f5);
        LegFR.func_78785_a(f5);
        LegBL.func_78785_a(f5);
        LegBR.func_78785_a(f5);
        Tail.func_78785_a(f5);
        EarR.func_78785_a(f5);
        EarL.func_78785_a(f5);
        ThePinkThing.func_78785_a(f5);
        Body.func_78785_a(f5);
        Stick.func_78785_a(f5);
        Hold1.func_78785_a(f5);
        Hold2.func_78785_a(f5);
        h11.func_78785_a(f5);
        h21.func_78785_a(f5);
        Pan1.func_78785_a(f5);
        Pan2.func_78785_a(f5);
        Pan3.func_78785_a(f5);
        Pan4.func_78785_a(f5);
        Pan5.func_78785_a(f5);
        LegFL.func_78785_a(f5);
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

    public void render(float f) {
        head.func_78785_a(f);
        Nose.func_78785_a(f);
        Ban.func_78785_a(f);
        LegFR.func_78785_a(f);
        LegBL.func_78785_a(f);
        LegBR.func_78785_a(f);
        Tail.func_78785_a(f);
        EarR.func_78785_a(f);
        EarL.func_78785_a(f);
        ThePinkThing.func_78785_a(f);
        Body.func_78785_a(f);
        Stick.func_78785_a(f);
        Hold1.func_78785_a(f);
        Hold2.func_78785_a(f);
        h11.func_78785_a(f);
        h21.func_78785_a(f);
        Pan1.func_78785_a(f);
        Pan2.func_78785_a(f);
        Pan3.func_78785_a(f);
        Pan4.func_78785_a(f);
        Pan5.func_78785_a(f);
        LegFL.func_78785_a(f);
    }

}
