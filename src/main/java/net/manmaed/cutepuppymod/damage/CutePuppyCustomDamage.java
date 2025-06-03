package net.manmaed.cutepuppymod.damage;

import net.manmaed.cutepuppymod.libs.RLHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.Entity;

public class CutePuppyCustomDamage {
    public static final ResourceKey<DamageType> BANNED = ResourceKey.create(Registries.DAMAGE_TYPE, RLHelper.location("banned"));
    public static final ResourceKey<DamageType> NO_BLOOD = ResourceKey.create(Registries.DAMAGE_TYPE, RLHelper.location("no_blood"));

    public static DamageSource no_blood(Entity causer) {
        return new DamageSource(
                causer.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(CutePuppyCustomDamage.NO_BLOOD),
                causer);
    }

    public static DamageSource banned(Entity causer) {
        return new DamageSource(
                causer.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(CutePuppyCustomDamage.BANNED),
                causer);
    }

}
