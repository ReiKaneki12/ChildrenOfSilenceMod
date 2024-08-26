package net.mcreator.childrenofsilence.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

public class ReturnAxolotlModelProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new Axolotl(EntityType.AXOLOTL, _level) : null;
	}
}
