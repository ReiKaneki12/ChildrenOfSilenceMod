
package net.mcreator.childrenofsilence.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.childrenofsilence.procedures.ShowSelectedSlot4Procedure;
import net.mcreator.childrenofsilence.procedures.ShowSelectedSlot3Procedure;
import net.mcreator.childrenofsilence.procedures.ShowSelectedSlot2Procedure;
import net.mcreator.childrenofsilence.procedures.ShowSelectedSlot1Procedure;
import net.mcreator.childrenofsilence.procedures.ShowSelectedSlot0Procedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot4TrueSightSlotProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot4SeaTransormationSlotProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot4MagicNameProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot4FireBallSlotProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot3TrueSightSlotProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot3SeaTransormationSlotProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot3MagicNameProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot3FireBallSlotProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot2TrueSightSlotProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot2SeaTransormationSlotProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot2MagicNameProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot2FireBallSlotProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot1TrueSightSlotProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot1SeaTransormationSlotProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot1MagicNameProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot1FireBallSlotProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot0TrueSightSlotProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot0SeaTransormationSlotProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot0MagicNameProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnSlot0FireBallSlotProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnShowSlotIconsProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class MagicSlotsOverlayOverlay {
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
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (ReturnShowSlotIconsProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/unselected_magic_slot.png"), w - 181, h - 47, 0, 0, 180, 24, 180, 24);

			event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/unselected_magic_slot.png"), w - 181, h - 73, 0, 0, 180, 24, 180, 24);

			event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/unselected_magic_slot.png"), w - 181, h - 99, 0, 0, 180, 24, 180, 24);

			event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/unselected_magic_slot.png"), w - 181, h - 125, 0, 0, 180, 24, 180, 24);

			event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/unselected_magic_slot.png"), w - 181, h - 151, 0, 0, 180, 24, 180, 24);

			if (ShowSelectedSlot4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/selected_magic_slot.png"), w - 181, h - 47, 0, 0, 180, 24, 180, 24);
			}
			if (ShowSelectedSlot3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/selected_magic_slot.png"), w - 181, h - 73, 0, 0, 180, 24, 180, 24);
			}
			if (ShowSelectedSlot2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/selected_magic_slot.png"), w - 181, h - 99, 0, 0, 180, 24, 180, 24);
			}
			if (ShowSelectedSlot1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/selected_magic_slot.png"), w - 181, h - 125, 0, 0, 180, 24, 180, 24);
			}
			if (ShowSelectedSlot0Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/selected_magic_slot.png"), w - 181, h - 151, 0, 0, 180, 24, 180, 24);
			}
			if (ReturnSlot0TrueSightSlotProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/true_sight_magic_icon.png"), w - 23, h - 147, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnSlot1TrueSightSlotProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/true_sight_magic_icon.png"), w - 23, h - 121, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnSlot2TrueSightSlotProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/true_sight_magic_icon.png"), w - 23, h - 95, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnSlot3TrueSightSlotProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/true_sight_magic_icon.png"), w - 23, h - 69, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnSlot4TrueSightSlotProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/true_sight_magic_icon.png"), w - 23, h - 43, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnSlot0FireBallSlotProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/fire_ball_magic_icon.png"), w - 23, h - 147, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnSlot1FireBallSlotProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/fire_ball_magic_icon.png"), w - 23, h - 121, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnSlot2FireBallSlotProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/fire_ball_magic_icon.png"), w - 23, h - 95, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnSlot3FireBallSlotProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/fire_ball_magic_icon.png"), w - 23, h - 69, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnSlot4FireBallSlotProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/fire_ball_magic_icon.png"), w - 23, h - 43, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnSlot0SeaTransormationSlotProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/fish.png"), w - 23, h - 147, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnSlot1SeaTransormationSlotProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/fish.png"), w - 23, h - 121, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnSlot2SeaTransormationSlotProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/fish.png"), w - 23, h - 95, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnSlot3SeaTransormationSlotProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/fish.png"), w - 23, h - 69, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnSlot4SeaTransormationSlotProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("children_of_silence:textures/screens/fish.png"), w - 23, h - 43, 0, 0, 16, 16, 16, 16);
			}
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ReturnSlot0MagicNameProcedure.execute(entity), w - 174, h - 144, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ReturnSlot1MagicNameProcedure.execute(entity), w - 174, h - 118, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ReturnSlot2MagicNameProcedure.execute(entity), w - 174, h - 92, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ReturnSlot3MagicNameProcedure.execute(entity), w - 174, h - 66, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ReturnSlot4MagicNameProcedure.execute(entity), w - 174, h - 40, -1, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
