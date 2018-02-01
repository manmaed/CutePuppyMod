package manmaed.cutepuppymod.client.render.peoples;

import manmaed.cutepuppymod.client.render.model.ModelPuppyHolder;
import manmaed.cutepuppymod.libs.Textures;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.ResourceLocation;

/**
 * Created by manmaed on 31/01/2018.
 */
public class RenderDemLayers implements LayerRenderer<EntityPlayer> {

    private final ModelPuppyHolder puppyHolder;
    private static String playerUUID;

    public RenderDemLayers(ModelPuppyHolder puppyHolder) {
        this.puppyHolder = puppyHolder;
    }

    @Override
    public void doRenderLayer(EntityPlayer entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        playerUUID = entitylivingbaseIn.getUniqueID().toString().replace("-","");
        /*LogHelper.fatal(entitylivingbaseIn.getUniqueID().toString().replace("-", ""));*/
        if (playerUUID.equalsIgnoreCase("2eebcb1af63e4a80b380801a10f88d4e") && !entitylivingbaseIn.inventory.armorInventory.get(2).getItem().equals(Items.ELYTRA) ) {
            GlStateManager.pushMatrix();
            bindTexture(Textures.MODEL_PUPPY_HOLDER);
            GlStateManager.translate(0F, 0.4375, -0.375);
            if (entitylivingbaseIn.isSneaking()) {
                GlStateManager.translate(0.0F, 0.25F, 0.15F);
                GlStateManager.rotate(20.0F, 0.5F, 0.00F, 00.0F);
            }
            //GlStateManager.rotate(netHeadYaw, 0.0F, 1.0F, 0.0F);
            float pitch = interpolateValues(entitylivingbaseIn.prevRotationPitch, entitylivingbaseIn.rotationPitch, partialTicks);
            //GlStateManager.rotate(pitch, 1.0F, 0.0F, 0.0F);
            GlStateManager.translate(0.0F, -0.4375F, 0.375F);
/*
        puppyHolder.render(scale);
*/
            puppyHolder.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            // Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale
            GlStateManager.popMatrix();
        }
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }

    private float interpolateValues(float prevVal, float nextVal, float partialTick) {
        return prevVal + partialTick * (nextVal - prevVal);
    }

    private void bindTexture(ResourceLocation rl) {
        Minecraft.getMinecraft().renderEngine.bindTexture(rl);
    }
}
