package net.manmaed.cutepuppymod.entitys;

import net.manmaed.cutepuppymod.items.CPItems;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.ForgeEventFactory;

import javax.annotation.Nullable;
import java.util.UUID;

/**
 * Created by manmaed on 10/04/2021.
 */
public class EntityGreen extends TameableEntity {

    protected EntityGreen(EntityType<? extends TameableEntity> type, World worldIn) {
        super(type, worldIn);
        this.setTamed(false);
    }

    protected void registerGoals() {
        //Goal Selectors
        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(2, new SitGoal(this));
        this.goalSelector.addGoal(3, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));
        this.goalSelector.addGoal(4, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        //Target Selectors
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this).setCallsForHelp());
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 2.5D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.2F);
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.ENTITY_WOLF_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_WOLF_DEATH;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        if (this.rand.nextInt(3) == 0) {
            return this.isTamed() && this.getHealth() < (float) 5.0D ? SoundEvents.ENTITY_WOLF_WHINE : SoundEvents.ENTITY_WOLF_PANT;
        } else {
            return SoundEvents.ENTITY_WOLF_AMBIENT;
        }
    }


    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume() {
        return 0.4F;
    }

    @Override
    public void setTamed(boolean tamed) {
        super.setTamed(tamed);
        if (tamed) {
            this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(5.0D);
            this.setHealth((float) 5.0D);
        } else {
            this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(2.5D);
        }
    }

    @Override
    public ActionResultType func_230254_b_(PlayerEntity playerEntity, Hand hand) {
        ItemStack itemStack = playerEntity.getHeldItem(hand);
        Item item = itemStack.getItem();
        if (this.world.isRemote) {
            boolean flag = this.isOwner(playerEntity) || this.isTamed() || item == Items.BONE && !this.isTamed();
            return flag ? ActionResultType.CONSUME : ActionResultType.PASS;
        } else {
            if (this.isTamed()) {
                if (item == CPItems.doggokibble && this.getHealth() < this.getMaxHealth()) {
                    if (!playerEntity.abilities.isCreativeMode) {
                        itemStack.shrink(1);
                    }
                    this.heal(3.0F);
                    return ActionResultType.SUCCESS;
                }
                if (!(item instanceof DyeItem)) {
                    ActionResultType actionresulttype = super.func_230254_b_(playerEntity, hand);
                    if ((!actionresulttype.isSuccessOrConsume() || this.isChild()) && this.isOwner(playerEntity)) {
                        this.func_233687_w_(!this.isSitting());
                        this.isJumping = false;
                        this.navigator.clearPath();
                        return ActionResultType.SUCCESS;
                    }

                    return actionresulttype;
                }
            } else if (item == Items.BONE) {
                if (!playerEntity.abilities.isCreativeMode) {
                    itemStack.shrink(1);
                }
                if (this.rand.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame(this, playerEntity)) {
                    this.setTamedBy(playerEntity);
                    this.navigator.clearPath();
                    this.func_233687_w_(true);
                    this.world.setEntityState(this, (byte)7);
                } else {
                    this.world.setEntityState(this, (byte)6);
                }
                return ActionResultType.SUCCESS;
            }
            return super.func_230254_b_(playerEntity, hand);
        }
    }

    @Nullable
    @Override
    public AgeableEntity func_241840_a(ServerWorld world, AgeableEntity entity) {
        EntityGreen red = new EntityGreen(CPEntityTypes.GREEN.get(), world);
        UUID uuid = this.getOwnerId();
        if (uuid != null) {
            red.setOwnerId(uuid);
            red.setTamed(true);
        }
        return red;
    }
}
