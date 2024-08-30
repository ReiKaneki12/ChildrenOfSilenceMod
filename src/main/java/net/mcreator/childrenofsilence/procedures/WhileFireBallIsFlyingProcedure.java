package net.mcreator.childrenofsilence.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

public class WhileFireBallIsFlyingProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity(true);
		assert Boolean.TRUE; //#dbg:WhileFireBallIsFlying:NoGravity
		ChildrenOfSilenceMod.queueServerWork(200, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
