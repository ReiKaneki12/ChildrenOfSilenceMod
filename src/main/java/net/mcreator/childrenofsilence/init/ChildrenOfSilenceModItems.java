
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.childrenofsilence.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ArmorItem;

import net.mcreator.childrenofsilence.item.TrueSightSpriteItem;
import net.mcreator.childrenofsilence.item.SpawnParticleDebugItem;
import net.mcreator.childrenofsilence.item.SlayerTabSpriteItem;
import net.mcreator.childrenofsilence.item.SlayerDaggerItem;
import net.mcreator.childrenofsilence.item.SeaTransformationSpriteItem;
import net.mcreator.childrenofsilence.item.RuinOfHadesLanceItem;
import net.mcreator.childrenofsilence.item.RefinedManShardItem;
import net.mcreator.childrenofsilence.item.ManaShardItem;
import net.mcreator.childrenofsilence.item.KyotoKatanaItem;
import net.mcreator.childrenofsilence.item.IllusionWalkerItem;
import net.mcreator.childrenofsilence.item.HayateTabSpriteItem;
import net.mcreator.childrenofsilence.item.HayateRustedKatanaItem;
import net.mcreator.childrenofsilence.item.HayateKatanaItem;
import net.mcreator.childrenofsilence.item.HayateClaymoreItem;
import net.mcreator.childrenofsilence.item.FireBallSpriteItem;
import net.mcreator.childrenofsilence.item.EsckTabSpriteItem;
import net.mcreator.childrenofsilence.item.EsckDemonArmorItem;
import net.mcreator.childrenofsilence.item.EsckArmorItem;
import net.mcreator.childrenofsilence.item.ElvenNekclaceItem;
import net.mcreator.childrenofsilence.item.DrakenTabSpriteItem;
import net.mcreator.childrenofsilence.item.DrakenSteelBallItem;
import net.mcreator.childrenofsilence.item.DrakenRapierItem;
import net.mcreator.childrenofsilence.item.DrakenAnchorItem;
import net.mcreator.childrenofsilence.item.CowboyCoatItem;
import net.mcreator.childrenofsilence.item.CheckSpellsSlotDebugItem;
import net.mcreator.childrenofsilence.item.CheckManaDebugItem;
import net.mcreator.childrenofsilence.item.AngleCheckerItem;
import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

