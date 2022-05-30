package net.primal.zerg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AcidActiveTickConditionProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
		execute(event);
	}

	public static boolean execute() {
		return execute(null);
	}

	private static boolean execute(@Nullable Event event) {
		double baseRate = 0;
		double rateWithAmplifier = 0;
		baseRate = 50;
		rateWithAmplifier = baseRate / Math.pow(2, 1);
		if (Math.floor(rateWithAmplifier) > 0) {
			return 10 % Math.floor(rateWithAmplifier) == 0;
		}
		return true;
	}
}
