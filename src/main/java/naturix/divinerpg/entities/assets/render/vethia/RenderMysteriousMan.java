package naturix.divinerpg.entities.assets.render.vethia;

import javax.annotation.Nullable;

import naturix.divinerpg.entities.assets.model.vethea.model.ModelMysteriousMan;
import naturix.divinerpg.entities.entity.vethia.MysteriousMan;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderMysteriousMan extends RenderLiving<MysteriousMan> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/mysteriousman.png");
	private final ModelMysteriousMan modelEntity;
    
	public RenderMysteriousMan(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelMysteriousMan(), 1F);
        modelEntity = (ModelMysteriousMan) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(MysteriousMan entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<MysteriousMan> {

	        @Override
	        public Render<? super MysteriousMan> createRenderFor(RenderManager manager) {
	            return new RenderMysteriousMan(manager, new ModelMysteriousMan(), 1F);
	        }
	    }

	}