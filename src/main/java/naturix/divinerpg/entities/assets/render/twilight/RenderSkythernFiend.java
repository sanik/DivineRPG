package naturix.divinerpg.entities.assets.render.twilight;

import javax.annotation.Nullable;

import naturix.divinerpg.entities.assets.model.twilight.model.ModelSkythernFiend;
import naturix.divinerpg.entities.entity.twilight.SkythernFiend;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderSkythernFiend extends RenderLiving<SkythernFiend> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/fiend_skythern.png");
	private final ModelSkythernFiend ModelSkythernFiend;
    
	public RenderSkythernFiend(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelSkythernFiend(), 1F);
        ModelSkythernFiend = (ModelSkythernFiend) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(SkythernFiend entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<SkythernFiend> {

	        @Override
	        public Render<? super SkythernFiend> createRenderFor(RenderManager manager) {
	            return new RenderSkythernFiend(manager, new ModelSkythernFiend(), 0.5F);
	        }
	    }

	}