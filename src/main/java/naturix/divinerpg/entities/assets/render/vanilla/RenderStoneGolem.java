package naturix.divinerpg.entities.assets.render.vanilla;

import javax.annotation.Nullable;

import naturix.divinerpg.entities.assets.model.vanilla.model.ModelStoneGolem;
import naturix.divinerpg.entities.entity.vanilla.StoneGolem;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderStoneGolem extends RenderLiving<StoneGolem> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/golem_stone.png");
	private final ModelStoneGolem ModelAyereco;
    
	public RenderStoneGolem(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelStoneGolem(), 1F);
        ModelAyereco = (ModelStoneGolem) super.mainModel;
    } 

	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(StoneGolem entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<StoneGolem> {

	        @Override
	        public Render<? super StoneGolem> createRenderFor(RenderManager manager) {
	            return new RenderStoneGolem(manager, new ModelStoneGolem(), 0.5F);
	        }
	    }

	}