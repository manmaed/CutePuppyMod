package manmaed.cutepuppymod.client.render.entity;

import manmaed.cutepuppymod.CutePuppyMod;
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

	public static final Factory FACTORY = new Factory();

	public RenderHerobrinePuppy(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelRedPuppy(), 0.5F);
	}
	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(@Nonnull EntityHerobrinePuppy entity) {
		if (CutePuppyMod.manmaedbday) {
			return Textures.MODEL_HEROBRINE_PUPPY_BDAY;
		}
		if (CutePuppyMod.halloween) {
			return Textures.MODEL_HEROBRINE_PUPPY_HALLOWEEN;
		}
		if (CutePuppyMod.christmas) {
			return Textures.MODEL_HEROBRINE_PUPPY_XMAS;
		} else {
			return Textures.MODEL_HEROBRINE_PUPPY;
		}
	}

	public static class Factory implements IRenderFactory<EntityHerobrinePuppy> {

		@Override
		public Render<? super EntityHerobrinePuppy> createRenderFor(RenderManager manager) {
			return new RenderHerobrinePuppy(manager);
		}

	}


}
