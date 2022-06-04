
package net.primal.zerg.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class AcidMobEffect extends MobEffect {
	public AcidMobEffect() {
		super(MobEffectCategory.HARMFUL, -16056564);
	}

	@Override
	public String getDescriptionId() {
		return "effect.zerg.acid_icon";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
