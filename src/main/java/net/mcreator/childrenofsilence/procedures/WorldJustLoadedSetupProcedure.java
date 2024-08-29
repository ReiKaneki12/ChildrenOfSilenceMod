package net.mcreator.childrenofsilence.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.childrenofsilence.network.ChildrenOfSilenceModVariables;
import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WorldJustLoadedSetupProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.minecraftforge.event.level.LevelEvent.Load event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		ChildrenOfSilenceModVariables.MapVariables.get(world).WorldJustLoaded = true;
		ChildrenOfSilenceModVariables.MapVariables.get(world).syncData(world);
		ChildrenOfSilenceMod.queueServerWork(20, () -> {
			ChildrenOfSilenceModVariables.MapVariables.get(world).WorldJustLoaded = false;
			ChildrenOfSilenceModVariables.MapVariables.get(world).syncData(world);
		});
	}
}
