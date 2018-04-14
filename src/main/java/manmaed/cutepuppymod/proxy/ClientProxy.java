package manmaed.cutepuppymod.proxy;

import manmaed.cutepuppymod.client.render.entity.*;
import manmaed.cutepuppymod.client.render.model.ModelPuppyHolder;
import manmaed.cutepuppymod.client.render.peoples.RenderDemLayers;
import manmaed.cutepuppymod.entity.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ClientProxy extends CommonProxy {

    public void renderInformation() {

		//Color Puppys
    	RenderingRegistry.registerEntityRenderingHandler(EntityPuppy.class, RenderPuppy.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityRedPuppy.class, RenderRedPuppy.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityYellowPuppy.class,  RenderYellowPuppy.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityBluePuppy.class,  RenderBluePuppy.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityPurplePuppy.class,  RenderPurplePuppy.FACTORY);

        RenderingRegistry.registerEntityRenderingHandler(EntityEnderPuppy.class,  RenderEnderPuppy.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderBossPuppy.class,  RenderEnderBossPuppy.FACTORY);

		//Custom Pups
		RenderingRegistry.registerEntityRenderingHandler(EntitySixPuppy.class,  RenderSixPuppy.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityStevePuppy.class,  RenderStevePuppy.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityHerobrinePuppy.class,  RenderHerobrinePuppy.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityTheBossPuppy.class, RenderTheBossPuppy.FACTORY);


/*      RenderingRegistry.registerEntityRenderingHandler(EntityWaterHamster.class,  RenderWaterHamster( ModelHamster(0), 0.5f));
        RenderingRegistry.registerEntityRenderingHandler(EntityHellHamster.class,  RenderHellHamster( ModelHamster(0), 0.5f));
        RenderingRegistry.registerEntityRenderingHandler(EntityForestHamster.class,  RenderForestHamster( ModelHamster(0), 0.5f));
        RenderingRegistry.registerEntityRenderingHandler(EntitySnowHamster.class,  RenderSnowHamster( ModelHamster(0), 0.5f));

*/


    }

    @SideOnly(Side.CLIENT)
    public void renderlayers() {
		RenderDemLayers dimlayer = new RenderDemLayers(new ModelPuppyHolder());
		for (RenderPlayer playerRender : Minecraft.getMinecraft().getRenderManager().getSkinMap().values()) {
			playerRender.addLayer(dimlayer);
		}
	}
}
