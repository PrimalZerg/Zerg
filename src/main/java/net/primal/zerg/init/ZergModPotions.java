
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.zerg.init;

import net.primal.zerg.ZergMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

public class ZergModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ZergMod.MODID);
	public static final RegistryObject<Potion> ACID_POTION = REGISTRY.register("acid_potion",
			() -> new Potion(new MobEffectInstance(ZergModMobEffects.ACID.get(), 3600, 0, false, false)));
}
