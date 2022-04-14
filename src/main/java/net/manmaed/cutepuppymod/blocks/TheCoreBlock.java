package net.manmaed.cutepuppymod.blocks;


import net.manmaed.cutepuppymod.entitys.CPEntityTypes;
import net.manmaed.cutepuppymod.entitys.EntityBoss;
import net.manmaed.cutepuppymod.items.CPItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Created by manmaed on 05/01/2020.
 */
public class TheCoreBlock extends Block {
    public TheCoreBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (!level.isClientSide) {
            ItemStack itemStack = player.getItemInHand(hand);
            if (itemStack.is(CPItems.SYRINGE_FULL.get())) {
                itemStack.shrink(1);
                level.setBlockAndUpdate(blockPos, Blocks.AIR.defaultBlockState());
                EntityBoss boss = new EntityBoss(CPEntityTypes.BOSS.get(), level);
                LightningBolt boltEntity = new LightningBolt(EntityType.LIGHTNING_BOLT, level);
                boltEntity.setVisualOnly(true);
                boltEntity.moveTo(blockPos, 10, 10);
                boss.moveTo(blockPos, 10, 10);
                level.addFreshEntity(boltEntity);
                level.addFreshEntity(boss);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.FAIL;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable BlockGetter getter, List<Component> list, TooltipFlag flag) {
        list.add(new TranslatableComponent("block.cutepuppymod.core_block.tooltip"));
    }
}
