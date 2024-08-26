package net.mcreator.childrenofsilence.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.childrenofsilence.item.CowboyCoatItem;

public class CowboyCoatModel extends GeoModel<CowboyCoatItem> {
	@Override
	public ResourceLocation getAnimationResource(CowboyCoatItem object) {
		return new ResourceLocation("children_of_silence", "animations/draken_coat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CowboyCoatItem object) {
		return new ResourceLocation("children_of_silence", "geo/draken_coat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CowboyCoatItem object) {
		return new ResourceLocation("children_of_silence", "textures/item/draken_coat.png");
	}
}
