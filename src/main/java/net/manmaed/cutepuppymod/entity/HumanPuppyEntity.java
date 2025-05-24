package net.manmaed.cutepuppymod.entity;

import net.manmaed.cutepuppymod.item.CutePuppyItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.Random;
import java.util.UUID;

public class HumanPuppyEntity extends TamableAnimal {

    private static final EntityDataAccessor<Integer> VARIANT_ID = SynchedEntityData.defineId(HumanPuppyEntity.class, EntityDataSerializers.INT);

    protected HumanPuppyEntity(EntityType<? extends TamableAnimal> entityType, Level level) {
        super(entityType, level);
        this.setTame(false, false);
        Random rand = new Random();
        setVariant(rand.nextInt(1));
    }

    protected void registerGoals() {
        //Goal Selectors
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new SitWhenOrderedToGoal(this));
        this.goalSelector.addGoal(3, new LeapAtTargetGoal(this, 0.4F));
        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0, true));
        this.goalSelector.addGoal(5, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F));
        this.goalSelector.addGoal(6, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        //Target Selectors
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setAlertOthers());
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder synceddata) {
        super.defineSynchedData(synceddata);
        //synceddata.define(VARIANT_ID, random.nextInt(1)); //Randomly set the Puppy variant
        synceddata.define(VARIANT_ID, 0);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        compoundTag.putInt("puppy_variant", this.getVariant());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        if (compoundTag.contains("puppy_variant")) {
            this.setVariant(compoundTag.getInt("puppy_variant"));
        }
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 2.5D)
                .add(Attributes.MOVEMENT_SPEED, 0.2D);
    }

    @Override
    protected @Nullable SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.WOLF_HURT;
    }

    @Override
    protected @Nullable SoundEvent getDeathSound() {
        return SoundEvents.WOLF_DEATH;
    }

    @Override
    protected @Nullable SoundEvent getAmbientSound() {
        if (this.random.nextInt(3) == 0) {
            return this.isOrderedToSit() && this.getHealth() < (float) 5.0D ? SoundEvents.WOLF_WHINE : SoundEvents.WOLF_PANT;
        } else {
            return SoundEvents.WOLF_AMBIENT;
        }
    }

    @Override
    protected float getSoundVolume() {
        return 0.4F;
    }


    @Override
    public boolean isFood(ItemStack itemStack) {
        return itemStack == Items.BONE.getDefaultInstance();
    }

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        Item item = itemStack.getItem();
        Level level = this.level();
        if (level.isClientSide) {
            boolean flag = this.isOwnedBy(player) || this.isTame() || item == Items.BONE && !this.isTame();
            return flag ? InteractionResult.CONSUME : InteractionResult.PASS;
        } else {
            if (this.isTame()) {
                if (item == CutePuppyItems.DOGGO_KIBBLE.get() && this.getHealth() < this.getMaxHealth()) {
                    if (!player.getAbilities().instabuild) {
                        itemStack.shrink(1);
                    }
                    this.heal(3.0F);
                    return InteractionResult.SUCCESS;
                }
                if (!(item instanceof DyeItem)) {
                    InteractionResult interactionresult = super.mobInteract(player, hand);
                    if ((!interactionresult.consumesAction() || this.isBaby()) && this.isOwnedBy(player)) {
                        //LogHelper.warn("before setting sit " + this.isOrderedToSit());
                        this.setOrderedToSit(!this.isOrderedToSit());
                        //LogHelper.warn("after setting sit " + this.isOrderedToSit());
                        this.jumping = false;
                        this.navigation.stop();
                        return InteractionResult.SUCCESS;
                    }

                    return interactionresult;
                }
            } else if (item == Items.BONE) {
                if (!player.getAbilities().instabuild) {
                    itemStack.shrink(1);
                }
                if (this.random.nextInt(3) == 0) {
                    this.tame(player);
                    this.navigation.stop();
                    this.setOrderedToSit(true);
                    level.broadcastEntityEvent(this, (byte) 7);
                    //TOTEM_USE maybe
                    //playSound(PSSounds.SLOW_TAME.get(), getSoundVolume(), 1F);
                } else {
                    level.broadcastEntityEvent(this, (byte) 6);
                }
                //playSound(SoundEvents.GENERIC_DRINK, getSoundVolume(), 1F);
                return InteractionResult.SUCCESS;
            }
            return super.mobInteract(player, hand);
        }
    }

    @Override
    public void setTame(boolean p_21836_, boolean p_326134_) {
        super.setTame(p_21836_, p_326134_);
        if (p_21836_) {
            this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(5.0D);
            this.setHealth((float) 5.0D);
        } else {
            this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(2.5D);
        }
    }


    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        HumanPuppyEntity puppy = new HumanPuppyEntity(CutePuppyEntityTypes.HUMAN_PUPPY.get(), serverLevel);
        UUID uuid = this.getOwnerUUID();
        if (uuid != null) {
            puppy.setOwnerUUID(uuid);
            puppy.setTame(true, true);
            puppy.setVariant(random.nextInt(1));
        }
        return puppy;
    }

    public void setVariant(Integer variant) {
        this.entityData.set(VARIANT_ID, variant);
    }

    public Integer getVariant() {
        return this.entityData.get(VARIANT_ID);
    }

    public String getVariantName(){
        int type = this.getVariant();
        String name;
        switch (type) {
            case 1:
                name = "alex";
                break;
            default:
                name = "steve";
                break;
        }
        return name;
    }
}
