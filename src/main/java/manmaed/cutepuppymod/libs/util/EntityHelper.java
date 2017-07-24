package manmaed.cutepuppymod.libs.util;

import manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityHelper {
/*	public static void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColor, int fgEggColor) {
        int id = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
        EntityList.entityEggs.put(Integer.valueOf(id), new EntityList.EntityEggInfo(id, bkEggColor, fgEggColor));

     }
*/
public static void registerEntity(ResourceLocation texture, Class<? extends Entity> entityClass, String entityName, int id, int eggPrimary, int eggSecondary) {

    EntityRegistry.registerModEntity(texture, entityClass, entityName, id, CutePuppyMod.instance, 64, 3, true, eggPrimary, eggSecondary);
    //LogHelper.info("README: " + entityClass + " " + entityName + " " + id);

 }
}
