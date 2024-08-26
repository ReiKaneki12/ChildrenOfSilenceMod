
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.childrenofsilence.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.childrenofsilence.potion.ManaSicknessMobEffect;
import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

public class ChildrenOfSilenceModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ChildrenOfSilenceMod.MODID);
	public static final RegistryObject<MobEffect> MANA_SICKNESS = REGISTRY.register("mana_sickness", () -> new ManaSicknessMobEffect());
}
