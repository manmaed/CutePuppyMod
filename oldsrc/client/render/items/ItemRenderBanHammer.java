package manmaed.cutepuppymod.client.render.items;

import manmaed.cutepuppymod.client.render.model.ModelBanHammer;
import manmaed.cutepuppymod.libs.Textures;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

/**
 * Created by manmaed on 12/02/2015.
 */
public class ItemRenderBanHammer implements IItemRenderer {

    protected ModelBanHammer modelBanHammer;

    public ItemRenderBanHammer()
    {
        modelBanHammer = new ModelBanHammer();
    }
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        switch(type) {
            case EQUIPPED: return true;
            default: return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
switch(type) {
    case EQUIPPED: {
        GL11.glPushMatrix();

        Minecraft.getMinecraft().renderEngine.bindTexture(Textures.MODEL_BAN_HAMMER);
        modelBanHammer.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
    default:
        break;
}

    }
}
