package net.manmaed.cutepuppymod.entity;

import net.manmaed.cutepuppymod.loot_table.CutePuppyCustomLootTables;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.loot.LootTable;

/**
 * Created by manmaed on 14/04/2022.
 */
public class EnderPuppyEntity extends EnderMan {
    public EnderPuppyEntity(EntityType<? extends EnderMan> type, Level level) {
        super(type, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.2D)
                .add(Attributes.ATTACK_DAMAGE, 7.0D)
                .add(Attributes.FOLLOW_RANGE, 64.0D);
    }

    @Override
    protected ResourceKey<LootTable> getDefaultLootTable() {
        return CutePuppyCustomLootTables.PUPPY_ENDER;
    }
}
