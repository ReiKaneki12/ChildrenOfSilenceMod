
package net.mcreator.childrenofsilence.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.mcreator.childrenofsilence.procedures.ReturnOverlayTrueProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnManaValueProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnColldownValueProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnColldownOverlayTrueProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ManaOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			if (ReturnOverlayTrueProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						ReturnManaValueProcedure.execute(entity), w / 2 + 92, h - 12, -16724788, false);
			if (ReturnColldownOverlayTrueProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						ReturnColldownValueProcedure.execute(entity), w / 2 + -118, h - 12, -3407872, false);
		}
	}
}
