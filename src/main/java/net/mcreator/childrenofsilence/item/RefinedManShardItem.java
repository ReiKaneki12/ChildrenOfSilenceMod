
package net.mcreator.childrenofsilence.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RefinedManShardItem extends Item {
	public RefinedManShardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
