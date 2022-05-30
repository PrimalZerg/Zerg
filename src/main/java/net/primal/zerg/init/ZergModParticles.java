
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.zerg.init;

import net.primal.zerg.client.particle.VespeneparticleParticle;
import net.primal.zerg.client.particle.AcidParticleParticle;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ZergModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ZergModParticleTypes.ACID_PARTICLE.get(),
				AcidParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ZergModParticleTypes.VESPENEPARTICLE.get(),
				VespeneparticleParticle::provider);
	}
}
