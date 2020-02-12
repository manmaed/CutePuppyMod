package net.manmaed.cutepuppymod.damage;

import net.minecraft.util.DamageSource;

public class CustomDamageSource {
    public static final DamageSource NO_BLOOD = (new DamageSource("noBlood")).setDamageBypassesArmor();
    public static final DamageSource BANNED = (new DamageSource("banned")).setDamageBypassesArmor();
}
