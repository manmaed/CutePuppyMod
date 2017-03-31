package manmaed.cutepuppymod.proxy;

import manmaed.cutepuppymod.client.render.entity.*;
import manmaed.cutepuppymod.entity.*;
import net.minecraftforge.fml.client.registry.RenderingRegistry;


public class ClientProxy extends CommonProxy {

    public void preInit() {

    }
    public void init() {

    }

    public void renderInformation() {

		//Color Puppys
    	RenderingRegistry.registerEntityRenderingHandler(EntityPuppy.class, RenderPuppy.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityRedPuppy.class, RenderRedPuppy.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityYellowPuppy.class,  RenderYellowPuppy.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityBluePuppy.class,  RenderBluePuppy.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityPurplePuppy.class,  RenderPurplePuppy.FACTORY);

        RenderingRegistry.registerEntityRenderingHandler(EntityEnderPuppy.class,  RenderEnderPuppy.FACTORY);

		//Custom Pups
		RenderingRegistry.registerEntityRenderingHandler(EntitySixPuppy.class,  RenderSixPuppy.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityStevePuppy.class,  RenderStevePuppy.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityHerobrinePuppy.class,  RenderHerobrinePuppy.FACTORY);




/*      RenderingRegistry.registerEntityRenderingHandler(EntityWaterHamster.class,  RenderWaterHamster( ModelHamster(0), 0.5f));
        RenderingRegistry.registerEntityRenderingHandler(EntityHellHamster.class,  RenderHellHamster( ModelHamster(0), 0.5f));
        RenderingRegistry.registerEntityRenderingHandler(EntityForestHamster.class,  RenderForestHamster( ModelHamster(0), 0.5f));
        RenderingRegistry.registerEntityRenderingHandler(EntitySnowHamster.class,  RenderSnowHamster( ModelHamster(0), 0.5f));
*/
    }

}
