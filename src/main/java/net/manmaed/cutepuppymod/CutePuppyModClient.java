package net.manmaed.cutepuppymod;

import net.manmaed.cutepuppymod.client.model.CutePuppyModels;
import net.manmaed.cutepuppymod.client.render.entity.*;
import net.manmaed.cutepuppymod.client.render.model.ModelBanHammerSix;
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
        event.registerLayerDefinition(CutePuppyModels.SIX, ModelPuppy::createBodyLayer);
        event.registerLayerDefinition(CutePuppyModels.BANHAMMER, ModelBanHammerSix::createBodyLayer);
        event.registerLayerDefinition(CutePuppyModels.ENDER_BOSS, ModelPuppy::createBodyLayer);
        event.registerLayerDefinition(CutePuppyModels.BOSS, ModelPuppy::createBodyLayer);
    }

    public static void doEntityRendering(final  EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(CutePuppyEntityTypes.PUPPY.get(), RenderPuppy::new);
        event.registerEntityRenderer(CutePuppyEntityTypes.HEROBRINE.get(), RenderHerobrine::new);
        event.registerEntityRenderer(CutePuppyEntityTypes.HUMAN_PUPPY.get(), RenderHumanPuppy::new);
        event.registerEntityRenderer(CutePuppyEntityTypes.ENDER.get(), RenderEnderPuppy::new);
        event.registerEntityRenderer(CutePuppyEntityTypes.SIX.get(), RenderSix::new);
        event.registerEntityRenderer(CutePuppyEntityTypes.ENDER_BOSS.get(), RenderEnderBoss::new);
        event.registerEntityRenderer(CutePuppyEntityTypes.BOSS.get(), RenderBoss::new);
    }
}
