package manmaed.cutepuppymod.libs.util;


import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by manmaed on 14/08/2015.
 */

@SideOnly(Side.CLIENT)
public class EventListenerClient {

   /* public EventListenerClient() {
        MinecraftForge.EVENT_BUS.register(this);
        FMLCommonHandler.instance().bus().register(this);
    }

    @SubscribeEvent
    public void renderPlayer(RenderPlayerEvent.Specials.Post event) {
        if (Minecraft.isFancyGraphicsEnabled()) {
            GL11.glPushMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            if (event.entityPlayer.isSneaking()) {
                GL11.glRotatef(28.6F, 1.0F, 0.0F, 0.0F);
            }
            GL11.glTranslatef(0.0F, -0.03F, 0.0F);
            PuppyHolder.instance.render(event.entityPlayer, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
            Minecraft.getMinecraft().renderEngine.bindTexture(Textures.MODEL_HOLDER_PUPPY);
            //PuppyHolder.instance.render();
            GL11.glPopMatrix();
        }
    }*/
}
