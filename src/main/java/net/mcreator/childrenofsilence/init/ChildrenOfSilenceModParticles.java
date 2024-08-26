
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.childrenofsilence.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.childrenofsilence.client.particle.TrueSightParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ChildrenOfSilenceModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(ChildrenOfSilenceModParticleTypes.TRUE_SIGHT_PARTICLE.get(), TrueSightParticleParticle::provider);
	}
}
