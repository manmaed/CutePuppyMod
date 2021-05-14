package net.manmaed.cutepuppymod.items.weapon;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

/**
 * Created by manmaed on 05/01/2020.
 */
public class BanHammer extends SwordItem {
    public BanHammer(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties properties) {
        super(tier, attackDamageIn, attackSpeedIn, properties);
    }
    /*public BanHammer(Properties properties, String name) {
        super(properties);
        setRegistryName(name);
    }*/
    /*public BanHammer(Properties properties, String name) {
        super(properties);
        setRegistryName(name);
    }*/

    //Make This On Attack!

    /*@Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemStack = playerIn.getHeldItem(handIn);
        if(!worldIn.isRemote) {
            return new ActionResult<>(ActionResultType.SUCCESS, this.banned(itemStack, playerIn));
        }
        return new ActionResult<>(ActionResultType.FAIL, itemStack);
    }*/
    /*protected ItemStack banned(ItemStack itemStack, PlayerEntity playerIn) {
        itemStack.shrink(1);
        playerIn.addStat(Stats.ITEM_USED.get(this));
        playerIn.attackEntityFrom(CustomDamageSource.BANNED, 200F);
        return itemStack;
    }*/

    @Override
    public int getItemEnchantability() {
        return 0;
    }

    @Override
    public boolean isRepairable(ItemStack stack) {
        return false;
    }
}
