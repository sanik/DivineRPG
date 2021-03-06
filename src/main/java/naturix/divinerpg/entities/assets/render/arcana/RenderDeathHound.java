package naturix.divinerpg.entities.assets.render.arcana;

import javax.annotation.Nullable;

import naturix.divinerpg.entities.assets.model.arcana.model.ModelDeathHound;
import naturix.divinerpg.entities.entity.arcana.DeathHound;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderDeathHound extends RenderLiving<DeathHound> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/death_hound.png");
	private final ModelDeathHound ModelDeathHound;
    
	public RenderDeathHound(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelDeathHound(), 1F);
        ModelDeathHound = (ModelDeathHound) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(DeathHound entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<DeathHound> {

	        @Override
	        public Render<? super DeathHound> createRenderFor(RenderManager manager) {
	            return new RenderDeathHound(manager, new ModelDeathHound(), 0.5F);
	        }
	    }

	}