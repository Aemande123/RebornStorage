package RebornStorage.init;

import RebornStorage.items.ItemRebornStorageCell;
import RebornStorage.items.ItemRebornStorageCellFluid;
import RebornStorage.items.ItemStoragePart;
import net.minecraft.item.Item;
import reborncore.RebornRegistry;

/**
 * Created by Gigabit101 on 03/01/2017.
 */
public class ModItems {
	public static Item REBORN_STORAGE_CELL;
	public static Item REBORN_STORAGE_CELL_FLUID;
	public static Item REBORN_STORAGE_PART;

	public static void init() {
		REBORN_STORAGE_CELL = new ItemRebornStorageCell();
		RebornRegistry.registerItem(REBORN_STORAGE_CELL);

		REBORN_STORAGE_CELL_FLUID = new ItemRebornStorageCellFluid();
		RebornRegistry.registerItem(REBORN_STORAGE_CELL_FLUID);

		REBORN_STORAGE_PART = new ItemStoragePart();
		RebornRegistry.registerItem(REBORN_STORAGE_PART);
	}
}
