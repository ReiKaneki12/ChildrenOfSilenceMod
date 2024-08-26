
package net.mcreator.childrenofsilence.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.childrenofsilence.procedures.ManaSicknessProcedureProcedure;
import net.mcreator.childrenofsilence.procedures.ManaSicknessEndProcedureProcedure;

public class ManaSicknessMobEffect extends MobEffect {
	public ManaSicknessMobEffect() {
		super(MobEffectCategory.HARMFUL, -4728676);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		ManaSicknessProcedureProcedure.execute(entity.level(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ManaSicknessEndProcedureProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
