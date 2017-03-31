package manmaed.cutepuppymod.client.render.entity;

import manmaed.cutepuppymod.client.render.model.ModelSixPuppy;
import manmaed.cutepuppymod.entity.EntitySixPuppy;
import manmaed.cutepuppymod.libs.Textures;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

public class RenderSixPuppy extends RenderLiving<EntitySixPuppy>
{

	private ResourceLocation mobTexture = Textures.MODEL_SIX_PUPPY;
	public static final Factory FACTORY = new Factory();

	public RenderSixPuppy(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelSixPuppy(), 0.5F);
	}
	@Override
	@Nonnull
	protected ResourceLocation func_110775_a(@Nonnull EntitySixPuppy entity) {
		return mobTexture;
	}

	public static class Factory implements IRenderFactory<EntitySixPuppy> {

		@Override
		public Render<? super EntitySixPuppy> createRenderFor(RenderManager manager) {
			return new RenderSixPuppy(manager);
		}

	}


}
