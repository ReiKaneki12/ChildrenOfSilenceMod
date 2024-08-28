package net.mcreator.childrenofsilence.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.childrenofsilence.item.KyotoKatanaItem;

public class KyotoKatanaItemModel extends GeoModel<KyotoKatanaItem> {
	@Override
	public ResourceLocation getAnimationResource(KyotoKatanaItem animatable) {
		return new ResourceLocation("children_of_silence", "animations/kusanagi.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KyotoKatanaItem animatable) {
		return new ResourceLocation("children_of_silence", "geo/kusanagi.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KyotoKatanaItem animatable) {
		return new ResourceLocation("children_of_silence", "textures/item/kusanagi.png");
	}
}
