package net.manmaed.cutepuppymod.materials;

import net.manmaed.cutepuppymod.items.CPPuppyDrops;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

/**
 * Complete copy paste from {@link net.minecraft.item.ItemTier}
 */
public enum ToolMaterials implements IItemTier {

    BAN(3, 3000, 2.0F, 20F, 0, () -> {
        return Ingredient.fromItems(Items.AIR);
    }),
    RED_CORE(2, 450, 8.0F, 2.0F, 18, () -> {
        return Ingredient.fromItems(CPPuppyDrops.redcore);
    }),
    BLUE_CORE(2, 450, 8.0F, 2.0F, 18, () -> {
        return Ingredient.fromItems(CPPuppyDrops.bluecore);
    }),
    YELLOW_CORE(2, 450, 8.0F, 2.0F, 18, () -> {
        return Ingredient.fromItems(CPPuppyDrops.yellowcore);
    }),
    PURPLE_CORE(2, 450, 8.0F, 2.0F, 18, () -> {
        return Ingredient.fromItems(CPPuppyDrops.purplecore);
    }),
    GREEN_CORE(2, 450, 8.0F, 2.0F, 18, () -> {
        return Ingredient.fromItems(CPPuppyDrops.greencore);
    });
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    ToolMaterials(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    public int getMaxUses() {
        return this.maxUses;
    }

    public float getEfficiency() {
        return this.efficiency;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}
