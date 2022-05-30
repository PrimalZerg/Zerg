package net.primal.zerg.procedures;

import net.primal.zerg.init.ZergModParticleTypes;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AcidShooterWhileProjectileFlyingTickProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
		execute(event, event.getEntityLiving().level, event.getEntityLiving().getX(), event.getEntityLiving().getY(), event.getEntityLiving().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double fireHeight = 0;
		BlockState clickedBlock = Blocks.AIR.defaultBlockState();
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ZergModParticleTypes.ACID_PARTICLE.get()), (x + 0.1), (y + 0.2), (z - 0.1), 5, 1, 1, 1, 0.1);
	}
}
