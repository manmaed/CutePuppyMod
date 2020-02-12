package net.manmaed.cutepuppymod.entitys;

import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.registries.ObjectHolder;

public class CPMEntitys {

    @ObjectHolder(Reference.Register + "red_puppy")
    public static EntityType<EntityRedPup> red;
    /*public static final EntityType<CowEntity> COW = register("cow", EntityType.Builder.create(CowEntity::new, EntityClassification.CREATURE).size(0.9F, 1.4F));*/

    public void initEntitys() {
    }
}
