
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.zerg.init;

import net.primal.zerg.client.renderer.ZerglingRenderer;
import net.primal.zerg.client.renderer.WildRoachRenderer;
import net.primal.zerg.client.renderer.WildHydraliskRenderer;
import net.primal.zerg.client.renderer.SpineShooterRenderer;
import net.primal.zerg.client.renderer.LarvaRenderer;
import net.primal.zerg.client.renderer.HostileZerglingRenderer;
import net.primal.zerg.client.renderer.HostileHydraliskRenderer;
import net.primal.zerg.client.renderer.FeralRoachRenderer;
import net.primal.zerg.client.renderer.BroodZerglingRenderer;
import net.primal.zerg.client.renderer.BroodRoachRenderer;
import net.primal.zerg.client.renderer.BroodHydraliskRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ZergModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ZergModEntities.SPINE_SHOOTER.get(), SpineShooterRenderer::new);
		event.registerEntityRenderer(ZergModEntities.ACID_SHOOTER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZergModEntities.LARVA.get(), LarvaRenderer::new);
		event.registerEntityRenderer(ZergModEntities.BROOD_ZERGLING.get(), BroodZerglingRenderer::new);
		event.registerEntityRenderer(ZergModEntities.WILD_ZERGLING.get(), ZerglingRenderer::new);
		event.registerEntityRenderer(ZergModEntities.HOSTILE_ZERGLING.get(), HostileZerglingRenderer::new);
		event.registerEntityRenderer(ZergModEntities.BROOD_ROACH.get(), BroodRoachRenderer::new);
		event.registerEntityRenderer(ZergModEntities.WILD_ROACH.get(), WildRoachRenderer::new);
		event.registerEntityRenderer(ZergModEntities.FERAL_ROACH.get(), FeralRoachRenderer::new);
		event.registerEntityRenderer(ZergModEntities.BROOD_HYDRALISK.get(), BroodHydraliskRenderer::new);
		event.registerEntityRenderer(ZergModEntities.WILD_HYDRALISK.get(), WildHydraliskRenderer::new);
		event.registerEntityRenderer(ZergModEntities.HOSTILE_HYDRALISK.get(), HostileHydraliskRenderer::new);
	}
}
