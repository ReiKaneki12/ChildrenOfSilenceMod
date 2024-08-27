
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.childrenofsilence.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.childrenofsilence.client.renderer.PenguinRenderer;
import net.mcreator.childrenofsilence.client.renderer.LichOfTheDarknessRenderer;
import net.mcreator.childrenofsilence.client.renderer.FireBallRenderer;
import net.mcreator.childrenofsilence.client.renderer.FireBallProjectileRenderer;
import net.mcreator.childrenofsilence.client.renderer.DrakenSteelBallProjectileRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ChildrenOfSilenceModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ChildrenOfSilenceModEntities.FIRE_BALL_PROJECTILE.get(), FireBallProjectileRenderer::new);
		event.registerEntityRenderer(ChildrenOfSilenceModEntities.FIRE_BALL.get(), FireBallRenderer::new);
		event.registerEntityRenderer(ChildrenOfSilenceModEntities.LICH_OF_THE_DARKNESS.get(), LichOfTheDarknessRenderer::new);
		event.registerEntityRenderer(ChildrenOfSilenceModEntities.PENGUIN.get(), PenguinRenderer::new);
		event.registerEntityRenderer(ChildrenOfSilenceModEntities.DRAKEN_STEEL_BALL_PROJECTILE.get(), DrakenSteelBallProjectileRenderer::new);
	}
}
