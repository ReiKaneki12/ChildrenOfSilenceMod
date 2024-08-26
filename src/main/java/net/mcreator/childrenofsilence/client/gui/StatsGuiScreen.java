package net.mcreator.childrenofsilence.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.childrenofsilence.world.inventory.StatsGuiMenu;
import net.mcreator.childrenofsilence.procedures.ReturnStrProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnStatPointsProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnIntProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnDexProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnConProcedure;
import net.mcreator.childrenofsilence.network.StatsGuiButtonMessage;
import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StatsGuiScreen extends AbstractContainerScreen<StatsGuiMenu> {
	private final static HashMap<String, Object> guistate = StatsGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_empty2;
	Button button_reset;
	Button button_empty3;

	public StatsGuiScreen(StatsGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("children_of_silence:textures/screens/stats_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.children_of_silence.stats_gui.label_str"), 5, 9, -3407872, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.children_of_silence.stats_gui.label_dex"), 5, 44, -16711834, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.children_of_silence.stats_gui.label_con"), 5, 79, -256, false);
		guiGraphics.drawString(this.font,

				ReturnStrProcedure.execute(entity), 30, 9, -16777216, false);
		guiGraphics.drawString(this.font,

				ReturnDexProcedure.execute(entity), 30, 44, -16777216, false);
		guiGraphics.drawString(this.font,

				ReturnConProcedure.execute(entity), 30, 79, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.children_of_silence.stats_gui.label_stat_points"), 5, 149, -16777216, false);
		guiGraphics.drawString(this.font,

				ReturnStatPointsProcedure.execute(entity), 65, 149, -16711681, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.children_of_silence.stats_gui.label_int"), 5, 114, -16763905, false);
		guiGraphics.drawString(this.font,

				ReturnIntProcedure.execute(entity), 30, 114, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.children_of_silence.stats_gui.button_empty"), e -> {
			if (true) {
				ChildrenOfSilenceMod.PACKET_HANDLER.sendToServer(new StatsGuiButtonMessage(0, x, y, z));
				StatsGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 4, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.children_of_silence.stats_gui.button_empty1"), e -> {
			if (true) {
				ChildrenOfSilenceMod.PACKET_HANDLER.sendToServer(new StatsGuiButtonMessage(1, x, y, z));
				StatsGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 39, 30, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_empty2 = Button.builder(Component.translatable("gui.children_of_silence.stats_gui.button_empty2"), e -> {
			if (true) {
				ChildrenOfSilenceMod.PACKET_HANDLER.sendToServer(new StatsGuiButtonMessage(2, x, y, z));
				StatsGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 74, 30, 20).build();
		guistate.put("button:button_empty2", button_empty2);
		this.addRenderableWidget(button_empty2);
		button_reset = Button.builder(Component.translatable("gui.children_of_silence.stats_gui.button_reset"), e -> {
			if (true) {
				ChildrenOfSilenceMod.PACKET_HANDLER.sendToServer(new StatsGuiButtonMessage(3, x, y, z));
				StatsGuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 120, this.topPos + 139, 51, 20).build();
		guistate.put("button:button_reset", button_reset);
		this.addRenderableWidget(button_reset);
		button_empty3 = Button.builder(Component.translatable("gui.children_of_silence.stats_gui.button_empty3"), e -> {
			if (true) {
				ChildrenOfSilenceMod.PACKET_HANDLER.sendToServer(new StatsGuiButtonMessage(4, x, y, z));
				StatsGuiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 109, 30, 20).build();
		guistate.put("button:button_empty3", button_empty3);
		this.addRenderableWidget(button_empty3);
	}
}
