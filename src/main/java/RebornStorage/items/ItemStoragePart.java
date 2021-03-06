package RebornStorage.items;

import RebornStorage.lib.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

/**
 * Created by Gigabit101 on 03/01/2017.
 */
public class ItemStoragePart extends ItemBase {
	public static final String[] types = new String[] { "256k", "1024k", "4096k", "16384k", "1024k_fluid", "4096k_fluid", "16384k_fluid", "32768k_fluid" };

	public ItemStoragePart() {
		setUnlocalizedName(ModInfo.MOD_ID + ".storagepart");
		setHasSubtypes(true);
		setRegistryName("storagepart");
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> list) {
		if (isInCreativeTab(tab)) {
			for (int meta = 0; meta < types.length; meta++) {
				list.add(new ItemStack(this, 1, meta));
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		int meta = itemStack.getItemDamage();
		if (meta < 0 || meta >= types.length) {
			meta = 0;
		}
		return super.getUnlocalizedName() + "." + types[meta];
	}
}
