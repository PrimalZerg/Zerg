package net.primal.zerg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AcidActiveTickConditionProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
		execute(event, event.getEntityLiving());
	}

	public static boolean execute(Entity entity) {
		return execute(null, entity);
	}

	private static boolean execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return false;
		double baseRate = 0;
		double rateWithAmplifier = 0;
		baseRate = 50;
		rateWithAmplifier = baseRate / Math.pow(2, 1);
		if (Math.floor(rateWithAmplifier) > 0) {
			return 10 % Math.floor(rateWithAmplifier) == 0;
		}
		entity.hurt(DamageSource.MAGIC, 1);
		return true;
	}
}
