package naturix.divinerpg.entities.assets.render.twilight;

import javax.annotation.Nullable;

import naturix.divinerpg.entities.assets.model.twilight.model.ModelTomo;
import naturix.divinerpg.entities.entity.arcana.EdenTomo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderTomoEden extends RenderLiving<EdenTomo> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/tomo_eden.png");
	private final ModelTomo ModelTomo;
    
	public RenderTomoEden(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelTomo(), 1F);
        ModelTomo = (ModelTomo) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(EdenTomo entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<EdenTomo> {

	        @Override
	        public Render<? super EdenTomo> createRenderFor(RenderManager manager) {
	            return new RenderTomoEden(manager, new ModelTomo(), 0.5F);
	        }
	    }

	}