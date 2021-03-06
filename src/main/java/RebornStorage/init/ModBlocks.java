package RebornStorage.init;

import RebornStorage.blocks.BlockMultiCrafter;
import RebornStorage.blocks.ItemBlockMultiCrafter;
import RebornStorage.lib.ModInfo;
import RebornStorage.tiles.TileMultiCrafter;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import reborncore.RebornRegistry;

/**
 * Created by Gigabit101 on 03/01/2017.
 */
public class ModBlocks {
	public static Block BLOCK_MULTI_CRAFTER;

	public static void init() {
		BLOCK_MULTI_CRAFTER = new BlockMultiCrafter();
		RebornRegistry.registerBlock(BLOCK_MULTI_CRAFTER, ItemBlockMultiCrafter.class, "multicrafter");
		GameRegistry.registerTileEntity(TileMultiCrafter.class, ModInfo.MOD_NAME + "TileMultiCrafter");
	}

}
