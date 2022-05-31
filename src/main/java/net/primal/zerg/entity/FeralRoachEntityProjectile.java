
package net.primal.zerg.entity;

import net.primal.zerg.init.ZergModItems;
import net.primal.zerg.init.ZergModEntities;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.Packet;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class FeralRoachEntityProjectile extends AbstractArrow implements ItemSupplier {
	public FeralRoachEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(ZergModEntities.FERAL_ROACH_PROJECTILE.get(), world);
	}

	public FeralRoachEntityProjectile(EntityType<? extends FeralRoachEntityProjectile> type, Level world) {
		super(type, world);
	}

	public FeralRoachEntityProjectile(EntityType<? extends FeralRoachEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public FeralRoachEntityProjectile(EntityType<? extends FeralRoachEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(ZergModItems.ACID_SPLASH.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(ZergModItems.ACID_SPLASH.get());
	}
}