public class ChildrenOfSilenceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChildrenOfSilenceMod.MODID);
	public static final RegistryObject<Item> TRUE_SIGHT_SPRITE = REGISTRY.register("true_sight_sprite", () -> new TrueSightSpriteItem());
	public static final RegistryObject<Item> CHECK_SPELLS_SLOT_DEBUG = REGISTRY.register("check_spells_slot_debug", () -> new CheckSpellsSlotDebugItem());
	public static final RegistryObject<Item> CHECK_MANA_DEBUG = REGISTRY.register("check_mana_debug", () -> new CheckManaDebugItem());
	public static final RegistryObject<Item> SPAWN_PARTICLE_DEBUG = REGISTRY.register("spawn_particle_debug", () -> new SpawnParticleDebugItem());
	public static final RegistryObject<Item> HAYATE_TAB_SPRITE = REGISTRY.register("hayate_tab_sprite", () -> new HayateTabSpriteItem());
	public static final RegistryObject<Item> HAYATE_KATANA = REGISTRY.register("hayate_katana", () -> new HayateKatanaItem());
	public static final RegistryObject<Item> HAYATE_CLAYMORE = REGISTRY.register("hayate_claymore", () -> new HayateClaymoreItem());
	public static final RegistryObject<Item> SLAYER_TAB_SPRITE = REGISTRY.register("slayer_tab_sprite", () -> new SlayerTabSpriteItem());
	public static final RegistryObject<Item> SLAYER_DAGGER = REGISTRY.register("slayer_dagger", () -> new SlayerDaggerItem());
	public static final RegistryObject<Item> ILLUSION_WALKER_HELMET = REGISTRY.register("illusion_walker_helmet", () -> new IllusionWalkerItem.Helmet());
	public static final RegistryObject<Item> ILLUSION_WALKER_CHESTPLATE = REGISTRY.register("illusion_walker_chestplate", () -> new IllusionWalkerItem.Chestplate());
	public static final RegistryObject<Item> ILLUSION_WALKER_LEGGINGS = REGISTRY.register("illusion_walker_leggings", () -> new IllusionWalkerItem.Leggings());
	public static final RegistryObject<Item> ILLUSION_WALKER_BOOTS = REGISTRY.register("illusion_walker_boots", () -> new IllusionWalkerItem.Boots());
	public static final RegistryObject<Item> MANA_SHARD_ORE = block(ChildrenOfSilenceModBlocks.MANA_SHARD_ORE);
	public static final RegistryObject<Item> DEEPSLATE_MANA_SHARD_ORE = block(ChildrenOfSilenceModBlocks.DEEPSLATE_MANA_SHARD_ORE);
	public static final RegistryObject<Item> MANA_SHARD = REGISTRY.register("mana_shard", () -> new ManaShardItem());
	public static final RegistryObject<Item> REFINED_MAN_SHARD = REGISTRY.register("refined_man_shard", () -> new RefinedManShardItem());
	public static final RegistryObject<Item> MANA_SHARD_BLOCK = block(ChildrenOfSilenceModBlocks.MANA_SHARD_BLOCK);
	public static final RegistryObject<Item> DRAKEN_ANCHOR = REGISTRY.register("draken_anchor", () -> new DrakenAnchorItem());
	public static final RegistryObject<Item> DRAKEN_TAB_SPRITE = REGISTRY.register("draken_tab_sprite", () -> new DrakenTabSpriteItem());
	public static final RegistryObject<Item> FIRE_BALL_SPRITE = REGISTRY.register("fire_ball_sprite", () -> new FireBallSpriteItem());
	public static final RegistryObject<Item> DRAKEN_RAPIER = REGISTRY.register("draken_rapier", () -> new DrakenRapierItem());
	public static final RegistryObject<Item> ANGLE_CHECKER = REGISTRY.register("angle_checker", () -> new AngleCheckerItem());
	public static final RegistryObject<Item> LICH_OF_THE_DARKNESS_SPAWN_EGG = REGISTRY.register("lich_of_the_darkness_spawn_egg",
			() -> new ForgeSpawnEggItem(ChildrenOfSilenceModEntities.LICH_OF_THE_DARKNESS, -6710887, -13434778, new Item.Properties()));
	public static final RegistryObject<Item> ELVEN_NEKCLACE = REGISTRY.register("elven_nekclace", () -> new ElvenNekclaceItem());
	public static final RegistryObject<Item> ELVEN_COFFIN = block(ChildrenOfSilenceModBlocks.ELVEN_COFFIN);
	public static final RegistryObject<Item> ELVEN_COFFIN_NO_SWORD = block(ChildrenOfSilenceModBlocks.ELVEN_COFFIN_NO_SWORD);
	public static final RegistryObject<Item> HAYATE_RUSTED_KATANA = REGISTRY.register("hayate_rusted_katana", () -> new HayateRustedKatanaItem());
	public static final RegistryObject<Item> SEA_TRANSFORMATION_SPRITE = REGISTRY.register("sea_transformation_sprite", () -> new SeaTransformationSpriteItem());
	public static final RegistryObject<Item> PENGUIN_SPAWN_EGG = REGISTRY.register("penguin_spawn_egg", () -> new ForgeSpawnEggItem(ChildrenOfSilenceModEntities.PENGUIN, -1, -16777216, new Item.Properties()));
	public static final RegistryObject<CowboyCoatItem> COWBOY_COAT_HELMET = REGISTRY.register("cowboy_coat_helmet", () -> new CowboyCoatItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<CowboyCoatItem> COWBOY_COAT_CHESTPLATE = REGISTRY.register("cowboy_coat_chestplate", () -> new CowboyCoatItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<CowboyCoatItem> COWBOY_COAT_LEGGINGS = REGISTRY.register("cowboy_coat_leggings", () -> new CowboyCoatItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<CowboyCoatItem> COWBOY_COAT_BOOTS = REGISTRY.register("cowboy_coat_boots", () -> new CowboyCoatItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<Item> DRAKEN_STEEL_BALL = REGISTRY.register("draken_steel_ball", () -> new DrakenSteelBallItem());
	public static final RegistryObject<Item> KYOTO_KATANA = REGISTRY.register("kyoto_katana", () -> new KyotoKatanaItem());
	public static final RegistryObject<Item> RUIN_OF_HADES_LANCE = REGISTRY.register("ruin_of_hades_lance", () -> new RuinOfHadesLanceItem());
	public static final RegistryObject<EsckArmorItem> ESCK_ARMOR_HELMET = REGISTRY.register("esck_armor_helmet", () -> new EsckArmorItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<EsckArmorItem> ESCK_ARMOR_CHESTPLATE = REGISTRY.register("esck_armor_chestplate", () -> new EsckArmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<EsckArmorItem> ESCK_ARMOR_LEGGINGS = REGISTRY.register("esck_armor_leggings", () -> new EsckArmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<EsckArmorItem> ESCK_ARMOR_BOOTS = REGISTRY.register("esck_armor_boots", () -> new EsckArmorItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<EsckDemonArmorItem> ESCK_DEMON_ARMOR_HELMET = REGISTRY.register("esck_demon_armor_helmet", () -> new EsckDemonArmorItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<EsckDemonArmorItem> ESCK_DEMON_ARMOR_CHESTPLATE = REGISTRY.register("esck_demon_armor_chestplate", () -> new EsckDemonArmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<EsckDemonArmorItem> ESCK_DEMON_ARMOR_LEGGINGS = REGISTRY.register("esck_demon_armor_leggings", () -> new EsckDemonArmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<EsckDemonArmorItem> ESCK_DEMON_ARMOR_BOOTS = REGISTRY.register("esck_demon_armor_boots", () -> new EsckDemonArmorItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<Item> ESCK_TAB_SPRITE = REGISTRY.register("esck_tab_sprite", () -> new EsckTabSpriteItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
