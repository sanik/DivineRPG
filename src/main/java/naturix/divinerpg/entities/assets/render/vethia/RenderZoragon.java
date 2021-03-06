package naturix.divinerpg.entities.assets.render.vethia;

import javax.annotation.Nullable;

import naturix.divinerpg.entities.assets.model.vethea.model.ModelZoragon;
import naturix.divinerpg.entities.entity.vethia.Zoragon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderZoragon extends RenderLiving<Zoragon> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/zoragon.png");
	private final ModelZoragon modelEntity;
    
	public RenderZoragon(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelZoragon(), 1F);
        modelEntity = (ModelZoragon) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(Zoragon entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<Zoragon> {

	        @Override
	        public Render<? super Zoragon> createRenderFor(RenderManager manager) {
	            return new RenderZoragon(manager, new ModelZoragon(), 1F);
	        }
	    }

	}