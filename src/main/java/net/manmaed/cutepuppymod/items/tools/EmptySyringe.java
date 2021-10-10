package net.manmaed.cutepuppymod.items.tools;

import net.manmaed.cutepuppymod.damage.CustomDamageSource;
import net.manmaed.cutepuppymod.items.CPItems;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

/**
 * Created by manmaed on 05/01/2020.
 */
public class EmptySyringe extends Item {
    public EmptySyringe(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (!world.isClientSide) {
            return InteractionResultHolder.pass(this.fillwithblood(itemStack, player, new ItemStack(CPItems.FULL_SYRINGE.get())));
        }
        return InteractionResultHolder.fail(itemStack);
    }

    protected ItemStack fillwithblood(ItemStack iteminhand, Player playerIn, ItemStack replaceingitem) {
        iteminhand.shrink(1);
        playerIn.awardStat(Stats.ITEM_USED.get(this));
        playerIn.hurt(CustomDamageSource.NO_BLOOD, 5F);
        if (iteminhand.isEmpty()) {
            return replaceingitem;
        } else {
            if (!playerIn.getInventory().add(replaceingitem)) {
                playerIn.drop(replaceingitem, false);
            }
            return iteminhand;
        }
    }
}
