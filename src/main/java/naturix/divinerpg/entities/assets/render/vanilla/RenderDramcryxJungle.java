package naturix.divinerpg.entities.assets.render.vanilla;

import javax.annotation.Nullable;

import naturix.divinerpg.entities.assets.model.vanilla.model.ModelDramcryx;
import naturix.divinerpg.entities.entity.vanilla.JungleStegosaurus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderDramcryxJungle extends RenderLiving<JungleStegosaurus> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/dramcryx_jungle.png");
	private final ModelDramcryx modelDramcryx;
    
	public RenderDramcryxJungle(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelDramcryx(), 1F);
        modelDramcryx = (ModelDramcryx) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(JungleStegosaurus entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<JungleStegosaurus> {

	        @Override
	        public Render<? super JungleStegosaurus> createRenderFor(RenderManager manager) {
	            return new RenderDramcryxJungle(manager, new ModelDramcryx(), 0.5F);
	        }
	    }

	}