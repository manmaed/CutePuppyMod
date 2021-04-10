package net.manmaed.cutepuppymod.items;

import net.manmaed.cutepuppymod.damage.CustomDamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

/**
 * Created by manmaed on 05/01/2020.
 */
public class EmptySyringe extends Item {
    public EmptySyringe(Properties properties, String name) {
        super(properties);
        setRegistryName(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemStack = playerIn.getHeldItem(handIn);
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
    }
}
