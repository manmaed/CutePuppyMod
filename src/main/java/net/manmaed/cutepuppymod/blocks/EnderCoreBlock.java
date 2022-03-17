package net.manmaed.cutepuppymod.blocks;


import net.minecraft.world.level.block.Block;

/**
 * Created by manmaed on 05/01/2020.
 */
public class EnderCoreBlock extends Block {
    public EnderCoreBlock(Properties properties) {
        super(properties);
    }

    //TODO: FIX
   /* @Override
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
                *//*                world.addEntity(new LightningBoltEntity(EntityType.LIGHTNING_BOLT, world));*//*
                world.addEntity(bossPuppy);
                for (ServerPlayerEntity serverPlayer : world.getEntitiesWithinAABB(ServerPlayerEntity.class, bossPuppy.getBoundingBox())) {
                    CriteriaTriggers.SUMMONED_ENTITY.trigger(serverPlayer, bossPuppy);
                }
                return ActionResultType.SUCCESS;
            }
        }
        return ActionResultType.FAIL;
    }*/
}
