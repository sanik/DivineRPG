package naturix.divinerpg.entities.assets.render.vethia;

import javax.annotation.Nullable;

import naturix.divinerpg.entities.assets.model.vethea.model.ModelShadahier;
import naturix.divinerpg.entities.entity.vethia.Shadahier;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderShadahier extends RenderLiving<Shadahier> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/shadahier.png");
	private final ModelShadahier modelEntity;
    
	public RenderShadahier(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelShadahier(), 1F);
        modelEntity = (ModelShadahier) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(Shadahier entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<Shadahier> {

	        @Override
	        public Render<? super Shadahier> createRenderFor(RenderManager manager) {
	            return new RenderShadahier(manager, new ModelShadahier(), 1F);
	        }
	    }

	}