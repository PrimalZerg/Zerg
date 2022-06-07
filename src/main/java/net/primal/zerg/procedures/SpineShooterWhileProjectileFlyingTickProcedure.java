package net.primal.zerg.procedures;

import net.primal.zerg.init.ZergModParticleTypes;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

public class SpineShooterWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ZergModParticleTypes.ACID_PARTICLE.get()), x, y, z, 5, 0.01, 0.01, 0.01, 0.01);
	}
}
