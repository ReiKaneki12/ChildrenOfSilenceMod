package net.mcreator.childrenofsilence.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.childrenofsilence.network.ChildrenOfSilenceModVariables;

public class ReturnSlot3TrueSightSlotProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(ChildrenOfSilenceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ChildrenOfSilenceModVariables.PlayerVariables())).SpellSlot3 == 1) {
			return true;
		}
		return false;
	}
}
