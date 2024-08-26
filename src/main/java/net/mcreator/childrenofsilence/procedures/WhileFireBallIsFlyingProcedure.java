package net.mcreator.childrenofsilence.procedures;

import net.minecraft.world.entity.Entity;

public class WhileFireBallIsFlyingProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		assert Boolean.TRUE; //#dbg:WhileFireBallIsFlying:NoGravity
		immediatesourceentity.setNoGravity(true);
	}
}
