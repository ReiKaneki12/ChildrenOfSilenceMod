package net.mcreator.childrenofsilence.procedures;

import software.bernie.geckolib.animatable.GeoItem;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.childrenofsilence.item.EsckDemonArmorItem;

public class EsckDemonArmorFlyAnimationProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player player && player.getAbilities().flying) {
			if (itemstack.getItem() instanceof EsckDemonArmorItem armor && armor instanceof GeoItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "empty");
			if (itemstack.getItem() instanceof EsckDemonArmorItem armor && armor instanceof GeoItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "fly");
		}
	}
}
