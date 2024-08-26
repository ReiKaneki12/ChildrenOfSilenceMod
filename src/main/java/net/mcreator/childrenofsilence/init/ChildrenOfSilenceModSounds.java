
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.childrenofsilence.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

public class ChildrenOfSilenceModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ChildrenOfSilenceMod.MODID);
	public static final RegistryObject<SoundEvent> PENGUIN_SOUND = REGISTRY.register("penguin_sound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("children_of_silence", "penguin_sound")));
	public static final RegistryObject<SoundEvent> PENGUIN_SOUND_HURT = REGISTRY.register("penguin_sound_hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("children_of_silence", "penguin_sound_hurt")));
}
