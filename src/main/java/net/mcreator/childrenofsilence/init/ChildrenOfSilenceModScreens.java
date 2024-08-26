
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.childrenofsilence.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.childrenofsilence.client.gui.StatsGuiScreen;
import net.mcreator.childrenofsilence.client.gui.SpellSlotMenuScreen;
import net.mcreator.childrenofsilence.client.gui.SeaTransformationGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ChildrenOfSilenceModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ChildrenOfSilenceModMenus.SPELL_SLOT_MENU.get(), SpellSlotMenuScreen::new);
			MenuScreens.register(ChildrenOfSilenceModMenus.STATS_GUI.get(), StatsGuiScreen::new);
			MenuScreens.register(ChildrenOfSilenceModMenus.SEA_TRANSFORMATION_GUI.get(), SeaTransformationGuiScreen::new);
		});
	}
}
