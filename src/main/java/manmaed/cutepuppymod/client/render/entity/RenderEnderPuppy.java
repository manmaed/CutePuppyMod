package manmaed.cutepuppymod.client.render.entity;

import manmaed.cutepuppymod.CutePuppyMod;
import manmaed.cutepuppymod.client.render.model.ModelRedPuppy;
import manmaed.cutepuppymod.entity.EntityEnderPuppy;
import manmaed.cutepuppymod.libs.Textures;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

public class RenderEnderPuppy extends RenderLiving<EntityEnderPuppy>
{

	public static final Factory FACTORY = new Factory();

	public RenderEnderPuppy(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelRedPuppy(), 0.5F);
	}
	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(@Nonnull EntityEnderPuppy entity) {
		if (CutePuppyMod.manmaedbday) {
			return Textures.MODEL_ENDER_PUPPY_BDAY;
		}
		if (CutePuppyMod.halloween) {
			return Textures.MODEL_ENDER_PUPPY_HALLOWEEN;
		}
		if (CutePuppyMod.christmas) {
			return Textures.MODEL_ENDER_PUPPY_XMAS;
		} else {
			return Textures.MODEL_ENDER_PUPPY;
		}
	}

	public static class Factory implements IRenderFactory<EntityEnderPuppy> {

		@Override
		public Render<? super EntityEnderPuppy> createRenderFor(RenderManager manager) {
			return new RenderEnderPuppy(manager);
		}

	}


}