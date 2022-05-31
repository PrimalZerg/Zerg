package net.primal.zerg.procedures;

import net.primal.zerg.init.ZergModParticleTypes;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

public class AcidShooterWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double fireHeight = 0;
		BlockState clickedBlock = Blocks.AIR.defaultBlockState();
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ZergModParticleTypes.ACID_PARTICLE.get()), (x + 0.1), (y + 0.2), (z - 0.1), 5, 0.1, 0.1, 0.1,
					0.1);
	}
}
