package manmaed.cutepuppymod.client.render.entity;

import manmaed.cutepuppymod.CutePuppyMod;
import manmaed.cutepuppymod.client.render.model.ModelRedPuppy;
import manmaed.cutepuppymod.entity.EntityPurplePuppy;
import manmaed.cutepuppymod.libs.Textures;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

public class RenderPurplePuppy extends RenderLiving<EntityPurplePuppy>
{

	public static final Factory FACTORY = new Factory();

	public RenderPurplePuppy(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelRedPuppy(), 0.5F);
	}
	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(@Nonnull EntityPurplePuppy entity) {
		if (CutePuppyMod.bday) {
			return Textures.MODEL_PURPLE_PUPPY_BDAY;
		}
		if (CutePuppyMod.halloween) {
			return Textures.MODEL_PURPLE_PUPPY_HALLOWEEN;
		}
		if (CutePuppyMod.christmas) {
			return Textures.MODEL_PURPLE_PUPPY_XMAS;
		} else {
			return Textures.MODEL_PURPLE_PUPPY;
		}
	}

	public static class Factory implements IRenderFactory<EntityPurplePuppy> {

		@Override
		public Render<? super EntityPurplePuppy> createRenderFor(RenderManager manager) {
			return new RenderPurplePuppy(manager);
		}

	}


}
