package naturix.divinerpg.entities.assets.render.twilight;

import javax.annotation.Nullable;

import naturix.divinerpg.entities.assets.model.twilight.model.ModelEnchantedArcher;
import naturix.divinerpg.entities.entity.twilight.MortumArcher;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderMortumArcher extends RenderLiving<MortumArcher> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/archer_mortum.png");
	private final ModelEnchantedArcher ModelEnchantedArcher;
    
	public RenderMortumArcher(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelEnchantedArcher(), 1F);
        ModelEnchantedArcher = (ModelEnchantedArcher) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(MortumArcher entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<MortumArcher> {

	        @Override
	        public RenderMortumArcher createRenderFor(RenderManager manager) {
	            return new RenderMortumArcher(manager, new ModelEnchantedArcher(), 0.5F);
	        }
	    }

	}