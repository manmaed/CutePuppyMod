package manmaed.cutepuppymod.client.render.entity;

import manmaed.cutepuppymod.CutePuppyMod;
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
	public static final Factory FACTORY = new Factory();

	public RenderBluePuppy(RenderManager rendermanagerIn)
	{
		super(rendermanagerIn, new ModelRedPuppy(), 0.5F);
	}
	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(@Nonnull EntityBluePuppy entity) {
		if (CutePuppyMod.manmaedbday) {
			return Textures.MODEL_BLUE_PUPPY_BDAY;
		}
		if (CutePuppyMod.halloween) {
			return Textures.MODEL_BLUE_PUPPY_HALLOWEEN;
		}
		if (CutePuppyMod.christmas) {
			return Textures.MODEL_BLUE_PUPPY_XMAS;
		} else {
			return Textures.MODEL_BLUE_PUPPY;
		}
	}

	public static class Factory implements IRenderFactory<EntityBluePuppy> {

		@Override
		public Render<? super EntityBluePuppy> createRenderFor(RenderManager manager)
		{
			return new RenderBluePuppy(manager);
		}

	}
}
