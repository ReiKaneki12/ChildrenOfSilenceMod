package net.mcreator.childrenofsilence.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.childrenofsilence.init.ChildrenOfSilenceModEntities;
import net.mcreator.childrenofsilence.entity.PenguinEntity;

public class ReturnPenguinModelProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new PenguinEntity(ChildrenOfSilenceModEntities.PENGUIN.get(), _level) : null;
	}
}
