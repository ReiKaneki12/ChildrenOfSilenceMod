package net.mcreator.childrenofsilence.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;

import net.mcreator.childrenofsilence.client.renderer.ElvenNekclaceRenderer;
import net.mcreator.childrenofsilence.client.model.ModelElvenNecklace;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChildrenOfSilenceModCuriosRenderers {
	@SubscribeEvent
	public static void registerLayers(final EntityRenderersEvent.RegisterLayerDefinitions evt) {
		evt.registerLayerDefinition(ChildrenOfSilenceModLayerDefinitions.ELVEN_NEKCLACE, ModelElvenNecklace::createBodyLayer);
	}

	@SubscribeEvent
	public static void clientSetup(final FMLClientSetupEvent evt) {
		CuriosRendererRegistry.register(ChildrenOfSilenceModItems.ELVEN_NEKCLACE.get(), ElvenNekclaceRenderer::new);
	}
}
