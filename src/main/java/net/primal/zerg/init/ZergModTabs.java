
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.zerg.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ZergModTabs {
	public static CreativeModeTab TAB_ZERG_MISC;
	public static CreativeModeTab TAB_ZERG_MOBS;

	public static void load() {
		TAB_ZERG_MISC = new CreativeModeTab("tabzerg_misc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ZergModItems.ZERG_CARAPACE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ZERG_MOBS = new CreativeModeTab("tabzerg_mobs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ZergModItems.ZERG_CLAW.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
