package manmaed.cutepuppymod.client.render.entity;

import manmaed.cutepuppymod.client.render.model.ModelRedPuppy;
import manmaed.cutepuppymod.entity.EntityPuppy;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

public class RenderPuppy extends RenderLiving<EntityPuppy>
{

	public static final Factory FACTORY = new Factory();

	public RenderPuppy(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelRedPuppy(), 0.5F);
	}
	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(@Nonnull EntityPuppy entity) {
		return RenderPuppyTextures.GreenPuppy();
	}
	public static class Factory implements IRenderFactory<EntityPuppy> {

		@Override
		public Render<? super EntityPuppy> createRenderFor(RenderManager manager) {
			return new RenderPuppy(manager);
		}

	}


}
