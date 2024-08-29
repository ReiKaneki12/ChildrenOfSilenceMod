package net.mcreator.childrenofsilence.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

import java.util.function.Supplier;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChildrenOfSilenceModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		ChildrenOfSilenceMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		ChildrenOfSilenceMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.ActualMana = original.ActualMana;
			clone.MaxMana = original.MaxMana;
			clone.SpellSlot0 = original.SpellSlot0;
			clone.SpellSlot1 = original.SpellSlot1;
			clone.SpellSlot2 = original.SpellSlot2;
			clone.SpellSlot3 = original.SpellSlot3;
			clone.SpellSlot4 = original.SpellSlot4;
			clone.ActualSpellSlot = original.ActualSpellSlot;
			clone.ActualSpellInSpellSlot = original.ActualSpellInSpellSlot;
			clone.SpellMenuJustClosed = original.SpellMenuJustClosed;
			clone.NameOfSpellInActualSlot = original.NameOfSpellInActualSlot;
			clone.MageClass = original.MageClass;
			clone.ManaRegenTick = original.ManaRegenTick;
			clone.SpellColldown = original.SpellColldown;
			clone.TrueSightIsOn = original.TrueSightIsOn;
			clone.Slot0SpellName = original.Slot0SpellName;
			clone.Slot1SpellName = original.Slot1SpellName;
			clone.Slot2SpellName = original.Slot2SpellName;
			clone.Slot3SpellName = original.Slot3SpellName;
			clone.Slot4SpellName = original.Slot4SpellName;
			clone.RealMageClass = original.RealMageClass;
			clone.RealMaxMana = original.RealMaxMana;
			clone.StatStr = original.StatStr;
			clone.StatDex = original.StatDex;
			clone.StatCon = original.StatCon;
			clone.RunMode = original.RunMode;
			clone.StatsPoints = original.StatsPoints;
			clone.StatInt = original.StatInt;
			clone.isPenguin = original.isPenguin;
			clone.isAxolotl = original.isAxolotl;
			if (!event.isWasDeath()) {
			}
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					ChildrenOfSilenceMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					ChildrenOfSilenceMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					ChildrenOfSilenceMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "children_of_silence_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				ChildrenOfSilenceMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "children_of_silence_mapvars";
		public String PlayerImmuneSlash = "\"\"";
		public boolean assss = true;
		public boolean WorldJustLoaded = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			PlayerImmuneSlash = nbt.getString("PlayerImmuneSlash");
			assss = nbt.getBoolean("assss");
			WorldJustLoaded = nbt.getBoolean("WorldJustLoaded");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putString("PlayerImmuneSlash", PlayerImmuneSlash);
			nbt.putBoolean("assss", assss);
			nbt.putBoolean("WorldJustLoaded", WorldJustLoaded);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				ChildrenOfSilenceMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("children_of_silence", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double ActualMana = 0.0;
		public double MaxMana = 10.0;
		public double SpellSlot0 = 0;
		public double SpellSlot1 = 0;
		public double SpellSlot2 = 0;
		public double SpellSlot3 = 0;
		public double SpellSlot4 = 0;
		public double ActualSpellSlot = 0;
		public double ActualSpellInSpellSlot = 0;
		public boolean SpellMenuJustClosed = false;
		public String NameOfSpellInActualSlot = "\"\"";
		public double MageClass = 0.0;
		public double ManaRegenTick = 0;
		public double SpellColldown = 0;
		public boolean TrueSightIsOn = false;
		public String Slot0SpellName = "\"\"";
		public String Slot1SpellName = "\"\"";
		public String Slot2SpellName = "\"\"";
		public String Slot3SpellName = "\"\"";
		public String Slot4SpellName = "";
		public double RealMageClass = 0;
		public double RealMaxMana = 0;
		public double StatStr = 10.0;
		public double StatDex = 10.0;
		public double StatCon = 10.0;
		public boolean RunMode = false;
		public double StatsPoints = 0;
		public double StatInt = 10.0;
		public boolean isPenguin = false;
		public boolean isAxolotl = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				ChildrenOfSilenceMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(entity.level()::dimension), new PlayerVariablesSyncMessage(this, entity.getId()));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("ActualMana", ActualMana);
			nbt.putDouble("MaxMana", MaxMana);
			nbt.putDouble("SpellSlot0", SpellSlot0);
			nbt.putDouble("SpellSlot1", SpellSlot1);
			nbt.putDouble("SpellSlot2", SpellSlot2);
			nbt.putDouble("SpellSlot3", SpellSlot3);
			nbt.putDouble("SpellSlot4", SpellSlot4);
			nbt.putDouble("ActualSpellSlot", ActualSpellSlot);
			nbt.putDouble("ActualSpellInSpellSlot", ActualSpellInSpellSlot);
			nbt.putBoolean("SpellMenuJustClosed", SpellMenuJustClosed);
			nbt.putString("NameOfSpellInActualSlot", NameOfSpellInActualSlot);
			nbt.putDouble("MageClass", MageClass);
			nbt.putDouble("ManaRegenTick", ManaRegenTick);
			nbt.putDouble("SpellColldown", SpellColldown);
			nbt.putBoolean("TrueSightIsOn", TrueSightIsOn);
			nbt.putString("Slot0SpellName", Slot0SpellName);
			nbt.putString("Slot1SpellName", Slot1SpellName);
			nbt.putString("Slot2SpellName", Slot2SpellName);
			nbt.putString("Slot3SpellName", Slot3SpellName);
			nbt.putString("Slot4SpellName", Slot4SpellName);
			nbt.putDouble("RealMageClass", RealMageClass);
			nbt.putDouble("RealMaxMana", RealMaxMana);
			nbt.putDouble("StatStr", StatStr);
			nbt.putDouble("StatDex", StatDex);
			nbt.putDouble("StatCon", StatCon);
			nbt.putBoolean("RunMode", RunMode);
			nbt.putDouble("StatsPoints", StatsPoints);
			nbt.putDouble("StatInt", StatInt);
			nbt.putBoolean("isPenguin", isPenguin);
			nbt.putBoolean("isAxolotl", isAxolotl);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			ActualMana = nbt.getDouble("ActualMana");
			MaxMana = nbt.getDouble("MaxMana");
			SpellSlot0 = nbt.getDouble("SpellSlot0");
			SpellSlot1 = nbt.getDouble("SpellSlot1");
			SpellSlot2 = nbt.getDouble("SpellSlot2");
			SpellSlot3 = nbt.getDouble("SpellSlot3");
			SpellSlot4 = nbt.getDouble("SpellSlot4");
			ActualSpellSlot = nbt.getDouble("ActualSpellSlot");
			ActualSpellInSpellSlot = nbt.getDouble("ActualSpellInSpellSlot");
			SpellMenuJustClosed = nbt.getBoolean("SpellMenuJustClosed");
			NameOfSpellInActualSlot = nbt.getString("NameOfSpellInActualSlot");
			MageClass = nbt.getDouble("MageClass");
			ManaRegenTick = nbt.getDouble("ManaRegenTick");
			SpellColldown = nbt.getDouble("SpellColldown");
			TrueSightIsOn = nbt.getBoolean("TrueSightIsOn");
			Slot0SpellName = nbt.getString("Slot0SpellName");
			Slot1SpellName = nbt.getString("Slot1SpellName");
			Slot2SpellName = nbt.getString("Slot2SpellName");
			Slot3SpellName = nbt.getString("Slot3SpellName");
			Slot4SpellName = nbt.getString("Slot4SpellName");
			RealMageClass = nbt.getDouble("RealMageClass");
			RealMaxMana = nbt.getDouble("RealMaxMana");
			StatStr = nbt.getDouble("StatStr");
			StatDex = nbt.getDouble("StatDex");
			StatCon = nbt.getDouble("StatCon");
			RunMode = nbt.getBoolean("RunMode");
			StatsPoints = nbt.getDouble("StatsPoints");
			StatInt = nbt.getDouble("StatInt");
			isPenguin = nbt.getBoolean("isPenguin");
			isAxolotl = nbt.getBoolean("isAxolotl");
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ChildrenOfSilenceMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	public static class PlayerVariablesSyncMessage {
		private final int target;
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
			this.target = buffer.readInt();
		}

		public PlayerVariablesSyncMessage(PlayerVariables data, int entityid) {
			this.data = data;
			this.target = entityid;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
			buffer.writeInt(message.target);
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.level().getEntity(message.target).getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.ActualMana = message.data.ActualMana;
					variables.MaxMana = message.data.MaxMana;
					variables.SpellSlot0 = message.data.SpellSlot0;
					variables.SpellSlot1 = message.data.SpellSlot1;
					variables.SpellSlot2 = message.data.SpellSlot2;
					variables.SpellSlot3 = message.data.SpellSlot3;
					variables.SpellSlot4 = message.data.SpellSlot4;
					variables.ActualSpellSlot = message.data.ActualSpellSlot;
					variables.ActualSpellInSpellSlot = message.data.ActualSpellInSpellSlot;
					variables.SpellMenuJustClosed = message.data.SpellMenuJustClosed;
					variables.NameOfSpellInActualSlot = message.data.NameOfSpellInActualSlot;
					variables.MageClass = message.data.MageClass;
					variables.ManaRegenTick = message.data.ManaRegenTick;
					variables.SpellColldown = message.data.SpellColldown;
					variables.TrueSightIsOn = message.data.TrueSightIsOn;
					variables.Slot0SpellName = message.data.Slot0SpellName;
					variables.Slot1SpellName = message.data.Slot1SpellName;
					variables.Slot2SpellName = message.data.Slot2SpellName;
					variables.Slot3SpellName = message.data.Slot3SpellName;
					variables.Slot4SpellName = message.data.Slot4SpellName;
					variables.RealMageClass = message.data.RealMageClass;
					variables.RealMaxMana = message.data.RealMaxMana;
					variables.StatStr = message.data.StatStr;
					variables.StatDex = message.data.StatDex;
					variables.StatCon = message.data.StatCon;
					variables.RunMode = message.data.RunMode;
					variables.StatsPoints = message.data.StatsPoints;
					variables.StatInt = message.data.StatInt;
					variables.isPenguin = message.data.isPenguin;
					variables.isAxolotl = message.data.isAxolotl;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
