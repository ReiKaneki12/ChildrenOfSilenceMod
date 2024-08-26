
package net.mcreator.childrenofsilence.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.childrenofsilence.world.inventory.StatsGuiMenu;
import net.mcreator.childrenofsilence.procedures.ResetStatsProcedure;
import net.mcreator.childrenofsilence.procedures.IncreaseStrProcedure;
import net.mcreator.childrenofsilence.procedures.IncreaseIntProcedure;
import net.mcreator.childrenofsilence.procedures.IncreaseDexProcedure;
import net.mcreator.childrenofsilence.procedures.IncreaseConProcedure;
import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StatsGuiButtonMessage {
	private final int buttonID, x, y, z;

	public StatsGuiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public StatsGuiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(StatsGuiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(StatsGuiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = StatsGuiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			IncreaseStrProcedure.execute(entity);
		}
		if (buttonID == 1) {

			IncreaseDexProcedure.execute(entity);
		}
		if (buttonID == 2) {

			IncreaseConProcedure.execute(entity);
		}
		if (buttonID == 3) {

			ResetStatsProcedure.execute(entity);
		}
		if (buttonID == 4) {

			IncreaseIntProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ChildrenOfSilenceMod.addNetworkMessage(StatsGuiButtonMessage.class, StatsGuiButtonMessage::buffer, StatsGuiButtonMessage::new, StatsGuiButtonMessage::handler);
	}
}
