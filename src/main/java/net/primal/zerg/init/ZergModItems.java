
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.zerg.init;

import net.primal.zerg.item.ZergClawItem;
import net.primal.zerg.item.ZergCarapaceItem;
import net.primal.zerg.item.VespeneBubbleItem;
import net.primal.zerg.item.SpineShooterItem;
import net.primal.zerg.item.SpineItem;
import net.primal.zerg.item.MineralShardItem;
import net.primal.zerg.item.EmptyVespeneBubbleItem;
import net.primal.zerg.item.CarapaceArmorItem;
import net.primal.zerg.item.AcidSplashItem;
import net.primal.zerg.item.AcidShooterItem;
import net.primal.zerg.item.AcidFluidItem;
import net.primal.zerg.ZergMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class ZergModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ZergMod.MODID);
	public static final RegistryObject<Item> CREEP = block(ZergModBlocks.CREEP, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> CREEP_TUMOR = block(ZergModBlocks.CREEP_TUMOR, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> BLACK_ZERG_CARAPACE = block(ZergModBlocks.BLACK_ZERG_CARAPACE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> GRAY_ZERG_CARAPACE = block(ZergModBlocks.GRAY_ZERG_CARAPACE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> LIGHT_GRAY_ZERG_CARAPACE = block(ZergModBlocks.LIGHT_GRAY_ZERG_CARAPACE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> WHITE_ZERG_CARAPACE = block(ZergModBlocks.WHITE_ZERG_CARAPACE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> PINK_ZERG_CARAPACE = block(ZergModBlocks.PINK_ZERG_CARAPACE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> MAGENTA_ZERG_CARAPACE = block(ZergModBlocks.MAGENTA_ZERG_CARAPACE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> PURPLE_ZERG_CARAPACE = block(ZergModBlocks.PURPLE_ZERG_CARAPACE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> RED_ZERG_CARAPACE = block(ZergModBlocks.RED_ZERG_CARAPACE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> ORANGE_ZERG_CARAPACE = block(ZergModBlocks.ORANGE_ZERG_CARAPACE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> YELLOW_ZERG_CARAPACE = block(ZergModBlocks.YELLOW_ZERG_CARAPACE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> LIME_ZERG_CARAPACE = block(ZergModBlocks.LIME_ZERG_CARAPACE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> GREEN_ZERG_CARAPACE = block(ZergModBlocks.GREEN_ZERG_CARAPACE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> LIGHT_BLUE_ZERG_CARAPACE = block(ZergModBlocks.LIGHT_BLUE_ZERG_CARAPACE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> CYAN_ZERG_CARAPACE = block(ZergModBlocks.CYAN_ZERG_CARAPACE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> BLUE_ZERG_CARAPACE = block(ZergModBlocks.BLUE_ZERG_CARAPACE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> BROWN_ZERG_CARAPACE = block(ZergModBlocks.BROWN_ZERG_CARAPACE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> BLOCK_OF_ZERG_CHITITN_DARK = block(ZergModBlocks.BLOCK_OF_ZERG_CHITITN_DARK, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> BLOCK_OF_ZERG_CHITIN = block(ZergModBlocks.BLOCK_OF_ZERG_CHITIN, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> MINERAL_ORE = block(ZergModBlocks.MINERAL_ORE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> DEEPSLATEMINERALORE = block(ZergModBlocks.DEEPSLATEMINERALORE, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> MINERAL_BLOCK = block(ZergModBlocks.MINERAL_BLOCK, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> MINERAL_SHARD = REGISTRY.register("mineral_shard", () -> new MineralShardItem());
	public static final RegistryObject<Item> ACID_FLUID_BUCKET = REGISTRY.register("acid_fluid_bucket", () -> new AcidFluidItem());
	public static final RegistryObject<Item> VESPENE_BUBBLE = REGISTRY.register("vespene_bubble", () -> new VespeneBubbleItem());
	public static final RegistryObject<Item> EMPTY_VESPENE_BUBBLE = REGISTRY.register("empty_vespene_bubble", () -> new EmptyVespeneBubbleItem());
	public static final RegistryObject<Item> ZERG_CLAW = REGISTRY.register("zerg_claw", () -> new ZergClawItem());
	public static final RegistryObject<Item> ZERG_CARAPACE = REGISTRY.register("zerg_carapace", () -> new ZergCarapaceItem());
	public static final RegistryObject<Item> SPINE = REGISTRY.register("spine", () -> new SpineItem());
	public static final RegistryObject<Item> BIG_ZERG_CLAW = block(ZergModBlocks.BIG_ZERG_CLAW, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> MEDIUM_ZERG_CLAW = block(ZergModBlocks.MEDIUM_ZERG_CLAW, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> SMALL_ZERG_CLAW = block(ZergModBlocks.SMALL_ZERG_CLAW, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> VESPENE_GEYSER = block(ZergModBlocks.VESPENE_GEYSER, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> SPINE_SHOOTER = REGISTRY.register("spine_shooter", () -> new SpineShooterItem());
	public static final RegistryObject<Item> ACID_SHOOTER = REGISTRY.register("acid_shooter", () -> new AcidShooterItem());
	public static final RegistryObject<Item> STORAGE_COCOON = block(ZergModBlocks.STORAGE_COCOON, ZergModTabs.TAB_ZERG_MISC);
	public static final RegistryObject<Item> CARAPACE_ARMOR_HELMET = REGISTRY.register("carapace_armor_helmet", () -> new CarapaceArmorItem.Helmet());
	public static final RegistryObject<Item> CARAPACE_ARMOR_CHESTPLATE = REGISTRY.register("carapace_armor_chestplate",
			() -> new CarapaceArmorItem.Chestplate());
	public static final RegistryObject<Item> CARAPACE_ARMOR_LEGGINGS = REGISTRY.register("carapace_armor_leggings",
			() -> new CarapaceArmorItem.Leggings());
	public static final RegistryObject<Item> CARAPACE_ARMOR_BOOTS = REGISTRY.register("carapace_armor_boots", () -> new CarapaceArmorItem.Boots());
	public static final RegistryObject<Item> LARVA = REGISTRY.register("larva_spawn_egg",
			() -> new ForgeSpawnEggItem(ZergModEntities.LARVA, -10538748, -9288321, new Item.Properties().tab(ZergModTabs.TAB_ZERG_MOBS)));
	public static final RegistryObject<Item> BROOD_ZERGLING = REGISTRY.register("brood_zergling_spawn_egg",
			() -> new ForgeSpawnEggItem(ZergModEntities.BROOD_ZERGLING, -9551069, -3407668, new Item.Properties().tab(ZergModTabs.TAB_ZERG_MOBS)));
	public static final RegistryObject<Item> WILD_ZERGLING = REGISTRY.register("wild_zergling_spawn_egg",
			() -> new ForgeSpawnEggItem(ZergModEntities.WILD_ZERGLING, -9551069, -1059607, new Item.Properties().tab(ZergModTabs.TAB_ZERG_MOBS)));
	public static final RegistryObject<Item> HOSTILE_ZERGLING = REGISTRY.register("hostile_zergling_spawn_egg",
			() -> new ForgeSpawnEggItem(ZergModEntities.HOSTILE_ZERGLING, -9551069, -65536, new Item.Properties().tab(ZergModTabs.TAB_ZERG_MOBS)));
	public static final RegistryObject<Item> BROOD_ROACH = REGISTRY.register("brood_roach_spawn_egg",
			() -> new ForgeSpawnEggItem(ZergModEntities.BROOD_ROACH, -11844292, -6750055, new Item.Properties().tab(ZergModTabs.TAB_ZERG_MOBS)));
	public static final RegistryObject<Item> WILD_ROACH = REGISTRY.register("wild_roach_spawn_egg",
			() -> new ForgeSpawnEggItem(ZergModEntities.WILD_ROACH, -11844292, -1452831, new Item.Properties().tab(ZergModTabs.TAB_ZERG_MOBS)));
	public static final RegistryObject<Item> FERAL_ROACH = REGISTRY.register("feral_roach_spawn_egg",
			() -> new ForgeSpawnEggItem(ZergModEntities.FERAL_ROACH, -11844292, -447673, new Item.Properties().tab(ZergModTabs.TAB_ZERG_MOBS)));
	public static final RegistryObject<Item> BROOD_HYDRALISK = REGISTRY.register("brood_hydralisk_spawn_egg",
			() -> new ForgeSpawnEggItem(ZergModEntities.BROOD_HYDRALISK, -12969977, -6750055, new Item.Properties().tab(ZergModTabs.TAB_ZERG_MOBS)));
	public static final RegistryObject<Item> WILD_HYDRALISK = REGISTRY.register("wild_hydralisk_spawn_egg",
			() -> new ForgeSpawnEggItem(ZergModEntities.WILD_HYDRALISK, -9292010, -728330, new Item.Properties().tab(ZergModTabs.TAB_ZERG_MOBS)));
	public static final RegistryObject<Item> HOSTILE_HYDRALISK = REGISTRY.register("hostile_hydralisk_spawn_egg",
			() -> new ForgeSpawnEggItem(ZergModEntities.HOSTILE_HYDRALISK, -12969977, -1630690,
					new Item.Properties().tab(ZergModTabs.TAB_ZERG_MOBS)));
	public static final RegistryObject<Item> ACID_SPLASH = REGISTRY.register("acid_splash", () -> new AcidSplashItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
