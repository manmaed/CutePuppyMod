package manmaed.cutepuppymod.client.render.entity;


import manmaed.cutepuppymod.client.render.model.ModelRedPuppyBig;
import manmaed.cutepuppymod.entity.EntityEnderBossPuppy;
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
		return RenderPuppyTextures.EnderBossPuppy();
	}
	public static class Factory implements IRenderFactory<EntityEnderBossPuppy> {

		@Override
		public Render<? super EntityEnderBossPuppy> createRenderFor(RenderManager manager) {
			return new RenderEnderBossPuppy(manager);
		}

	}


}