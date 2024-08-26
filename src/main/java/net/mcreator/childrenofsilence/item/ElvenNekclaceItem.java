
package net.mcreator.childrenofsilence.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ElvenNekclaceItem extends Item implements ICurioItem {
	public ElvenNekclaceItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
