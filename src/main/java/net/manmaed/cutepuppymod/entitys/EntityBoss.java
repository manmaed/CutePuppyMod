package net.manmaed.cutepuppymod.entitys;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.world.World;

/**
 * Created by manmaed on 10/04/2021.
 */
public class EntityBoss extends MobEntity {
    protected EntityBoss(EntityType<? extends MobEntity> type, World worldIn) {
        super(type, worldIn);
    }
}
