package manmaed.cutepuppymod.client.render.entity;

import manmaed.cutepuppymod.client.render.model.ModelRedPuppy;
import manmaed.cutepuppymod.entity.EntityYellowPuppy;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

public class RenderYellowPuppy extends RenderLiving<EntityYellowPuppy>
{

	public static final Factory FACTORY = new Factory();

	public RenderYellowPuppy(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelRedPuppy(), 0.5F);
	}
	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(@Nonnull EntityYellowPuppy entity) {
		return RenderPuppyTextures.YellowPuppy();
	}

	public static class Factory implements IRenderFactory<EntityYellowPuppy> {

		@Override
		public Render<? super EntityYellowPuppy> createRenderFor(RenderManager manager) {
			return new RenderYellowPuppy(manager);
		}

	}
	}

