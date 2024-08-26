
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.childrenofsilence.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

public class ChildrenOfSilenceModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ChildrenOfSilenceMod.MODID);
	public static final RegistryObject<SimpleParticleType> TRUE_SIGHT_PARTICLE = REGISTRY.register("true_sight_particle", () -> new SimpleParticleType(true));
}
