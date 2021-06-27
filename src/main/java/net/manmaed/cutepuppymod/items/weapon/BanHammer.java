package net.manmaed.cutepuppymod.items.weapon;

import net.manmaed.cutepuppymod.damage.CustomDamageSource;
import net.manmaed.cutepuppymod.materials.ToolMaterials;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

/**
 * Created by manmaed on 27/06/2021.
 */
public class BanHammer extends SwordItem {
    public BanHammer(Properties builderIn) {
        super(ToolMaterials.BAN, 10, 0, builderIn);
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damageItem(1, attacker, (entity) -> {
            entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
        });
        target.attackEntityFrom(CustomDamageSource.BANNED, 25F);
        return true;
    }
}
