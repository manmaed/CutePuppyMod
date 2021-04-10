package net.manmaed.cutepuppymod;

import net.manmaed.cutepuppymod.client.render.entity.RenderRed;
import net.manmaed.cutepuppymod.entitys.CPEntityTypes;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * Created by manmaed on 10/04/2021.
 */
public class CutePuppyModClient {

    public static void doClientStuff(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(CPEntityTypes.RED.get(), RenderRed::new);
    }
}
