package net.manmaed.cutepuppymod.item.tools;

import net.manmaed.cutepuppymod.damage.CutePuppyCustomDamage;
import net.manmaed.cutepuppymod.item.CutePuppyItems;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
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
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (!level.isClientSide) {
            return new InteractionResultHolder<>(InteractionResult.SUCCESS,
                    this.fillWithBlood(itemStack, player, new ItemStack(CutePuppyItems.SYRINGE_FULL.get())));
        }
        return new InteractionResultHolder<>(InteractionResult.FAIL, itemStack);
    }

    protected ItemStack fillWithBlood(ItemStack itemInHand, Player player, ItemStack replaceingItem) {
        itemInHand.shrink(1);
        player.awardStat(Stats.ITEM_USED.get(this));
        //TODO Redo Custom Damage
        //player.hurt(this.damageSources.banned(), 5.0F);
        player.hurt(CutePuppyCustomDamage.no_blood(player), 5.0F);
        if (itemInHand.isEmpty()) {
            return replaceingItem;
        } else {
            if (!player.getInventory().add(replaceingItem)) {
                player.drop(replaceingItem, false);
            }
            return itemInHand;
        }
    }
}
