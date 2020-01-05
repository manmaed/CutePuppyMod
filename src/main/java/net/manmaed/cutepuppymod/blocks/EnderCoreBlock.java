package net.manmaed.cutepuppymod.blocks;


import net.minecraft.block.Block;

/**
 * Created by manmaed on 05/01/2020.
 */
public class EnderCoreBlock extends Block {
    public EnderCoreBlock(Properties properties) {
        super(properties);
    }

    /*@Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if(!worldIn.isRemote) {
            ItemStack itemStack = player.getHeldItem(handIn);
            if(itemStack.getItem() == CPMItems.endercore) {
                itemStack.shrink(1);
                worldIn.setBlockToAir(pos);
                net.manmaed.cutepuppymod.entity.EntityEnderBossPuppy enderBossPuppy = new net.manmaed.cutepuppymod.entity.EntityEnderBossPuppy(worldIn);
                enderBossPuppy.setLocationAndAngles(pos.getX(), pos.getY(), pos.getZ(), 10, 10);
                worldIn.spawnEntity(new EntityLightningBolt(worldIn, pos.getX(), pos.getY(), pos.getZ(), false));
                worldIn.spawnEntity(enderBossPuppy);
                return true;
            }
        }
        return false;
    }*/
}
