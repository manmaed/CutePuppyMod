package manmaed.cutepuppymod.client.render.entity;

import manmaed.cutepuppymod.client.render.model.ModelRedPuppy;
import manmaed.cutepuppymod.entity.EntityHerobrinePuppy;
import manmaed.cutepuppymod.libs.Textures;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

public class RenderHerobrinePuppy extends RenderLiving<EntityHerobrinePuppy>
{

	private ResourceLocation mobTexture = Textures.MODEL_HEROBRINE_PUPPY;
	public static final Factory FACTORY = new Factory();

	public RenderHerobrinePuppy(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelRedPuppy(), 0.5F);
	}
	@Override
	@Nonnull
	protected ResourceLocation func_110775_a(@Nonnull EntityHerobrinePuppy entity) {
		return mobTexture;
	}

	public static class Factory implements IRenderFactory<EntityHerobrinePuppy> {

		@Override
		public Render<? super EntityHerobrinePuppy> createRenderFor(RenderManager manager) {
			return new RenderHerobrinePuppy(manager);
		}

	}


}
