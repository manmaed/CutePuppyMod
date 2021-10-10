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

    BAN(3, 3000, 2.0F, 20F, 0, () -> {
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
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyLoadedValue<Ingredient> repairMaterial;

    ToolMaterials(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyLoadedValue<>(repairMaterialIn);
    }

    public int getUses() {
        return this.maxUses;
    }

    public float getSpeed() {
        return this.efficiency;
    }

    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    public int getLevel() {
        return this.harvestLevel;
    }

    public int getEnchantmentValue() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }
}
