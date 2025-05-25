package net.manmaed.cutepuppymod.entity;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import org.jetbrains.annotations.Nullable;

import java.util.function.Predicate;

public class CustomNonTameRandomTagetGoal<T extends LivingEntity> extends NearestAttackableTargetGoal<T> {
    private final TamableAnimal tamableMob;
    public CustomNonTameRandomTagetGoal(TamableAnimal pTamableMob, Class pTargetType, boolean pMustSee, @Nullable Predicate pTargetPredicate) {
        super(pTamableMob, pTargetType, pMustSee, pTargetPredicate);
        this.tamableMob = pTamableMob;
    }

    @Override
    public boolean canUse() {
        return !this.tamableMob.isTame() && super.canUse() && !(target.getMaxHealth() == 5.0);
    }

    @Override
    public boolean canContinueToUse() {
        return this.targetConditions != null ? this.targetConditions.test(this.mob, this.target) : super.canContinueToUse();
    }
}
