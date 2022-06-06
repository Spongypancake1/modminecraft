
package net.mcreator.smpp.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.smpp.entity.KingEntity;
import net.mcreator.smpp.client.model.Modelking;

public class KingRenderer extends MobRenderer<KingEntity, Modelking<KingEntity>> {
	public KingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelking(context.bakeLayer(Modelking.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KingEntity entity) {
		return new ResourceLocation("smpp:textures/king.png");
	}
}
