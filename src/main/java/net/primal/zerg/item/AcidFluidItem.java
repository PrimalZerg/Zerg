
package net.primal.zerg.item;

import net.primal.zerg.init.ZergModTabs;
import net.primal.zerg.init.ZergModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class AcidFluidItem extends BucketItem {
	public AcidFluidItem() {
		super(ZergModFluids.ACID_FLUID,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(ZergModTabs.TAB_ZERG_MISC));
	}
}
