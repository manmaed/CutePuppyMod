package manmaed.cutepuppymod.client.render.entity;

import manmaed.cutepuppymod.client.render.model.ModelRedPuppy;
import manmaed.cutepuppymod.entity.EntityBluePuppy;
import manmaed.cutepuppymod.libs.Textures;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

public class RenderBluePuppy extends RenderLiving<EntityBluePuppy>
{
	private ResourceLocation mobTexture = Textures.MODEL_BLUE_PUPPY;
	public static final Factory FACTORY = new Factory();

	public RenderBluePuppy(RenderManager rendermanagerIn)
	{
		super(rendermanagerIn, new ModelRedPuppy(), 0.5F);
	}
	@Override
	@Nonnull
	protected ResourceLocation func_110775_a(@Nonnull EntityBluePuppy entity) {
		return mobTexture;
	}

	public static class Factory implements IRenderFactory<EntityBluePuppy> {

		@Override
		public Render<? super EntityBluePuppy> createRenderFor(RenderManager manager)
		{
			return new RenderBluePuppy(manager);
		}

	}
}
