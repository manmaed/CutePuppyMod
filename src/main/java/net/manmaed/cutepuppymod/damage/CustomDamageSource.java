package net.manmaed.cutepuppymod.damage;


import net.minecraft.world.damagesource.DamageSource;

public class CustomDamageSource {
    public static final DamageSource NO_BLOOD = (new DamageSource("noblood")).bypassArmor();
    public static final DamageSource BANNED = (new DamageSource("banned")).bypassArmor();
}
