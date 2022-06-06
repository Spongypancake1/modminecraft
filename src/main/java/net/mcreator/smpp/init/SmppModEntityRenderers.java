
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.smpp.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.smpp.client.renderer.KingRenderer;
import net.mcreator.smpp.client.renderer.FireflyRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SmppModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SmppModEntities.KING.get(), KingRenderer::new);
		event.registerEntityRenderer(SmppModEntities.FIREFLY.get(), FireflyRenderer::new);
	}
}
