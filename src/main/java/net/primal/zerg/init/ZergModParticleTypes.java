
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.zerg.init;

import net.primal.zerg.ZergMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class ZergModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ZergMod.MODID);
	public static final RegistryObject<ParticleType<?>> ACID_PARTICLE = REGISTRY.register("acid_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> VESPENEPARTICLE = REGISTRY.register("vespeneparticle", () -> new SimpleParticleType(false));
}
