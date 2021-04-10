package net.manmaed.cutepuppymod.entitys;

import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;

/**
 * Created by manmaed on 10/04/2021.
 */
public class CPEntity {

    public static void load() {
        GlobalEntityTypeAttributes.put(CPEntityTypes.RED.get(), EntityRed.setCustomAttributes().create());
    }
}
