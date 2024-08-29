package net.mcreator.childrenofsilence.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.childrenofsilence.network.ChildrenOfSilenceModVariables;

public class WhileFireBallIsFlyingProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (ChildrenOfSilenceModVariables.MapVariables.get(world).WorldJustLoaded) {
			if (!entity.level().isClientSide())
				entity.discard();
		} else if (!ChildrenOfSilenceModVariables.MapVariables.get(world).WorldJustLoaded) {
			immediatesourceentity.setNoGravity(true);
			assert Boolean.TRUE; //#dbg:WhileFireBallIsFlying:NoGravity
		}
	}
}
