
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.childrenofsilence.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.childrenofsilence.world.inventory.StatsGuiMenu;
import net.mcreator.childrenofsilence.world.inventory.SpellSlotMenuMenu;
import net.mcreator.childrenofsilence.world.inventory.SeaTransformationGuiMenu;
import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

public class ChildrenOfSilenceModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ChildrenOfSilenceMod.MODID);
	public static final RegistryObject<MenuType<SpellSlotMenuMenu>> SPELL_SLOT_MENU = REGISTRY.register("spell_slot_menu", () -> IForgeMenuType.create(SpellSlotMenuMenu::new));
	public static final RegistryObject<MenuType<StatsGuiMenu>> STATS_GUI = REGISTRY.register("stats_gui", () -> IForgeMenuType.create(StatsGuiMenu::new));
	public static final RegistryObject<MenuType<SeaTransformationGuiMenu>> SEA_TRANSFORMATION_GUI = REGISTRY.register("sea_transformation_gui", () -> IForgeMenuType.create(SeaTransformationGuiMenu::new));
}
