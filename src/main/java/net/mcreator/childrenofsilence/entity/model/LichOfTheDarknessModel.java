package net.mcreator.childrenofsilence.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.childrenofsilence.entity.LichOfTheDarknessEntity;

public class LichOfTheDarknessModel extends GeoModel<LichOfTheDarknessEntity> {
	@Override
	public ResourceLocation getAnimationResource(LichOfTheDarknessEntity entity) {
		return new ResourceLocation("children_of_silence", "animations/eldritch_lich.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LichOfTheDarknessEntity entity) {
		return new ResourceLocation("children_of_silence", "geo/eldritch_lich.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LichOfTheDarknessEntity entity) {
		return new ResourceLocation("children_of_silence", "textures/entities/" + entity.getTexture() + ".png");
	}

}
