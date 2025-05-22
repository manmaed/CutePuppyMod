package net.manmaed.cutepuppymod.materials;


import net.manmaed.cutepuppymod.items.CPPuppyDrops;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

/**
 * Complete copy paste from {@link net.minecraft.world.item.Tiers}
 */
public enum ToolMaterials implements Tier {

    BAN(3, 3000, 2.0F, 0F, 0, () -> {
        return Ingredient.of(Items.AIR);
    }), RED_CORE(2, 450, 8.0F, 2.0F, 18, () -> {
        return Ingredient.of(CPPuppyDrops.RED_CORE.get());
    }), BLUE_CORE(2, 450, 8.0F, 2.0F, 18, () -> {
        return Ingredient.of(CPPuppyDrops.BLUE_CORE.get());
    }), YELLOW_CORE(2, 450, 8.0F, 2.0F, 18, () -> {
        return Ingredient.of(CPPuppyDrops.YELLOW_CORE.get());
    }), PURPLE_CORE(2, 450, 8.0F, 2.0F, 18, () -> {
        return Ingredient.of(CPPuppyDrops.PURPLE_CORE.get());
    }), GREEN_CORE(2, 450, 8.0F, 2.0F, 18, () -> {
        return Ingredient.of(CPPuppyDrops.GREEN_CORE.get());
    });
    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ToolMaterials(int levelIn, int useIn, float speedIn, float damageIn, int enchantmentValueIn, Supplier<Ingredient> repairIngredientIn) {
        this.level = levelIn;
        this.uses = useIn;
        this.speed = speedIn;
        this.damage = damageIn;
        this.enchantmentValue = enchantmentValueIn;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredientIn);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
