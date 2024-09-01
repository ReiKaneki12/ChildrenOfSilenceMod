package net.mcreator.childrenofsilence.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.childrenofsilence.network.ChildrenOfSilenceModVariables;

public class UseArmorSkillProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ChildrenOfSilenceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ChildrenOfSilenceModVariables.PlayerVariables())).EsckArmorOn) {
			{
				boolean _setval = !(entity.getCapability(ChildrenOfSilenceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ChildrenOfSilenceModVariables.PlayerVariables())).isDemon;
				entity.getCapability(ChildrenOfSilenceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.isDemon = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
