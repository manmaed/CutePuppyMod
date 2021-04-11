package net.manmaed.cutepuppymod.entitys;

import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CPEntityTypes {

    private static float width = 0.7f;
    private static float height = 0.7f;
    private static String getName(String name) {
        return name + "_puppy";
    }

    /*private RegistryObject<EntityType<Entity>> dolazy(String name, Entity entity ) {
        return ENTITY_TYPES.register(getName(name),
                () -> EntityType.Builder.create(entity:: new, EntityClassification.AMBIENT)
                        .size(width, height)
                        .build(getName(name))
        );
    }*/

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Refs.id);

    /*public static final RegistryObject<EntityType<EntityRed>> PINK = dolazy("red", EntityRed.class);*/

    public static final RegistryObject<EntityType<EntityRed>> RED = ENTITY_TYPES.register(getName("red"),
            () -> EntityType.Builder.create(EntityRed:: new, EntityClassification.AMBIENT)
                    .size(width, height)
                    .build(getName("red"))
    );

    public static final RegistryObject<EntityType<EntityBlue>> BLUE = ENTITY_TYPES.register(getName("blue"),
            () -> EntityType.Builder.create(EntityBlue:: new, EntityClassification.AMBIENT)
                    .size(width, height)
                    .build(getName("blue"))
    );

    public static final RegistryObject<EntityType<EntityGreen>> GREEN = ENTITY_TYPES.register(getName("green"),
            () -> EntityType.Builder.create(EntityGreen:: new, EntityClassification.AMBIENT)
                    .size(width, height)
                    .build(getName("green"))
    );

    public static final RegistryObject<EntityType<EntityYellow>> YELLOW = ENTITY_TYPES.register(getName("yellow"),
            () -> EntityType.Builder.create(EntityYellow:: new, EntityClassification.AMBIENT)
                    .size(width, height)
                    .build(getName("yellow"))
    );

    public static final RegistryObject<EntityType<EntityPurple>> PURPLE = ENTITY_TYPES.register(getName("purple"),
            () -> EntityType.Builder.create(EntityPurple:: new, EntityClassification.AMBIENT)
                    .size(width, height)
                    .build(getName("purple"))
    );

    public static final RegistryObject<EntityType<EntitySteve>> STEVE = ENTITY_TYPES.register(getName("steve"),
            () -> EntityType.Builder.create(EntitySteve:: new, EntityClassification.AMBIENT)
                    .size(width, height)
                    .build(getName("steve"))
    );

    public static final RegistryObject<EntityType<EntityHerobrine>> HEROBRINE = ENTITY_TYPES.register(getName("herobrine"),
            () -> EntityType.Builder.create(EntityHerobrine:: new, EntityClassification.AMBIENT)
                    .size(width, height)
                    .build(getName("herobrine"))
    );

    public static final RegistryObject<EntityType<EntityEnder>> ENDER = ENTITY_TYPES.register(getName("ender"),
            () -> EntityType.Builder.create(EntityEnder:: new, EntityClassification.MONSTER)
                    .size(width, height)
                    .build(getName("ender"))
    );

    public static final RegistryObject<EntityType<EntityBoss>> BOSS = ENTITY_TYPES.register(getName("boss"),
            () -> EntityType.Builder.create(EntityBoss:: new, EntityClassification.MONSTER)
                    .size(width, height)
                    .build(getName("boss"))
    );

    public static final RegistryObject<EntityType<EntitySix>> SIX = ENTITY_TYPES.register(getName("six"),
            () -> EntityType.Builder.create(EntitySix:: new, EntityClassification.AMBIENT)
                    .size(width, height)
                    .build(getName("six"))
    );

    /*
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Refs.id);

    //Entity Types
    @ObjectHolder(Refs.Register + "petrock")
    public static EntityType<EntityPetRock> PETROCK;

    public static final RegistryObject<EntityType<EntityPetRock>> PETROCK = ENTITY_TYPES.register("petrock",
            () -> EntityType.Builder.create(EntityPetRock:: new, EntityClassification.MISC)
                    .size(width, height)
                    .build("petrock")
    );
     */
}
