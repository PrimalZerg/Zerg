package net.primal.zerg.procedures;

import net.primal.zerg.init.ZergModItems;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;

public class FeralRoachOnInitialEntitySpawnProcedure {
	public static void execute() {
		{
			ItemStack _isc = new ItemStack(Blocks.AIR);
			final ItemStack _setstack = new ItemStack(ZergModItems.ACID_SHOOTER.get());
			final int _sltid = 0;
			_setstack.setCount(1);
			_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable) {
					((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
				}
			});
		}
	}
}
