package net.manmaed.cutepuppymod.blocks;


import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by manmaed on 05/01/2020.
 */
public class TheCoreBlock extends Block {
    public TheCoreBlock(Properties properties) {
        super(properties);
    }

    //TODO
    /*@Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if(!worldIn.isRemote) {
            ItemStack itemStack = playerIn.getHeldItem(hand);
            if(itemStack.getItem() == CPMItems.fullsyringe) {
                itemStack.shrink(1);
                worldIn.setBlockToAir(pos);
                EntityTheBossPuppy bossPuppy = new EntityTheBossPuppy(worldIn);
                bossPuppy.setLocationAndAngles(pos.getX(), pos.getY(), pos.getZ(), 10, 10);
                worldIn.spawnEntity(new EntityLightningBolt(worldIn, pos.getX(), pos.getY(), pos.getZ(), false));
                worldIn.spawnEntity(bossPuppy);
                for (EntityPlayerMP entityplayermp : worldIn.getEntitiesWithinAABB(EntityPlayerMP.class, bossPuppy.getEntityBoundingBox().grow(50.0D)))
                {
                    CriteriaTriggers.SUMMONED_ENTITY.trigger(entityplayermp, bossPuppy);
                }
                return true;
            }
        }
        return false;
    }*/

    @Override
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
         tooltip.add(new TranslationTextComponent("block.cutepuppymod.coreblock.tooltip"));
    }
}
