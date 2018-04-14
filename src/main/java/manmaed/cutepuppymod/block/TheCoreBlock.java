package manmaed.cutepuppymod.block;

import manmaed.cutepuppymod.entity.EntityTheBossPuppy;
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
public class TheCoreBlock extends BaseCoreBlock {
    private static String name = "TheCoreBlock";
    public TheCoreBlock() {
        setUnlocalizedName(name);
        setRegistryName(name);
    }
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if(!worldIn.isRemote) {
            ItemStack itemStack = playerIn.getHeldItem(hand);
            if(itemStack.getItem() == CPMItems.fullsyringe) {
                itemStack.shrink(1);
                worldIn.setBlockToAir(pos);
                EntityTheBossPuppy BossPuppy = new EntityTheBossPuppy(worldIn);
                BossPuppy.setLocationAndAngles(pos.getX(), pos.getY(), pos.getZ(), 10, 10);
                worldIn.spawnEntity(new EntityLightningBolt(worldIn, pos.getX(), pos.getY(), pos.getZ(), false));
                worldIn.spawnEntity(BossPuppy);
                return true;
            }
        }
        return false;
    }

}
