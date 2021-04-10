package net.manmaed.cutepuppymod.entitys;

import net.manmaed.cutepuppymod.client.render.entity.*;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

/**
 * Created by manmaed on 10/04/2021.
 */
public class CPEntity {

    public static void load() {
        GlobalEntityTypeAttributes.put(CPEntityTypes.RED.get(), EntityRed.setCustomAttributes().create());
        GlobalEntityTypeAttributes.put(CPEntityTypes.BLUE.get(), EntityRed.setCustomAttributes().create());
        GlobalEntityTypeAttributes.put(CPEntityTypes.GREEN.get(), EntityRed.setCustomAttributes().create());
        GlobalEntityTypeAttributes.put(CPEntityTypes.YELLOW.get(), EntityRed.setCustomAttributes().create());
        GlobalEntityTypeAttributes.put(CPEntityTypes.PURPLE.get(), EntityRed.setCustomAttributes().create());
        GlobalEntityTypeAttributes.put(CPEntityTypes.STEVE.get(), EntitySteve.setCustomAttributes().create());
        GlobalEntityTypeAttributes.put(CPEntityTypes.HEROBRINE.get(), EntityHerobrine.setCustomAttributes().create());

    }

    public static void clientload() {
        RenderingRegistry.registerEntityRenderingHandler(CPEntityTypes.RED.get(), RenderRed::new);
        RenderingRegistry.registerEntityRenderingHandler(CPEntityTypes.BLUE.get(), RenderBlue::new);
        RenderingRegistry.registerEntityRenderingHandler(CPEntityTypes.GREEN.get(), RenderGreen::new);
        RenderingRegistry.registerEntityRenderingHandler(CPEntityTypes.YELLOW.get(), RenderYellow::new);
        RenderingRegistry.registerEntityRenderingHandler(CPEntityTypes.PURPLE.get(), RenderPurple::new);
        RenderingRegistry.registerEntityRenderingHandler(CPEntityTypes.STEVE.get(), RenderSteve::new);
        RenderingRegistry.registerEntityRenderingHandler(CPEntityTypes.HEROBRINE.get(), RenderHerobrine::new);


    }
}
