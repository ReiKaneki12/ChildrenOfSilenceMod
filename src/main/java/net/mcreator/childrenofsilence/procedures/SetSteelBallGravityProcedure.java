package net.mcreator.childrenofsilence.procedures;

import net.minecraft.world.entity.Entity;

public class SetSteelBallGravityProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity(true);
	}
}
