package net.mcreator.childrenofsilence.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.childrenofsilence.item.EsckDemonArmorItem;

public class EsckDemonArmorModel extends GeoModel<EsckDemonArmorItem> {
	@Override
	public ResourceLocation getAnimationResource(EsckDemonArmorItem object) {
		return new ResourceLocation("children_of_silence", "animations/esck_demon_mode.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EsckDemonArmorItem object) {
		return new ResourceLocation("children_of_silence", "geo/esck_demon_mode.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EsckDemonArmorItem object) {
		return new ResourceLocation("children_of_silence", "textures/item/esck_demon_mode.png");
	}
}
