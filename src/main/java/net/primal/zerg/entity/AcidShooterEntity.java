
package net.primal.zerg.entity;

import net.primal.zerg.procedures.AcidShooterWhileProjectileFlyingTickProcedure;
import net.primal.zerg.procedures.AcidShooterProjectileHitsPlayerProcedure;
import net.primal.zerg.init.ZergModItems;
import net.primal.zerg.init.ZergModEntities;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class AcidShooterEntity extends AbstractArrow implements ItemSupplier {
	public AcidShooterEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(ZergModEntities.ACID_SHOOTER.get(), world);
	}

	public AcidShooterEntity(EntityType<? extends AcidShooterEntity> type, Level world) {
		super(type, world);
	}

	public AcidShooterEntity(EntityType<? extends AcidShooterEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public AcidShooterEntity(EntityType<? extends AcidShooterEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
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

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		AcidShooterProjectileHitsPlayerProcedure.execute(entityHitResult.getEntity());
	}

	@Override
	public void tick() {
		super.tick();
		AcidShooterWhileProjectileFlyingTickProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
		if (this.inGround)
			this.discard();
	}

	public static AcidShooterEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		AcidShooterEntity entityarrow = new AcidShooterEntity(ZergModEntities.ACID_SHOOTER.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static AcidShooterEntity shoot(LivingEntity entity, LivingEntity target) {
		AcidShooterEntity entityarrow = new AcidShooterEntity(ZergModEntities.ACID_SHOOTER.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 2f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}