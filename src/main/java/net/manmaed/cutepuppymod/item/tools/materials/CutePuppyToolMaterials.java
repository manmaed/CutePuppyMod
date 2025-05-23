package net.manmaed.cutepuppymod.item.tools.materials;


import com.google.common.base.Suppliers;
import net.manmaed.cutepuppymod.item.CutePuppyItems;
import net.manmaed.cutepuppymod.tag.CutePuppyTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

/**
 * Complete copy and paste from {@link net.minecraft.world.item.Tiers}
 */
public enum CutePuppyToolMaterials implements Tier {

    RED_CORES(CutePuppyTags.BlockTag.INCORRECT_FOR_RED_CORES, 450, 8.0F, 3.0F, 18, () -> Ingredient.of(CutePuppyItems.RED_CORE)),
    BLUE_CORES(CutePuppyTags.BlockTag.INCORRECT_FOR_BLUE_CORES, 450, 8.0F, 3.0F, 18, () -> Ingredient.of(CutePuppyItems.BLUE_CORE)),
    YELLOW_CORES(CutePuppyTags.BlockTag.INCORRECT_FOR_YELLOW_CORES, 450, 8.0F, 3.0F, 18, () -> Ingredient.of(CutePuppyItems.YELLOW_CORE)),
    PURPLE_CORES(CutePuppyTags.BlockTag.INCORRECT_FOR_PURPLE_CORES, 450, 8.0F, 3.0F, 18, () -> Ingredient.of(CutePuppyItems.PURPLE_CORE)),
    GREEN_CORES(CutePuppyTags.BlockTag.INCORRECT_FOR_GREEN_CORES, 450, 8.0F, 3.0F, 18, () -> Ingredient.of(CutePuppyItems.GREEN_CORE)),
    BAN(CutePuppyTags.BlockTag.INCORRECT_FOR_BAN, 3000, 2.0F, 0F, 0, () -> Ingredient.of(Items.AIR));

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    CutePuppyToolMaterials(TagKey<Block> blockTagKey, int useIn, float speedIn, float damageIn, int enchantmentValueIn, Supplier<Ingredient> repairIngredientIn) {
        incorrectBlocksForDrops = blockTagKey;
        this.uses = useIn;
        this.speed = speedIn;
        this.damage = damageIn;
        this.enchantmentValue = enchantmentValueIn;
        this.repairIngredient = Suppliers.memoize(repairIngredientIn::get);
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

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
