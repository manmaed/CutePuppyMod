package net.manmaed.cutepuppymod.entitys;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.level.Level;

/**
 * Created by manmaed on 14/04/2022.
 */
public class EntityEnder extends EnderMan {
    public EntityEnder(EntityType<? extends EnderMan> type, Level level) {
        super(type, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.2D)
                .add(Attributes.ATTACK_DAMAGE,7.0D)
                .add(Attributes.FOLLOW_RANGE, 64.0D);
    }

    @Override
    public float getEyeHeight(Pose pose) {
        return 1.0F;
    }
}
