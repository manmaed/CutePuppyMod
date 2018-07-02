package manmaed.cutepuppymod.client.render.entity;

import manmaed.cutepuppymod.client.render.model.ModelRedPuppy;
import manmaed.cutepuppymod.entity.EntityRedPuppy;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

public class RenderRedPuppy extends RenderLiving<EntityRedPuppy>
{

	public static final Factory FACTORY = new Factory();

	public RenderRedPuppy(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelRedPuppy(), 0.5F);
	}
	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(@Nonnull EntityRedPuppy entity) {
		return RenderPuppyTextures.RedPuppy();
	}

	public static class Factory implements IRenderFactory<EntityRedPuppy> {

		@Override
		public Render<? super EntityRedPuppy> createRenderFor(RenderManager manager) {
			return new RenderRedPuppy(manager);
		}

	}


}
