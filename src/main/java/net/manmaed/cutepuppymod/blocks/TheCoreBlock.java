package net.manmaed.cutepuppymod.blocks;


import net.manmaed.cutepuppymod.items.CPItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

/**
 * Created by manmaed on 05/01/2020.
 */
public class TheCoreBlock extends Block {
    public TheCoreBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!world.isClientSide) {
            ItemStack itemStack = player.getItemInHand(hand);
            if (itemStack.getItem() == CPItems.FULL_SYRINGE.get()) {
                itemStack.shrink(1);
                /*world.setBlock(pos, Blocks.AIR.defaultBlockState());
                EntityBoss bossPuppy = new EntityBoss(CPEntityTypes.BOSS.get() ,world);
                bossPuppy.setLocationAndAngles(pos.getX(), pos.getY(), pos.getZ(), 10, 10);
                LightningBoltEntity boltEntity = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, world);
                boltEntity.setLocationAndAngles(pos.getX(), pos.getY(), pos.getZ(), 10, 10);
                boltEntity.setEffectOnly(true);
                world.addEntity(boltEntity);
                bossPuppy.setAttackTarget(player);
                //world.addEntity(new LightningBoltEntity(EntityType.LIGHTNING_BOLT, world));
                world.addEntity(bossPuppy);
                for (Entity serverPlayer : world.getEntities(ServerPlayer.class, bossPuppy.getBoundingBox())) {
                    CriteriaTriggers.SUMMONED_ENTITY.trigger(serverPlayer, bossPuppy);
                }*/
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.FAIL;
    }

    /*@Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        tooltip.add(new Tras("block.cutepuppymod.coreblock.tooltip"));
    }*/

}
