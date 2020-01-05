package net.manmaed.cutepuppymod.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
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
        if(worldIn.isRemote) {
            ItemStack itemStack =  playerIn.getHeldItem(handIn);
            itemStack.shrink(1);
            playerIn.inventory.addItemStackToInventory(new ItemStack(CPMItems.fullsyringe));
            playerIn.attackEntityFrom(DamageSource.GENERIC, 2.0F);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
