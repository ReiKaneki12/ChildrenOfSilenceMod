package net.mcreator.childrenofsilence.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.childrenofsilence.network.ChildrenOfSilenceModVariables;
import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

public class WhileFireBallIsFlyingProcedure {
	public static void execute(LevelAccessor world, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity(true);
		if (ChildrenOfSilenceModVariables.MapVariables.get(world).WorldJustLoaded) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
		ChildrenOfSilenceMod.queueServerWork(300, () -> {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		});
	}
}
