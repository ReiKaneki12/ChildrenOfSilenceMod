package net.mcreator.childrenofsilence.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.childrenofsilence.network.ChildrenOfSilenceModVariables;

public class ReturnStatPointsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + (entity.getCapability(ChildrenOfSilenceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ChildrenOfSilenceModVariables.PlayerVariables())).StatsPoints;
	}
}
