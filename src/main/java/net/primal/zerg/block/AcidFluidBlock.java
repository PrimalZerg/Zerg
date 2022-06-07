
package net.primal.zerg.block;

import net.primal.zerg.procedures.AcidShooterProjectileHitsPlayerProcedure;
import net.primal.zerg.init.ZergModFluids;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class AcidFluidBlock extends LiquidBlock {
	public AcidFluidBlock() {
		super(() -> (FlowingFluid) ZergModFluids.ACID_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		AcidShooterProjectileHitsPlayerProcedure.execute(entity);
	}
}
