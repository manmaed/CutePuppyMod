package net.manmaed.cutepuppymod.blocks;


import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

/**
 * Created by manmaed on 05/01/2020.
 */
public class TheCoreBlock extends Block {
    public TheCoreBlock(Properties properties) {
        super(properties);
    }

    //TODO: FIX
    /*@Override
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

    /*@Override
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
         tooltip.add(new TranslationTextComponent("block.cutepuppymod.coreblock.tooltip"));
    }*/
}
