
package net.mcreator.childrenofsilence.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.childrenofsilence.entity.FireBallProjectileEntity;
import net.mcreator.childrenofsilence.client.model.Modelfire_ball;

public class FireBallProjectileRenderer extends MobRenderer<FireBallProjectileEntity, Modelfire_ball<FireBallProjectileEntity>> {
	public FireBallProjectileRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfire_ball(context.bakeLayer(Modelfire_ball.LAYER_LOCATION)), 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(FireBallProjectileEntity entity) {
		return new ResourceLocation("children_of_silence:textures/entities/fire_ball.png");
	}
}
