package manmaed.cutepuppymod.client.render.entity;

import manmaed.cutepuppymod.client.render.model.ModelRedPuppy;
import manmaed.cutepuppymod.entity.EntityStevePuppy;
import manmaed.cutepuppymod.libs.Textures;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

public class RenderStevePuppy extends RenderLiving<EntityStevePuppy>
{

	private ResourceLocation mobTexture = Textures.MODEL_STEVE_PUPPY;
	public static final Factory FACTORY = new Factory();

	public RenderStevePuppy(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelRedPuppy(), 0.5F);
	}
	@Override
	@Nonnull
	protected ResourceLocation func_110775_a(@Nonnull EntityStevePuppy entity) {
		return mobTexture;
	}

	public static class Factory implements IRenderFactory<EntityStevePuppy> {

		@Override
		public Render<? super EntityStevePuppy> createRenderFor(RenderManager manager) {
			return new RenderStevePuppy(manager);
		}

	}


}
