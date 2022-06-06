
package net.mcreator.smpp.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.smpp.entity.FireflyEntity;
import net.mcreator.smpp.client.model.Modelfirefly;

public class FireflyRenderer extends MobRenderer<FireflyEntity, Modelfirefly<FireflyEntity>> {
	public FireflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfirefly(context.bakeLayer(Modelfirefly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FireflyEntity entity) {
		return new ResourceLocation("smpp:textures/firefly.png");
	}
}
