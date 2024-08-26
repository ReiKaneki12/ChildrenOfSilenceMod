package net.mcreator.childrenofsilence.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.childrenofsilence.world.inventory.SeaTransformationGuiMenu;
import net.mcreator.childrenofsilence.procedures.ReturnPenguinModelProcedure;
import net.mcreator.childrenofsilence.procedures.ReturnAxolotlModelProcedure;
import net.mcreator.childrenofsilence.network.SeaTransformationGuiButtonMessage;
import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SeaTransformationGuiScreen extends AbstractContainerScreen<SeaTransformationGuiMenu> {
	private final static HashMap<String, Object> guistate = SeaTransformationGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_penguin;
	Button button_axolotl;

	public SeaTransformationGuiScreen(SeaTransformationGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("children_of_silence:textures/screens/sea_transformation_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (ReturnPenguinModelProcedure.execute(world) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 90, this.topPos + 34, 30, 0f + (float) Math.atan((this.leftPos + 90 - mouseX) / 40.0), (float) Math.atan((this.topPos + -15 - mouseY) / 40.0), livingEntity);
		}
		if (ReturnAxolotlModelProcedure.execute(world) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 90, this.topPos + 134, 30, 0f + (float) Math.atan((this.leftPos + 90 - mouseX) / 40.0), (float) Math.atan((this.topPos + 85 - mouseY) / 40.0), livingEntity);
		}
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
	}

	@Override
	public void init() {
		super.init();
		button_penguin = Button.builder(Component.translatable("gui.children_of_silence.sea_transformation_gui.button_penguin"), e -> {
			if (true) {
				ChildrenOfSilenceMod.PACKET_HANDLER.sendToServer(new SeaTransformationGuiButtonMessage(0, x, y, z));
				SeaTransformationGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 19, 61, 20).build();
		guistate.put("button:button_penguin", button_penguin);
		this.addRenderableWidget(button_penguin);
		button_axolotl = Button.builder(Component.translatable("gui.children_of_silence.sea_transformation_gui.button_axolotl"), e -> {
			if (true) {
				ChildrenOfSilenceMod.PACKET_HANDLER.sendToServer(new SeaTransformationGuiButtonMessage(1, x, y, z));
				SeaTransformationGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 119, 61, 20).build();
		guistate.put("button:button_axolotl", button_axolotl);
		this.addRenderableWidget(button_axolotl);
	}
}
