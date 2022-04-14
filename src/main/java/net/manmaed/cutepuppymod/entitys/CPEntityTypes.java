package net.manmaed.cutepuppymod.entitys;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.RegistryObject;

public class CPEntityTypes {

    private static float width = 0.7f;
    private static float height = 0.7f;
    private static String getName(String name) {
        return name + "_puppy";
    }

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, CutePuppyMod.MOD_ID);

    public static final RegistryObject<EntityType<EntityRed>> RED = ENTITY_TYPES.register(getName("red"),
            () -> EntityType.Builder.of(EntityRed:: new, MobCategory.CREATURE)
                    .sized(width, height)
                    .build(getName("red"))
    );

    public static final RegistryObject<EntityType<EntityBlue>> BLUE = ENTITY_TYPES.register(getName("blue"),
            () -> EntityType.Builder.of(EntityBlue:: new, MobCategory.CREATURE)
                    .sized(width, height)
                    .build(getName("blue"))
    );

    public static final RegistryObject<EntityType<EntityGreen>> GREEN = ENTITY_TYPES.register(getName("green"),
            () -> EntityType.Builder.of(EntityGreen:: new, MobCategory.CREATURE)
                    .sized(width, height)
                    .build(getName("green"))
    );

    public static final RegistryObject<EntityType<EntityYellow>> YELLOW = ENTITY_TYPES.register(getName("yellow"),
            () -> EntityType.Builder.of(EntityYellow:: new, MobCategory.CREATURE)
                    .sized(width, height)
                    .build(getName("yellow"))
    );

    public static final RegistryObject<EntityType<EntityPurple>> PURPLE = ENTITY_TYPES.register(getName("purple"),
            () -> EntityType.Builder.of(EntityPurple:: new, MobCategory.CREATURE)
                    .sized(width, height)
                    .build(getName("purple"))
    );

    public static final RegistryObject<EntityType<EntitySteve>> STEVE = ENTITY_TYPES.register(getName("steve"),
            () -> EntityType.Builder.of(EntitySteve:: new, MobCategory.CREATURE)
                    .sized(width, height)
                    .build(getName("steve"))
    );

    public static final RegistryObject<EntityType<EntityHerobrine>> HEROBRINE = ENTITY_TYPES.register(getName("herobrine"),
            () -> EntityType.Builder.of(EntityHerobrine:: new, MobCategory.CREATURE)
                    .sized(width, height)
                    .build(getName("herobrine"))
    );

    public static final RegistryObject<EntityType<EntityEnder>> ENDER = ENTITY_TYPES.register(getName("ender"),
            () -> EntityType.Builder.of(EntityEnder:: new, MobCategory.MONSTER)
                    .sized(width, height)
                    .build(getName("ender"))
    );
    /*public static final RegistryObject<EntityType<EntityBoss>> BOSS = ENTITY_TYPES.register(getName("boss"),
            () -> EntityType.Builder.of(EntityBoss:: new, MobCategory.MONSTER)
                    .sized(6.7F, 6.7F)
                    .build(getName("boss"))
    );

    public static final RegistryObject<EntityType<EntitySix>> SIX = ENTITY_TYPES.register(getName("six"),
            () -> EntityType.Builder.of(EntitySix:: new, MobCategory.CREATURE)
                    .sized(width, height)
                    .build(getName("six"))
    );*/

    public static final RegistryObject<EntityType<EntityEnderBoss>> ENDER_BOSS = ENTITY_TYPES.register(getName("ender_boss"),
            () -> EntityType.Builder.of(EntityEnderBoss:: new, MobCategory.MONSTER)
                    .sized(1.7F, 1.7F)
                    .build(getName("ender_boss"))
    );
}
