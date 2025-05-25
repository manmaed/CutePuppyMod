package net.manmaed.cutepuppymod;

import net.manmaed.cutepuppymod.client.model.CutePuppyModels;
import net.manmaed.cutepuppymod.client.render.entity.RenderEnderPuppy;
import net.manmaed.cutepuppymod.client.render.entity.RenderHerobrine;
import net.manmaed.cutepuppymod.client.render.entity.RenderHumanPuppy;
import net.manmaed.cutepuppymod.client.render.entity.RenderPuppy;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entity.CutePuppyEntityTypes;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

/**
 * Created by manmaed on 10/04/2021.
 */
public class CutePuppyModClient {
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(CutePuppyModels.PUPPY, ModelPuppy::createBodyLayer);
        event.registerLayerDefinition(CutePuppyModels.HEROBRINE, ModelPuppy::createBodyLayer);
        event.registerLayerDefinition(CutePuppyModels.HUMAN, ModelPuppy::createBodyLayer);
        event.registerLayerDefinition(CutePuppyModels.ENDER, ModelPuppy::createBodyLayer);
    }

    public static void doEntityRendering(final  EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(CutePuppyEntityTypes.PUPPY.get(), RenderPuppy::new);
        event.registerEntityRenderer(CutePuppyEntityTypes.HEROBRINE.get(), RenderHerobrine::new);
        event.registerEntityRenderer(CutePuppyEntityTypes.HUMAN_PUPPY.get(), RenderHumanPuppy::new);
        event.registerEntityRenderer(CutePuppyEntityTypes.ENDER.get(), RenderEnderPuppy::new);
    }
}
