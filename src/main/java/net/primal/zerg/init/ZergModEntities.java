
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.zerg.init;

import net.primal.zerg.entity.ZerglingEntity;
import net.primal.zerg.entity.WildRoachEntityProjectile;
import net.primal.zerg.entity.WildRoachEntity;
import net.primal.zerg.entity.WildHydraliskEntityProjectile;
import net.primal.zerg.entity.WildHydraliskEntity;
import net.primal.zerg.entity.SpineShooterEntity;
import net.primal.zerg.entity.LarvaEntity;
import net.primal.zerg.entity.HostileZerglingEntity;
import net.primal.zerg.entity.HostileHydraliskEntityProjectile;
import net.primal.zerg.entity.HostileHydraliskEntity;
import net.primal.zerg.entity.FeralRoachEntityProjectile;
import net.primal.zerg.entity.FeralRoachEntity;
import net.primal.zerg.entity.BroodZerglingEntity;
import net.primal.zerg.entity.BroodRoachEntityProjectile;
import net.primal.zerg.entity.BroodRoachEntity;
import net.primal.zerg.entity.BroodHydraliskEntityProjectile;
import net.primal.zerg.entity.BroodHydraliskEntity;
import net.primal.zerg.entity.AcidShooterEntity;
import net.primal.zerg.ZergMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ZergModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, ZergMod.MODID);
	public static final RegistryObject<EntityType<ZerglingEntity>> WILD_ZERGLING = register("wild_zergling",
			EntityType.Builder.<ZerglingEntity>of(ZerglingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ZerglingEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<HostileZerglingEntity>> HOSTILE_ZERGLING = register("hostile_zergling",
			EntityType.Builder.<HostileZerglingEntity>of(HostileZerglingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HostileZerglingEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<WildHydraliskEntity>> WILD_HYDRALISK = register("wild_hydralisk",
			EntityType.Builder.<WildHydraliskEntity>of(WildHydraliskEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WildHydraliskEntity::new)

					.sized(0.9f, 2.4f));
	public static final RegistryObject<EntityType<WildHydraliskEntityProjectile>> WILD_HYDRALISK_PROJECTILE = register("projectile_wild_hydralisk",
			EntityType.Builder.<WildHydraliskEntityProjectile>of(WildHydraliskEntityProjectile::new, MobCategory.MISC)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(WildHydraliskEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HostileHydraliskEntity>> HOSTILE_HYDRALISK = register("hostile_hydralisk",
			EntityType.Builder.<HostileHydraliskEntity>of(HostileHydraliskEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HostileHydraliskEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HostileHydraliskEntityProjectile>> HOSTILE_HYDRALISK_PROJECTILE = register(
			"projectile_hostile_hydralisk",
			EntityType.Builder.<HostileHydraliskEntityProjectile>of(HostileHydraliskEntityProjectile::new, MobCategory.MISC)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(HostileHydraliskEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SpineShooterEntity>> SPINE_SHOOTER = register("projectile_spine_shooter",
			EntityType.Builder.<SpineShooterEntity>of(SpineShooterEntity::new, MobCategory.MISC).setCustomClientFactory(SpineShooterEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WildRoachEntity>> WILD_ROACH = register("wild_roach",
			EntityType.Builder.<WildRoachEntity>of(WildRoachEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WildRoachEntity::new)

					.sized(1.3f, 1.5999999999999999f));
	public static final RegistryObject<EntityType<WildRoachEntityProjectile>> WILD_ROACH_PROJECTILE = register("projectile_wild_roach",
			EntityType.Builder.<WildRoachEntityProjectile>of(WildRoachEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(WildRoachEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FeralRoachEntity>> FERAL_ROACH = register("feral_roach",
			EntityType.Builder.<FeralRoachEntity>of(FeralRoachEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FeralRoachEntity::new)

					.sized(1.3f, 1.5999999999999999f));
	public static final RegistryObject<EntityType<FeralRoachEntityProjectile>> FERAL_ROACH_PROJECTILE = register("projectile_feral_roach",
			EntityType.Builder.<FeralRoachEntityProjectile>of(FeralRoachEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(FeralRoachEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AcidShooterEntity>> ACID_SHOOTER = register("projectile_acid_shooter",
			EntityType.Builder.<AcidShooterEntity>of(AcidShooterEntity::new, MobCategory.MISC).setCustomClientFactory(AcidShooterEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LarvaEntity>> LARVA = register("larva",
			EntityType.Builder.<LarvaEntity>of(LarvaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2)
					.setUpdateInterval(3).setCustomClientFactory(LarvaEntity::new)

					.sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<BroodHydraliskEntity>> BROOD_HYDRALISK = register("brood_hydralisk",
			EntityType.Builder.<BroodHydraliskEntity>of(BroodHydraliskEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BroodHydraliskEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BroodHydraliskEntityProjectile>> BROOD_HYDRALISK_PROJECTILE = register("projectile_brood_hydralisk",
			EntityType.Builder.<BroodHydraliskEntityProjectile>of(BroodHydraliskEntityProjectile::new, MobCategory.MISC)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(BroodHydraliskEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BroodRoachEntity>> BROOD_ROACH = register("brood_roach",
			EntityType.Builder.<BroodRoachEntity>of(BroodRoachEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BroodRoachEntity::new)

					.sized(1.3f, 1.5999999999999999f));
	public static final RegistryObject<EntityType<BroodRoachEntityProjectile>> BROOD_ROACH_PROJECTILE = register("projectile_brood_roach",
			EntityType.Builder.<BroodRoachEntityProjectile>of(BroodRoachEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(BroodRoachEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BroodZerglingEntity>> BROOD_ZERGLING = register("brood_zergling",
			EntityType.Builder.<BroodZerglingEntity>of(BroodZerglingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BroodZerglingEntity::new)

					.sized(0.7f, 0.9f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ZerglingEntity.init();
			HostileZerglingEntity.init();
			WildHydraliskEntity.init();
			HostileHydraliskEntity.init();
			WildRoachEntity.init();
			FeralRoachEntity.init();
			LarvaEntity.init();
			BroodHydraliskEntity.init();
			BroodRoachEntity.init();
			BroodZerglingEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WILD_ZERGLING.get(), ZerglingEntity.createAttributes().build());
		event.put(HOSTILE_ZERGLING.get(), HostileZerglingEntity.createAttributes().build());
		event.put(WILD_HYDRALISK.get(), WildHydraliskEntity.createAttributes().build());
		event.put(HOSTILE_HYDRALISK.get(), HostileHydraliskEntity.createAttributes().build());
		event.put(WILD_ROACH.get(), WildRoachEntity.createAttributes().build());
		event.put(FERAL_ROACH.get(), FeralRoachEntity.createAttributes().build());
		event.put(LARVA.get(), LarvaEntity.createAttributes().build());
		event.put(BROOD_HYDRALISK.get(), BroodHydraliskEntity.createAttributes().build());
		event.put(BROOD_ROACH.get(), BroodRoachEntity.createAttributes().build());
		event.put(BROOD_ZERGLING.get(), BroodZerglingEntity.createAttributes().build());
	}
}
