package net.manmaed.cutepuppymod.entitys;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.world.World;

/**
 * Created by manmaed on 10/04/2021.
 */
public class EntityEnder extends EndermanEntity {
    public EntityEnder(EntityType<? extends EndermanEntity> type, World worldIn) {
        super(type, worldIn);
    }
}
