
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.childrenofsilence.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.childrenofsilence.client.model.Modelvertical_slash;
import net.mcreator.childrenofsilence.client.model.Modelsteel_ball_projectile;
import net.mcreator.childrenofsilence.client.model.Modelslayer_leggings;
import net.mcreator.childrenofsilence.client.model.Modelslayer_helmet_boots;
import net.mcreator.childrenofsilence.client.model.Modelslayer_chestplate;
import net.mcreator.childrenofsilence.client.model.Modelpenguin_normal_model;
import net.mcreator.childrenofsilence.client.model.Modelhorizontal_slash;
import net.mcreator.childrenofsilence.client.model.Modelfire_ball;
import net.mcreator.childrenofsilence.client.model.Modelaxolotl;
import net.mcreator.childrenofsilence.client.model.ModelElvenNecklace;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ChildrenOfSilenceModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelElvenNecklace.LAYER_LOCATION, ModelElvenNecklace::createBodyLayer);
		event.registerLayerDefinition(Modelaxolotl.LAYER_LOCATION, Modelaxolotl::createBodyLayer);
		event.registerLayerDefinition(Modelslayer_leggings.LAYER_LOCATION, Modelslayer_leggings::createBodyLayer);
		event.registerLayerDefinition(Modelvertical_slash.LAYER_LOCATION, Modelvertical_slash::createBodyLayer);
		event.registerLayerDefinition(Modelslayer_chestplate.LAYER_LOCATION, Modelslayer_chestplate::createBodyLayer);
		event.registerLayerDefinition(Modelsteel_ball_projectile.LAYER_LOCATION, Modelsteel_ball_projectile::createBodyLayer);
		event.registerLayerDefinition(Modelhorizontal_slash.LAYER_LOCATION, Modelhorizontal_slash::createBodyLayer);
		event.registerLayerDefinition(Modelfire_ball.LAYER_LOCATION, Modelfire_ball::createBodyLayer);
		event.registerLayerDefinition(Modelpenguin_normal_model.LAYER_LOCATION, Modelpenguin_normal_model::createBodyLayer);
		event.registerLayerDefinition(Modelslayer_helmet_boots.LAYER_LOCATION, Modelslayer_helmet_boots::createBodyLayer);
	}
}
