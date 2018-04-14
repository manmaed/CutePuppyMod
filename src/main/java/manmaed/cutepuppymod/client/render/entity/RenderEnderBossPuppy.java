package manmaed.cutepuppymod.client.render.entity;


import manmaed.cutepuppymod.CutePuppyMod;
import manmaed.cutepuppymod.client.render.model.ModelRedPuppyBig;
import manmaed.cutepuppymod.entity.EntityEnderBossPuppy;
import manmaed.cutepuppymod.libs.Textures;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

public class RenderEnderBossPuppy extends RenderLiving<EntityEnderBossPuppy>
{

	public static final Factory FACTORY = new Factory();

	public RenderEnderBossPuppy(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelRedPuppyBig(), 0.5F);
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityEnderBossPuppy entity) {
		if (CutePuppyMod.bday) {
			return Textures.MODEL_ENDER_PUPPY_BDAY;
		}
		if (CutePuppyMod.halloween) {
			return Textures.MODEL_ENDER_PUPPY_HALLOWEEN;
		}
		if (CutePuppyMod.christmas) {
			return Textures.MODEL_ENDER_PUPPY_XMAS;
		} else {
			return Textures.MODEL_ENDER_PUPPY;
		}
	}
	public static class Factory implements IRenderFactory<EntityEnderBossPuppy> {

		@Override
		public Render<? super EntityEnderBossPuppy> createRenderFor(RenderManager manager) {
			return new RenderEnderBossPuppy(manager);
		}

	}


}