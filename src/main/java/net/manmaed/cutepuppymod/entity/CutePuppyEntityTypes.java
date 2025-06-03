package net.manmaed.cutepuppymod.entity;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CutePuppyEntityTypes {

    private static final float width = 0.7f;
    private static final float height = 0.7f;

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, CutePuppyMod.MOD_ID);

    public static final DeferredHolder<EntityType<?>, EntityType<PuppyEntity>> PUPPY = ENTITY_TYPES.register("puppy",
            () -> EntityType.Builder.of(PuppyEntity::new, MobCategory.AMBIENT)
                    .sized(width, height)
                    .build("puppy"));

    public static final DeferredHolder<EntityType<?>, EntityType<HumanPuppyEntity>> HUMAN_PUPPY = ENTITY_TYPES.register("human_puppy",
            () -> EntityType.Builder.of(HumanPuppyEntity::new, MobCategory.AMBIENT)
                    .sized(width, height)
                    .build("human_puppy"));

    public static final DeferredHolder<EntityType<?>, EntityType<HerobrinePuppyEntity>> HEROBRINE = ENTITY_TYPES.register("herobrine_puppy",
            () -> EntityType.Builder.of(HerobrinePuppyEntity::new, MobCategory.CREATURE)
                    .sized(width, height).build("herobrine_puppy"));

    public static final DeferredHolder<EntityType<?>, EntityType<EnderPuppyEntity>> ENDER = ENTITY_TYPES.register("ender_puppy",
            () -> EntityType.Builder.of(EnderPuppyEntity::new, MobCategory.MONSTER)
                    .sized(width, height).build("ender_puppy"));

    public static final DeferredHolder<EntityType<?>, EntityType<SixEntity>> SIX = ENTITY_TYPES.register("six_puppy",
            () -> EntityType.Builder.of(SixEntity::new, MobCategory.MONSTER)
                    .sized(width, height).build("six_puppy"));

    public static final DeferredHolder<EntityType<?>, EntityType<EnderBossEntity>> ENDER_BOSS = ENTITY_TYPES.register("ender_boss_puppy",
            () -> EntityType.Builder.of(EnderBossEntity::new, MobCategory.MONSTER)
                    .sized(1.7F, 1.7F).build("ender_boss_puppy"));

    public static final DeferredHolder<EntityType<?>, EntityType<BossEntity>> BOSS = ENTITY_TYPES.register("boss_puppy",
            () -> EntityType.Builder.of(BossEntity::new, MobCategory.MONSTER)
                    .sized(6.7F, 6.7F).build("boss_puppy"));

    /*
    public static final RegistryObject<EntityType<EntityRed>> RED = ENTITY_TYPES.register(getName("red"), () -> EntityType.Builder.of(EntityRed::new, MobCategory.CREATURE).sized(width, height).build(getName("red")));
    public static final RegistryObject<EntityType<EntityBlue>> BLUE = ENTITY_TYPES.register(getName("blue"), () -> EntityType.Builder.of(EntityBlue::new, MobCategory.CREATURE).sized(width, height).build(getName("blue")));
    public static final RegistryObject<EntityType<EntityGreen>> GREEN = ENTITY_TYPES.register(getName("green"), () -> EntityType.Builder.of(EntityGreen::new, MobCategory.CREATURE).sized(width, height).build(getName("green")));
    public static final RegistryObject<EntityType<EntityYellow>> YELLOW = ENTITY_TYPES.register(getName("yellow"), () -> EntityType.Builder.of(EntityYellow::new, MobCategory.CREATURE).sized(width, height).build(getName("yellow")));
    public static final RegistryObject<EntityType<EntityPurple>> PURPLE = ENTITY_TYPES.register(getName("purple"), () -> EntityType.Builder.of(EntityPurple::new, MobCategory.CREATURE).sized(width, height).build(getName("purple")));
    public static final RegistryObject<EntityType<EntitySteve>> STEVE = ENTITY_TYPES.register(getName("steve"), () -> EntityType.Builder.of(EntitySteve::new, MobCategory.CREATURE).sized(width, height).build(getName("steve")));
    */

    /*
    public static final RegistryObject<EntityType<EntityEnder>> ENDER = ENTITY_TYPES.register(getName("ender"), () -> EntityType.Builder.of(EntityEnder::new, MobCategory.MONSTER).sized(width, height).build(getName("ender")));
    public static final RegistryObject<EntityType<EntityBoss>> BOSS = ENTITY_TYPES.register(getName("boss"), () -> EntityType.Builder.of(EntityBoss::new, MobCategory.MONSTER).sized(6.7F, 6.7F).build(getName("boss")));

    public static final RegistryObject<EntityType<EntitySix>> SIX = ENTITY_TYPES.register(getName("six"), () -> EntityType.Builder.of(EntitySix::new, MobCategory.CREATURE).sized(width, height).build(getName("six")));

    public static final RegistryObject<EntityType<EntityEnderBoss>> ENDER_BOSS = ENTITY_TYPES.register(getName("ender_boss"), () -> EntityType.Builder.of(EntityEnderBoss::new, MobCategory.MONSTER).sized(1.7F, 1.7F).build(getName("ender_boss")));
    */
}
