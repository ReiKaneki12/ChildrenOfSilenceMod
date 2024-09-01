package net.mcreator.childrenofsilence.procedures;

import net.minecraft.world.entity.Entity;

public class KeyXProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		UseArmorSkillProcedureProcedure.execute(entity);
	}
}
