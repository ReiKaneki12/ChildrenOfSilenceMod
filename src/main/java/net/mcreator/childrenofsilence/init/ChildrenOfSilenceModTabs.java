
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.childrenofsilence.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChildrenOfSilenceModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChildrenOfSilenceMod.MODID);
	public static final RegistryObject<CreativeModeTab> HAYATE_TAB = REGISTRY.register("hayate_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.children_of_silence.hayate_tab")).icon(() -> new ItemStack(ChildrenOfSilenceModItems.HAYATE_TAB_SPRITE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ChildrenOfSilenceModItems.HAYATE_KATANA.get());
				tabData.accept(ChildrenOfSilenceModItems.HAYATE_CLAYMORE.get());
				tabData.accept(ChildrenOfSilenceModItems.ELVEN_NEKCLACE.get());
				tabData.accept(ChildrenOfSilenceModBlocks.ELVEN_COFFIN.get().asItem());
				tabData.accept(ChildrenOfSilenceModBlocks.ELVEN_COFFIN_NO_SWORD.get().asItem());
				tabData.accept(ChildrenOfSilenceModItems.HAYATE_RUSTED_KATANA.get());
				tabData.accept(ChildrenOfSilenceModItems.KYOTO_KATANA.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> MAGIC_BLOCKS = REGISTRY.register("magic_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.children_of_silence.magic_blocks")).icon(() -> new ItemStack(ChildrenOfSilenceModBlocks.MANA_SHARD_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ChildrenOfSilenceModBlocks.MANA_SHARD_ORE.get().asItem());
				tabData.accept(ChildrenOfSilenceModBlocks.DEEPSLATE_MANA_SHARD_ORE.get().asItem());
				tabData.accept(ChildrenOfSilenceModBlocks.MANA_SHARD_BLOCK.get().asItem());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> MAGIC = REGISTRY.register("magic",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.children_of_silence.magic")).icon(() -> new ItemStack(ChildrenOfSilenceModItems.REFINED_MAN_SHARD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ChildrenOfSilenceModItems.MANA_SHARD.get());
				tabData.accept(ChildrenOfSilenceModItems.REFINED_MAN_SHARD.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> SPELLS = REGISTRY.register("spells",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.children_of_silence.spells")).icon(() -> new ItemStack(ChildrenOfSilenceModItems.TRUE_SIGHT_SPRITE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ChildrenOfSilenceModItems.TRUE_SIGHT_SPRITE.get());
				tabData.accept(ChildrenOfSilenceModItems.FIRE_BALL_SPRITE.get());
				tabData.accept(ChildrenOfSilenceModItems.SEA_TRANSFORMATION_SPRITE.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> SLAYER_TAB = REGISTRY.register("slayer_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.children_of_silence.slayer_tab")).icon(() -> new ItemStack(ChildrenOfSilenceModItems.SLAYER_TAB_SPRITE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ChildrenOfSilenceModItems.SLAYER_DAGGER.get());
				tabData.accept(ChildrenOfSilenceModItems.ILLUSION_WALKER_HELMET.get());
				tabData.accept(ChildrenOfSilenceModItems.ILLUSION_WALKER_CHESTPLATE.get());
				tabData.accept(ChildrenOfSilenceModItems.ILLUSION_WALKER_LEGGINGS.get());
				tabData.accept(ChildrenOfSilenceModItems.ILLUSION_WALKER_BOOTS.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> DRAKEN_TAB = REGISTRY.register("draken_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.children_of_silence.draken_tab")).icon(() -> new ItemStack(ChildrenOfSilenceModItems.DRAKEN_TAB_SPRITE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ChildrenOfSilenceModItems.DRAKEN_ANCHOR.get());
				tabData.accept(ChildrenOfSilenceModItems.DRAKEN_RAPIER.get());
				tabData.accept(ChildrenOfSilenceModItems.COWBOY_COAT_HELMET.get());
				tabData.accept(ChildrenOfSilenceModItems.COWBOY_COAT_CHESTPLATE.get());
				tabData.accept(ChildrenOfSilenceModItems.COWBOY_COAT_LEGGINGS.get());
				tabData.accept(ChildrenOfSilenceModItems.COWBOY_COAT_BOOTS.get());
				tabData.accept(ChildrenOfSilenceModItems.DRAKEN_STEEL_BALL.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> DEBUG = REGISTRY.register("debug",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.children_of_silence.debug")).icon(() -> new ItemStack(Items.DEBUG_STICK)).displayItems((parameters, tabData) -> {
				tabData.accept(ChildrenOfSilenceModItems.CHECK_SPELLS_SLOT_DEBUG.get());
				tabData.accept(ChildrenOfSilenceModItems.CHECK_MANA_DEBUG.get());
				tabData.accept(ChildrenOfSilenceModItems.SPAWN_PARTICLE_DEBUG.get());
				tabData.accept(ChildrenOfSilenceModItems.ANGLE_CHECKER.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ChildrenOfSilenceModItems.LICH_OF_THE_DARKNESS_SPAWN_EGG.get());
			tabData.accept(ChildrenOfSilenceModItems.PENGUIN_SPAWN_EGG.get());
		}
	}
}
