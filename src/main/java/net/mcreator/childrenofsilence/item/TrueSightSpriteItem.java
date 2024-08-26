
package net.mcreator.childrenofsilence.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TrueSightSpriteItem extends Item {
	public TrueSightSpriteItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}
}
