package net.mcreator.childrenofsilence.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.childrenofsilence.network.ChildrenOfSilenceModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SeaTransformationPerksProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ChildrenOfSilenceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ChildrenOfSilenceModVariables.PlayerVariables())).isPenguin) {
			if (entity instanceof LivingEntity _livingEntity)
				_livingEntity.addEffect((new MobEffectInstance(MobEffects.WATER_BREATHING, 1, 0)));
			if (entity instanceof LivingEntity _livingEntity)
				_livingEntity.addEffect((new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1, 0)));
		} else if ((entity.getCapability(ChildrenOfSilenceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ChildrenOfSilenceModVariables.PlayerVariables())).isAxolotl) {
			if (entity instanceof LivingEntity _livingEntity)
				_livingEntity.addEffect((new MobEffectInstance(MobEffects.WATER_BREATHING, 1, 0)));
			if (entity instanceof LivingEntity _livingEntity)
				_livingEntity.addEffect((new MobEffectInstance(MobEffects.REGENERATION, 1, 1)));
		}
	}
}
