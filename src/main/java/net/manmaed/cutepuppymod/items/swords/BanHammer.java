package net.manmaed.cutepuppymod.items.swords;

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
public class BanHammer extends Item {
    public BanHammer(Properties properties, String name) {
        super(properties);
        setRegistryName(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemStack = playerIn.getHeldItem(handIn);
        if(!worldIn.isRemote) {
            return new ActionResult<>(ActionResultType.SUCCESS, this.banned(itemStack, playerIn));
        }
        return new ActionResult<>(ActionResultType.FAIL, itemStack);
    }

    protected ItemStack banned(ItemStack itemStack, PlayerEntity playerIn) {
        itemStack.shrink(1);
        playerIn.addStat(Stats.ITEM_USED.get(this));
        playerIn.attackEntityFrom(CustomDamageSource.BANNED, 200F);
        return itemStack;
    }
}
