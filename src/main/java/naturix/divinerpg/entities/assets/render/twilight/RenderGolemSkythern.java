package naturix.divinerpg.entities.assets.render.twilight;

import javax.annotation.Nullable;

import naturix.divinerpg.entities.assets.model.twilight.model.ModelTwilightGolem;
import naturix.divinerpg.entities.entity.twilight.SkythernGolem;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderGolemSkythern extends RenderLiving<SkythernGolem> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/golem_skythern.png");
	private final ModelTwilightGolem ModelTwilightGolem;
    
	public RenderGolemSkythern(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelTwilightGolem(), 1F);
        ModelTwilightGolem = (ModelTwilightGolem) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(SkythernGolem entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<SkythernGolem> {

	        @Override
	        public Render<? super SkythernGolem> createRenderFor(RenderManager manager) {
	            return new RenderGolemSkythern(manager, new ModelTwilightGolem(), 0.5F);
	        }
	    }

	}