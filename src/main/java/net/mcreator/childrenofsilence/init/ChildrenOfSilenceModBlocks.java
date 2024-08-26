
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.childrenofsilence.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.childrenofsilence.block.ManaShardOreBlock;
import net.mcreator.childrenofsilence.block.ManaShardBlockBlock;
import net.mcreator.childrenofsilence.block.ElvenCoffinNoSwordBlock;
import net.mcreator.childrenofsilence.block.ElvenCoffinBlock;
import net.mcreator.childrenofsilence.block.DeepslateManaShardOreBlock;
import net.mcreator.childrenofsilence.ChildrenOfSilenceMod;

public class ChildrenOfSilenceModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChildrenOfSilenceMod.MODID);
	public static final RegistryObject<Block> MANA_SHARD_ORE = REGISTRY.register("mana_shard_ore", () -> new ManaShardOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_MANA_SHARD_ORE = REGISTRY.register("deepslate_mana_shard_ore", () -> new DeepslateManaShardOreBlock());
	public static final RegistryObject<Block> MANA_SHARD_BLOCK = REGISTRY.register("mana_shard_block", () -> new ManaShardBlockBlock());
	public static final RegistryObject<Block> ELVEN_COFFIN = REGISTRY.register("elven_coffin", () -> new ElvenCoffinBlock());
	public static final RegistryObject<Block> ELVEN_COFFIN_NO_SWORD = REGISTRY.register("elven_coffin_no_sword", () -> new ElvenCoffinNoSwordBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
