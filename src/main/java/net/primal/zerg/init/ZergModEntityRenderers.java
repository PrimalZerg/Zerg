
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.zerg.init;

import net.primal.zerg.client.renderer.ZerglingRenderer;
import net.primal.zerg.client.renderer.WildHydraliskRenderer;
import net.primal.zerg.client.renderer.HostileZerglingRenderer;
import net.primal.zerg.client.renderer.HostileHydraliskRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ZergModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ZergModEntities.ZERGLING.get(), ZerglingRenderer::new);
		event.registerEntityRenderer(ZergModEntities.HOSTILE_ZERGLING.get(), HostileZerglingRenderer::new);
		event.registerEntityRenderer(ZergModEntities.WILD_HYDRALISK.get(), WildHydraliskRenderer::new);
		event.registerEntityRenderer(ZergModEntities.WILD_HYDRALISK_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZergModEntities.HOSTILE_HYDRALISK.get(), HostileHydraliskRenderer::new);
		event.registerEntityRenderer(ZergModEntities.HOSTILE_HYDRALISK_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZergModEntities.SPINE_SHOOTER.get(), ThrownItemRenderer::new);
	}
}
