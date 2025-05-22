package net.manmaed.cutepuppymod;


import net.manmaed.cutepuppymod.client.model.CPModels;
import net.manmaed.cutepuppymod.client.render.entity.*;
import net.manmaed.cutepuppymod.client.render.model.ModelBanHammerSix;
import net.manmaed.cutepuppymod.client.render.model.ModelPuppy;
import net.manmaed.cutepuppymod.entitys.CPEntityTypes;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * Created by manmaed on 10/04/2021.
 */
public class CutePuppyModClient {

    public static boolean iChunHatsLoaded;

    public static void doEntityRendering(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(CPEntityTypes.RED.get(), RenderRed::new);
        event.registerEntityRenderer(CPEntityTypes.BLUE.get(), RenderBlue::new);
        event.registerEntityRenderer(CPEntityTypes.GREEN.get(), RenderGreen::new);
        event.registerEntityRenderer(CPEntityTypes.YELLOW.get(), RenderYellow::new);
        event.registerEntityRenderer(CPEntityTypes.PURPLE.get(), RenderPurple::new);
        event.registerEntityRenderer(CPEntityTypes.STEVE.get(), RenderSteve::new);
        event.registerEntityRenderer(CPEntityTypes.HEROBRINE.get(), RenderHerobrine::new);
        event.registerEntityRenderer(CPEntityTypes.ENDER.get(), RenderEnder::new);
        event.registerEntityRenderer(CPEntityTypes.BOSS.get(), RenderBoss::new);
        event.registerEntityRenderer(CPEntityTypes.SIX.get(), RenderSix::new);
        event.registerEntityRenderer(CPEntityTypes.ENDER_BOSS.get(), RenderEnderBoss::new);
    }

    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(CPModels.RED, ModelPuppy::createBodyLayer);
        event.registerLayerDefinition(CPModels.BLUE, ModelPuppy::createBodyLayer);
        event.registerLayerDefinition(CPModels.GREEN, ModelPuppy::createBodyLayer);
        event.registerLayerDefinition(CPModels.YELLOW, ModelPuppy::createBodyLayer);
        event.registerLayerDefinition(CPModels.PURPLE, ModelPuppy::createBodyLayer);
        event.registerLayerDefinition(CPModels.STEVE, ModelPuppy::createBodyLayer);
        event.registerLayerDefinition(CPModels.HEROBRINE, ModelPuppy::createBodyLayer);
        event.registerLayerDefinition(CPModels.ENDER, ModelPuppy::createBodyLayer);
        event.registerLayerDefinition(CPModels.BOSS, ModelPuppy::createBodyLayer);
        event.registerLayerDefinition(CPModels.SIX, ModelPuppy::createBodyLayer);
        event.registerLayerDefinition(CPModels.ENDERBOSS, ModelPuppy::createBodyLayer);
        event.registerLayerDefinition(CPModels.BANHAMMER, ModelBanHammerSix::createBodyLayer);
    }

    public static void doClientStuff(final FMLClientSetupEvent event) {
        iChunHatsLoaded = ModList.get().isLoaded("hats");
        if (!iChunHatsLoaded) {
            /*new Thread(PSHats::load).start();*/
        }
    }
}
