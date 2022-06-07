package net.primal.zerg.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class AcidActiveTickConditionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double baseRate = 0;
		double rateWithAmplifier = 0;
		entity.hurt(DamageSource.MAGIC, (float) 0.5);
	}
}
