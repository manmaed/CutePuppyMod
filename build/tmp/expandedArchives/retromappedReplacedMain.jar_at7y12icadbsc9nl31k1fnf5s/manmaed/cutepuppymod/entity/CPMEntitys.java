package manmaed.cutepuppymod.entity;

import manmaed.cutepuppymod.libs.util.EntityHelper;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraftforge.fml.common.registry.EntityRegistry;


public class CPMEntitys
{
	public static void Load()
	{

		/**
		 *  1st Color - Back
		 *  2nd Color - Dots
		 */

		int id = 1;
		//Colored
		EntityHelper.registerEntity(EntityPuppy.class, "GreenPuppy", id++, 0x3cff00, 0x3cff00);
		EntityHelper.registerEntity(EntityRedPuppy.class, "RedPuppy", id++, 0xffb2b2, 0xf80000);
		EntityHelper.registerEntity(EntityBluePuppy.class, "BluePuppy", id++, 0x00ffff, 0x3cafaf);
		EntityHelper.registerEntity(EntityPurplePuppy.class, "PurplePuppy", id++, 0x713cfb, 0x4600ff);
		EntityHelper.registerEntity(EntityYellowPuppy.class, "YellowPuppy", id++, 0xfcff00, 0x000000);
		//Custom
		//EntityHelper.registerEntity(EntityHazardPuppy.class, "HazardPuppy");
		EntityHelper.registerEntity(EntitySixPuppy.class, "SixPuppy", id++, 0x935a33, 0x633b22);
		EntityHelper.registerEntity(EntityStevePuppy.class, "StevePuppy", id++, 0x004192, 0x220092);
		EntityHelper.registerEntity(EntityHerobrinePuppy.class, "HerobrinePuppy", id++, 0xFFFFFF, 0xd4d4d4);
        EntityHelper.registerEntity(EntityEnderPuppy.class, "EnderPuppy", id++, 0x151515, 0x000000);

		/**
		 * Add a spawn entry for the supplied entity in the supplied {@link Biomes} list
		 * @param entityClass Entity class added
		 * @param weightedProb Probability
		 * @param min Min spawn count
		 * @param max Max spawn count
		 * @param typeOfCreature Type of spawn
		 * @param biomes List of biomes
		 */

		EntityRegistry.addSpawn(EntityBluePuppy.class, 10, 1, 2, EnumCreatureType.CREATURE,  Biomes.field_76772_c, Biomes.field_76781_i, Biomes.field_76768_g, Biomes.field_150583_P, Biomes.field_150582_Q, Biomes.field_76780_h);
        EntityRegistry.addSpawn(EntityRedPuppy.class, 10, 1, 2, EnumCreatureType.CREATURE, Biomes.field_76778_j);
        EntityRegistry.addSpawn(EntityPuppy.class, 10, 1, 2, EnumCreatureType.CREATURE, Biomes.field_76772_c, Biomes.field_76781_i, Biomes.field_76768_g, Biomes.field_150583_P, Biomes.field_150582_Q, Biomes.field_76780_h);
        EntityRegistry.addSpawn(EntityYellowPuppy.class, 10, 1, 2, EnumCreatureType.CREATURE, Biomes.field_76769_d, Biomes.field_76786_s, Biomes.field_150588_X, Biomes.field_150587_Y);
        EntityRegistry.addSpawn(EntityPurplePuppy.class, 10, 1, 2, EnumCreatureType.CREATURE, Biomes.field_76772_c, Biomes.field_76781_i, Biomes.field_76768_g, Biomes.field_150583_P, Biomes.field_150582_Q, Biomes.field_76780_h);

		//Custom
		EntityRegistry.addSpawn(EntityStevePuppy.class, 10, 1, 4, EnumCreatureType.CREATURE, Biomes.field_76772_c, Biomes.field_76781_i, Biomes.field_76768_g, Biomes.field_150583_P, Biomes.field_150582_Q, Biomes.field_76780_h);
        EntityRegistry.addSpawn(EntityHerobrinePuppy.class, 3, 1, 1, EnumCreatureType.MONSTER, Biomes.field_76772_c, Biomes.field_76781_i, Biomes.field_76768_g, Biomes.field_150583_P, Biomes.field_150582_Q, Biomes.field_76780_h);
        EntityRegistry.addSpawn(EntitySixPuppy.class, 3, 1, 1, EnumCreatureType.MONSTER, Biomes.field_76772_c, Biomes.field_76781_i, Biomes.field_76768_g, Biomes.field_150583_P, Biomes.field_150582_Q, Biomes.field_76780_h);
        EntityRegistry.addSpawn(EntityEnderPuppy.class, 9, 1, 4, EnumCreatureType.MONSTER, Biomes.field_76772_c, Biomes.field_76781_i, Biomes.field_76768_g, Biomes.field_150583_P, Biomes.field_150582_Q, Biomes.field_76780_h, Biomes.field_76779_k);

		//EntitySpawnPlacementRegistry.setPlacementType(EntityHerobrinePuppy.class, EntityLiving.SpawnPlacementType.ON_GROUND);

	}

}
