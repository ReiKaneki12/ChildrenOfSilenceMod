package net.mcreator.childrenofsilence.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.childrenofsilence.network.ChildrenOfSilenceModVariables;

public class ReturnManaValueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return Math.floor((entity.getCapability(ChildrenOfSilenceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ChildrenOfSilenceModVariables.PlayerVariables())).ActualMana) + "/"
				+ Math.floor((entity.getCapability(ChildrenOfSilenceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ChildrenOfSilenceModVariables.PlayerVariables())).MaxMana);
	}
}
