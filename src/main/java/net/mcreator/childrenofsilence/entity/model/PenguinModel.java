package net.mcreator.childrenofsilence.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.childrenofsilence.entity.PenguinEntity;

public class PenguinModel extends GeoModel<PenguinEntity> {
	@Override
	public ResourceLocation getAnimationResource(PenguinEntity entity) {
		return new ResourceLocation("children_of_silence", "animations/penguin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PenguinEntity entity) {
		return new ResourceLocation("children_of_silence", "geo/penguin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PenguinEntity entity) {
		return new ResourceLocation("children_of_silence", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(PenguinEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
