/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.primal.zerg;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.primal.zerg.init.ZergModTabs;
import net.primal.zerg.init.ZergModPotions;
import net.primal.zerg.init.ZergModParticleTypes;
import net.primal.zerg.init.ZergModMobEffects;
import net.primal.zerg.init.ZergModItems;
import net.primal.zerg.init.ZergModFluids;
import net.primal.zerg.init.ZergModFeatures;
import net.primal.zerg.init.ZergModEntities;
import net.primal.zerg.init.ZergModBlocks;
import net.primal.zerg.init.ZergModBiomes;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("zerg")
public class ZergMod {
	public static final Logger LOGGER = LogManager.getLogger(ZergMod.class);
	public static final String MODID = "zerg";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public ZergMod() {
		ZergModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ZergModBlocks.REGISTRY.register(bus);
		ZergModItems.REGISTRY.register(bus);
		ZergModEntities.REGISTRY.register(bus);

		ZergModFeatures.REGISTRY.register(bus);
		ZergModFluids.REGISTRY.register(bus);

		ZergModMobEffects.REGISTRY.register(bus);
		ZergModPotions.REGISTRY.register(bus);
		ZergModBiomes.REGISTRY.register(bus);
		ZergModParticleTypes.REGISTRY.register(bus);
	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
