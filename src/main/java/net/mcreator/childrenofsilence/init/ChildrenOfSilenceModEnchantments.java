
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.childrenofsilence.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.childrenofsilence.enchantment.BlessedEnchantment;
import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

public class ChildrenOfSilenceModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ChildrenOfSilenceMod.MODID);
	public static final RegistryObject<Enchantment> BLESSED = REGISTRY.register("blessed", () -> new BlessedEnchantment());
}
