
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.childrenofsilence.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.childrenofsilence.network.UseSpellKeyMessage;
import net.mcreator.childrenofsilence.network.UseArmorSkillMessage;
import net.mcreator.childrenofsilence.network.ToggleRunModeMessage;
import net.mcreator.childrenofsilence.network.StatsMenuMessage;
import net.mcreator.childrenofsilence.network.SpellMenuMessage;
import net.mcreator.childrenofsilence.network.PreviousSpellMessage;
import net.mcreator.childrenofsilence.network.NextSpellMessage;
import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ChildrenOfSilenceModKeyMappings {
	public static final KeyMapping SPELL_MENU = new KeyMapping("key.children_of_silence.spell_menu", GLFW.GLFW_KEY_M, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ChildrenOfSilenceMod.PACKET_HANDLER.sendToServer(new SpellMenuMessage(0, 0));
				SpellMenuMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_SPELL_KEY = new KeyMapping("key.children_of_silence.use_spell_key", GLFW.GLFW_KEY_Z, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ChildrenOfSilenceMod.PACKET_HANDLER.sendToServer(new UseSpellKeyMessage(0, 0));
				UseSpellKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping NEXT_SPELL = new KeyMapping("key.children_of_silence.next_spell", GLFW.GLFW_KEY_DOWN, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ChildrenOfSilenceMod.PACKET_HANDLER.sendToServer(new NextSpellMessage(0, 0));
				NextSpellMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping PREVIOUS_SPELL = new KeyMapping("key.children_of_silence.previous_spell", GLFW.GLFW_KEY_UP, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ChildrenOfSilenceMod.PACKET_HANDLER.sendToServer(new PreviousSpellMessage(0, 0));
				PreviousSpellMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping STATS_MENU = new KeyMapping("key.children_of_silence.stats_menu", GLFW.GLFW_KEY_V, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ChildrenOfSilenceMod.PACKET_HANDLER.sendToServer(new StatsMenuMessage(0, 0));
				StatsMenuMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping TOGGLE_RUN_MODE = new KeyMapping("key.children_of_silence.toggle_run_mode", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ChildrenOfSilenceMod.PACKET_HANDLER.sendToServer(new ToggleRunModeMessage(0, 0));
				ToggleRunModeMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ARMOR_SKILL = new KeyMapping("key.children_of_silence.use_armor_skill", GLFW.GLFW_KEY_X, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ChildrenOfSilenceMod.PACKET_HANDLER.sendToServer(new UseArmorSkillMessage(0, 0));
				UseArmorSkillMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SPELL_MENU);
		event.register(USE_SPELL_KEY);
		event.register(NEXT_SPELL);
		event.register(PREVIOUS_SPELL);
		event.register(STATS_MENU);
		event.register(TOGGLE_RUN_MODE);
		event.register(USE_ARMOR_SKILL);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				SPELL_MENU.consumeClick();
				USE_SPELL_KEY.consumeClick();
				NEXT_SPELL.consumeClick();
				PREVIOUS_SPELL.consumeClick();
				STATS_MENU.consumeClick();
				TOGGLE_RUN_MODE.consumeClick();
				USE_ARMOR_SKILL.consumeClick();
			}
		}
	}
}
