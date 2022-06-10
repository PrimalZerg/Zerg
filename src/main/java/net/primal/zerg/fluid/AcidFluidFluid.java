
package net.primal.zerg.fluid;

import net.primal.zerg.init.ZergModParticleTypes;
import net.primal.zerg.init.ZergModItems;
import net.primal.zerg.init.ZergModFluids;
import net.primal.zerg.init.ZergModBlocks;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

public abstract class AcidFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(ZergModFluids.ACID_FLUID,
			ZergModFluids.FLOWING_ACID_FLUID,
			FluidAttributes.builder(new ResourceLocation("zerg:blocks/acid_still"), new ResourceLocation("zerg:blocks/acid_flow")).luminosity(2)

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty"))))
			.explosionResistance(100f).canMultiply()

			.bucket(ZergModItems.ACID_FLUID_BUCKET).block(() -> (LiquidBlock) ZergModBlocks.ACID_FLUID.get());

	private AcidFluidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (ZergModParticleTypes.ACID_PARTICLE.get());
	}

	public static class Source extends AcidFluidFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AcidFluidFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
