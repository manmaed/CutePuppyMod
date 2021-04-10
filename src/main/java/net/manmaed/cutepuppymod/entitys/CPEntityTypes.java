package net.manmaed.cutepuppymod.entitys;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import net.manmaed.cutepuppymod.libs.Refs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class CPEntityTypes {

    private static String getName(String name) {
        return name + "_puppy";
    }

    /*private RegistryObject<EntityType<Entity>> dolazy(String name, Entity entity ) {
        return ENTITY_TYPES.register(getName(name),
                () -> EntityType.Builder.create(entity:: new, EntityClassification.AMBIENT)
                        .size(0.5f, 0.5f)
                        .build(getName(name))
        );
    }*/

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Refs.id);

    /*public static final RegistryObject<EntityType<EntityRed>> PINK = dolazy("red", EntityRed.class);*/

    public static final RegistryObject<EntityType<EntityRed>> RED = ENTITY_TYPES.register(getName("red"),
            () -> EntityType.Builder.create(EntityRed:: new, EntityClassification.AMBIENT)
                    .size(0.5f, 0.5f)
                    .build(getName("red"))
    );

    public static final RegistryObject<EntityType<EntityBlue>> BLUE = ENTITY_TYPES.register(getName("blue"),
            () -> EntityType.Builder.create(EntityBlue:: new, EntityClassification.AMBIENT)
                    .size(0.5f, 0.5f)
                    .build(getName("blue"))
    );

    public static final RegistryObject<EntityType<EntityGreen>> GREEN = ENTITY_TYPES.register(getName("green"),
            () -> EntityType.Builder.create(EntityGreen:: new, EntityClassification.AMBIENT)
                    .size(0.5f, 0.5f)
                    .build(getName("green"))
    );

    public static final RegistryObject<EntityType<EntityYellow>> YELLOW = ENTITY_TYPES.register(getName("yellow"),
            () -> EntityType.Builder.create(EntityYellow:: new, EntityClassification.AMBIENT)
                    .size(0.5f, 0.5f)
                    .build(getName("yellow"))
    );

    public static final RegistryObject<EntityType<EntityPurple>> PURPLE = ENTITY_TYPES.register(getName("purple"),
            () -> EntityType.Builder.create(EntityPurple:: new, EntityClassification.AMBIENT)
                    .size(0.5f, 0.5f)
                    .build(getName("purple"))
    );

    public static final RegistryObject<EntityType<EntitySteve>> STEVE = ENTITY_TYPES.register(getName("steve"),
            () -> EntityType.Builder.create(EntitySteve:: new, EntityClassification.AMBIENT)
                    .size(0.5f, 0.5f)
                    .build(getName("steve"))
    );

    public static final RegistryObject<EntityType<EntityHerobrine>> HEROBRINE = ENTITY_TYPES.register(getName("herobrine"),
            () -> EntityType.Builder.create(EntityHerobrine:: new, EntityClassification.AMBIENT)
                    .size(0.5f, 0.5f)
                    .build(getName("herobrine"))
    );

    /*
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Refs.id);

    //Entity Types
    @ObjectHolder(Refs.Register + "petrock")
    public static EntityType<EntityPetRock> PETROCK;

    public static final RegistryObject<EntityType<EntityPetRock>> PETROCK = ENTITY_TYPES.register("petrock",
            () -> EntityType.Builder.create(EntityPetRock:: new, EntityClassification.MISC)
                    .size(0.5f, 0.5f)
                    .build("petrock")
    );
     */
}
