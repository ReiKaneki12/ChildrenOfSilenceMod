package net.mcreator.childrenofsilence.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.childrenofsilence.item.EsckArmorItem;

public class EsckArmorModel extends GeoModel<EsckArmorItem> {
	@Override
	public ResourceLocation getAnimationResource(EsckArmorItem object) {
		return new ResourceLocation("children_of_silence", "animations/esck_armor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EsckArmorItem object) {
		return new ResourceLocation("children_of_silence", "geo/esck_armor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EsckArmorItem object) {
		return new ResourceLocation("children_of_silence", "textures/item/esck_armor.png");
	}
}
