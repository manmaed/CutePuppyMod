package manmaed.cutepuppymod.items;

import manmaed.cutepuppymod.items.puppydrops.ItemCoreBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

/**
 * Created by manmaed on 14/04/2018.
 */
public class EmptySyringe extends ItemCoreBase {

    private static String name = "EmptySyringe";

    public EmptySyringe() {
        super();
        setUnlocalizedName(name);
        setRegistryName(name);
        setMaxStackSize(1);
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand hand) {
        if(!worldIn.isRemote)
        {
            ItemStack itemStack = playerIn.getHeldItem(hand);
            itemStack.shrink(1);
            playerIn.inventory.addItemStackToInventory(new ItemStack(CPMItems.fullsyringe));
            playerIn.attackEntityFrom(DamageSource.GENERIC, 2.0F);
        }
        return super.onItemRightClick(worldIn, playerIn, hand);
    }

}
