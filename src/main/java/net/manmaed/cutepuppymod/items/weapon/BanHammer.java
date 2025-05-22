package net.manmaed.cutepuppymod.items.weapon;

import net.manmaed.cutepuppymod.damage.CustomDamageSource;
import net.manmaed.cutepuppymod.materials.ToolMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.enchantment.Enchantment;


/**
 * Created by manmaed on 27/06/2021.
 */
public class BanHammer extends SwordItem {
    public BanHammer(Properties builderIn) {
        super(ToolMaterials.BAN, 0, 2.0F, builderIn);
    }

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return false;
    }

    @Override
    public boolean isEnchantable(ItemStack p_41456_) {
        return false;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return false;
    }

    @Override
    public boolean hurtEnemy(ItemStack itemStack, LivingEntity target, LivingEntity attacker) {
        itemStack.hurtAndBreak(1, attacker, (entity) -> {
            entity.broadcastBreakEvent(EquipmentSlot.MAINHAND);
        });
        target.hurt(CustomDamageSource.BANNED, 25.0F);
        return true;
    }
}
