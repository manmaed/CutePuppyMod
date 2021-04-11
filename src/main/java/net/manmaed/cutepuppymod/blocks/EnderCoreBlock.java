package net.manmaed.cutepuppymod.blocks;


import net.manmaed.cutepuppymod.entitys.CPEntityTypes;
import net.manmaed.cutepuppymod.entitys.EntityBossEnder;
import net.manmaed.cutepuppymod.items.CPPuppyDrops;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

/**
 * Created by manmaed on 05/01/2020.
 */
public class EnderCoreBlock extends Block {
    public EnderCoreBlock(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        if(!world.isRemote) {
            ItemStack itemStack = player.getHeldItem(hand);
            if(itemStack.getItem() == CPPuppyDrops.endercore) {
                itemStack.shrink(1);
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
                EntityBossEnder bossPuppy = new EntityBossEnder(CPEntityTypes.BOSS_ENDER.get() ,world);
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
}
