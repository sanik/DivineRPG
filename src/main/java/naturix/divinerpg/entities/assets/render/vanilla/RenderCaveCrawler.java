package naturix.divinerpg.entities.assets.render.vanilla;

import javax.annotation.Nullable;

import naturix.divinerpg.entities.assets.model.vanilla.model.ModelCrawler;
import naturix.divinerpg.entities.entity.vanilla.CaveCrawler;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderCaveCrawler extends RenderLiving<CaveCrawler> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/crawler_cave.png");
	private final ModelCrawler ModelAyereco;
    
	public RenderCaveCrawler(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelCrawler(), 1F);
        ModelAyereco = (ModelCrawler) super.mainModel;
    } 

	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(CaveCrawler entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<CaveCrawler> {

	        @Override
	        public Render<? super CaveCrawler> createRenderFor(RenderManager manager) {
	            return new RenderCaveCrawler(manager, new ModelCrawler(), 0.5F);
	        }
	    }

	}