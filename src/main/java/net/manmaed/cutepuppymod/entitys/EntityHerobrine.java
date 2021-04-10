package net.manmaed.cutepuppymod.entitys;

import net.manmaed.cutepuppymod.items.CPItems;
import net.manmaed.cutepuppymod.items.CPPuppyDrops;
import net.manmaed.cutepuppymod.items.spawn_eggs.HerobrineEgg;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.AbstractSkeletonEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.monster.GhastEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.entity.passive.horse.LlamaEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.ForgeEventFactory;

import javax.annotation.Nullable;
import java.util.UUID;
import java.util.function.Predicate;

/**
 * Created by manmaed on 10/04/2021.
 */
public class EntityHerobrine extends TameableEntity implements IAngerable {

    private static final DataParameter<Integer> angerTime = EntityDataManager.createKey(EntityHerobrine.class, DataSerializers.VARINT);
    public static final Predicate<LivingEntity> TARGET_ENTITIES = (entity) -> {
        EntityType<?> entitytype = entity.getType();
        return entitytype == CPEntityTypes.STEVE.get();
    };
    private static final RangedInteger angerRange = TickRangeConverter.convertRange(20, 39);
    private UUID target_uuid;

    protected EntityHerobrine(EntityType<? extends EntityHerobrine> type, World worldIn) {
        super(type, worldIn);
        this.setTamed(false);
    }

    protected void registerGoals() {
        //Goal Selectors
        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(2, new SitGoal(this));
        this.goalSelector.addGoal(3, new LeapAtTargetGoal(this, 0.4F));
        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0D, true));
        this.goalSelector.addGoal(5, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));
        this.goalSelector.addGoal(6, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(8, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(9, new LookRandomlyGoal(this));
        //Target Selectors
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setCallsForHelp());
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, 10, true, false, this::func_233680_b_));
        this.targetSelector.addGoal(5, new NonTamedTargetGoal<>(this, AnimalEntity.class, false, TARGET_ENTITIES));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal<>(this, AbstractSkeletonEntity.class, false));
        this.targetSelector.addGoal(7, new ResetAngerGoal<>(this, true));
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 2.5D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.2F)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 5.0D);
    }

    protected void registerData() {
        super.registerData();
        this.dataManager.register(angerTime, 0);
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
        if (this.func_233678_J__()) {
            return SoundEvents.ENTITY_WOLF_GROWL;
        } else if (this.rand.nextInt(3) == 0) {
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

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource source, float amount) {
        if (this.isInvulnerableTo(source)) {
            return false;
        } else {
            Entity entity = source.getTrueSource();
            this.func_233687_w_(false);
            if (entity != null && !(entity instanceof PlayerEntity) && !(entity instanceof AbstractArrowEntity)) {
                amount = (amount + 1.0F) / 2.0F;
            }

            return super.attackEntityFrom(source, amount);
        }
    }

    public boolean attackEntityAsMob(Entity entityIn) {
        boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float)((int)this.getAttributeValue(Attributes.ATTACK_DAMAGE)));
        if (flag) {
            this.applyEnchantments(this, entityIn);
        }

        return flag;
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

        this.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(5.0D);
    }

    @Override
    public ActionResultType func_230254_b_(PlayerEntity playerEntity, Hand hand) {
        ItemStack itemStack = playerEntity.getHeldItem(hand);
        Item item = itemStack.getItem();
        if (this.world.isRemote) {
            boolean flag = this.isOwner(playerEntity) || this.isTamed() || item == CPPuppyDrops.stevecore && !this.isTamed() && this.func_233678_J__();
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
            } else if (item == CPPuppyDrops.stevecore && !this.func_233678_J__()) {
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

    public boolean shouldAttackEntity(LivingEntity target, LivingEntity owner) {
        if (!(target instanceof CreeperEntity) && !(target instanceof GhastEntity)) {
            if (target instanceof EntityHerobrine) {
                EntityHerobrine herobrine = (EntityHerobrine)target;
                return !herobrine.isTamed() || herobrine.getOwner() != owner;
            } else if (target instanceof PlayerEntity && owner instanceof PlayerEntity && !((PlayerEntity)owner).canAttackPlayer((PlayerEntity)target)) {
                return false;
            } else if (target instanceof AbstractHorseEntity && ((AbstractHorseEntity)target).isTame()) {
                return false;
            } else {
                return !(target instanceof TameableEntity) || !((TameableEntity)target).isTamed();
            }
        } else {
            return false;
        }
    }

    public boolean canBeLeashedTo(PlayerEntity player) {
        return !this.func_233678_J__() && super.canBeLeashedTo(player);
    }

    @Nullable
    @Override
    public AgeableEntity func_241840_a(ServerWorld world, AgeableEntity entity) {
        EntityHerobrine red = new EntityHerobrine(CPEntityTypes.HEROBRINE.get(), world);
        UUID uuid = this.getOwnerId();
        if (uuid != null) {
            red.setOwnerId(uuid);
            red.setTamed(true);
        }
        return red;
    }

    @Override
    public int getAngerTime() {
        return this.dataManager.get(angerTime);
    }

    @Override
    public void setAngerTime(int time) {
        this.dataManager.set(angerTime, time);
    }

    @Nullable
    @Override
    public UUID getAngerTarget() {
        return this.target_uuid;
    }

    @Override
    public void setAngerTarget(@Nullable UUID target) {
        this.target_uuid = target;
    }

    @Override
    public void func_230258_H__() {
        this.setAngerTime(angerRange.getRandomWithinRange(this.rand));
    }
}
