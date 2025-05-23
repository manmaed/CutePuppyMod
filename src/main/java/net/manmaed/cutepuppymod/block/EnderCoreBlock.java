package net.manmaed.cutepuppymod.block;


import net.manmaed.cutepuppymod.item.CutePuppyItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.BlockHitResult;

/**
 * Created by manmaed on 05/01/2020.
 */
public class EnderCoreBlock extends Block {
    public EnderCoreBlock() {
        super(Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(3.0F, 5.0F).requiresCorrectToolForDrops());
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack itemStack, BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand hand, BlockHitResult blockHitResult) {
        if (!level.isClientSide) {
            if (itemStack.is(CutePuppyItems.ENDER_CORE.get())) {
                itemStack.shrink(1);
                level.setBlockAndUpdate(blockPos, Blocks.AIR.defaultBlockState());
                //EntityEnderBoss boss = new EntityEnderBoss(CPEntityTypes.ENDER_BOSS.get(), level);
                LightningBolt boltEntity = new LightningBolt(EntityType.LIGHTNING_BOLT, level);
                boltEntity.setVisualOnly(true);
                boltEntity.moveTo(blockPos, 10, 10);
                //boss.moveTo(blockPos, 10, 10);
                level.addFreshEntity(boltEntity);
                //level.addFreshEntity(boss);
                return ItemInteractionResult.SUCCESS;
            }
        }
        return ItemInteractionResult.FAIL;
    }
}
