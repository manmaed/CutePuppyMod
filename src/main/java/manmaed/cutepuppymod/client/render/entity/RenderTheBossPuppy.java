package manmaed.cutepuppymod.client.render.entity;


import manmaed.cutepuppymod.client.render.model.ModelTheBossPuppy;
import manmaed.cutepuppymod.entity.EntityTheBossPuppy;
import manmaed.cutepuppymod.libs.Textures;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

public class RenderTheBossPuppy extends RenderLiving<EntityTheBossPuppy>
{

	public static final Factory FACTORY = new Factory();

	public RenderTheBossPuppy(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelTheBossPuppy(), 0.5F);
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityTheBossPuppy entity) {
		return Textures.MODEL_BOSS_PUPPY;
		}
	public static class Factory implements IRenderFactory<EntityTheBossPuppy> {

		@Override
		public Render<? super EntityTheBossPuppy> createRenderFor(RenderManager manager) {
			return new RenderTheBossPuppy(manager);
		}

	}
}