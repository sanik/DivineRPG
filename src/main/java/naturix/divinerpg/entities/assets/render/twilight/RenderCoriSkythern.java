package naturix.divinerpg.entities.assets.render.twilight;

import javax.annotation.Nullable;

import naturix.divinerpg.entities.assets.model.twilight.model.ModelCori;
import naturix.divinerpg.entities.entity.twilight.SkythernCori;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderCoriSkythern extends RenderLiving<SkythernCori> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/cori_skythern.png");
	private final ModelCori ModelCori;
    
	public RenderCoriSkythern(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelCori(), 1F);
        ModelCori = (ModelCori) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(SkythernCori entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<SkythernCori> {

	        @Override
	        public Render<? super SkythernCori> createRenderFor(RenderManager manager) {
	            return new RenderCoriSkythern(manager, new ModelCori(), 0.5F);
	        }
	    }

	}