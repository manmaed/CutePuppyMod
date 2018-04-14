package manmaed.cutepuppymod.block;

import manmaed.cutepuppymod.entity.EntityEnderBossPuppy;
import manmaed.cutepuppymod.items.CPMItems;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by manmaed on 14/04/2018.
 */
public class EnderCoreBlock extends BaseCoreBlock {
    private static String name = "EnderCoreBlock";
    public EnderCoreBlock() {
        setUnlocalizedName(name);
        setRegistryName(name);
    }
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if(!worldIn.isRemote) {
            ItemStack itemStack = playerIn.getHeldItem(hand);
            if(itemStack.getItem() == CPMItems.endercore) {
                itemStack.shrink(1);
                worldIn.setBlockToAir(pos);
                EntityEnderBossPuppy enderBossPuppy = new EntityEnderBossPuppy(worldIn);
                enderBossPuppy.setLocationAndAngles(pos.getX(), pos.getY(), pos.getZ(), 10, 10);
                worldIn.spawnEntity(new EntityLightningBolt(worldIn, pos.getX(), pos.getY(), pos.getZ(), false));
                worldIn.spawnEntity(enderBossPuppy);
                return true;
            }
        }
        return false;
    }
}
