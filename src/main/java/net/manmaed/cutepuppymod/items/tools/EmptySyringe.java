package net.manmaed.cutepuppymod.items.tools;

import net.manmaed.cutepuppymod.damage.CustomDamageSource;
import net.manmaed.cutepuppymod.items.CPItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stat;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
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
        if(!level.isClientSide) {
            return new InteractionResultHolder<>(InteractionResult.SUCCESS, this.fillWithBlood(itemStack, player, new ItemStack(CPItems.SYRINGE_FULL.get())));
        }
        return new InteractionResultHolder<>(InteractionResult.FAIL, itemStack);
    }

    protected ItemStack fillWithBlood(ItemStack itemInHand, Player player, ItemStack replaceingItem) {
        itemInHand.shrink(1);
        player.awardStat(Stats.ITEM_USED.get(this));
        player.hurt(CustomDamageSource.NO_BLOOD, 5.0F);
        if (itemInHand.isEmpty()) {
            return replaceingItem;
        } else {
            if (!player.getInventory().add(replaceingItem)) {
                player.drop(replaceingItem, false);
            }
            return itemInHand;
        }
    }

    /* @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        =
        if(!worldIn.isRemote) {
            return new ActionResult<>(ActionResultType.SUCCESS, this.fillwithblood(itemStack, playerIn, new ItemStack(CPItems.fullsyringe)));
        }
        return new ActionResult<>(ActionResultType.FAIL, itemStack);
    }

    protected ItemStack fillwithblood(ItemStack iteminhand, PlayerEntity playerIn, ItemStack replaceingitem) {
        iteminhand.shrink(1);
        playerIn.addStat(Stats.ITEM_USED.get(this));
        playerIn.attackEntityFrom(CustomDamageSource.NO_BLOOD, 5F);
        if (iteminhand.isEmpty()) {
            return replaceingitem;
        } else {
            if (!playerIn.inventory.addItemStackToInventory(replaceingitem)) {
                playerIn.dropItem(replaceingitem, false);
            }
            return iteminhand;
        }
    }*/
}
