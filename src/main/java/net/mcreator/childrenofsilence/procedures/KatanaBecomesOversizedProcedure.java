package net.mcreator.childrenofsilence.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.childrenofsilence.init.ChildrenOfSilenceModItems;

public class KatanaBecomesOversizedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(ChildrenOfSilenceModItems.ELVEN_NEKCLACE.get(), lv).isPresent() : false) {
			if (entity.isShiftKeyDown()) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(ChildrenOfSilenceModItems.HAYATE_CLAYMORE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
	}
}
