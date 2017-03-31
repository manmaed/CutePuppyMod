package manmaed.cutepuppymod.client.render;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import manmaed.cutepuppymod.CutePuppyMod;
import manmaed.cutepuppymod.client.render.model.ModelPuppyHolder;
import manmaed.cutepuppymod.libs.Textures;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraftforge.client.event.RenderPlayerEvent;
import org.lwjgl.opengl.GL11;

public class RenderPuppyHolder
{
    private ModelPuppyHolder model;


    public RenderPuppyHolder() {
        model = new ModelPuppyHolder();
    }



    @SubscribeEvent
    public void onPlayerRender(RenderPlayerEvent.Specials.Post event) {
        if (!CutePuppyMod.puppy || event.entityLiving.getActivePotionEffect(Potion.invisibility) != null)
            return;
        EntityPlayer player = event.entityPlayer;
        if (CutePuppyMod.proxy.list.isPuppy(player)) {
            boolean armor = player.getCurrentArmor(3) != null;
            float yaw = player.prevRotationYawHead + (player.rotationYawHead - player.prevRotationYawHead) * event.partialRenderTick;
            float yawOffset = player.prevRenderYawOffset + (player.renderYawOffset - player.prevRenderYawOffset) * event.partialRenderTick;
            float pitch = player.prevRotationPitch + (player.rotationPitch - player.prevRotationPitch) * event.partialRenderTick;
            GL11.glPushMatrix();
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glRotatef(yawOffset, 0, -1, 0);
            GL11.glRotatef(yaw - 270, 0, 1, 0);
            GL11.glRotatef(pitch, 0, 0, 1);
            GL11.glTranslated(0, (player != Minecraft.getMinecraft().thePlayer ? 1.62F : 0F) - player.getDefaultEyeHeight() + (player.isSneaking() ? 0.0625 : 0), 0);
            GL11.glRotatef(90F, 0F, 1F, 0F);
            GL11.glRotatef(20f, 1f, 0f, 0f);
            GL11.glTranslatef(0.35f, -1.35f + (armor ? -0.1f : 0), 0f);
            GL11.glColor4f(1f, 1f, 1f, 1f);
            Minecraft.getMinecraft().renderEngine.bindTexture(Textures.MODEL_HOLDER_PUPPY);
            model.render(0.0625f);
            GL11.glColor4f(1f, 1f, 1f, 1f);
            GL11.glAlphaFunc(0x204, 0.1f);
            GL11.glPopMatrix();
        }
    }


}
