package top.ilov.mcmods.ekac;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.ilov.mcmods.ekac.blocks.ekaCBlocksRegistry;
import top.ilov.mcmods.ekac.items.ekaCItemsRegistry;

public class ekaCMod implements ModInitializer {

	public static final String MOD_ID = "ekac";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ekaCBlocksRegistry.registerModBlocks();
		ekaCItemsRegistry.registerModItems();
		ekaCItemGroup.registerItemGroup();

	}
}
