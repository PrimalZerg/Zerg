
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.zerg.init;

import net.primal.zerg.potion.AcidMobEffect;
import net.primal.zerg.ZergMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class ZergModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ZergMod.MODID);
	public static final RegistryObject<MobEffect> ACID = REGISTRY.register("acid", () -> new AcidMobEffect());
}
