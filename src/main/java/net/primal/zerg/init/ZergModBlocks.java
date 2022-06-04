
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.zerg.init;

import net.primal.zerg.block.YellowZergCarapaceBlock;
import net.primal.zerg.block.WhiteZergCarapaceBlock;
import net.primal.zerg.block.VespeneGeyserBlock;
import net.primal.zerg.block.StorageCocoonBlock;
import net.primal.zerg.block.SmallZergClawBlock;
import net.primal.zerg.block.RedZergCarapaceBlock;
import net.primal.zerg.block.PurpleZergCarapaceBlock;
import net.primal.zerg.block.PinkZergCarapaceBlock;
import net.primal.zerg.block.OrangeZergCarapaceBlock;
import net.primal.zerg.block.MineraloreBlock;
import net.primal.zerg.block.MineralBlockBlock;
import net.primal.zerg.block.MediumZergClawBlock;
import net.primal.zerg.block.MagentaZergCarapaceBlock;
import net.primal.zerg.block.LimeZergCarapaceBlock;
import net.primal.zerg.block.LightGrayZergCarapaceBlock;
import net.primal.zerg.block.LightBlueZergCarapaceBlock;
import net.primal.zerg.block.GreenZergCarapaceBlock;
import net.primal.zerg.block.GrayZergCarapaceBlock;
import net.primal.zerg.block.DeepslatemineraloreBlock;
import net.primal.zerg.block.CyanZergCarapaceBlock;
import net.primal.zerg.block.CreepTumorBlock;
import net.primal.zerg.block.CreepBlock;
import net.primal.zerg.block.BrownZergCarapaceBlock;
import net.primal.zerg.block.BlueZergCarapaceBlock;
import net.primal.zerg.block.BlockOfZergChitinBlock;
import net.primal.zerg.block.BlackZergCarapaceBlock;
import net.primal.zerg.block.BigZergClawBlock;
import net.primal.zerg.block.AcidFluidBlock;
import net.primal.zerg.ZergMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class ZergModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ZergMod.MODID);
	public static final RegistryObject<Block> WHITE_ZERG_CARAPACE = REGISTRY.register("white_zerg_carapace", () -> new WhiteZergCarapaceBlock());
	public static final RegistryObject<Block> BLUE_ZERG_CARAPACE = REGISTRY.register("blue_zerg_carapace", () -> new BlueZergCarapaceBlock());
	public static final RegistryObject<Block> GRAY_ZERG_CARAPACE = REGISTRY.register("gray_zerg_carapace", () -> new GrayZergCarapaceBlock());
	public static final RegistryObject<Block> LIGHT_GRAY_ZERG_CARAPACE = REGISTRY.register("light_gray_zerg_carapace",
			() -> new LightGrayZergCarapaceBlock());
	public static final RegistryObject<Block> RED_ZERG_CARAPACE = REGISTRY.register("red_zerg_carapace", () -> new RedZergCarapaceBlock());
	public static final RegistryObject<Block> LIGHT_BLUE_ZERG_CARAPACE = REGISTRY.register("light_blue_zerg_carapace",
			() -> new LightBlueZergCarapaceBlock());
	public static final RegistryObject<Block> PINK_ZERG_CARAPACE = REGISTRY.register("pink_zerg_carapace", () -> new PinkZergCarapaceBlock());
	public static final RegistryObject<Block> PURPLE_ZERG_CARAPACE = REGISTRY.register("purple_zerg_carapace", () -> new PurpleZergCarapaceBlock());
	public static final RegistryObject<Block> CYAN_ZERG_CARAPACE = REGISTRY.register("cyan_zerg_carapace", () -> new CyanZergCarapaceBlock());
	public static final RegistryObject<Block> YELLOW_ZERG_CARAPACE = REGISTRY.register("yellow_zerg_carapace", () -> new YellowZergCarapaceBlock());
	public static final RegistryObject<Block> ORANGE_ZERG_CARAPACE = REGISTRY.register("orange_zerg_carapace", () -> new OrangeZergCarapaceBlock());
	public static final RegistryObject<Block> BLACK_ZERG_CARAPACE = REGISTRY.register("black_zerg_carapace", () -> new BlackZergCarapaceBlock());
	public static final RegistryObject<Block> LIME_ZERG_CARAPACE = REGISTRY.register("lime_zerg_carapace", () -> new LimeZergCarapaceBlock());
	public static final RegistryObject<Block> GREEN_ZERG_CARAPACE = REGISTRY.register("green_zerg_carapace", () -> new GreenZergCarapaceBlock());
	public static final RegistryObject<Block> MAGENTA_ZERG_CARAPACE = REGISTRY.register("magenta_zerg_carapace",
			() -> new MagentaZergCarapaceBlock());
	public static final RegistryObject<Block> BROWN_ZERG_CARAPACE = REGISTRY.register("brown_zerg_carapace", () -> new BrownZergCarapaceBlock());
	public static final RegistryObject<Block> MINERAL_BLOCK = REGISTRY.register("mineral_block", () -> new MineralBlockBlock());
	public static final RegistryObject<Block> BLOCK_OF_ZERG_CHITIN = REGISTRY.register("block_of_zerg_chitin", () -> new BlockOfZergChitinBlock());
	public static final RegistryObject<Block> CREEP = REGISTRY.register("creep", () -> new CreepBlock());
	public static final RegistryObject<Block> MEDIUM_ZERG_CLAW = REGISTRY.register("medium_zerg_claw", () -> new MediumZergClawBlock());
	public static final RegistryObject<Block> SMALL_ZERG_CLAW = REGISTRY.register("small_zerg_claw", () -> new SmallZergClawBlock());
	public static final RegistryObject<Block> BIG_ZERG_CLAW = REGISTRY.register("big_zerg_claw", () -> new BigZergClawBlock());
	public static final RegistryObject<Block> MINERAL_ORE = REGISTRY.register("mineral_ore", () -> new MineraloreBlock());
	public static final RegistryObject<Block> VESPENE_GEYSER = REGISTRY.register("vespene_geyser", () -> new VespeneGeyserBlock());
	public static final RegistryObject<Block> DEEPSLATEMINERALORE = REGISTRY.register("deepslatemineralore", () -> new DeepslatemineraloreBlock());
	public static final RegistryObject<Block> CREEP_TUMOR = REGISTRY.register("creep_tumor", () -> new CreepTumorBlock());
	public static final RegistryObject<Block> ACID_FLUID = REGISTRY.register("acid_fluid", () -> new AcidFluidBlock());
	public static final RegistryObject<Block> STORAGE_COCOON = REGISTRY.register("storage_cocoon", () -> new StorageCocoonBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CreepBlock.registerRenderLayer();
			MediumZergClawBlock.registerRenderLayer();
			SmallZergClawBlock.registerRenderLayer();
			VespeneGeyserBlock.registerRenderLayer();
			CreepTumorBlock.registerRenderLayer();
			StorageCocoonBlock.registerRenderLayer();
		}
	}
}
