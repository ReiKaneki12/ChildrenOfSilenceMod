package net.mcreator.childrenofsilence.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.childrenofsilence.network.ChildrenOfSilenceModVariables;
import net.mcreator.childrenofsilence.init.ChildrenOfSilenceModParticleTypes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TrueSightParticleAnimationProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double PITCH2 = 0;
		double PITCH = 0;
		double YAW = 0;
		double YAW2 = 0;
		if ((entity.getCapability(ChildrenOfSilenceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ChildrenOfSilenceModVariables.PlayerVariables())).TrueSightIsOn) {
			PITCH = Math.cos(entity.getXRot() / ((-180) / Math.PI));
			PITCH = Math.sin(entity.getXRot() / ((-180) / Math.PI));
			YAW = Math.sin(entity.getYRot() / ((-180) / Math.PI));
			YAW2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
			world.addParticle((SimpleParticleType) (ChildrenOfSilenceModParticleTypes.TRUE_SIGHT_PARTICLE.get()), (x + 0.25 * YAW), (y + 1.85), (z + 0.25 * YAW2), 0, 0, 0);
		}
	}
}
