
package net.mcreator.childrenofsilence.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ManaShardItem extends Item {
	public ManaShardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
