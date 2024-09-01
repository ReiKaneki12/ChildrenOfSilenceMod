package net.mcreator.childrenofsilence.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.childrenofsilence.network.ChildrenOfSilenceModVariables;
import net.mcreator.childrenofsilence.client.model.Modelesck_demon_placeholder_normal_model;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class EsckDemonModeProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onEventTriggered(RenderLivingEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		RenderLivingEvent _evt = (RenderLivingEvent) event;
		Minecraft mc = Minecraft.getInstance();
		EntityRenderDispatcher dis = Minecraft.getInstance().getEntityRenderDispatcher();
		EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
		if ((entity.getCapability(ChildrenOfSilenceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ChildrenOfSilenceModVariables.PlayerVariables())).isDemon
				&& (entity.getCapability(ChildrenOfSilenceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ChildrenOfSilenceModVariables.PlayerVariables())).EsckArmorOn) {
			if (_evt.getRenderer() instanceof PlayerRenderer) {
				if (_evt instanceof RenderLivingEvent.Pre) {
					_evt.setCanceled(true);
				}
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerRenderer(context, new ResourceLocation("children_of_silence:textures/entities/esck_demon_placeholder.png"),
						new Modelesck_demon_placeholder_normal_model(context.bakeLayer(Modelesck_demon_placeholder_normal_model.LAYER_LOCATION)))
						.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
			}
		}
	}
}
