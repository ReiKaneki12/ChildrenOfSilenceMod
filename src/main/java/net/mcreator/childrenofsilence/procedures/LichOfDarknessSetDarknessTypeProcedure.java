package net.mcreator.childrenofsilence.procedures;

import net.minecraft.world.entity.Entity;

public class LichOfDarknessSetDarknessTypeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("isDarknessEntity", true);
	}
}
