package net.manmaed.cutepuppymod.blocks;


import net.manmaed.cutepuppymod.entitys.CPEntityTypes;
import net.manmaed.cutepuppymod.entitys.EntityBoss;
import net.manmaed.cutepuppymod.items.CPItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by manmaed on 05/01/2020.
 */
public class TheCoreBlock extends Block {
    public TheCoreBlock(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        if(!world.isRemote) {
            ItemStack itemStack = player.getHeldItem(hand);
            if(itemStack.getItem() == CPItems.fullsyringe) {
                itemStack.shrink(1);
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
                EntityBoss bossPuppy = new EntityBoss(CPEntityTypes.BOSS.get() ,world);
                bossPuppy.setLocationAndAngles(pos.getX(), pos.getY(), pos.getZ(), 10, 10);
                LightningBoltEntity boltEntity = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, world);
                boltEntity.setLocationAndAngles(pos.getX(), pos.getY(), pos.getZ(), 10, 10);
                boltEntity.setEffectOnly(true);
                world.addEntity(boltEntity);
                bossPuppy.setAttackTarget(player);
/*                world.addEntity(new LightningBoltEntity(EntityType.LIGHTNING_BOLT, world));*/
                world.addEntity(bossPuppy);
                for (ServerPlayerEntity serverPlayer : world.getEntitiesWithinAABB(ServerPlayerEntity.class, bossPuppy.getBoundingBox())) {
                    CriteriaTriggers.SUMMONED_ENTITY.trigger(serverPlayer, bossPuppy);
                }
                return ActionResultType.SUCCESS;
            }
        }
        return ActionResultType.FAIL;
    }

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
