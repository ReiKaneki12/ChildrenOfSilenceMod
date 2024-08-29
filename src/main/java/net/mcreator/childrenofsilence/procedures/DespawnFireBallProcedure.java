package net.mcreator.childrenofsilence.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.childrenofsilence.network.ChildrenOfSilenceModVariables;

public class DespawnFireBallProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (ChildrenOfSilenceModVariables.MapVariables.get(world).WorldJustLoaded) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
