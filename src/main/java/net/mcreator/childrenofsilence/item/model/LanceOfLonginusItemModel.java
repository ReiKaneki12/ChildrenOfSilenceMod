package net.mcreator.childrenofsilence.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.childrenofsilence.item.LanceOfLonginusItem;

public class LanceOfLonginusItemModel extends GeoModel<LanceOfLonginusItem> {
	@Override
	public ResourceLocation getAnimationResource(LanceOfLonginusItem animatable) {
		return new ResourceLocation("children_of_silence", "animations/longinus_spear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LanceOfLonginusItem animatable) {
		return new ResourceLocation("children_of_silence", "geo/longinus_spear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LanceOfLonginusItem animatable) {
		return new ResourceLocation("children_of_silence", "textures/item/longinus_spear.png");
	}
}
