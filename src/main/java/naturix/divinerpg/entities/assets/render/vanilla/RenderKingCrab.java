package naturix.divinerpg.entities.assets.render.vanilla;

import javax.annotation.Nullable;

import naturix.divinerpg.entities.assets.model.vanilla.model.ModelKingCrab;
import naturix.divinerpg.entities.entity.vanilla.KingCrab;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderKingCrab extends RenderLiving<KingCrab> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/crab.png");
	private final ModelKingCrab ModelAyereco;
    
	public RenderKingCrab(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelKingCrab(), 1F);
        ModelAyereco = (ModelKingCrab) super.mainModel;
        

    } 


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(KingCrab entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<KingCrab> {

	        @Override
	        public Render<? super KingCrab> createRenderFor(RenderManager manager) {
	            return new RenderKingCrab(manager, new ModelKingCrab(), 0.5F);
	        }
	    }

	}