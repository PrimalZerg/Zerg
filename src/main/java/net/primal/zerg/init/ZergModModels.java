
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.zerg.init;

import net.primal.zerg.client.model.Modelspine;
import net.primal.zerg.client.model.Modelroach;
import net.primal.zerg.client.model.Modellarva;
import net.primal.zerg.client.model.Modelhydralisk;
import net.primal.zerg.client.model.Modelcustom_model;
import net.primal.zerg.client.model.Modelarmor_leggings;
import net.primal.zerg.client.model.Modelarmor;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ZergModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelroach.LAYER_LOCATION, Modelroach::createBodyLayer);
		event.registerLayerDefinition(Modelarmor_leggings.LAYER_LOCATION, Modelarmor_leggings::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelspine.LAYER_LOCATION, Modelspine::createBodyLayer);
		event.registerLayerDefinition(Modellarva.LAYER_LOCATION, Modellarva::createBodyLayer);
		event.registerLayerDefinition(Modelhydralisk.LAYER_LOCATION, Modelhydralisk::createBodyLayer);
		event.registerLayerDefinition(Modelarmor.LAYER_LOCATION, Modelarmor::createBodyLayer);
	}
}
